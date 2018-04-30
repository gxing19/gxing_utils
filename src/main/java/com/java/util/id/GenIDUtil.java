package com.java.util.id;

import java.util.Random;

/**
 * 根据当前时间的毫秒值生成唯一ID
 */
public class GenIDUtil {

	/**
	 * 当前毫秒值+n位随机数
	 */
	public static String getUniqueId(int num) {

		// 取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		// long millis = System.nanoTime();
		// 加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		// 如果不足三位前面补0
		String str = millis + String.format("%03d", end3);

		return str;
	}
}
