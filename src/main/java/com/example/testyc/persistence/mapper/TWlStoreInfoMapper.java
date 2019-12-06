package com.example.testyc.persistence.mapper;

import com.example.testyc.persistence.entity.TWlStoreInfo;
import com.example.testyc.persistence.entity.TWlStoreInfoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TWlStoreInfoMapper {
    /**
     *
     * @mbggenerated 2019-12-05
     */
    int countByExample(TWlStoreInfoExample example);

    /**
     *
     * @mbggenerated 2019-12-05
     */
    int deleteByPrimaryKey(String guid);

    /**
     *
     * @mbggenerated 2019-12-05
     */
    int insertSelective(TWlStoreInfo record);

    /**
     *
     * @mbggenerated 2019-12-05
     */
    List<TWlStoreInfo> selectByExample(TWlStoreInfoExample example);

    /**
     *
     * @mbggenerated 2019-12-05
     */
    TWlStoreInfo selectByPrimaryKey(String guid);

    /**
     *
     * @mbggenerated 2019-12-05
     */
    int updateByPrimaryKeySelective(TWlStoreInfo record);
}