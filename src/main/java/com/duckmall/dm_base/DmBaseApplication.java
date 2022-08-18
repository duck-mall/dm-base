package com.duckmall.dm_base;

import com.duckmall.dm_base.model.RootModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DmBaseApplication {

    public static void main(String[] args) {
        RootModel<Object> objectRootModel = new RootModel<>();
        SpringApplication.run(DmBaseApplication.class, args);
    }

}
