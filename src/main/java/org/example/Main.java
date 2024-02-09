package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(2);

        for (int i = 0; i <6; i++) {
            Task task = new Task(i);
            pool.execute(task);
        }
    }
}