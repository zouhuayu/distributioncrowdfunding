package com.atguigu.crowd.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
@Configuration
public class AlipayConfig implements InitializingBean {

	// 使用@Value注解从application.yml文件中读取数据
	@Value("${ali.pay.app.id}")
	private String appId;

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id;

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC9AwzQzdddfNWam7dYSIxjPRapgvnoO58SXeaBfE0NADm65Vry8YBk7uhL68Vy3Ve+1TOhTZEMhUXPGyvJR7HvpgCRZ29t5KmanEKVGZ3tlDpKqI6msvVwUk3dJB7ozYyAoem727xQI26kbpYkuf5vakxYRerbc/oueEou9AJ7/Tj2enQRT/+4Veg87zJLmmfGJpbt3ugNxoWTqlbhALyXAxlNkHBWNNDc/8NdvlI2+5ETi4JiQHoDBXgd7puc1x5CjceLyAB45o4UGTDf0RTZYzyniu6js+Z9Njw0xYxsWG2uURbtMSaMWy46WwAGSKNQBTMWzrpiBEtMxDXQhghZAgMBAAECggEAQu1fjlg02E+puzNEOqiFvWYWLjPIlej2rKQ/SL5g8ieQSZOJHtlQ42yNKMT1h3TE6zfHLmiu4cYXL/ypBn6yjO806Ee99yWuwKZwFSea+lMwSNtil7hqnDkohROTNlACXlH216Q5DA9f0C2wUJTjeUQkgGVRgh+RCP9jFTkl4Azv1C6i3K/2gOQyaucv1W+TNb20Dpf7YLLh5TqLP6/Oq10GoPBySXxGk48qicwqNdOHFfxdZLXEmg74rGY9JZjAwd83WupCqvybSBXYEhxHTscgLncGwdPrr3FzstdaknIv4A0hB1FCCRTPaC77i7RDpA2tFY80bR8ZoTAIGr+A4QKBgQDvgn8kpduLgrREPblnM9KFf/4gCqCgN9nB9ni3J1dIpMtfN+ibHR6P5blBbu4sm1LnSOWAYIJP0FP33TtyXaRFnvmoCvB9wZXOamdo032vrXxIAbDLw55myb2a70rjyH2ELdMwbAPHwp4LXuaBPr0httsQg1HCoMqakH68Dsj5XQKBgQDKBn+n/Te+qd//vvG4VQ6W6dt86FyNPTjgNPCqF6ltSs4WjVZAYo9FI0AWCGu3AUj8pP4XWijZKV2FKGBGQwnqPRKvurfPcDaqvUCNEtSgShR2KejRHxx558rvddotVKlmC+BbWMERoQt6N3+ph85oxgx91pRPlcQVvOSU4tDPLQKBgQDP1AjHoDQVpuENphHPf6RZu2qkGxSuckg+isTNCRIwMu9WPIlWr7npW4mZQcziYBVcJGEhOJ1a7IcwOYRwBNmaoAw6yONN/EEl0CbTS1Fws7V4Nh9XcPNudfhVDPeLGFnx7GGpTtEo8bN6YmraE7rCGo2Ukp7LqAKmhGO0g4/Y8QKBgD4pM7w3sKBM2qxxTyTdnwiWWj+bq2aV8Nsjzu03LJ2BR9oukNxstxKZ3w0oeCQuFAwQpFIBHtJ65Nik7MKRvApD0m0ZsZb1OwzcAHGn2p6bTKJzELzPqs5joNB/XatXAmxwuQ7CR12qRMLNMs2yCLO6RHuvu6ClP1lE7rxU8dTdAoGBAK9lyqbV+fa6p/ZJzZ5xC7W/w60Y1JxeZ/c4/L6AT+rVBOWTVcHshTkMzq7Tf+OK+DFrzloa0H5cm2N72qFcfrew5MOmL2oiVVjylNxJa4S+3WpVXYHJ3tf7nuQl/o39HAschznujUA1QH/arpgvzIXVYBxhTU7sHlc7Rak59qgu";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	// 沙箱公钥地址：https://openhome.alipay.com/platform/appDaily.htm
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqoS2DZQdRUvv9oiEliVXdGO03g66+KDjUGayg8TU2LmH0JOkZrLSYB8pAhaAR2POiyvHlWGMo2KWgDNW1vEVEpkK/xU6OHC8bF94H5tPKcBMtSnrik+L8OQxf8DjpYHJUbIWy2f4GBtiD2i/kihmKmXYlvx8eGEnJRJxurLu2UfEBhnnb52jPQHRRhLoyAtvvh4SEngCp9HbccOOt5tGPKKGicMXS86IwCjik0ixQKjqu1EgZSAmrQCeQ+XBnxpooijfLb2dAWId4FeQ77QTh/hrZXsla297TxiRiRC2WDdQdJVfk1vUlV/u/txV6Nw+1A4NF15A73+VkKGAFYsyeQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://v79jmn.natappfree.cc/pay/notify.html";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://v79jmn.natappfree.cc/pay/return.html";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";


	public void afterPropertiesSet() throws Exception {

		// 在@Value注解给this.appId注入数值后，给AlipayConfig.app_id赋值
		AlipayConfig.app_id = this.appId;

	}

}

