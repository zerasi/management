package cn.sys.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.User;
import cn.sys.entity.UserExample;
import cn.sys.service.UserService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("login")
	public Result login(HttpSession session,User User){
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(User.getUsername()).andPasswordEqualTo(User.getPassword());
		User existUser = this.UserService.login(example);
		if(existUser!=null){
			session.setAttribute("user", existUser);
			return new Result(true, "成功");
		}
		return new Result(false, "失败");
	}
	
	@RequestMapping("updatelogin")
	public Result updatelogin(HttpSession session,User User){
		try {
			this.UserService.update(User);
			session.setAttribute("user", User);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("getSessionUser")
	public User updatelogin(HttpSession session){
		User existUser = (User) session.getAttribute("user");
		if(existUser!=null){
			return existUser;
		}
		return null;
	}
	
	@RequestMapping("findAll")
	public List<User> findALl(User User){
		UserExample example = new UserExample();
		return UserService.findAll(example);
	}
	
	@RequestMapping("add")
	public Result add(User User){
		try {
			UserExample example = new UserExample();
			example.createCriteria().andUsernameEqualTo(User.getUsername());
			List<User> listUser = UserService.findAll(example);
			if(User.getId()==null){
				if(listUser.size()>0){
					return new Result(false, "用户名已存在");
				}
				this.UserService.add(User);
				return new Result(true, "注册成功，赶快登录去吧！");
			}else{
				if(listUser.size()>0 && !listUser.get(0).getId().equals(User.getId())){
					return new Result(false, "用户名已存在");
				}
				this.UserService.update(User);
			}
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("updategeren")
	public Result updategeren(HttpSession session,User user){
		try {
			UserExample example = new UserExample();
			example.createCriteria().andUsernameEqualTo(user.getUsername());
			List<User> listUser = UserService.findAll(example);
			if(listUser.size()>0 && !listUser.get(0).getId().equals(user.getId())){
				return new Result(false, "用户名已存在");
			}
			this.UserService.update(user);
			this.UserService.updategeren(user);
			session.setAttribute("user", user);
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("findPage")
	public PageResult findPage(User User,Integer page,Integer rows){
		UserExample example = new UserExample();
		return this.UserService.findPage(example,page,rows);
	}
	
	@RequestMapping("findOne")
	public User findOne(Integer id){
		User User = this.UserService.findOne(id);
		return User;
	}
	
	@RequestMapping("update")
	public Result update( User User){
		try {
			this.UserService.update(User);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	@RequestMapping(value="delete")
	public Result delete(String ids){
		
		try {
			for (String id : ids.split(",")) {
				this.UserService.delete(Integer.parseInt(id));
			}
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	
	
}
