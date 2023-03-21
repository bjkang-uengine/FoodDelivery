package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingEnd extends AbstractEvent {

    private Long id;

    public CookingEnd(Cooking aggregate) {
        super(aggregate);
    }

    public CookingEnd() {
        super();
    }
}
