package com.edubridge.mavenproject1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Book b = new Book(101,"java","james","AABC123456");
        System.out.println(b);

        System.out.println(b.getBookId());
        System.out.println(b.getBookName());
        System.out.println(b.getBookAuthor());
        System.out.println(b.getBookISBN());
    }
}
