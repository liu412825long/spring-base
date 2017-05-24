package cn.sh.base.dao;

import java.util.List;

import cn.sh.base.entity.Consume;

public interface ConsumeMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Consume record);

	int insertSelective(Consume record);

	Consume selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Consume record);

	int updateByPrimaryKey(Consume record);

	public List<Consume> selectByCondition(Consume record);

	public List<Consume> selectByConsumeDetailId(Integer consumeDetailId);
}