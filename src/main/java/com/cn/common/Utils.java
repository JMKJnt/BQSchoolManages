package com.cn.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * 工具类
 * @author songzhili
 * 2016年11月14日下午4:19:56
 */
public class Utils {

	/**
	 * 将空对象转化成空字符串""
	 * @param object
	 * @return
	 */
	public static String nullToString(Object object){
		String result=object==null?"":object.toString();
		return result;
	}
	public static boolean isEmpty(String source){
		
		if(source == null || source.trim().length() == 0){
			return true;
		}
		return false;
	}
	
	public static boolean areNotEmpty(String a ,String b){
		
		if(!isEmpty(a) && !isEmpty(b)){
			return true;
		}
		return false;
	}
	/****/
	public static String[] obtainCodeAndVersion(Map<String, Object> source){
		
		String[] result = {"",""};
		if(source.get("code") != null){
			result[0] = source.get("code").toString();
		}
		if(source.get("version") != null){
			result[1] = source.get("version").toString();
		}
		return result;
	}
	/**
	 * 
	 * @param source
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> transferSourceToMap(Map<String, Object> source){
		
		Object object = source.get("jsonStr");
		if(object instanceof Map){
			Map<String,Object> objectThree = (Map<String,Object>)object;
			return objectThree;
		}
		return null;
	}

	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };
	public static String generateShortUuid(String uuid32) {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = uuid32.toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);
			shortBuffer.append(chars[x % 0x3E]);
		}
		return shortBuffer.toString();

	}
	public static String Random_5NO() {
		Random random = new Random();
		String random_no = "";
		for (int j = 0; j < 5; j++) {
			random_no += random.nextInt(10);
		}
//		String sdf = new SimpleDateFormat("MMSS").format(new Date());
		return random_no;
	}
}
