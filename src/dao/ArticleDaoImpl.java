package dao;
import java.util.ArrayList;
import domain.ArticleBean;

public class ArticleDaoImpl implements ArticleDao{
	private static ArticleDaoImpl instance = new ArticleDaoImpl();
	private ArticleDaoImpl() {}
	public static ArticleDaoImpl getInstance() {return instance;}

	@Override
	public void insertArticle(ArticleBean article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ArticleBean> selectArticlesAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> selectArticlesByWiter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean selectByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countArricle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContent(String title, String content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContent(String title) {
		// TODO Auto-generated method stub
		
	}

}
