package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.ProjectVO;

/**
 * @author zouhuayu
 * 2019-11-11-14:00
 */
public interface ProjectService {
    void saveProject(ProjectVO projectVO, String memberId);
}
