/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeedcp.modules.weixin.dao;


import com.jeedcp.common.persistence.CrudDao;
import com.jeedcp.common.persistence.annotation.MyBatisDao;
import com.jeedcp.modules.weixin.entity.WeixinMenuGroup;

/**
 * 菜单组DAO接口
 * @author jeedcp
 * @version 2016-09-19
 */
@MyBatisDao
public interface WeixinMenuGroupDao extends CrudDao<WeixinMenuGroup> {
	
}