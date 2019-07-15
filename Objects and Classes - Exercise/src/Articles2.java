import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    static class Article {

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;

        }
        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];
            Article article = new Article(title,content,author);

            articles.add(article);

        }
        String criteria = scanner.nextLine();

        if (criteria.equals("title")){
            articles.sort(Comparator.comparing(f -> f.title));
        }else if (criteria.equals("content")){
            articles.sort(Comparator.comparing(f -> f.content));
        }else{
            articles.sort(Comparator.comparing(f -> f.author));
        }
        for (Article article:articles) {
            System.out.println(article.toString());
        }
    }
}
