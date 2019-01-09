package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	public void ceateArticle(ArticleBean bean);
	public ArrayList<ArticleBean> findArticleAll();
	public ArrayList<ArticleBean> findByWriter(String writer);
	public ArticleBean findBySeq(String seq);
	public String countArticle();
	public void changeContent(String title,String newcontent);
	public void removetitle(String title);
}
