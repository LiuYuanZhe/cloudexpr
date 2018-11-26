package com.cun.register.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 18/5/25.
 */
@Component
public class ElasticClientUtils {
    public final static String ip = "47.104.0.219";
    public final static String port = "9300";
    private Logger logger = LoggerFactory.getLogger(ElasticClientUtils.class);
    public  TransportClient getClient(String ip ,String port ){
        try {
            return get(ip,port);
        }catch (Exception e){
            e.printStackTrace();
        }
        logger.info("client null failed");
        return null;
    }
    public TransportClient get(String ip ,String port )throws Exception{
        Map<String, String> map = new HashMap<String, String>();
        map.put("cluster.name", "my-application");
        //设置集群名称
        Settings settings = Settings.builder().put(map).build();
        //创建client
        TransportClient client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(ip), Integer.parseInt(port)));
        return client;
    }
    public static void close(TransportClient client){
        client.close();
    }
    public void saveJson(JSONObject json,TransportClient client){
        IndexResponse response = client.prepareIndex("jobs","job").setSource(json, XContentType.JSON).get();
        logger.info("json index:"+response.getIndex()+"json type:"+response.getType()+"json status"+response.status());
    }

    public static void main(String[] args) {
    }

}
