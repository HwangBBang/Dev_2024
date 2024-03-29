package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

// dto 경우 Data 애노테이션 사용해도 되지만,
// 핵심 도메인에서 @Data 는 좀 위험하다 .
@Getter
@Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
