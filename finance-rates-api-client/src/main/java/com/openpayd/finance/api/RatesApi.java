package com.openpayd.finance.api;

import com.openpayd.finance.api.response.RatesApiResponse;
import feign.Param;
import feign.RequestLine;

import java.util.Currency;

public interface RatesApi {


    @RequestLine("GET {path}?access_key={accessKey}&base={base}&symbols={symbols}")
    RatesApiResponse getRates(@Param("path") String path,
                              @Param("accessKey") String accessKey,
                              @Param("base") Currency base,
                              @Param("symbols") String symbols);

}
