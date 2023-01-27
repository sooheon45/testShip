package shiptest.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shiptest.domain.*;

@RepositoryRestResource(collectionResourceRel = "aggs", path = "aggs")
public interface AggRepository extends PagingAndSortingRepository<Agg, Long> {}
