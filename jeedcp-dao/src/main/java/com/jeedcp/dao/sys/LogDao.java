/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeedcp.org/">Jeedcp</a> All rights reserved.
 */
package com.jeedcp.dao.sys;

import com.jeedcp.dao.base.CrudDao;
import com.jeedcp.entity.sys.Log;
import com.jeedcp.persistence.annotation.MyBatisDao;

/**
 * 日志DAO接口
 * @author jeedcp
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

	public void empty();
}
