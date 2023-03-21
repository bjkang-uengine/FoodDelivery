package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryComplete extends AbstractEvent {

    private Long id;

    public DeliveryComplete(Deelivery aggregate) {
        super(aggregate);
    }

    public DeliveryComplete() {
        super();
    }
}
