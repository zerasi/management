package cn.sys.dao;

import cn.sys.entity.Category;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CategoryMapper {

	@Delete("delete from category where id = #{id}")
	int deleteByPrimaryKey(int id);

	@Select("select id, parentId, name, des, uid, bak1, bak2 from category where uid = #{id}")
	List<Category> findAllByUid(Integer id);

	@Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert category(parentId, name, des, uid, bak1, bak2)"
    		+" values(#{parentId}, #{name}, #{des}, #{uid}, #{bak1}, #{bak2})")
	int insert(Category category);

	@Select("select id, parentId, name, des, uid, bak1, bak2 from category where id = #{id}")
	Category selectByPrimary(Integer id);

	@Update("update category set parentId = #{parentId}, name = #{name}, des = #{des}, bak1 = #{bak1}, bak2 = #{bak2}"
			+ " where id = #{id}")
	int updateByPrimary(Category category);

	@Select("select id, parentId, name, des, uid, bak1, bak2 from category where parentId = #{id}")
	List<Category> getListByParent(int id);

	int deleteByPrimaryKeys(List<Integer> listId);
	
}