class User {
    private String username;

    //Constructor User
    public User(String username) {
        this.username = username;
    }
 
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
}

class Film {
    private String title;
    private String genre;

    //Constructor Film
    public Film(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    //Setter & Getter atribut Film
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Method untuk Menampilkan Detail Film
    public void showFilm() {
        System.out.println("Film: " + title);
        System.out.println("Genre: " + genre);
    }
}

class Review {
    private User user;
    private Film film;
    private int rating;
    private String comments;
    private String date;

    //Constructor Review
    public Review(User user, Film film, int rating, String comments, String date) {
        this.user = user;
        this.film = film;
        this.rating = rating;
        this.comments = comments;
        this.date = date;
    }

    //Method untuk Menampilkan Hasil Review
    public void showReview() {
        System.out.println("User: " + user.getUsername());
        System.out.println("Film: " + film.getTitle());
        System.out.println("Rating: " + rating);
        System.out.println("Comments: " + comments);
        System.out.println("Dates: " + date);
    }
}

//Main program
public class Main {
    public static void main(String[] args) {
        //Object yang dihasilkan adalah user, film, & review
        User user1 = new User("bibed");
        Film film1 = new Film("Fantastic Mr.Fox", "Family");
        Film film2 = new Film("Frankenstein", "Fantasy");

        Review review1 = new Review(
            user1, film1, 
            5, "Love the animation!", "20-2-2026");

         Review review2 = new Review(
            user1, film2, 
            5, "The whole movie is so coool!", "23-2-2026"); 
            
            film1.showFilm();
            review1.showReview();

            System.out.println();

            film2.showFilm();
            review2.showReview();
        }
    }

