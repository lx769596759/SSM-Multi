package mapper;

import domain.Dome;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;

@Resource
public interface DomeMapper {

    @Select("select * from user limit 1,1")
    @ResultType(Dome.class)
    Dome getNameAndAge();

    Dome selectAll();
}
