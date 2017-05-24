package cn.sh.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.sh.base.dao.MessageMapper;
import cn.sh.base.entity.Message;
import cn.sh.base.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public int insertMessage(Message message) {
		// TODO Auto-generated method stub
		return messageMapper.insertSelective(message);
	}

	@Override
	public int deleteMessage(int id) {
		// TODO Auto-generated method stub
		return messageMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateMessage(Message message) {
		// TODO Auto-generated method stub
		return messageMapper.updateByPrimaryKeySelective(message);
	}

	@Override
	public Message selectMessageById(int id) {
		// TODO Auto-generated method stub
		return messageMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Message> selectByNotifyId(Message message) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("notifyid", message.getNotifyid());
		map.put("status", message.getStatus());
		return messageMapper.selectByNotifyId(map);
	}

}
