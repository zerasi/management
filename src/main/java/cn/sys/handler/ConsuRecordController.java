package cn.sys.handler;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.ConsuRecord;
import cn.sys.entity.ConsuRecordExample;
import cn.sys.entity.User;
import cn.sys.service.ConsuRecordService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("consuRecord")
public class ConsuRecordController {

	@Autowired
	private ConsuRecordService ConsuRecordService;
	
	@RequestMapping("findAll")
	public List<ConsuRecord> findALl(){
		return ConsuRecordService.findAll(new ConsuRecordExample());
	}
	
	@RequestMapping("add")
	public Result add(ConsuRecord ConsuRecord ,HttpSession session){
		try {
			User existUser = (User) session.getAttribute("user");
			if(existUser==null){
				return new Result(false, "请您先登录");
			}
			if(ConsuRecord.getId()==null){
				ConsuRecord.setUid(existUser.getId());
				this.ConsuRecordService.add(ConsuRecord);
			}else{
				this.ConsuRecordService.update(ConsuRecord);
			}
			return new Result(true, "成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "失败");
		}
	}
	
	@RequestMapping("findPage")
	public PageResult findPage(ConsuRecord ConsuRecord, Integer page, Integer rows, HttpSession session){
		User existUser = (User) session.getAttribute("user");
		if(existUser==null){
			return null;
		}
		ConsuRecordExample example = new ConsuRecordExample();
		example.createCriteria().andUidEqualTo(existUser.getId());
		PageResult PageResult = ConsuRecordService.findPage(example,page,rows);
		return PageResult;
	}

	@RequestMapping("findOne")
	public ConsuRecord findOne(Integer id){
		ConsuRecord ConsuRecord = this.ConsuRecordService.findOne(id);
		return ConsuRecord;
	}
	
	@RequestMapping("update")
	public Result update(ConsuRecord ConsuRecord){
		try {
			this.ConsuRecordService.update(ConsuRecord);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	@RequestMapping(value="delete")
	public Result delete(String ids,Integer a){
		
		try {
			for (String id : ids.split(",")) {
				this.ConsuRecordService.delete(Integer.parseInt(id));
			}
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	} 
	
	@RequestMapping(value="report")
	public Map<String, List<Object>> report(Date date_start, Date date_end, String date_type, HttpSession session){
		User existUser = (User) session.getAttribute("user");
		if(existUser==null){
			return null;
		}
		return this.ConsuRecordService.report(date_start, date_end, date_type, existUser.getId());
	} 
	
	@RequestMapping(value="report_cate")
	public Map<String, List<Object>> report_cate(Date date_start, Date date_end, HttpSession session){
		User existUser = (User) session.getAttribute("user");
		if(existUser==null){
			return null;
		}
		return this.ConsuRecordService.report_cate(date_start, date_end, existUser.getId());
	} 
	
}
