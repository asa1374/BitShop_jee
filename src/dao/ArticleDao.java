package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleDao {
	public void insertArticle(ArticleBean article);
	public ArrayList<ArticleBean> selectArticlesAll();
	public ArrayList<ArticleBean> selectArticlesByWiter(String writer);
	public ArticleBean selectByTitle(String title);
	public String countArricle();
	public void updateContent(String title,String content);
	public void deleteContent(String title);
}
