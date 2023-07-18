package project.verybigsite.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@NoArgsConstructor
public class Cart {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "priceOfCart")
    private Long priceOfCart;

    @Column(name = "productListInCart")
    private ArrayList<Product> productListInCart;

    //@oneToOne
    @Column(name = "userOfCart")
    private User userOfCart;
}
