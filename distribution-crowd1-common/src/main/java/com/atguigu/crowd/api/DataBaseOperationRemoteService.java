package com.atguigu.crowd.api;

import com.atguigu.crowd.entity.MemberLaunchInfoPO;
import com.atguigu.crowd.entity.ProjectVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.crowd.entity.MemberPO;
import com.atguigu.crowd.entity.ResultEntity;

@FeignClient("database-provider")
public interface DataBaseOperationRemoteService {
	
	@RequestMapping("/retrieve/loign/acct/count")
	ResultEntity<Integer> retrieveLoignAcctCount(@RequestParam("loginacct") String loginAcct);

	@RequestMapping("/save/member/remote")
	ResultEntity<String> saveMemberRemote(@RequestBody MemberPO memberPO);

	@RequestMapping("/retrieve/member/by/login/acct")
	ResultEntity<MemberPO> retrieveMemberByLoginAcct(@RequestParam("loginacct") String loginAcct);

	@RequestMapping("/save/project/remote/{memberId}")
	ResultEntity<String> saveProjectRemote(
			@RequestBody ProjectVO projectVO,
			@PathVariable("memberId") String memberId);

	@RequestMapping("/retrieve/member/launch/info/po")
	ResultEntity<MemberLaunchInfoPO> retrieveMemberLaunchInfoPO(@RequestParam("memberId") String memberId);
}
