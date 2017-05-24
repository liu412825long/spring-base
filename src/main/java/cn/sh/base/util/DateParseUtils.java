package cn.sh.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.sh.base.common.Constants;

public class DateParseUtils {
	public static String parseToStringDate(Date date) {
		if (date != null) {
			SimpleDateFormat sd = new SimpleDateFormat(Constants.DATAFORMAT_UNDERLINE);
			return sd.format(date);
		}
		return "";
	}

}
