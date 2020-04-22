package cn.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.CategoryMapper;
import cn.sys.dao.ConsuWayMapper;
import cn.sys.entity.Category;
import cn.sys.entity.ConsuWay;
import cn.sys.entity.ConsuWayExample;
import cn.sys.service.CategoryService;
import cn.sys.utils.PageResult;
import cn.sys.utils.TreeUtils;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private ConsuWayMapper consuWayMapper;

	@Override
	public int delete(int id) {
		List<Integer> listId = new ArrayList<>();
		listId.add(id);
		selectAllChild(id, listId);
		return categoryMapper.deleteByPrimaryKeys(listId);
	}
	
	public void selectAllChild(int id, List<Integer> listId){
		List<Category> listByParent = categoryMapper.getListByParent(id);
		if(listByParent.size()>0){
			listByParent.forEach(p -> {
				listId.add(p.getId());
				selectAllChild(p.getId(), listId);
			});
		}
	}

	@Override
	public JSONArray findAllByUid(Category category) {
		List datas = categoryMapper.findAllByUid(category.getUid());
        JSONArray array = new JSONArray();
        TreeUtils.setPermissionsTree(0, datas, array);
        return array;
	}

	@Override
	public int add(Category category) {
		return categoryMapper.insert(category);
	}

	@Override
	public Category findOne(Integer id) {
		return categoryMapper.selectByPrimary(id);
	}

	@Override
	public int edit(Category category) {
		return categoryMapper.updateByPrimary(category);
	}

	@Override
	public List<ConsuWay> findAllConsuWay(ConsuWayExample consuWayExample) {
		return consuWayMapper.selectByExample(consuWayExample);
	}
	
	

}
