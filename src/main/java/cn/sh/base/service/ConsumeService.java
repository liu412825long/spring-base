package cn.sh.base.service;

import java.util.List;

import cn.sh.base.entity.Consume;

public interface ConsumeService {

	public int insertConsume(Consume consume);

	public int deleteConsume(int id);

	public int updateConsume(Consume consume);

	public Consume selectConsumeById(int id);

	public List<Consume> selectByCondition(Consume consume);

	public List<Consume> selectByConsumeDetailId(int id);

}
