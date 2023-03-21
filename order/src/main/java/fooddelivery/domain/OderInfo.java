package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OderInfo extends AbstractEvent {

    private Long id;

    public OderInfo(Order aggregate) {
        super(aggregate);
    }

    public OderInfo() {
        super();
    }
}
