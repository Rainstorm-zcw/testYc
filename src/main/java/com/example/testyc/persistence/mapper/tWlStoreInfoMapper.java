package com.example.testyc.persistence.mapper;

import com.example.testyc.persistence.entity.tWlStoreInfo;
import com.example.testyc.persistence.entity.tWlStoreInfoExample;
import java.util.List;

public interface tWlStoreInfoMapper {
    /**
     *
     * @mbggenerated 2019-12-03
     */
    int countByExample(tWlStoreInfoExample example);

    /**
     *
     * @mbggenerated 2019-12-03
     */
    int deleteByPrimaryKey(String guid);

    /**
     *
     * @mbggenerated 2019-12-03
     */
    int insertSelective(tWlStoreInfo record);

    /**
     *
     * @mbggenerated 2019-12-03
     */
    List<tWlStoreInfo> selectByExample(tWlStoreInfoExample example);

    /**
     *
     * @mbggenerated 2019-12-03
     */
    tWlStoreInfo selectByPrimaryKey(String guid);

    /**
     *
     * @mbggenerated 2019-12-03
     */
    int updateByPrimaryKeySelective(tWlStoreInfo record);
}