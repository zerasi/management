package cn.sys.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sys.entity.ConsuRecord;
import cn.sys.entity.ConsuRecordExample;

public interface ConsuRecordService {

	void add(ConsuRecord ConsuRecord);

	void update(ConsuRecord ConsuRecord);

	ConsuRecord findOne(Integer id);

	void delete(int parseInt);

	cn.sys.utils.PageResult findPage(ConsuRecordExample example, Integer page, Integer rows);

	List<ConsuRecord> findAll(ConsuRecordExample ConsuRecordExample);

	Map<String, List<Object>> report(Date date_start, Date date_end, String date_type, Integer integer);

	Map<String, List<Object>> report_cate(Date date_start, Date date_end, Integer id);

}
