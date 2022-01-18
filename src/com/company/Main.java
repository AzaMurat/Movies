package com.company;
import com.company.dataBase.JsonIO;
import com.company.exception.InputException;
import com.company.model.Cast;
import com.company.model.Movies;
import com.company.service.FindAble;
import com.company.service.SortAble;
import com.company.service.impl.FindByMap;
import com.company.service.impl.MovieStore;

import java.util.List;
import java.util.Scanner;
public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static SortAble s = (SortAble) new MovieStore();
    private static FindAble f = (FindAble) new FindByMap();
    private static final Scanner in;
    private static final Scanner inForString;


    public static void main(String[] args) throws InputException {
        while (true) {
            commads();
            try {
                System.out.print(" выберите номер: ");
                int inputNumber = in.nextInt();
                String aktorRoles;
                switch(inputNumber) {
                    case 1:
                        System.out.println(" Каталог : ");
                        s.printAllMovies(JsonIO.getMovies());
                        break;
                    case 2:
                        System.out.println(" Напишите полное название фильма: ");
                        aktorRoles = inForString.nextLine();
                        s.findMovie(movies, aktorRoles);
                        break;
                    case 3:
                        System.out.println(" Сортировка по годам: ");
                        s.sortByYear(JsonIO.getMovies());
                        break;
                    case 4:
                        System.out.println("Отсортировано по названию фильма:");
                        s.sortByName(movies);
                        break;
                    case 5:
                        System.out.println(" Директоры : ");
                        s.sortByDirector(movies);
                        break;
                    case 6:
                        System.out.println(" Напишите имя актера: ");
                        aktorRoles = inForString.nextLine();
                        f.findMoviesByActor(JsonIO.getMovies(), aktorRoles);
                        break;
                    case 7:
                        System.out.print(" Напишите имя директора: ");
                        aktorRoles = inForString.nextLine();
                        f.findMoviesByDirector(JsonIO.getMovies(), aktorRoles);
                        break;
                    case 8:
                        f.findMoviesByYear(JsonIO.getMovies(), getInt());
                        break;
                    case 9:
                        System.out.print(" Напишите роли по имени актера:");
                        aktorRoles = inForString.nextLine();
                        f.findMoviesAndRoleByActor(JsonIO.getMovies(), aktorRoles);
                        break;
                    case 10:
                        System.out.println(" Сортировка ролей и актеров: ");
                        f.showActorRoles(JsonIO.getMovies());
                        break;
                    default:
                        throw new InputException(" Вы ввели неверный номер, пожалуйста, введите еще раз ");
                }
            } catch (InputException var3) {
                System.err.println("Извините, вы не правильно выбрали, выберите еще раз!" +
                        "\n-------------------------------------------------");
            }
        }
    }

    static void commads() {
        System.out.println("--------------Команды-----------------------");
        System.out.println("Нажмите 1, чтобы распечатать каталог");
        System.out.println("Нажмите 2, чтобы найти фильм по полному или частичному названию.");
        System.out.println("Нажмите 3, чтобы отсортировать по году");
        System.out.println("Нажмите 4 для сортировки по имени");
        System.out.println("Нажмите 5 для сортировки по директору");
        System.out.println("Нажмите 6, чтобы найти фильмы по имени актера");
        System.out.println("Нажмите 7, чтобы найти фильмы по имени режиссера");
        System.out.println("Нажмите 8, чтобы найти фильмы по годам");
        System.out.println("Нажмите 9, чтобы просмотреть все фильмы и роли по имени актера.");
        System.out.println("Нажмите 10, чтобы отсортировать Список всех актеров с их ролями");
        System.out.println("---------------------------------------------");
    }

    public static int getInt() {
        System.out.print(" Напишите год: ");
        int a = 0;

        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception var2) {
            System.out.println("Неправильно, попробуйте занова");
            var2.printStackTrace();
        }

        return a;
    }

    static {
        in = new Scanner(System.in);
        inForString = new Scanner(System.in);
    }
}