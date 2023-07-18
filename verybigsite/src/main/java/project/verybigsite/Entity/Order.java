package project.verybigsite.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import project.verybigsite.Enums.OrderStatus;

import java.util.ArrayList;

@Entity
@NoArgsConstructor
public class Order {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "statusOfOrder")
    private OrderStatus statusOfOrder;

    @Column(name = "priceOfOrder")
    private Long priceOfOrder;

    @Column(name = "productListInOrder")
    private ArrayList<Product> productListInOrder;

    //@manytoOne
    @Column(name = "userOfOrder")
    private User userOfOrder;
}

