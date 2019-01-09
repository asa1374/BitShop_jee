package service;

import java.util.ArrayList;

import dao.ArticleDaoImpl;
import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService{
	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	private ArticleServiceImpl() {
		dao = ArticleDaoImpl.getInstance();
	}
	public static ArticleServiceImpl getInstance() {return instance;}
	ArticleDaoImpl dao;
	

	@Override
	public void ceateArticle(ArticleBean bean) {

	}

	@Override
	public ArrayList<ArticleBean> findArticleAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> findByWriter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findBySeq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countArticle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeContent(String title, String newcontent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removetitle(String title) {
		// TODO Auto-generated method stub
		
	}

}
