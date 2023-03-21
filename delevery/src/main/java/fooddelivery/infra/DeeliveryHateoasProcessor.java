package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeeliveryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Deelivery>> {

    @Override
    public EntityModel<Deelivery> process(EntityModel<Deelivery> model) {
        return model;
    }
}
