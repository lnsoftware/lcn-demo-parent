package com.mysoft.lcn.service;

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @auth lnsof
 * @Date 2018/10/1 21:31
 * @Version 1.0
 */
@Service
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {


    @Value("${tm.manager.url}")
    private String url;

    @Override
    public String getTxUrl() {
        System.out.println("load tm.manager.url ");
        return url;
    }
}