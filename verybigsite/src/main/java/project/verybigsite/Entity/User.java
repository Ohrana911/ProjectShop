package project.verybigsite.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.verybigsite.Enums.UserRole;
import project.verybigsite.WishList;

@Entity
//@Table(name = "products")
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "userRole")
    private UserRole userRole;

    //@oneToOne
    @Column(name = "userCart")
    private Cart userCart;

    //@onetoone
    @Column(name = "userWishList")
    private WishList userWishList;

    //@onetomany
    @Column(name = "userOrders")
    private Order userOrder;

    public User(String fullName, String email){
        this.fullName=fullName;
        this.email=email;
    }
}
