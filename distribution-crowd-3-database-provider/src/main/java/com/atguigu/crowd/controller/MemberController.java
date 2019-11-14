package com.atguigu.crowd.controller;

import com.atguigu.crowd.entity.MemberLaunchInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.crowd.entity.MemberPO;
import com.atguigu.crowd.entity.ResultEntity;
import com.atguigu.crowd.service.api.MemberService;
import com.atguigu.crowd.util.CrowdConstant;
import com.atguigu.crowd.util.CrowdUtils;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping("/retrieve/member/launch/info/po")
	public ResultEntity<MemberLaunchInfoPO> retrieveMemberLaunchInfoPO(@RequestParam("memberId") String memberId) {

		MemberLaunchInfoPO memberLaunchInfoPO = memberService.getMemberLaunchInfoPO(memberId);

		return ResultEntity.successWithData(memberLaunchInfoPO);
	}

	@RequestMapping("/retrieve/loign/acct/count")
	public ResultEntity<Integer> retrieveLoignAcctCount(
			@RequestParam("loginacct") String loginAcct) {
		
		if(!CrowdUtils.strEffectiveCheck(loginAcct)) {
			return ResultEntity.failed(CrowdConstant.MESSAGE_LOGINACCT_INVALID);
		}
		
		try {
			int count = memberService.getLoginAcctCount(loginAcct);
			
			return ResultEntity.successWithData(count);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResultEntity.failed(e.getMessage());
		}
	}
	
	@RequestMapping("/save/member/remote")
	public ResultEntity<String> saveMemberRemote(@RequestBody MemberPO memberPO) {
		
		try {
			// 执行保存
			memberService.saveMemberPO(memberPO);
		} catch (Exception e) {
			e.printStackTrace();
			
			return ResultEntity.failed(e.getMessage());
		}
		
		return ResultEntity.successNoData();
		
	}

	@RequestMapping("/retrieve/member/by/login/acct")
	public ResultEntity<MemberPO> retrieveMemberByLoginAcct(@RequestParam("loginacct") String loginAcct) {

		MemberPO memberPO = null;

		try {
			memberPO = memberService.getMemberByLoginAcct(loginAcct);
		} catch (Exception e) {
			e.printStackTrace();

			return ResultEntity.failed(e.getMessage());
		}

		return ResultEntity.successWithData(memberPO);
	}

}
