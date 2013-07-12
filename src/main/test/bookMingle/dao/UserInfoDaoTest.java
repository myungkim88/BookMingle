package bookMingle.dao;

import java.sql.Date;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bookMingle.model.UserInfo;

public class UserInfoDaoTest {
	UserInfo userInfo;
	Date registeredTime;
	Date lastActiveTime;
	UserInfoDao userInfoDao;
	
	/**
	 * Creates a datasource and returns it
	 * 
	 * @return The datasource
	 */
	public static DataSource getDataSource() {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setServerName("127.0.0.1");
		ds.setDatabaseName("bookmingle");
		ds.setPassword("1234");
		ds.setUser("root");
		return ds;
	}
	
	@Before
	public void setUp() {
		DataSource ds = getDataSource();
		userInfoDao = new UserInfoDao();
		userInfoDao.setDataSource(ds);
		java.util.Calendar cal = java.util.Calendar.getInstance();
		java.util.Date utilDate = cal.getTime();
		
		userInfo = new UserInfo();
		userInfo.setMemberId("testMemberId");
		userInfo.setPassword("testPassword");
		userInfo.setFirstname("testFirstname");
		userInfo.setLastname("testLastname");
		userInfo.setEmail("testEmail@testEmail");
		registeredTime = new Date(utilDate.getTime());
		userInfo.setRegisteredDate(registeredTime);
		lastActiveTime = new Date(utilDate.getTime());
		userInfo.setLastActiveDate(lastActiveTime);	
		userInfo.setDob(Date.valueOf("1988-03-28"));
	}
	
	@Test
	public void testInsertNewUser() {
		userInfoDao.insertUserInfo(userInfo);
		UserInfo result = userInfoDao.getUserInfo(userInfo.getMemberId());
		Assert.assertEquals(userInfo.getEmail(), result.getEmail());
		Assert.assertEquals(userInfo.getFirstname(), result.getFirstname());
		Assert.assertEquals(userInfo.getLastname(), result.getLastname());
		Assert.assertEquals(userInfo.getMemberId(), result.getMemberId());
		Assert.assertEquals(userInfo.getPassword(), result.getPassword());
		Assert.assertTrue(userInfo.getDob().equals(result.getDob()));
		Assert.assertTrue(userInfo.getLastModifiedDate().equals(result.getLastModifiedDate()));
//		Assert.assertTrue(userInfo.getRegisteredDate().equals(result.getRegisteredDate()));
		
//		Assert.assertEquals(userInfo.getLastModifiedDate(), result.getLastModifiedDate());
//		Assert.assertEquals(userInfo.getRegisteredDate(), result.getRegisteredDate());
	}
	
	@After
	public void cleanUp() {
		userInfoDao.deleteUserInfo(userInfo);
	}
}
