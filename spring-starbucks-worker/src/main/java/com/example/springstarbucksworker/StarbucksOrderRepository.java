
package com.example.springstarbucksworker;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StarbucksOrderRepository extends CrudRepository<StarbucksOrder, Integer> {

	 // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
	 // https://docs.spring.io/spring-data/data-commons/docs/current/reference/html/#repositories.query-methods.query-creation

	List<StarbucksOrder> findByOrderNumber(String orderNumber) ;

}

/* See Also:

* https://www.baeldung.com/spring-data-query-by-example
* https://www.baeldung.com/spring-data-derived-queries
* https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-jpa-repo

*/