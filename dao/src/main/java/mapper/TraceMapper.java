package mapper;

import domain.RequestInfo;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface TraceMapper {

    @Insert("insert into trace (uri,method,remote_addr,query_string) values (#{uri},#{method},#{remoteAddr},#{queryString})")
    int insertTrace(RequestInfo requestInfo);
}
