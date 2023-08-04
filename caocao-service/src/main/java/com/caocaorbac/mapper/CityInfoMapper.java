package com.caocaorbac.mapper;


import com.caocaorbac.common.dto.CityInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityInfoMapper {
    void saveCitiesInfo(List<CityInfoDTO> cityInfos);

}
