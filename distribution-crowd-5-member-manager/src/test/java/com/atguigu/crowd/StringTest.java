package com.atguigu.crowd;

import com.aliyun.oss.OSSClient;
import org.junit.Test;

import com.atguigu.crowd.util.CrowdUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class StringTest {
	
	@Test
	public void testSendCode() {
		String appcode = "61f2eaa3c43e42ad82c26fbbe1061311";
		//String appcode = "665da991748e4b1fb330baa19db02890";
		String randomCode = CrowdUtils.randomCode(4);
		String phoneNum = "15926305308";
		CrowdUtils.sendShortMessage(appcode, randomCode, phoneNum);
	}

	@Test
	public void testOSS() throws FileNotFoundException {
		// Endpoint以杭州为例，其它Region请按实际情况填写。
				String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
				//String accessKeyId = "LTAI4FwrfnyJSiWLidALwRxQ";
				//String accessKeySecret = "WAvW5h1W8VUMVEztLmlF8HGKtmCKVk";
				String accessKeyId = "LTAI4Fxgat1JG3GLiNwq6tLY";
				String accessKeySecret = "wqZaVi5VjIZBVoonRTQYMi02tnm0tF";
		// 创建OSSClient实例。
				OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

		// 声明要上传的文件名
				String fileName = "1.png";

		// 声明上传文件后存入的目录的名称
				String folderName = "test";

		// 声明Bucket名称
				String bucketName = "learnjiawa001";

		// 存入对象的名称=目录名称+"/"+文件名
				String objectName = folderName + "/" + fileName;

		// 上传文件流。
				InputStream inputStream = new FileInputStream(fileName);
				ossClient.putObject(bucketName, objectName, inputStream);

		// 关闭OSSClient。
				ossClient.shutdown();
	}

}
