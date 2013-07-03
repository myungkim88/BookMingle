package bookMingle.model;

public class Answer {
	private int boardId;
	private String Answer;
	private String memberId;
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
	 * @return the answer
	 */
	public String getAnswer() {
		return Answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		Answer = answer;
	}
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
	
	
}
