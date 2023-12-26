package monster.realrestfulman.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monster.realrestfulman.aop.TraceInfo;
import monster.realrestfulman.controller.dto.OrderRequest;
import monster.realrestfulman.service.OrderService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Robin on 2023/12/13.
 * Description :
 */
@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    public ResponseEntity<?> postOrder1(HttpServletRequest servletRequest, @ModelAttribute OrderRequest request) {
        log.info("주문내역::상품=" + request.getProductName() + ":가격=" + request.getAmount());
        Map<String, String> body = new HashMap<>();
        body.put("msg", "주문 완료!");


        HttpHeaders headers = new HttpHeaders();
        headers.add("traceInfo", servletRequest.getHeader("traceInfo"));
        return ResponseEntity.ok().headers(headers).body(body);
    }

    @PostMapping
    public ResponseEntity<?> postOrder2(@TraceInfo String traceInfo, @RequestBody OrderRequest request) {
        log.info("주문내역::상품=" + request.getProductName() + ":가격=" + request.getAmount());
        HttpHeaders headers = new HttpHeaders();
        headers.add("traceInfo", traceInfo);
        Map<String, String> body = new HashMap<>();
        body.put("msg", "주문 완료!");
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(body);
    }
}
