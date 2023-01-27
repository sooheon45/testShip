package shiptest.domain;

import java.util.*;
import lombok.*;
import shiptest.domain.*;
import shiptest.infra.AbstractEvent;

@Data
@ToString
public class Ev extends AbstractEvent {

    private Long id;

    public Ev(Agg aggregate) {
        super(aggregate);
    }

    public Ev() {
        super();
    }
}
