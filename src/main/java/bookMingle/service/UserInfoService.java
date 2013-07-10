package bookMingle.service;

import javax.annotation.Resource;
import javax.sql.DataSource;

import bookMingle.dao.UserInfoDao;
import bookMingle.model.UserInfo;

public class UserInfoService {

	@Resource(name = "jdbc/bmdb")
	private DataSource ds;

	public UserInfo getUserInfo(UserInfo userInfo) {
		UserInfo result = null;
		try {
			UserInfoDao userInfoDao = new UserInfoDao();
			userInfoDao.setDataSource(ds);
			result = userInfoDao.getUserInfo(userInfo.getMemberId());
		} catch (Exception e) {
		}
		return result;
	}

	public void updateUserInfo(UserInfo userInfo) {
		try {
			UserInfoDao userInfoDao = new UserInfoDao();
			userInfoDao.setDataSource(ds);
			userInfoDao.udpateUserInfo(userInfo);
		} catch (Exception e) {
		}
	}

	public void insertNewUser(UserInfo userInfo) {
		try {
			UserInfoDao userInfoDao = new UserInfoDao();
			userInfoDao.setDataSource(ds);
			userInfoDao.insertUserInfo(userInfo);
		} catch (Exception e) {
		}
	}

	public void deleteUser(UserInfo userInfo) {
		try {
			UserInfoDao userInfoDao = new UserInfoDao();
			userInfoDao.setDataSource(ds);
			userInfoDao.deleteUserInfo(userInfo);
		} catch (Exception e) {
		}
	}
}
