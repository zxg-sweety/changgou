package com.changgou.dao;


import com.changgou.goods.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
/*
 *@Date2021/12/512:04
 *@Author zxg
 * DAO使用通用接口Mapper,Dao接口需要继承org.apache.catalina.mapper.Mapper;
 * 增加数据：调用Mapper.Insert()
 * 增加数据：调用Mapper.InsertSelective()
 * 修改数据：调用Mapper.Update(T)
 * 修改数据：调用Mapper.UpdateByPrimarykey(T)
 * 查询数据：调用Mapper.SelectByPrimarykey(T)
 */

public interface BrandMapper  extends Mapper<Brand> {
    /*查询全部*/
    List<Brand> findAll();
    /*根据id查询*/
    Brand findById(Integer id);
}
