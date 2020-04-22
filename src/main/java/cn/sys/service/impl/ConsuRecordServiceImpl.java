package cn.sys.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.sys.dao.CategoryMapper;
import cn.sys.dao.ConsuRecordMapper;
import cn.sys.dao.ConsuWayMapper;
import cn.sys.entity.Category;
import cn.sys.entity.ConsuRecord;
import cn.sys.entity.ConsuRecordExample;
import cn.sys.service.ConsuRecordService;
import cn.sys.utils.PageResult;

@Service
@Transactional
public class ConsuRecordServiceImpl implements ConsuRecordService{
	
	@Autowired
	private ConsuRecordMapper mapper;
	@Autowired
	private ConsuWayMapper consuWayMapper;
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public void add(ConsuRecord ConsuRecord) {
		this.mapper.insert(ConsuRecord);
		
	}

	@Override
	public void update(ConsuRecord ConsuRecord) {
		this.mapper.updateByPrimaryKeySelective(ConsuRecord);
		
	}

	@Override
	public PageResult findPage(ConsuRecordExample example, Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		Page<ConsuRecord> pages = (Page<ConsuRecord>) this.mapper.selectByExample(example);
		List<ConsuRecord> list = pages.getResult();
		list.forEach(p -> {
			List<String> listStr = new ArrayList<>();
			getCategoryDesLinkStr(p.getConsu_cate(), listStr);
			Collections.reverse(listStr);
			p.setConsuCateDisp(StringUtils.join(listStr, "-"));
			p.setConsuWay(consuWayMapper.selectByPrimaryKey(p.getConsu_way()));
		});
		return new PageResult(pages.getTotal(), list);
	}
	
	public void getCategoryDesLinkStr(Integer id, List<String> listStr){
		Category category = categoryMapper.selectByPrimary(id);
		if(category!=null){
			listStr.add(category.getName());
			if(!category.getParentId().equals(0)){
				getCategoryDesLinkStr(category.getParentId(), listStr);
			}
		}
	}

	@Override
	public ConsuRecord findOne(Integer id) {
		return this.mapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(int parseInt) {
		this.mapper.deleteByPrimaryKey(parseInt);
		
	}

	@Override
	public List<ConsuRecord> findAll(ConsuRecordExample ConsuRecordExample) {
		return this.mapper.selectByExample(ConsuRecordExample);
	}

	@Override
	public Map<String, List<Object>> report(Date date_start, Date date_end, String date_type, Integer integer) {
		Map<String, List<Object>> returnMap = new HashMap<String, List<Object>>();
		List<Object> titleList = new ArrayList<>();
		List<Object> contentList = new ArrayList<>();
		if(date_type!=null && "1".equals(date_type)){
			List<HashMap<String, BigDecimal>> queryList = this.mapper.reportDay(date_start, date_end, integer);
			queryList.forEach(p -> {
				titleList.add(p.get("date_t"));
				contentList.add(p.get("sum_t"));
			});
			returnMap.put("titleList", titleList);
			returnMap.put("contentList", contentList);
		}else if(date_type!=null && "2".equals(date_type)){
			List<HashMap<String, BigDecimal>> queryList = this.mapper.reportMonth(date_start, date_end ,integer);
			queryList.forEach(p -> {
				titleList.add(p.get("date_t"));
				contentList.add(p.get("sum_t"));
			});
			returnMap.put("titleList", titleList);
			returnMap.put("contentList", contentList);
		}else if(date_type!=null && "3".equals(date_type)){
			List<HashMap<String, BigDecimal>> queryList = this.mapper.reportYear(date_start, date_end ,integer);
			queryList.forEach(p -> {
				titleList.add(p.get("date_t"));
				contentList.add(p.get("sum_t"));
			});
			returnMap.put("titleList", titleList);
			returnMap.put("contentList", contentList);
		}
		return returnMap;
	}

	@Override
	public Map<String, List<Object>> report_cate(Date date_start, Date date_end, Integer id) {
		Map<String, List<Object>> returnMap = new HashMap<String, List<Object>>();
		List<Object> titleList = new ArrayList<>();
		List<Object> contentList = new ArrayList<>();
		List<HashMap<String, BigDecimal>> queryList = this.mapper.report_cate(date_start, date_end ,id);
		queryList.forEach(p -> {
			titleList.add(p.get("title"));
			contentList.add(p.get("content"));
		});
		returnMap.put("titleList", titleList);
		returnMap.put("contentList", contentList);
		return returnMap;
	}


}
