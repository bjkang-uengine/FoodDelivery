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

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeeveryStarted'"
    )
    public void wheneverDeeveryStarted_UpdateStatus(
        @Payload DeeveryStarted deeveryStarted
    ) {
        DeeveryStarted event = deeveryStarted;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + deeveryStarted + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryComplete'"
    )
    public void wheneverDeliveryComplete_UpdateStatus(
        @Payload DeliveryComplete deliveryComplete
    ) {
        DeliveryComplete event = deliveryComplete;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + deliveryComplete + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Accepted'"
    )
    public void wheneverAccepted_UpdateStatus(@Payload Accepted accepted) {
        Accepted event = accepted;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + accepted + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Canceled'"
    )
    public void wheneverCanceled_UpdateStatus(@Payload Canceled canceled) {
        Canceled event = canceled;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + canceled + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookingStarted'"
    )
    public void wheneverCookingStarted_UpdateStatus(
        @Payload CookingStarted cookingStarted
    ) {
        CookingStarted event = cookingStarted;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + cookingStarted + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookingEnd'"
    )
    public void wheneverCookingEnd_UpdateStatus(
        @Payload CookingEnd cookingEnd
    ) {
        CookingEnd event = cookingEnd;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + cookingEnd + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }
}
