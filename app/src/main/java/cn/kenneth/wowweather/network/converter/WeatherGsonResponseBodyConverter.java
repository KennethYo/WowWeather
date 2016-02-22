package cn.kenneth.wowweather.network.converter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by Kenneth on 2016/2/21.
 */
class WeatherGsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final static String PREFIX = "{\"HeWeather data service 3.0\":[";
    private final static String SUFFIX = "]}";
    private final static String KEY_NAME = "HeWeather data service 3.0";
    private final TypeAdapter<T> adapter;
    private final Gson gson;


    public WeatherGsonResponseBodyConverter(TypeAdapter<T> adapter) {
        this.adapter = adapter;
        this.gson = new Gson();
    }


    @Override
    public T convert(ResponseBody value) throws IOException {
        try {
            String string = value.string();
            if (string.startsWith(PREFIX) && string.endsWith(SUFFIX)) {
                JsonObject jsonObject = gson.fromJson(string, JsonObject.class);
                JsonArray jsonArray = jsonObject.getAsJsonArray(KEY_NAME);
                if (jsonArray.size() > 0) {
                    return adapter.fromJsonTree(jsonArray.get(0));
                } else {
                    return null;
                }
            }
            return adapter.fromJson(string);
        } finally {
            value.close();
        }
    }
}
