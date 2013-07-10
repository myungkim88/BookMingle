package bookMingle.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;

import bookMingle.model.UserInfo;

public class UserInfoDaoTest {
	UserInfo userInfo;
	Date registeredTime;
	Date lastActiveTime;
	@Before
	public void setUp() {
		userInfo = new UserInfo();
		userInfo.setMemberId("testMemberId");
		userInfo.setPassword("testPassword");
		userInfo.setFirstname("testFirstname");
		userInfo.setLastname("testLastname");
		userInfo.setEmail("testEmail@testEmail");
		registeredTime = new Date();
		userInfo.setRegisteredDate(registeredTime);
		lastActiveTime = new Date();
		userInfo.setLastActiveDate(lastActiveTime);
		Calendar calendarDate = new GregorianCalendar(1988, 03, 28);
		userInfo.setDob(date);
		
		
		
	}
}
