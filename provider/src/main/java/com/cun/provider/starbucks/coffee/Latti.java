package com.cun.provider.starbucks.coffee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试springboot
 * Created by LiuYuanZhe on 2018/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Latti {
    private static Logger logger = LoggerFactory.getLogger(Latti.class);

    @Test
    public void testLog(){
        logger.debug("debug：....");
        logger.info(logger.getClass().getName()+":info...");
        logger.error(logger.getName()+":error...");
    }


    public static void main(String[] args) {

    }
}
