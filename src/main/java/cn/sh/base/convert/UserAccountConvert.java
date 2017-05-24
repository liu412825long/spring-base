package cn.sh.base.convert;

import java.util.Date;

import cn.sh.base.entity.UserAccount;
import cn.sh.base.vo.UserAccountVo;
import org.springframework.beans.BeanUtils;

import cn.sh.base.vo.UserAccountInfo;

public class UserAccountConvert {

	public static UserAccount toUserAccount(UserAccountVo vo) {
		UserAccount userAccount = new UserAccount();
		BeanUtils.copyProperties(vo, userAccount);
		userAccount.setRegisterdate(new Date());
		userAccount.setRole(0);
		return userAccount;
	}

	public static UserAccountInfo toUserAccountInfo(UserAccount vo) {
		UserAccountInfo userAccount = new UserAccountInfo();
		BeanUtils.copyProperties(vo, userAccount);
		return userAccount;
	}

	public static UserAccount toUserAccount(UserAccountInfo vo) {
		UserAccount userAccount = new UserAccount();
		BeanUtils.copyProperties(vo, userAccount);
		return userAccount;
	}

}
