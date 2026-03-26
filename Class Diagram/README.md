# OOP Project (26/03/26)
### Elisabeth La Satta Sitorus | 039

### 1. Deskripsi Kasus
Seorang user ingin meninggalkan review tiap selesai menonton film, dia membutuhkan sebuah sistem yang bisa mencatat review user tersebut dari nama film, genre film, rating, komentar atas film, hingga tanggal log reviewnya.
Maka, dari masalah tersebut dibuatlah class diagram untuk menggambarkan kelas apa saja yang dibutuhkan dan relasinya, yang nantinya akan diagram tersebut akan diimplementasikan ke dalam suatu sistem. 

### 2. Class Diagram
<img width="940" height="1200" alt="image" src="https://github.com/user-attachments/assets/533253c0-60b1-49e9-a52f-38bed06dd230" />

### 3. Kode Program Java
```java
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

    public void viewFilm() {
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
    public void viewReview() {
        System.out.println("User: " + user.getUsername());
        System.out.println("Film: " + film.getTitle());
        System.out.println("Rating: " + rating);
        System.out.println("Comments: " + comments);
        System.out.println("Dates: " + date);
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("bibed");
        Film film1 = new Film("Fantastic Mr.Fox", "Family");
        Film film2 = new Film("Frankenstein", "Fantasy");

        Review review1 = new Review(
            user1, film1, 
            5, "Love the animation!", "20-2-2026");

         Review review2 = new Review(
            user1, film2, 
            5, "The whole movie is so coool!", "23-2-2026"); 
            
            film1.viewFilm();
            review1.viewReview();

            System.out.println();

            film2.viewFilm();
            review2.viewReview();
        }
    }
```

### Output
```text
Film: Fantastic Mr.Fox
Genre: Family
User: bibed
Film: Fantastic Mr.Fox
Rating: 5
Comments: Love the animation!
Dates: 20-2-2026

Film: Frankenstein
Genre: Fantasy
User: bibed
Film: Frankenstein
Rating: 5
Comments: The whole movie is so coool!
Dates: 23-2-2026
```

### 4. Penjelasan OOP
