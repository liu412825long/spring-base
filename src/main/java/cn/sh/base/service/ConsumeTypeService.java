package cn.sh.base.service;

import java.util.List;

import cn.sh.base.entity.ConsumeType;

public interface ConsumeTypeService {

	public int insertConsumeType(ConsumeType consumeType);

	public int deleteConsumeType(int id);

	public int updateConsumeType(ConsumeType consumeType);

	public ConsumeType selectConsumeTypeById(int id);

	public List<ConsumeType> selectAll();

}
