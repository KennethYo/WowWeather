package cn.kenneth.wowweather.model;

/**
 * 实况天气
 * Created by Kenneth on 2016/2/21.
 */
public class Now {
    /**
     * code : 100
     * txt : 晴
     */

    private Cond cond;
    private String fl;
    private String hum;
    private String pcpn;
    private String pres;
    private String tmp;
    private String vis;
    /**
     * deg : 340
     * dir : 北风
     * sc : 微风
     * spd : 0
     */

    private Wind wind;

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Cond getCond() {
        return cond;
    }

    public String getFl() {
        return fl;
    }

    public String getHum() {
        return hum;
    }

    public String getPcpn() {
        return pcpn;
    }

    public String getPres() {
        return pres;
    }

    public String getTmp() {
        return tmp;
    }

    public String getVis() {
        return vis;
    }

    public Wind getWind() {
        return wind;
    }

    public static class Cond {
        private String code;
        private String txt;

        public void setCode(String code) {
            this.code = code;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getCode() {
            return code;
        }

        public String getTxt() {
            return txt;
        }
    }

    public static class Wind {
        private String deg;
        private String dir;
        private String sc;
        private String spd;

        public void setDeg(String deg) {
            this.deg = deg;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public void setSc(String sc) {
            this.sc = sc;
        }

        public void setSpd(String spd) {
            this.spd = spd;
        }

        public String getDeg() {
            return deg;
        }

        public String getDir() {
            return dir;
        }

        public String getSc() {
            return sc;
        }

        public String getSpd() {
            return spd;
        }
    }
}
