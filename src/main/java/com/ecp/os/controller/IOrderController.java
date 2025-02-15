package com.ecp.os.controller;

import com.ecp.os.models.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface IOrderController {

    @GetMapping("/get")
    ResponseEntity<Order> get(@RequestParam(name = "id") Long order_id);

    @PostMapping("/create")
    ResponseEntity<Order> create(@RequestBody Order ordert);


}
