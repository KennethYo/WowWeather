package cn.kenneth.wowweather.network;

import cn.kenneth.wowweather.model.Model;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Kenneth on 2016/2/21.
 */
public interface APIServices {
    @GET("/heweather/weather/free")
    Observable<Model> getWeather(@Query("city") String city);
}
