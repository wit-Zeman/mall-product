package com.zeman.mall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeman.mall.product.domain.Category;
import com.zeman.mall.product.service.CategoryService;
import com.zeman.mall.product.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author xzhan
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2023-12-10 20:37:43
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




