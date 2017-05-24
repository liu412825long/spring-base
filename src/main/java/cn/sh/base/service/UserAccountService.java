package cn.sh.base.service;

import java.util.List;

import cn.sh.base.entity.UserAccount;

public interface UserAccountService {

	public UserAccount selectUserAccount(int id);

	public int insertUserAccount(UserAccount userAccount);

	public int updateUserAccount(UserAccount userAccount);

	public int deleteUserAccount(int id);

	public UserAccount login(UserAccount userAccount);

	public List<UserAccount> selectAll();

}
