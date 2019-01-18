package com.employ.controller;

import com.employ.properties.GirlProperties;
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
 * @create 2019-01-18 15:36
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    private static final Logger logger = LoggerFactory.getLogger(GirlController.class);

    private final GirlProperties girlProperties;

    @Autowired
    public GirlController(GirlProperties girlProperties) {
        this.girlProperties = girlProperties;
    }

    @GetMapping("/info")
    public GirlProperties getInfo(){
        logger.info("===================================================");
        logger.info(girlProperties.toString());
        logger.info("===================================================");
        return girlProperties;
    }
}
