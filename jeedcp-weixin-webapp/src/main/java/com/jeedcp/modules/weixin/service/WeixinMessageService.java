/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeedcp.modules.weixin.service;

import java.util.List;

import com.jeedcp.common.service.CrudService;
import com.jeedcp.modules.weixin.dao.WeixinMessageDao;
import com.jeedcp.modules.weixin.entity.WeixinMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * 微信推送信息Service
 * @author jeedcp
 * @version 2016-09-20
 */
@Service
@Transactional(readOnly = true)
public class WeixinMessageService extends CrudService<WeixinMessageDao, WeixinMessage> {

	public WeixinMessage get(String id) {
		return super.get(id);
	}
	
	public List<WeixinMessage> findList(WeixinMessage weixinMessage) {
		return super.findList(weixinMessage);
	}
	

	
	@Transactional(readOnly = false)
	public void save(WeixinMessage weixinMessage) {
		super.save(weixinMessage);
	}
	
	@Transactional(readOnly = false)
	public void delete(WeixinMessage weixinMessage) {
		super.delete(weixinMessage);
	}
	
}