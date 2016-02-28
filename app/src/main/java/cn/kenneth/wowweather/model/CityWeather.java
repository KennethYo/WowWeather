package cn.kenneth.wowweather.model;

import java.util.List;

/**
 * Created by Kenneth on 2016/2/21.
 */
public class CityWeather {

    /**
     * city : 牙克石
     * cnty : 中国
     * id : CN101081011
     * lat : 49.274000
     * lon : 121.474000
     * update : {"loc":"2016-02-21 21:21","utc":"2016-02-21 13:21"}
     */

    private Basic basic;
    /**
     * cond : {"code":"100","txt":"晴"}
     * fl : -29
     * hum : 74
     * pcpn : 0
     * pres : 1033
     * tmp : -30
     * vis : 0
     * wind : {"deg":"340","dir":"北风","sc":"微风","spd":"0"}
     */

    private Now now;
    /**
     * basic : {"city":"牙克石","cnty":"中国","id":"CN101081011","lat":"49.274000","lon":"121.474000","update":{"loc":"2016-02-21 21:21","utc":"2016-02-21 13:21"}}
     * daily_forecast : [{"astro":{"sr":"06:53","ss":"17:22"},"cond":{"code_d":"500","code_n":"100","txt_d":"薄雾","txt_n":"晴"},"date":"2016-02-21","hum":"95","pcpn":"0.0","pop":"47","pres":"1026","tmp":{"max":"-20","min":"-32"},"vis":"2","wind":{"deg":"250","dir":"西北风","sc":"3-4","spd":"12"}},{"astro":{"sr":"06:51","ss":"17:24"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2016-02-22","hum":"91","pcpn":"0.2","pop":"51","pres":"1033","tmp":{"max":"-18","min":"-32"},"vis":"10","wind":{"deg":"307","dir":"西北风","sc":"微风","spd":"3"}},{"astro":{"sr":"06:49","ss":"17:25"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2016-02-23","hum":"96","pcpn":"0.0","pop":"5","pres":"1034","tmp":{"max":"-17","min":"-30"},"vis":"2","wind":{"deg":"266","dir":"西北风","sc":"微风","spd":"10"}},{"astro":{"sr":"06:47","ss":"17:27"},"cond":{"code_d":"104","code_n":"104","txt_d":"阴","txt_n":"阴"},"date":"2016-02-24","hum":"94","pcpn":"0.1","pop":"67","pres":"1032","tmp":{"max":"-16","min":"-29"},"vis":"10","wind":{"deg":"285","dir":"西北风","sc":"微风","spd":"8"}},{"astro":{"sr":"06:45","ss":"17:28"},"cond":{"code_d":"104","code_n":"101","txt_d":"阴","txt_n":"多云"},"date":"2016-02-25","hum":"96","pcpn":"0.2","pop":"10","pres":"1031","tmp":{"max":"-15","min":"-27"},"vis":"10","wind":{"deg":"256","dir":"西北风","sc":"微风","spd":"7"}},{"astro":{"sr":"06:43","ss":"17:30"},"cond":{"code_d":"104","code_n":"101","txt_d":"阴","txt_n":"多云"},"date":"2016-02-26","hum":"94","pcpn":"0.0","pop":"1","pres":"1025","tmp":{"max":"-14","min":"-26"},"vis":"10","wind":{"deg":"244","dir":"无持续风向","sc":"微风","spd":"2"}},{"astro":{"sr":"06:41","ss":"17:32"},"cond":{"code_d":"104","code_n":"100","txt_d":"阴","txt_n":"晴"},"date":"2016-02-27","hum":"96","pcpn":"0.6","pop":"45","pres":"1019","tmp":{"max":"-13","min":"-27"},"vis":"5","wind":{"deg":"249","dir":"无持续风向","sc":"微风","spd":"2"}}]
     * hourly_forecast : [{"date":"2016-02-21 22:00","hum":"100","pop":"0","pres":"1031","tmp":"-29","wind":{"deg":"235","dir":"西南风","sc":"微风","spd":"4"}}]
     * now : {"cond":{"code":"100","txt":"晴"},"fl":"-29","hum":"74","pcpn":"0","pres":"1033","tmp":"-30","vis":"0","wind":{"deg":"340","dir":"北风","sc":"微风","spd":"0"}}
     * status : ok
     * suggestion : {"comf":{"brf":"极不舒适","txt":"白天天气虽然晴好，但气温低，您会感觉十分寒冷，极不舒适，请注意保暖，并避免出门，以防冻伤。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"寒冷","txt":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。"},"flu":{"brf":"极易发","txt":"天气寒冷，且昼夜温差很大，极易发生感冒。请特别注意增加衣服保暖防寒。"},"sport":{"brf":"较不宜","txt":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。"},"trav":{"brf":"较不宜","txt":"天气较好，但温度很低，且风稍大，可有选择进行出游，比如说选择雪上项目，这也不错哦。"},"uv":{"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}}
     */

    private Aqi aqi;

    private String status;
    /**
     * comf : {"brf":"极不舒适","txt":"白天天气虽然晴好，但气温低，您会感觉十分寒冷，极不舒适，请注意保暖，并避免出门，以防冻伤。"}
     * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
     * drsg : {"brf":"寒冷","txt":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。"}
     * flu : {"brf":"极易发","txt":"天气寒冷，且昼夜温差很大，极易发生感冒。请特别注意增加衣服保暖防寒。"}
     * sport : {"brf":"较不宜","txt":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。"}
     * trav : {"brf":"较不宜","txt":"天气较好，但温度很低，且风稍大，可有选择进行出游，比如说选择雪上项目，这也不错哦。"}
     * uv : {"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}
     */

    private Suggestion suggestion;
    /**
     * astro : {"sr":"06:53","ss":"17:22"}
     * cond : {"code_d":"500","code_n":"100","txt_d":"薄雾","txt_n":"晴"}
     * date : 2016-02-21
     * hum : 95
     * pcpn : 0.0
     * pop : 47
     * pres : 1026
     * tmp : {"max":"-20","min":"-32"}
     * vis : 2
     * wind : {"deg":"250","dir":"西北风","sc":"3-4","spd":"12"}
     */

    private List<DailyForecast> daily_forecast;
    /**
     * date : 2016-02-21 22:00
     * hum : 100
     * pop : 0
     * pres : 1031
     * tmp : -29
     * wind : {"deg":"235","dir":"西南风","sc":"微风","spd":"4"}
     */

    private List<HourlyForecast> hourly_forecast;

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public void setDaily_forecast(List<DailyForecast> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public void setHourly_forecast(List<HourlyForecast> hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }

    public Aqi getAqi() {
        return aqi;
    }

    public void setAqi(Aqi aqi) {
        this.aqi = aqi;
    }

    public Basic getBasic() {
        return basic;
    }

    public Now getNow() {
        return now;
    }

    public String getStatus() {
        return status;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public List<DailyForecast> getDaily_forecast() {
        return daily_forecast;
    }

    public List<HourlyForecast> getHourly_forecast() {
        return hourly_forecast;
    }

}
