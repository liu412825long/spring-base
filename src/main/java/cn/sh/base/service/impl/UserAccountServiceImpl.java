package cn.sh.base.service.impl;

import java.util.List;

import cn.sh.base.dao.UserAccountMapper;
import cn.sh.base.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sh.base.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountMapper userAccountMapper;

	@Override
	public UserAccount selectUserAccount(int id) {
		// TODO Auto-generated method stub
		return userAccountMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insertUserAccount(UserAccount userAccount) {
		// TODO Auto-generated method stub
		return userAccountMapper.insertSelective(userAccount);
	}

	@Override
	public int updateUserAccount(UserAccount userAccount) {
		// TODO Auto-generated method stub
		return userAccountMapper.updateByPrimaryKeySelective(userAccount);
	}

	@Override
	public int deleteUserAccount(int id) {
		// TODO Auto-generated method stub
		return userAccountMapper.deleteByPrimaryKey(id);
	}

	@Override
	public UserAccount login(UserAccount userAccount) {
		// TODO Auto-generated method stub
		return userAccountMapper.selectByCondition(userAccount);
	}

	@Override
	public List<UserAccount> selectAll() {
		// TODO Auto-generated method stub
		return userAccountMapper.selectAll();
	}

}
