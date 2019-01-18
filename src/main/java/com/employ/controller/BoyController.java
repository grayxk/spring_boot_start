package com.employ.controller;

import com.employ.properties.BoyProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author grayAdmin
 * @email qxk5670@163.com
 * @create 2019-01-18 15:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("boy")
public class BoyController {

    private static final Logger logger = LoggerFactory.getLogger(GirlController.class);

    private final BoyProperties boyProperties;

    @Autowired
    public BoyController(BoyProperties boyProperties) {
        this.boyProperties = boyProperties;
    }

    @GetMapping("/info")
    public BoyProperties getInfo(){
        logger.info("===================================================");
        logger.info(boyProperties.toString());
        logger.info("===================================================");
        return boyProperties;
    }
}
