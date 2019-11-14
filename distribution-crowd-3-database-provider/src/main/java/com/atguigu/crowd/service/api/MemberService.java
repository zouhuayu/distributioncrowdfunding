package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.MemberLaunchInfoPO;
import com.atguigu.crowd.entity.MemberPO;

public interface MemberService {

	int getLoginAcctCount(String loginAcct);

	void saveMemberPO(MemberPO memberPO);

    MemberPO getMemberByLoginAcct(String loginAcct);

	MemberLaunchInfoPO getMemberLaunchInfoPO(String memberId);
}
