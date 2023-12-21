package monster.realrestfulman.controller;

import monster.realrestfulman.controller.dto.RequestOrder;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robin on 2023/12/13.
 * Description :
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @PostMapping
    public ResponseEntity<?> postOrder(@ModelAttribute RequestOrder request) {
        
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
