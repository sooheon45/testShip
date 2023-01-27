package shiptest.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shiptest.domain.*;

@Component
public class GggHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ggg>> {

    @Override
    public EntityModel<Ggg> process(EntityModel<Ggg> model) {
        return model;
    }
}
