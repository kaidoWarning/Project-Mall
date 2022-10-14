package com.example.mall.product.dao;

import com.example.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kaido
 * @email 2423751519@qq.com
 * @date 2022-10-14 09:43:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
