package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeeveryStarted extends AbstractEvent {

    private Long id;

    public DeeveryStarted(Deelivery aggregate) {
        super(aggregate);
    }

    public DeeveryStarted() {
        super();
    }
}
