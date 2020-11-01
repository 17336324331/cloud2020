package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author cry
 * @date 2020年11月01日 23:46
 * @description
 */
@Mapper
public interface PaymentDao {

     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
