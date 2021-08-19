package lab.webservices.pizzaorder.repositories;

import lab.webservices.pizzaorder.entities.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

    PizzaOrder findOrderById(Long id);

}
