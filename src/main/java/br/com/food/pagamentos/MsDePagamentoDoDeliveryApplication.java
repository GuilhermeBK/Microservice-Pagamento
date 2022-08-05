package br.com.food.pagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsDePagamentoDoDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDePagamentoDoDeliveryApplication.class, args);
    }

}
