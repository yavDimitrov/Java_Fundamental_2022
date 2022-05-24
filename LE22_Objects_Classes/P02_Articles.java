package LE22_Objects_Classes;

import java.util.Scanner;

public class P02_Articles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String autthor = data[1];

        Article article1 = new Article(title, content, autthor);


        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split(": ");
            switch (commands[0]) {
                case "Edit":
                    article1.setContent(commands[1]);
                    break;
                case "ChangeAuthor":
                    article1.setAuthor(commands[1]);
                    break;
                case "Rename":
                    article1.setTitle(commands[1]);
                    break;
            }
        }

        System.out.println(article1.toString());
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            //"{title} - {content}:{author}"
            return String.format("%s - %s: %s", this.title, this.content, this.author);

        }
    }
}
