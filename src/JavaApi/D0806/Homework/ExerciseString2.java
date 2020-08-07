package JavaApi.D0806.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseString2 {
	
	/**
 		手机号码前三位代表运营商
      	中国电信	2G/3G号段：133，153， 180，181，189
				4G号段：173， 177
      	中国联通	2G/3G号段：130，131，132，155，156，185，186
				3G上网卡：145
				4G号段：176，185
      	中国移动	2G/3G号段：134，135，136，137，138，139，150，151，152，158，159，182，183，184
				3G上网卡：147
				4G号段：178，184
		请根据传入的电话号码, 返回对应的运营商的名称
	 */
	public void getISP(String phoneNumber) {
		Scanner input = new Scanner(System.in);
		int[] yd = new int[]{134,135,136,137,138,139,150,151,152,158,159,182,183,184 ,147 ,178,184};//中国移动
		int[] dx = new int[]{133,153, 180,181,189,173,177};//中国电信
		int[] lt = new int[]{130,131,132,155,156,185,186,145,176,185};// 中国联通
		if ( phoneNumber.length() != 11){
			System.out.println("请输入正确的电话号码：");
			String ID = input.nextLine();
			getISP(ID);
		}else {
			String prefix = phoneNumber.substring(0,3);
			int index = Arrays.binarySearch(yd, Integer.parseInt(prefix));
			if (index<0){
				index = Arrays.binarySearch(dx, Integer.parseInt(prefix));
				if (index< 0){
					index = Arrays.binarySearch(lt, Integer.parseInt(prefix));
					if (index < 0){
						System.out.println("未知号码");
					} else {
						System.out.println("中国联通");
					}
				}else {
					System.out.println("中国电信");
				}
			}else {
				System.out.println("中国移动");
			}
		}


		//return "中国电信 or 中国联通 or 中国移动";
	}
	
	/**
		身份证号码规则：
			前1、2位数字表示：所在省份的代码；
			第3、4位数字表示：所在城市的代码；
			第5、6位数字表示：所在区县的代码；
			第7-14位数字表示：出生年、月、日；
			第15、16位数字表示：所在地的派出所的代码；
			第17位数字表示性别：奇数表示男性，偶数表示女性；
			第18位数字是校检码
		任意给出一个身份证号码，在控制台输所有的出个人信息，
			日期格式：xxxx年xx月xx日
			性别：显示男，女
			其他代码：显示原值
	 */
	public void parseId(String num) {

		while (true) {

			if (num.length() == 18) {
				//subSequence按指定位置截取
				String year = (String) num.subSequence(6, 10);
				String month = (String) num.subSequence(10, 12);
				String day = (String) num.subSequence(12, 14);
				System.out.println("您的生日是：" + year + "年" + month + "月" + day + "日");
				String sex = (String) num.subSequence(16, 17);
				int a = Integer.parseInt(sex);
				//int a = Integer.valueOf(sex).intValue();
				if (a%2==0){
					System.out.println("性别 女" );
				}else{
					System.out.println("性别 男" );
				}
				String other1 =(String) num.subSequence(0,6);
				System.out.println("所在地代码："+other1);
				String other2 = (String) num.subSequence(14,16);
				System.out.println("所在地派出所代码："+other2);
				String other3 = (String) num.subSequence(17,18);
				System.out.println("校验码："+other3);
				break;
			} else {
				System.out.println("请输入正确的身份证号码：");
				Scanner input = new Scanner(System.in);
				String ID = input.nextLine();
				parseId(ID);
			}
		}
	}
	/**
		研究网络上垃圾邮件的信息和词，请将经常在垃圾邮件中看到的30个词创建成一个列表。写一个方法，用户输入email信息，
		扫描这些词是否出现在这个邮件中，只要在信息中出现一次这些单词，就给这个词记一分，根据最后的得分，给这个邮件记一个等级，
		返回该邮件的等级
	 * @param email https://wenku.baidu.com/view/a543b86e011ca300a6c3907d.html
	 */

	public int checkJunkMail(String email) {
		String [] emails ={"免费", "五折","点击这里" ,"现在就打电话","订购","赚取","折扣",
				"你中奖了","隐藏","你需要的信息","减肥","百万美元", "机会" ,"比较",
				"移除" ,"收集" ,"惊人的" ,"现金奖励" ,"答应你", "信贷", "借贷" ,"满意保证",
				"现在行动", "全新", "全天然", "避免破产", "如上所见！", "直接购买", "赌场",
				"现金", "特别优惠", "特惠条款", "享受回报", "担保","保证", "无成本","无收费", "" +
				"提供", "一次性", "在线药房", "现在订购", "请阅读", "不要删除", "限期", "无担保债务或信贷",
				"假期", "万艾可", "访问我们的网站", "售完为止", "为什么要支付更多", "赢家",
				"在家工作", "您被选中","售完即止"
		};
		int count = 0;
		for(int i = 0; i < emails.length; i++){
			if(email.contains(emails[i])){
					count ++;
			}
		}



		return count;
	}


	public static void main(String[] args) {
		ExerciseString2 eX = new ExerciseString2();
		//eX.parseId("");
		//eX.getISP("");
		System.out.println("出现敏感词 "+eX.checkJunkMail("免费大礼包售完即止,详情访问我们的网站，更有特背优惠等着您") +" 次");
	}
}
