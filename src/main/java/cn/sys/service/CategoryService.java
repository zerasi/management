package cn.sys.service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;

import cn.sys.entity.Category;
import cn.sys.entity.ConsuWay;
import cn.sys.entity.ConsuWayExample;
import cn.sys.utils.PageResult;

public interface CategoryService {

	int delete(int id);

	JSONArray findAllByUid(Category category);

	int add(Category category);

	Category findOne(Integer id);

	int edit(Category category);

	List<ConsuWay> findAllConsuWay(ConsuWayExample consuWayExample);

}
