package cn.sys.handler;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;

import cn.sys.entity.Category;
import cn.sys.entity.ConsuWay;
import cn.sys.entity.ConsuWayExample;
import cn.sys.entity.User;
import cn.sys.service.CategoryService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("findAllByUid")
	public JSONArray findAllByUid(HttpSession session, Category category){
		User existUser = (User) session.getAttribute("user");
		if(existUser!=null){
			category.setUid(existUser.getId());
			return categoryService.findAllByUid(category);
		}
		return null;
	}
	
	@RequestMapping(value="delete")
	public Result delete(Integer id){
		
		try {
			this.categoryService.delete(id);
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Result add(@RequestBody Category category, HttpSession session) {
        //后端如果用springMVC的@RequestBody注解的话，则只能Json对象的字符串，不能接收Json对象
        try {
        	User existUser = (User) session.getAttribute("user");
    		if(existUser!=null){
    			category.setUid(existUser.getId());
    			if(category.getParentId() == null){
    				category.setParentId(0);
    			}
    			int rows = categoryService.add(category);
    			return new Result(true, "操作成功");
    		}
    		return new Result(false, "请您先登录");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
    }
	
	@RequestMapping(value="edit", method = RequestMethod.POST)
	public Result edit(@RequestBody Category category, HttpSession session) {
        //后端如果用springMVC的@RequestBody注解的话，则只能Json对象的字符串，不能接收Json对象
        try {
        	User existUser = (User) session.getAttribute("user");
    		if(existUser!=null){
    			category.setUid(existUser.getId());
    			if(category.getParentId() == null){
    				category.setParentId(0);
    			}
    			int rows = categoryService.edit(category);
    			return new Result(true, "操作成功");
    		}
    		return new Result(false, "请您先登录");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
    }
	
	@RequestMapping("findOne")
	public Category findOne(Integer id){
		return categoryService.findOne(id);
	}
	
	@RequestMapping("findAllConsuWay")
	public List<ConsuWay> findAllConsuWay(ConsuWay consuWay){
		return categoryService.findAllConsuWay(new ConsuWayExample());
	}
	
}
