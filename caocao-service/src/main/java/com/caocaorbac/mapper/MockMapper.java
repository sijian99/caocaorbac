package com.caocaorbac.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MockMapper {
    String mockGetData(String code);
}
