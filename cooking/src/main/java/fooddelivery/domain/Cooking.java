package fooddelivery.domain;

import fooddelivery.CookingApplication;
import fooddelivery.domain.Accepted;
import fooddelivery.domain.Canceled;
import fooddelivery.domain.CookingEnd;
import fooddelivery.domain.CookingStarted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cooking_table")
@Data
public class Cooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long storeId;

    private String status;

    private Long foodId;

    @PostPersist
    public void onPostPersist() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();

        Canceled canceled = new Canceled(this);
        canceled.publishAfterCommit();

        CookingStarted cookingStarted = new CookingStarted(this);
        cookingStarted.publishAfterCommit();

        CookingEnd cookingEnd = new CookingEnd(this);
        cookingEnd.publishAfterCommit();
    }

    public static CookingRepository repository() {
        CookingRepository cookingRepository = CookingApplication.applicationContext.getBean(
            CookingRepository.class
        );
        return cookingRepository;
    }
}
