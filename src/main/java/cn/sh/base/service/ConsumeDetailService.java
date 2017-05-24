package cn.sh.base.service;

import cn.sh.base.entity.UserAccount;
import cn.sh.base.vo.ConsumeStatistics;
import cn.sh.base.vo.ShowConsumeDetailListVoPage;
import cn.sh.base.entity.ConsumeDetail;
import cn.sh.base.vo.AddConsumeDetailVo;
import cn.sh.base.vo.ShowConsumeDetailListVo;
import cn.sh.base.vo.ShowConsumeDetailVo;
import cn.sh.base.vo.SingleConsumeVo;

public interface ConsumeDetailService {
	public int insertConsumeDetail(AddConsumeDetailVo vo);

	public int deleteConsumeDetail(int id);

	public ConsumeDetail selectById(int id);

	public int updateConsumeDetail(ConsumeDetail consumeDetail);

	public AddConsumeDetailVo initConsumeDetail(UserAccount userAccount);

	public ShowConsumeDetailVo selectConsumeDetialByCondition(int id);

	public ShowConsumeDetailListVoPage getConsumeDetialList(ShowConsumeDetailListVo vo);

	public ConsumeStatistics getConsume();

	public SingleConsumeVo getSingleConsumeMoney(Integer userId);

}
