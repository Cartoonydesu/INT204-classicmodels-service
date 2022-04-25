package sit.int204.classicmodelsservice.entities;

import javax.persistence.*;

@Table(name = "orders", indexes = {
        @Index(name = "customerNumber", columnList = "customerNumber")
})
@Entity
public class Order {
    @Id
    @Column(name = "orderNumber", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customerNumber", nullable = false)
    private Customer customerNumber;

    public Customer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Customer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}