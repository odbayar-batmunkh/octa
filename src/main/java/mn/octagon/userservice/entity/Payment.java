package mn.octagon.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mn.octagon.userservice.entity.Enums.PaymentMethodType;
import mn.octagon.userservice.entity.Invoice.BankTransaction;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total_amount")
    private BigDecimal total_amount;

    @Column(name = "payment_method_type")
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethodType payment_method_type;

    @OneToOne
    @JoinColumn(name = "bank_transaction")
    private BankTransaction bank_transaction;

    @OneToOne
    @JoinColumn(name = "bank_id")
    private Bank bank_id;
}
