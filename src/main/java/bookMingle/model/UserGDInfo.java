package bookMingle.model;

import java.util.Date;

/**
 * @author MyungHo Kim myungho.mortimen@gmail.com
 *
 */
public class UserGDInfo {
	private String memberId;
	private int partipatedBoard;
	private int numOfPartipatedBoard;
	private int goodDiscussionPoint;
	private Date lastActiveDate;
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the partipatedBoard
	 */
	public int getPartipatedBoard() {
		return partipatedBoard;
	}
	/**
	 * @param partipatedBoard the partipatedBoard to set
	 */
	public void setPartipatedBoard(int partipatedBoard) {
		this.partipatedBoard = partipatedBoard;
	}
	/**
	 * @return the numOfPartipatedBoard
	 */
	public int getNumOfPartipatedBoard() {
		return numOfPartipatedBoard;
	}
	/**
	 * @param numOfPartipatedBoard the numOfPartipatedBoard to set
	 */
	public void setNumOfPartipatedBoard(int numOfPartipatedBoard) {
		this.numOfPartipatedBoard = numOfPartipatedBoard;
	}
	/**
	 * @return the goodDiscussionPoint
	 */
	public int getGoodDiscussionPoint() {
		return goodDiscussionPoint;
	}
	/**
	 * @param goodDiscussionPoint the goodDiscussionPoint to set
	 */
	public void setGoodDiscussionPoint(int goodDiscussionPoint) {
		this.goodDiscussionPoint = goodDiscussionPoint;
	}
	/**
	 * @return the lastActiveDate
	 */
	public Date getLastActiveDate() {
		return lastActiveDate;
	}
	/**
	 * @param lastActiveDate the lastActiveDate to set
	 */
	public void setLastActiveDate(Date lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}
	
	
}
