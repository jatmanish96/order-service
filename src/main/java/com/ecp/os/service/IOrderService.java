package com.ecp.os.service;

import com.ecp.os.models.Order;
import org.springframework.http.ResponseEntity;

public interface IOrderService {

    ResponseEntity<Order>get(Long order_id);

    ResponseEntity<Order>create(Order order);


}
