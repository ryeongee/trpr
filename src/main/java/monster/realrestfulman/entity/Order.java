package monster.realrestfulman.entity;

import jakarta.persistence.*;
import lombok.Getter;

/**
 * Created by Robin on 2023/12/22.
 * Description :
 */
@Entity
@Table(name = "ORDER")
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long productListId;
    @Column
    private int amount;

}
