package com.lzh.cloud.service;

import com.lzh.cloud.entities.Pay;

import java.util.List;

/**
 * @Auther: li zhihong
 * @Date: 2024/6/28 14:17
 */
public interface PayService {
   int add(Pay pay);
   int delete(Integer id);
   int update(Pay pay);
   Pay   getById(Integer id);
   List<Pay> getAll();
}
