package mn.octagon.userservice.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ItemModel {

    private long id;
    private String code;
    private String internal_code;
    private String name;
    private BigDecimal price;
    private BigDecimal cost;

    public ItemModel(Long id, String code, String internal_code, String name,BigDecimal price,BigDecimal cost) {
        this.id = id;
        this.code = code;
        this.internal_code = internal_code;
        this.name = name;
        this.price = price;
        this.cost = cost;
    }
}
