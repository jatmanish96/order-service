package com.ecp.os.controllerimpl;

import com.ecp.os.controller.IOrderController;
import com.ecp.os.models.Order;
import com.ecp.os.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@Slf4j
public class OrderControllerImpl implements IOrderController {

    public static final Logger logger = LoggerFactory.getLogger(OrderControllerImpl.class);

    @Autowired
    private IOrderService orderService;

    @Override
    public ResponseEntity<Order> get(Long order_id) {
        return orderService.get(order_id);
    }
}
