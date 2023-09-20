package mn.octagon.userservice.entity.Invoice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bank_transaction")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "rrn")
    private BigDecimal rrn;

    @Column(name = "bank_id")
    private String bank_id;

    @Column(name = "terminal_id")
    private String terminal_id;

    @Column(name = "approval_code")
    private String approval_code;

    @Column(name = "amount")
    private BigDecimal amount;
}
