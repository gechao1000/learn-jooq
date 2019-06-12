package com.example.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jooq.Record;
import org.jooq.Result;

/**
 * ResultConverter class
 *
 * @author gexc
 * @date 2019/06/11
 */
public class ResultConverter {

    public JSONArray toArray(Result<Record> result) {
        JSONArray list = new JSONArray();
        JSONObject json = null;
        for (Record record: result) {
            json = new JSONObject();

        }

        return null;
    }
}
