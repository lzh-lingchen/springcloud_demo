package com.lzh.cloud.exp;

import com.lzh.cloud.resp.ResultData;
import com.lzh.cloud.resp.ReturnCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: li zhihong
 * @Date: 2024/6/28 15:29
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler
{
  /**
   * 默认全局异常处理。
   * @param e the e
   * @return ResultData
   */
  @ExceptionHandler(RuntimeException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public ResultData<String> exception(Exception e) {
    log.error("全局异常信息exception:{}", e.getMessage(), e);
    return ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
  }
}
