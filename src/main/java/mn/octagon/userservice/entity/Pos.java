package mn.octagon.userservice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mn.octagon.userservice.entity.Enums.PosStatusType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pos")
public class Pos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "tax_number")
    private String tax_number;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "tax_branch")
    private String tax_branch;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "pos_status")
    @Enumerated(EnumType.ORDINAL)
    private PosStatusType pos_status;
}
