package cn.sys.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-04-21
 */
public class ConsuRecord {
    private Integer id;

    /**
     * 消费用途
     */
    private String consu_name;

    /**
     * 消费详细
     */
    private String consu_des;

    /**
     * 消费地址
     */
    private String consu_ads;

    /**
     * 消费时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date consu_time;

    /**
     * 消费金额
     */
    private BigDecimal consu_money;

    private Integer consu_cate;
    private String consuCateDisp;

    private Integer consu_way;

    /**
     * 是否打印发票
     */
    private String comsu_rep;

    private Integer uid;

    private String bak1;

    private String bak2;

    private String bak3;
    
    private ConsuWay consuWay;

    public String getConsuCateDisp() {
		return consuCateDisp;
	}

	public void setConsuCateDisp(String consuCateDisp) {
		this.consuCateDisp = consuCateDisp;
	}

	public ConsuWay getConsuWay() {
		return consuWay;
	}

	public void setConsuWay(ConsuWay consuWay) {
		this.consuWay = consuWay;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsu_name() {
        return consu_name;
    }

    public void setConsu_name(String consu_name) {
        this.consu_name = consu_name == null ? null : consu_name.trim();
    }

    public String getConsu_des() {
        return consu_des;
    }

    public void setConsu_des(String consu_des) {
        this.consu_des = consu_des == null ? null : consu_des.trim();
    }

    public String getConsu_ads() {
        return consu_ads;
    }

    public void setConsu_ads(String consu_ads) {
        this.consu_ads = consu_ads == null ? null : consu_ads.trim();
    }

    public Date getConsu_time() {
        return consu_time;
    }

    public void setConsu_time(Date consu_time) {
        this.consu_time = consu_time;
    }

    public BigDecimal getConsu_money() {
        return consu_money;
    }

    public void setConsu_money(BigDecimal consu_money) {
        this.consu_money = consu_money;
    }

    public Integer getConsu_cate() {
        return consu_cate;
    }

    public void setConsu_cate(Integer consu_cate) {
        this.consu_cate = consu_cate;
    }

    public Integer getConsu_way() {
        return consu_way;
    }

    public void setConsu_way(Integer consu_way) {
        this.consu_way = consu_way;
    }

    public String getComsu_rep() {
        return comsu_rep;
    }

    public void setComsu_rep(String comsu_rep) {
        this.comsu_rep = comsu_rep == null ? null : comsu_rep.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3 == null ? null : bak3.trim();
    }
}