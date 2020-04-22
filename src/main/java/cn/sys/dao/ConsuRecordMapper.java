package cn.sys.dao;

import cn.sys.entity.ConsuRecord;
import cn.sys.entity.ConsuRecordExample;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ConsuRecordMapper {
    int countByExample(ConsuRecordExample example);

    int deleteByExample(ConsuRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConsuRecord record);

    int insertSelective(ConsuRecord record);

    List<ConsuRecord> selectByExample(ConsuRecordExample example);

    ConsuRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConsuRecord record, @Param("example") ConsuRecordExample example);

    int updateByExample(@Param("record") ConsuRecord record, @Param("example") ConsuRecordExample example);

    int updateByPrimaryKeySelective(ConsuRecord record);

    int updateByPrimaryKey(ConsuRecord record);

    @Select("select date_format(t.consu_time, '%Y-%m-%d') date_t,sum(consu_money) sum_t from consu_record t where "
    		+ " uid = #{id} and t.consu_time BETWEEN #{date_start} AND date_add(#{date_end}, interval 1 day) "
    		+ "group by date_format(t.consu_time, '%Y-%m-%d')")
	List<HashMap<String, BigDecimal>> reportDay(
            @Param("date_start") Date date_start, @Param("date_end") Date date_end, @Param("id") Integer id);

    @Select("select date_format(t.consu_time, '%Y-%m') date_t,sum(consu_money) sum_t from consu_record t where "
    		+ " uid = #{id} and t.consu_time BETWEEN #{date_start} AND date_add(#{date_end}, interval 1 day) "
    		+ "group by date_format(t.consu_time, '%Y-%m')")
	List<HashMap<String, BigDecimal>> reportMonth(
            @Param("date_start") Date date_start, @Param("date_end") Date date_end, @Param("id") Integer id);
    
    @Select("select date_format(t.consu_time, '%Y') date_t,sum(consu_money) sum_t from consu_record t where "
    		+ " uid = #{id} and t.consu_time BETWEEN #{date_start} AND date_add(#{date_end}, interval 1 day) "
    		+ "group by date_format(t.consu_time, '%Y')")
	List<HashMap<String, BigDecimal>> reportYear(
            @Param("date_start") Date date_start, @Param("date_end") Date date_end, @Param("id") Integer id);

    @Select("select t2.name as title, sum(t1.consu_money) as content  from consu_record t1 INNER JOIN category t2 on t1.consu_cate = t2.id "
    		+" where t1.consu_time BETWEEN #{date_start} AND date_add(#{date_end}, interval 1 day) and t1.uid = #{id} "
    		+" GROUP BY t2.id,t2.name ")
	List<HashMap<String, BigDecimal>> report_cate(
            @Param("date_start") Date date_start, @Param("date_end") Date date_end, @Param("id") Integer id);

}