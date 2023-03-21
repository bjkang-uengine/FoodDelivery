package fooddelivery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_Notify(@Payload OrderPlaced orderPlaced) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener Notify : " + orderPlaced + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCanceled'"
    )
    public void wheneverOrderCanceled_Notify(
        @Payload OrderCanceled orderCanceled
    ) {
        OrderCanceled event = orderCanceled;
        System.out.println(
            "\n\n##### listener Notify : " + orderCanceled + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Accepted'"
    )
    public void wheneverAccepted_Notify(@Payload Accepted accepted) {
        Accepted event = accepted;
        System.out.println("\n\n##### listener Notify : " + accepted + "\n\n");
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Canceled'"
    )
    public void wheneverCanceled_Notify(@Payload Canceled canceled) {
        Canceled event = canceled;
        System.out.println("\n\n##### listener Notify : " + canceled + "\n\n");
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookingStarted'"
    )
    public void wheneverCookingStarted_Notify(
        @Payload CookingStarted cookingStarted
    ) {
        CookingStarted event = cookingStarted;
        System.out.println(
            "\n\n##### listener Notify : " + cookingStarted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookingEnd'"
    )
    public void wheneverCookingEnd_Notify(@Payload CookingEnd cookingEnd) {
        CookingEnd event = cookingEnd;
        System.out.println(
            "\n\n##### listener Notify : " + cookingEnd + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeeveryStarted'"
    )
    public void wheneverDeeveryStarted_Notify(
        @Payload DeeveryStarted deeveryStarted
    ) {
        DeeveryStarted event = deeveryStarted;
        System.out.println(
            "\n\n##### listener Notify : " + deeveryStarted + "\n\n"
        );
        // Sample Logic //

    }
}
