package cn.sh.base.controller;

import java.util.Date;

import cn.sh.base.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sh.base.service.UserAccountService;

@Controller
public class TestConroller {

	@Autowired
	private UserAccountService userAccountService;

	/*
	 * @RequestMapping(value = "/index") public String index() { return "index";
	 * }
	 */

	@RequestMapping(value = "/userAccount")
	@ResponseBody
	public UserAccount getUserAccount() {
		return userAccountService.selectUserAccount(1);
	}

	@RequestMapping(value = "/addAccount")
	@ResponseBody
	public UserAccount addUserAccount() {
		UserAccount userAccount = new UserAccount();
		userAccount.setCellphone("aa");
		userAccount.setRegisterdate(new Date());
		int i = userAccountService.insertUserAccount(userAccount);
		return userAccount;
	}

	@RequestMapping(value = "/deleteAccount")
	@ResponseBody
	public int deleteUserAccount() {

		int i = userAccountService.deleteUserAccount(1);
		return i;
	}

}
