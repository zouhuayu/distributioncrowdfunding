package com.atguigu.crowd.api;

import java.util.List;

import com.atguigu.crowd.entity.MemberConfirmInfoVO;
import com.atguigu.crowd.entity.ProjectVO;
import com.atguigu.crowd.entity.ReturnVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.crowd.entity.ResultEntity;


@FeignClient("project-manager")
public interface ProjectOperationRemoteService {
	
	@RequestMapping("/project/manager/save/whole/project")
	public ResultEntity<String> saveWholeProject(
            @RequestParam("memberSignToken") String memberSignToken,
            @RequestParam("projectTempToken") String projectTempToken);

	@RequestMapping("/project/manager/save/confirm/infomation")
	public ResultEntity<String> saveConfirmInfomation(
            @RequestBody MemberConfirmInfoVO memberConfirmInfoVO);
	
	@RequestMapping("/project/manager/save/return/infromation")
	public ResultEntity<String> saveReturnInfromation(
            @RequestBody ReturnVO returnVO);
	
	@RequestMapping("/project/manager/save/project/information")
	public ResultEntity<String> saveProjectInformation(
            @RequestBody ProjectVO projectVOFront);
	
	@RequestMapping("/project/manager/save/detail/picture/path/list")
	public ResultEntity<String> saveDetailPicturePathList(@RequestParam("memberSignToken") String memberSignToken,
                                                          @RequestParam("projectTempToken") String projectTempToken,
                                                          @RequestParam("detailPicturePathList") List<String> detailPicturePathList);
	
	@RequestMapping("/project/manager/save/head/picture/path")
	public ResultEntity<String> saveHeadPicturePath(@RequestParam("memberSignToken") String memberSignToken,
                                                    @RequestParam("projectTempToken") String projectTempToken,
                                                    @RequestParam("headerPicturePath") String headerPicturePath);
	
	@RequestMapping("/project/manager/initCreation")
	public ResultEntity<ProjectVO> initCreation(
            @RequestParam("memberSignToken") String memberSignToken);
}
