package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	public void ceateArticle(String title,String content,String writer,String regdate);
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findWriter(String writer);
	public ArticleBean findSeq(String seq);
	public String articleCount();
	public void updateContent(String title,String newcontent);
	public void deletetitle(String title);
}
