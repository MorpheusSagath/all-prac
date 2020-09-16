public class ForAuthor2 {
    public static void main(String[] args) {
        Author a = new Author("Rosa", "rosarosa1991@mail.com", 'f');
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        a.setEmail("oraoraora@mail.com");
        System.out.println(a);
    }
}
