package com.changgou.service.impl;/*
 *@Date2021/12/512:05
 *@AuthorAdministrator
 */

import com.changgou.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;
    /*
    *查询所有
    *@return
    */
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    /*
    * 通过id查询
    * */
    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /*
    * 新增品牌
    * */
    @Override
    public Integer add(Brand brand) {
        return brandMapper.insertSelective(brand);
    }

    /*
    * 修改
    * */
    @Override
    public Integer update(Brand brand) {
        return brandMapper.updateByPrimaryKeySelective(brand);
    }
    /*
     * 删除
     * */
    @Override
    public Integer delete(Integer id) {
        return brandMapper.deleteByPrimaryKey(id);
    }
}
