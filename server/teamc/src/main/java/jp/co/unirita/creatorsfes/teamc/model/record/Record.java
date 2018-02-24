package jp.co.unirita.creatorsfes.teamc.model.record;

import java.util.HashMap;
import java.util.Map;

public class Record {

    private Map<String, String> map;

    public Record() {
        map = new HashMap<>();
    }

    public Record(Record record) {
        this();
        record.getParams().keySet().forEach( key -> {
            map.put(key, record.getParam(key));
        });
    }

    public Map<String, String> getParams() {
        return map;
    }

    public String getParam(String key) {
        return map.get(key);
    }

    public int getParamAsInt(String key) {
        return Integer.parseInt(getParam(key));
    }

    public void setParam(String key, String value) {
        this.map.put(key, value);
    }

    public boolean hasParam(String key) {
        return map.containsKey(key);
    }
}