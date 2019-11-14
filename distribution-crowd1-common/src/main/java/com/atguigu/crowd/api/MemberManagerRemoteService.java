package com.atguigu.crowd.api;

import com.atguigu.crowd.entity.MemberLaunchInfoPO;
import com.atguigu.crowd.entity.MemberSignSuccessVO;
import com.atguigu.crowd.entity.MemberVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.crowd.entity.ResultEntity;


@FeignClient("member-manager")
public interface MemberManagerRemoteService {
	
	@RequestMapping("/retrieve/member/launch/info/by/member/token")
	public ResultEntity<MemberLaunchInfoPO> retrieveMemberLaunchInfoByMemberToken(@RequestParam("token") String token);
	
	@RequestMapping("/member/manager/logout")
	public ResultEntity<String> logout(@RequestParam("token") String token);
	
	@RequestMapping("/member/manager/login")
	public ResultEntity<MemberSignSuccessVO> login(
            @RequestParam("loginacct") String loginAcct,
            @RequestParam("userpswd") String userPswd);

	@RequestMapping("/member/manager/register")
	public ResultEntity<String> register(@RequestBody MemberVO memberVO);
	
	@RequestMapping("/member/manager/send/code")
	public ResultEntity<String> sendCode(@RequestParam("phoneNum") String phoneNum);
}
