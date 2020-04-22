package cn.sys.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 
 * @author wcyong
 * 
 */
public class Category implements Serializable{
	
	private Integer id;
	private Integer parentId;
	private String name;
	private String des;
	private Integer uid;
	private String bak1;
	private String bak2;
	private String text;

	public String getText() {return name; }

	private List<Category> child;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
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
		this.bak1 = bak1;
	}
	public String getBak2() {
		return bak2;
	}
	public void setBak2(String bak2) {
		this.bak2 = bak2;
	}
	public List<Category> getChild() {
		return child;
	}
	public void setChild(List<Category> child) {
		this.child = child;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

}