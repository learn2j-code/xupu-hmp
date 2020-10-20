package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.ErrorPictureList;
import com.dlm.hmp.pojo.ErrorPictureListExample;
import java.util.List;

public interface ErrorPictureListMapper {
    int countByExample(ErrorPictureListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErrorPictureList record);

    int insertSelective(ErrorPictureList record);

    List<ErrorPictureList> selectByExample(ErrorPictureListExample example);

    ErrorPictureList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErrorPictureList record);

    int updateByPrimaryKey(ErrorPictureList record);
}