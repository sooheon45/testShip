package shiptest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shiptest.BoundedContext427Application;
import shiptest.domain.Ev;

@Entity
@Table(name = "Agg_table")
@Data
public class Agg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        shiptest.external.Ggg ggg = new shiptest.external.Ggg();
        // mappings goes here
        BoundedContext427Application.applicationContext
            .getBean(shiptest.external.GggService.class)
            .co(ggg);

        Ev ev = new Ev(this);
        ev.publishAfterCommit();
    }

    public static AggRepository repository() {
        AggRepository aggRepository = BoundedContext427Application.applicationContext.getBean(
            AggRepository.class
        );
        return aggRepository;
    }
}
