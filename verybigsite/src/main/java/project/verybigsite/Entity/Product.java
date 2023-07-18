package project.verybigsite.Entity;

import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.verybigsite.Enums.Tags;

import java.util.ArrayList;

@Entity
//@Table(name = "products")
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "priceOfProduct")
    private Long priceOfProduct;

    @Column(name = "quantityProduct")
    private Long quantityProduct;

    @Column(name = "scrForImage")
    private String scrForImage;

    @Column(name = "tagsList")
    private ArrayList<Tags> tagsList;

    @Column(name = "active")
    private boolean active;

    public Product(String productName, Long priceOfProduct, Long quantityProduct, String scrForImage){
        this.productName=productName;
        this.priceOfProduct=priceOfProduct;
        this.quantityProduct=quantityProduct;
        this.scrForImage=scrForImage;
    }
}
