package com.yxb.cms.architect.conf;

/**
 * 支付宝沙箱支付
 */
public class AlipayConfig
{
    public static String app_id = "2021000117627556";

    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCuy2iokJw3jvfi0HCQPq+WQhk6f1MZCoNehlfWKYzQZGQrlm6X9ixWl1OYyE4hoPptSTnOTAFVW/QI8yVfZbA1OSKdQSJHEo09Y0twfXgFpqfgINinpT+kmdHmqpVNPJ8mgrSHtBBHAlnHANTdmbsdf/LqoO97aIK4Tk01LPnuyCrhYxpZenF4pyQ8uDiWvO2MWC8tmuU+LbIp2lZCbnNZ7SteTub4SI/2bfT3vegOqQDktDNXPb3QCIeGclKWOYm55XVxVADPuTloR8r8MK9EAziAipSh4Z0VsYAPod9z32F919Z9gLEGJ3SSjwxDWA2NujN6ZL+tpmLFv4w/nFV3AgMBAAECggEAQOriz9gFbMz4W5C2fZwKcm/SFtu67Q3uhGi4rp134t2mJloUcPPIu9AwCAo8mljDKVuM0IWB6UXheIF1W9zUeK/jnyvVozfMpQP/vKOcs9yVdLQ+QuUooeVPA7BPCwR8xzy797p0YSsKVNKGPFcgG3Cts15aEydZhUHvgtRVbszjnz0v5GZ3OrlBn8jPwaR0bv8qK6wJl4APAzs87UWf3h+tf++9aYrEHkERMzVFkTnUVbLPghOGB4Hz0U3O0zsGYUBFDi9dYf28B+tvo1CV4JDcHuMf9tWkDY+h4ZeGcCBfbwqOh5cF/7sZVE1jyWx3OF27H5jmRQHz5W4K+kJOAQKBgQDTk/jQFHKJ0/a5TBqkDywVW9o0Rhk30Ze0K68rACwFRaaMXxlYyCNsMq9HSTnyi+TP/YxzMSTouQaDrnDUipKdUWSVwL2qnR9k/CXwdJ2Ivjagn45qdtNUsbLJOQAc+nmKvlJhZmio4gzOGD0IiqP+aab/oTv9c6rZOBuLwBd4QQKBgQDTfmB/LYfYfEENkvuSJdVbE7hR4GpbZCeHvVsrgYHGxE3nPH49Rc9BijjF9B3NpMQMY/zo8rJjoq7DptmmbCSHj9qLT/JOx2oEJ7sfKPSdnNM7tGXmf3mIWK5oPM6FxRhu90k83HkdO0YDliR+Pma5+ywdHbvxvwy8Fi5+ieWftwKBgFZYm0CAN8ZcBOLWVkECGCGXXNPcj8oh9WGIOnK4HT8Bj9jVrsh21U4A2VukXMvJn9XqSflw4vk/GZOAC3gSHYeqgfxDrqQEf5188hbR4MC/sBeZRkvYtqJn6ukIJC2vYw7mYURywN+7cTJi3fWwbwETKR5GNO9Y1y7TIRrFiE6BAoGAf5OTSARCFs/VOgf44w8ZZYg+vn0eCyUeR15tGZBUpX8S8zLlf7aVsBZd6uM3+y2x6TuDe02zWDDxNSp3zlEbs/6NuU2vf+AAzqLc2I4PCOhp73EBqwooWJwOEOjlN4JOG9nlfuYL1RtFP7KZLuIbe4LM+H9QOSKi3u6Oe1xZfH8CgYBIPwNsGCAY3QYQvIlxc2+UZcYlRhXQV4eoe3RWeCYhhwA3M2gU+hD7d1wH5oVwsUjccidVkxQdMd0c+cQHJzZNwAOPKWzf3beu2PGtvYHJq3TEr/tvbVTgiggZ+TAzz3SqYnRifBXmcBQYUdm5MGIoOYP8fAJvuCDlXeL7lF6Zpw==";

    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyz482IDCympmqP/LPxDWBJyZ+55S4wvMTtS383oyYsvI/8UGylkBVxX8GmPe5WoA+SqTmvQSBOK6r5M3XS4+jpzvo7eJQLOmU0/1C9szQvbSUCCdxLCRtIz80RPN++WplLvlp4Alb06Q4ycx1LxI55anbfsXXoF6Obzr5h50z2LnW7bqLEx+BPj6ZvtGRXs/ux8FbZHm+kquMM4J/pGuLVohDk4rHvUGgtzWObP5i+ASWlEFGuSeovSDrrJw3ktern17faImZdjjQgwDCtHd8Q+qTbHzKSdzET6FFvmc8uiTFSXKfaAwbGD8MD7EF53plvVWsowQOqUXJglXPeEnYQIDAQAB";

    public static String notify_url = "http://localhost:8080/pay/alipayNotifyNotice.action";

    public static String return_url = "http://localhost:8080/pay/alipayReturnNotice.action";

    public static String sign_type = "RSA2";

    public static String charset = "utf-8";

    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}