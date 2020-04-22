package cn.sys.dao;

import cn.sys.entity.ConsuWay;
import cn.sys.entity.ConsuWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsuWayMapper {
    int countByExample(ConsuWayExample example);

    int deleteByExample(ConsuWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConsuWay record);

    int insertSelective(ConsuWay record);

    List<ConsuWay> selectByExample(ConsuWayExample example);

    ConsuWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConsuWay record, @Param("example") ConsuWayExample example);

    int updateByExample(@Param("record") ConsuWay record, @Param("example") ConsuWayExample example);

    int updateByPrimaryKeySelective(ConsuWay record);

    int updateByPrimaryKey(ConsuWay record);
}