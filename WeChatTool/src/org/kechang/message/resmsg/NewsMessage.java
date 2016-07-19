package org.kechang.message.resmsg;

import java.util.List;

public class NewsMessage extends BaseMessage{
	//News message number 
	private int ArticleCount;
	//Multi-news message
	private List<Article> Articles;
	
	public int getArticleCount() {
		return ArticleCount;
	}
	
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Article> getArticles() {
		return Articles;
	}

	public void setArticles(List<Article> articles) {
		Articles = articles;
	}
	
	
}
