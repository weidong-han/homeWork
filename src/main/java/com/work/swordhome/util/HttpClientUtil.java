package com.work.swordhome.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

/**
 * Created by weidong.han on 2019/7/17.
 */
public class HttpClientUtil{
    private  static  final Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    private static final int MAX_TOTAL = 100;
    private static final int MAX_PERROUTE = 50;
    public static CloseableHttpClient getHttpClient() {
        ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy = new ServiceUnavailableRetryStrategy() {
            /**
             * retry逻辑
             */
            @Override
            public boolean retryRequest(HttpResponse response, int executionCount, HttpContext context) {
                if ((response.getStatusLine().getStatusCode() != HttpStatus.OK.value()) && executionCount <= 10 )
                    return true;
                else
                    return false;
            }

            /**
             * retry间隔时间
             */
            @Override
            public long getRetryInterval() {
                return 3000;
            }
        };
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.setMaxTotal(MAX_TOTAL);
        cm.setDefaultMaxPerRoute(MAX_PERROUTE);
        CloseableHttpClient httpClient = HttpClients.custom().setRetryHandler(new DefaultHttpRequestRetryHandler())
                .setConnectionManager(cm).build();
        return httpClient;
    }
}
