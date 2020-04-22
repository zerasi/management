package cn.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.CategoryMapper;
import cn.sys.dao.UserMapper;
import cn.sys.dao.UserMapper;
import cn.sys.entity.Category;
import cn.sys.entity.User;
import cn.sys.entity.UserExample;
import cn.sys.entity.User;
import cn.sys.service.UserService;
import cn.sys.service.UserService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class UserServiceimpl implements UserService{
	
	@Autowired
	private UserMapper mapper;
	@Autowired
	private UserMapper smapper;
	

	@Override
	public List<User> findAll(UserExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public void add(User User) {
		mapper.insertSelective(User);
	}

	@Override
	public void update(User User) {
		mapper.updateByPrimaryKeySelective(User);
		
	}

	@Override
	public User findOne(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(UserExample example, Integer page, Integer rows) {
		PageHelper.startPage(page,rows);
		Page<User> pages = (Page<User>)this.mapper.selectByExample(example);
		List<User> list =  pages.getResult();
		return new PageResult(pages.getTotal(), pages.getResult());
	}

	@Override
	public void delete(int parseInt) {
		mapper.deleteByPrimaryKey(parseInt);
		
	}

	@Override
	public User login(UserExample example) {
		List<User> list = this.mapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void updategeren(User user) {
		this.mapper.updateByPrimaryKeySelective(user);
		
	}

}
