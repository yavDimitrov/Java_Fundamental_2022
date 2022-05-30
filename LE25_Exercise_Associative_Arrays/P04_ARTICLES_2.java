package LE22_Objects_Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04_ARTICLES_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articleList = new ArrayList<>();
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articleList.add(article);

        }

        String line = scanner.nextLine();

        switch (line) {
            case "title":
                articleList.stream()
                        //.sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()))
                        .forEach(p -> System.out.println(p.toString()));

                break;

            case "content":
                articleList.stream()
                        //.sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent()))
                        .forEach(p -> System.out.println(p.toString()));

                break;

            case "author":
                articleList.stream()
                        //.sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(p -> System.out.println(p.toString()));

                break;

        }


    }

    public static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
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

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            // "{title} - {content}: {author}"
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
