package aula99.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import aula99.entities.Comment;
import aula99.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date data1 = sdf.parse("21/06/2018 13:05:44");
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		int likes = 12;

		Post post1 = new Post(data1, title, content, likes);

		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome!");
		Comment comment3 = new Comment("Legal");
		Comment comment4 = new Comment("Trouxa!");

		post1.addComment(comment1);
		post1.addComment(comment2);
		post1.addComment(comment3);
		post1.addComment(comment4);

		data1 = sdf.parse("28/07/2018 23:14:19");
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;

		Post post2 = new Post(data1, title, content, likes);

		comment1 = new Comment("Good night!");
		comment2 = new Comment("May the Force be with you");

		post2.addComment(comment1);
		post2.addComment(comment2);
		post2.addComment(comment4);
		post2.removeComment(comment4);

		System.out.println(post1);
		System.out.println(post2);

	}
}
