package src.models;

public class User {

    private String userName;
    private int age;
    private String[] booksIssued;
    private int numberOfBooksIssued;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBooksIssued(String booksIssued[]) {
        this.booksIssued = booksIssued;
    }

    public String[] getBooksIssued() {
        return booksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public int getNumberOfbooksIssued() {
        return numberOfBooksIssued;
    }

}
