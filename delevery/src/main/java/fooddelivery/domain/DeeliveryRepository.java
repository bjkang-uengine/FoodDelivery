package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "deeliveries",
    path = "deeliveries"
)
public interface DeeliveryRepository
    extends PagingAndSortingRepository<Deelivery, Long> {}
