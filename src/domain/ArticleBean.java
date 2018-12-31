package domain;

public class ArticleBean {
	private String seq, title, content, writer, regdate;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return String.format("[게시판]\n"
				+ "게시글 번호 : %s\n"
				+ "글 제목 : %s\n"
				+ "글 내용 : %s\n"
				+ "글 쓴이 : %s\n"
				+ "등록일 :%s",seq,title,content,writer,regdate );
	}
	
}
