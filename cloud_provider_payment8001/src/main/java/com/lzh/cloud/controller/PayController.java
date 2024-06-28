package com.lzh.cloud.controller;

import com.lzh.cloud.entities.Pay;
import com.lzh.cloud.entities.PayDTO;
import com.lzh.cloud.resp.ResultData;
import com.lzh.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: li zhihong
 * @Date: 2024/6/28 14:20
 */
@RestController
public class PayController {
  @Resource
  PayService payService;
  @PostMapping(value = "/pay/add")
  public ResultData<String> addPay(@RequestBody Pay pay){
    int i = payService.add(pay);
    return ResultData.success("成功插入记录，返回值："+i);
  }
  @DeleteMapping(value = "/pay/del/{id}")
  public ResultData<String> deletePay(@PathVariable("id") Integer id) {
    int i = payService.delete(id);
    return ResultData.success("成功删除记录，返回值："+i);
  }
  @PutMapping(value = "/pay/update")
  public ResultData<String> updatePay(@RequestBody PayDTO payDTO){
    Pay pay = new Pay();
    BeanUtils.copyProperties(payDTO, pay);
    int i = payService.update(pay);
    return ResultData.success("成功更新记录，返回值："+i);
  }
  @GetMapping(value = "/pay/get/{id}")
  public ResultData<Pay> getById(@PathVariable("id") Integer id){
    return ResultData.success(payService.getById(id));
  }

  @GetMapping(value = "/pay/getAll")
  public ResultData<List<Pay>> getAll(){
    return ResultData.success(payService.getAll());
  }
}
