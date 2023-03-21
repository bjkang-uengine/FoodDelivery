package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Canceled extends AbstractEvent {

    private Long id;

    public Canceled(Cooking aggregate) {
        super(aggregate);
    }

    public Canceled() {
        super();
    }
}
