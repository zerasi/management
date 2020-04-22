package cn.sys.entity;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-04-21
 */
public class ConsuWay {
    private Integer id;

    private String consu_way;

    private String bak1;

    private String bak2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsu_way() {
        return consu_way;
    }

    public void setConsu_way(String consu_way) {
        this.consu_way = consu_way == null ? null : consu_way.trim();
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }
}