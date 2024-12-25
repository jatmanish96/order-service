package com.ecp.os.serviceimpl;

import com.ecp.os.models.Order;
import com.ecp.os.repository.OrderRepository;
import com.ecp.os.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    public static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public ResponseEntity<Order> get(Long order_id) {
        logger.info("Order Service class get method order_id: {}",order_id);
        try {
            Optional<Order> order=orderRepository.findById(order_id);
            if(order.isEmpty()){
                throw new NoSuchElementException("No order found for thid order_id :"+order_id);
            }
           return ResponseEntity.ok().body(order.get());
        } catch (Exception e) {
            logger.error("Order Service class get method error : {}",e.getStackTrace());
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<Order> create(Order order) {
        logger.info("Order Service class create method order: {}",order);
        return null;
    }
}
