package mapper;

import java.util.List;
import model.Student;
import model.StudentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(StudentExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(StudentExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Student row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Student row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Student row, @Param("example") StudentExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Student row, @Param("example") StudentExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Student row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Student row);
}