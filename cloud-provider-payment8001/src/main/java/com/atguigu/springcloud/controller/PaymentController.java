package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author cry
 * @date 2020年11月02日 0:06
 * @description
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果===>{}",result);
        if (result > 0 ){
            return new CommonResult(200,"插入数据库成功",result);
        }else{
            return new CommonResult(200,"插入数据库失败",result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果222===>{}",payment);
        if (Objects.nonNull(payment)){
            return new CommonResult(200,"查询成功126666663123123",payment);
        }else{
            return new CommonResult(200,"查询失败,查询id"+id,payment);
        }

    }

}
