package mn.octagon.userservice.entity.Invoice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mn.octagon.userservice.entity.Payment;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total_price")
    private BigDecimal total_price;

    @Column(name = "total_cost")
    private BigDecimal total_cost;

    @Column(name = "total_pay")
    private BigDecimal total_pay;

    @Column(name = "total_margin")
    private BigDecimal total_margin;

    @OneToMany(mappedBy = "sale")
    private List<Payment> payments;

    public void afterConstruction() {
        this.total_price = BigDecimal.ZERO;
        this.total_cost = BigDecimal.ZERO;
        this.total_pay = BigDecimal.ZERO;
        this.total_margin = BigDecimal.ZERO;
    }
}
