package shiptest.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shiptest.domain.*;

@Component
public class AggHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Agg>> {

    @Override
    public EntityModel<Agg> process(EntityModel<Agg> model) {
        return model;
    }
}
