package lab.webservices.pizzaorder.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customer;

    private String pizzas;

    private int price;

}
