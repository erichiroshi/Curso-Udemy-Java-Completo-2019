package aula099.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private int likes;
	private List<Comment> comments = new ArrayList<>();

	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Comment comment) {

		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		
		comments.remove(comment);
	}

	@Override
	public String toString() {
		
		String commentss = "";
		for(Comment c : comments)
			commentss += c+"\n";
		
		return String.format("%s%n%d Likes - %s%n%s%nComments:%n%s", title, likes, sdf.format(moment), content,
				commentss);
	}
}
