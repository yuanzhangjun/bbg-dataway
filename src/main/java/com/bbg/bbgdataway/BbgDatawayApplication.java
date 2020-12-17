package com.bbg.bbgdataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author yuanzhangjun
 * @date 2020/11/17
 */

@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication(scanBasePackages = {"com.bbg.bbgdataway"})
public class BbgDatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbgDatawayApplication.class, args);
    }

}
