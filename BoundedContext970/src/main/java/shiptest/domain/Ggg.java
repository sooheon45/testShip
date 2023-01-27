package shiptest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shiptest.BoundedContext970Application;

@Entity
@Table(name = "Ggg_table")
@Data
public class Ggg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {}

    public static GggRepository repository() {
        GggRepository gggRepository = BoundedContext970Application.applicationContext.getBean(
            GggRepository.class
        );
        return gggRepository;
    }
}
