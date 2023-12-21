package monster.realrestfulman.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Robin on 2023/12/13.
 * Description :
 */
@Getter
@AllArgsConstructor
public class RequestOrder {
    @NotEmpty
    private String productName;
    @NotEmpty
    private Integer amount;
}
