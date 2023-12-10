package com.zeman.mall.product;


import com.zeman.mall.product.domain.Brand;
import com.zeman.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService ;
    @Test
    void contextLoads() {
    }

}
