package cn.kenneth.wowweather.network;

import cn.kenneth.wowweather.model.CityWeather;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Kenneth on 2016/2/21.
 */
public interface APIServices {
    @GET("heweather/weather/free")
    Observable<CityWeather> getWeather(@Query("city") String city);
}
