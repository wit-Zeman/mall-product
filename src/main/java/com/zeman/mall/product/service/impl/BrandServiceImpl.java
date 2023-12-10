package com.zeman.mall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeman.mall.product.domain.Brand;
import com.zeman.mall.product.service.BrandService;
import com.zeman.mall.product.mapper.BrandMapper;
import org.springframework.stereotype.Service;

/**
* @author xzhan
* @description 针对表【pms_brand(品牌)】的数据库操作Service实现
* @createDate 2023-12-10 20:37:43
*/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
    implements BrandService{

}




