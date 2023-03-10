package com.eduonline.content.service;

import com.eduonline.base.model.PageParams;
import com.eduonline.base.model.PageResult;
import com.eduonline.content.model.dto.AddCourseDto;
import com.eduonline.content.model.dto.CourseBaseInfoDto;
import com.eduonline.content.model.dto.EditCourseDto;
import com.eduonline.content.model.dto.QueryCourseParamsDto;
import com.eduonline.content.model.po.CourseBase;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/17/2023 10:21 PM
 */

/**
 * @param 分页参数 、 课程参数
 * @author qsun
 * @description 课程查询
 * @return
 * @date 2/17/2023 10:25 PM
 */
@Service
public interface CourseBaseInfoService {

    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParamsDto);

    /**
     * @param companyId    教学机构id
     * @param addCourseDto 课程基本信息
     * @description 添加课程基本信息
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    public CourseBaseInfoDto getCourseBaseInfo(long courseId);

    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);

}
