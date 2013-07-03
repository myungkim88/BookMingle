package bookMingle.model;

import java.util.Date;

public class QuestionInfo {
	private int memberId;
	private int bookId;
	private int boardId;
	private String question;
	private int solved;
	private Date createdDate;
	private Date lastEditedDate;
	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the boardId
	 */
	public int getBoardId() {
		return boardId;
	}
	/**
	 * @param boardId the boardId to set
	 */
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the solved
	 */
	public int getSolved() {
		return solved;
	}
	/**
	 * @param solved the solved to set
	 */
	public void setSolved(int solved) {
		this.solved = solved;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the lastEditedDate
	 */
	public Date getLastEditedDate() {
		return lastEditedDate;
	}
	/**
	 * @param lastEditedDate the lastEditedDate to set
	 */
	public void setLastEditedDate(Date lastEditedDate) {
		this.lastEditedDate = lastEditedDate;
	}
	
	
}
