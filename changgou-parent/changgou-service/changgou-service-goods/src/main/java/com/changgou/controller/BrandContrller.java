package com.changgou.controller;/*
 *@Date2021/12/512:07
 *@AuthorAdministrator
 */

import com.changgou.goods.pojo.Brand;
import com.changgou.pojo.Result;
import com.changgou.pojo.StatusCode;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
@CrossOrigin
/* 跨域  不同域名|端口|协议之间的访问
 */
public class BrandContrller {
    /*查询所有品牌*/
    @Autowired
    private BrandService brandService;

    @GetMapping
    public Result<List<Brand>> findAll() {
        List<Brand> brandList = brandService.findAll();
        return new Result<List<Brand>>(true, StatusCode.OK, "success", brandList);
    }

    @GetMapping("/{id}")
    public Result<Brand> findById(@PathVariable(value = "id", required = true) Integer id) {
        Brand brand = brandService.findById(id);
        return new Result<Brand>(true, StatusCode.OK, "success", brand);
    }

    @PostMapping
    public Result addBrand(@RequestBody  Brand brand) {  //@RequestBody将json格式转为对象
        Integer addStatus = brandService.add(brand);
        Boolean flag = false;
        Integer statusCode = StatusCode.ERROR;
        String message = "新增失败!";
        if (addStatus == 1) {
            flag = true;
            statusCode = StatusCode.OK;
            message = "新增成功!";
        }
        return new Result(flag, statusCode, message);
    }


    @PutMapping
    public Result updateBrand(@RequestBody  Brand brand) {  //@RequestBody将json格式转为对象
        Integer updateStatus = brandService.update(brand);
        Boolean flag = false;
        Integer statusCode = StatusCode.ERROR;
        String message = "修改失败!";
        if (updateStatus == 1) {
            flag = true;
            statusCode = StatusCode.OK;
            message = "修改成功!";
        }
        return new Result(flag, statusCode, message);
    }

    @DeleteMapping("/{id}")
    public Result deleteBrand(@PathVariable (value = "id") Integer id){
        Boolean flag = false;
        Integer statusCode = StatusCode.ERROR;
        String message = "删除失败!";
        Integer integer = brandService.delete(id);
        if(integer ==1){
            flag = true;
            statusCode = StatusCode.OK;
            message = "删除成功!";
        }
        return new Result(flag,statusCode,message);
    }
}
