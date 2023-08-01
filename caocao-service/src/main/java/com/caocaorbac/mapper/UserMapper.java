package com.caocaorbac.mapper;

import com.caocaorbac.vo.QueryCityVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    String queryCityId(QueryCityVO queryCityVO);
}
