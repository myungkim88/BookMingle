/**
 * 
 */
package bookMingle.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import bookMingle.model.UserInfo;

/**
 * @author MyungHo Kim myungho.mortimen@gmail.com
 * 
 */
public class UserInfoDao extends JdbcDaoSupport {
	private static final String INSERT = "INSERT INTO userInfo " +
			"(memberId, password, firstname, lastname, dob, email, registeredDate, " +
			"lastActiveDate) VALUES (?,?,?,?,?,?,?,?)";
	private static final String SELECT_AN_USER = "SELECT * FROM userInfo where memberId = ?";
	private static final String SELECT_ALL = "SELECT * FROM userInfo";
	private static final String DELETE_USER = "DELETE FROM userInfo WHERE memberId=?";
	private static final String UPDATE_USER = "UPDATE userInfo SET password=?, " +
				"lastModifiedDate=? where memberId=?";
			
	
	/**
	 * @param memberId member Id
	 * @return return userInfo
	 */
	public UserInfo getUserInfo(String memberId) {
		UserInfo userInfo = null;
		List<Object> userInfos = getJdbcTemplate().query(SELECT_AN_USER, new Object[] {memberId}, 
				new UserInfoRowMapper());
		if (userInfos != null && userInfos.size() == 1) {
			userInfo = (UserInfo) userInfos.get(0);
		}
		
		return userInfo;
	}
	
	public void insertUserInfo(UserInfo userInfo) {
		getJdbcTemplate().update(INSERT, new Object[] {userInfo.getMemberId(), userInfo.getPassword(),
				userInfo.getFirstname(), userInfo.getLastname(), userInfo.getDob(), userInfo.getEmail(),
				userInfo.getRegisteredDate(), userInfo.getLastModifiedDate()});
	}
	
	public void deleteUserInfo(UserInfo userInfo) {
		getJdbcTemplate().update(DELETE_USER, new Object[] {userInfo.getMemberId()});
	}
	
	public void udpateUserInfo(UserInfo userInfo) {
		getJdbcTemplate().update(UPDATE_USER, new Object[] {userInfo.getPassword(), new Date()});
	}
}


class UserInfoRowMapper implements RowMapper<Object> {
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserInfo userInfo = new UserInfo();
		userInfo.setMemberId(rs.getString("memberId"));
		userInfo.setPassword(rs.getString("password"));
		userInfo.setDob(rs.getDate("dob"));
		userInfo.setFirstname(rs.getString("firstname"));
		userInfo.setLastname(rs.getString("lastname"));
		userInfo.setEmail(rs.getString("email"));
		userInfo.setRegisteredDate(rs.getDate("registeredDate"));
		userInfo.setLastActiveDate(rs.getDate("lastActiveDate"));
		
		return userInfo;
	}
}