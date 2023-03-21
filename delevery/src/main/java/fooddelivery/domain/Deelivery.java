package fooddelivery.domain;

import fooddelivery.DeleveryApplication;
import fooddelivery.domain.DeeveryStarted;
import fooddelivery.domain.DeliveryComplete;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Deelivery_table")
@Data
public class Deelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long customerId;

    private Long storeId;

    private Long foodId;

    private String status;

    private String adress;

    @PostPersist
    public void onPostPersist() {
        DeeveryStarted deeveryStarted = new DeeveryStarted(this);
        deeveryStarted.publishAfterCommit();

        DeliveryComplete deliveryComplete = new DeliveryComplete(this);
        deliveryComplete.publishAfterCommit();
    }

    public static DeeliveryRepository repository() {
        DeeliveryRepository deeliveryRepository = DeleveryApplication.applicationContext.getBean(
            DeeliveryRepository.class
        );
        return deeliveryRepository;
    }

    public static void orderInfo(OderInfo oderInfo) {
        /** Example 1:  new item 
        Deelivery deelivery = new Deelivery();
        repository().save(deelivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(oderInfo.get???()).ifPresent(deelivery->{
            
            deelivery // do something
            repository().save(deelivery);


         });
        */

    }
}
