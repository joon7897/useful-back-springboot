package com.exam.config.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    /**
     * String → Map
     *
     * @param str
     * @return Map
     * @throws JsonProcessingException
     */
    public static Map<String, String> convStringToMap(String str) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> map = mapper.readValue(str, Map.class);

        return map;
    }

    /**
     * Map → JSONObject
     *
     * @param map
     * @return JSONObject
     */
    public static JSONObject convMapToJson(Map<String, Object> map) {
        JSONObject jsonObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            jsonObject.put(key, value);
        }
        return jsonObject;
    }

    /**
     * List<Map> → JSONArray
     *
     * @param list
     * @return jsonArray
     */
    public static JSONArray convListMapToJsonArray(List<Map<String, Object>> list) {
        JSONArray jsonArray = new JSONArray();
        for (Map<String, Object> map : list) {
            jsonArray.add(convMapToJson(map));
        }
        return jsonArray;
    }

    /**
     * JSON → Map
     *
     * @param jsonObj
     * @return map
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> convJsonToMap(JSONObject jsonObj) {
        Map<String, Object> map = null;

        try {
            map = new ObjectMapper().readValue(jsonObj.toJSONString(), Map.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * JSONArray → List<Map>
     *
     * @param jsonArray
     * @return list
     */
    public static List<Map<String, Object>> convListMapToJsonArray(JSONArray jsonArray) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        if (jsonArray != null) {
            int jsonSize = jsonArray.size();
            for (int i = 0; i < jsonSize; i++) {
                Map<String, Object> map = JsonUtil.convJsonToMap((JSONObject) jsonArray.get(i));
                list.add(map);
            }
        }
        return list;
    }

}
