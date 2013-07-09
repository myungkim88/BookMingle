package bookMingle.service;

import javax.annotation.Resource;
import javax.sql.DataSource;

import bookMingle.dao.UserInfoDao;
import bookMingle.model.UserInfo;

public class UserInfoService {
	
	@Resource(name="jdbc/bmdb")
	private DataSource ds;
	
	public void getUserInfo(UserInfo userInfo){
		try {
			UserInfoDao userInfoDao = new UserInfoDao();
			userInfoDao.setDataSource(ds);
			userInfoDao.getUserInfo(userInfo.getMemberId());
		} catch (Exception e) {
		}
	}
}
