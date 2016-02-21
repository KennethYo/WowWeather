package cn.kenneth.wowweather.model;

/**
 * 基本信息
 * Created by Kenneth on 2016/2/21.
 */
public class Basic {
    private String city;
    private String cnty;
    private String id;
    private String lat;
    private String lon;
    /**
     * loc : 2016-02-21 21:21
     * utc : 2016-02-21 13:21
     */

    private Update update;

    public void setCity(String city) {
        this.city = city;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public String getCity() {
        return city;
    }

    public String getCnty() {
        return cnty;
    }

    public String getId() {
        return id;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public Update getUpdate() {
        return update;
    }

    public static class Update {
        private String loc;
        private String utc;

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public void setUtc(String utc) {
            this.utc = utc;
        }

        public String getLoc() {
            return loc;
        }

        public String getUtc() {
            return utc;
        }
    }
}
