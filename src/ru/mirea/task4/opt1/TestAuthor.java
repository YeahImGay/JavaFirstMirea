package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Ryu Murakami", "DedInside2007@gmail.com", 'M');
        System.out.println(author1);
        System.out.println(author1.getName());
        System.out.println(author1.getEmail());
        System.out.println(author1.getGender());
        Author author2 = new Author("Vlad Galakas", "PazhiloyPauchok228@gmail.ru", 'M');
        author2.setEmail("PazhiloyCyborg@gmail.com");
        System.out.println(author2);
    }
}
