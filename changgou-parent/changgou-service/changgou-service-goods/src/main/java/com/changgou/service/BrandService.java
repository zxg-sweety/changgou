package com.changgou.service;

import com.changgou.goods.pojo.Brand;
import java.util.List;

public interface BrandService {

    List<Brand> findAll();

    Brand findById(Integer id);

    Integer add(Brand brand);

    Integer update(Brand brand);

    Integer delete(Integer id);
}
