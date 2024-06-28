package com.lzh.cloud.service.impl;

import com.lzh.cloud.entities.Pay;
import com.lzh.cloud.mapper.PayMapper;
import com.lzh.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: li zhihong
 * @Date: 2024/6/28 14:19
 */
@Service
public class PayServiceImpl implements PayService {
  @Resource
  PayMapper payMapper;
  @Override
  public int add(Pay pay){
    return payMapper.insertSelective(pay);
  }
  @Override
  public int delete(Integer id){
    return payMapper.deleteByPrimaryKey(id);
  }
  @Override
  public int update(Pay pay){
    return payMapper.updateByPrimaryKeySelective(pay);
  }
  @Override
  public Pay getById(Integer id){
    return payMapper.selectByPrimaryKey(id);
  }
  @Override
  public List<Pay> getAll(){
    return payMapper.selectAll();
  }
}