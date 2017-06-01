package main;

import thread.check.message.RunCheckMessage;
import thread.work.client.ClientWork;
import thread.work.client.OneClientThread;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Thread mainThread = new Thread(new RunCheckMessage());
        mainThread.start();

        Scanner scanner = new Scanner(System.in);
        String command;
        String id;
        boolean key = true;

        while (key) {
            command = scanner.next();
            switch (command) {
                case "/help":
                    System.out.println("/active - посмотреть список активных пользователей.");
                    System.out.println("/active_size - посмотреть количевство активных пользователей.");
                    System.out.println("/delete_id - завершить работу пользователя по id.");
                    System.out.println("/delete_all - завершить работу всех пользователей.");
                    System.out.println("/stop - завершить рабботу клиента.");
                    break;

                case "/active":
                    System.out.println(RunCheckMessage.listOfclient.toString());
                    break;

                case "/active_size":
                    System.out.println(RunCheckMessage.listOfclient.size());
                    break;

                case "/delete_id":
                    System.out.println("Введите id");
                    id = scanner.next();
                    System.out.println(delete_id(id));
                    break;

                case "/delete_all":
                    System.out.println(delete_all());
                    break;

                case "/stop":
                    delete_all();
                    key = false;
                    mainThread.stop();
                    break;

                default:
                    System.out.println("Uncorrect command!");
                    break;
            }
        }
    }

    private static boolean delete_id(String id) {
        for (OneClientThread tm : ClientWork.clientThreadArrayList){
            if (tm.getUser_id().equals(id)){
                tm.setCounter(60);
                ClientWork.clientThreadArrayList.remove(tm);
                return true;
            }
        }
        return false;
    }

    private static boolean delete_all(){
        for (OneClientThread tm : ClientWork.clientThreadArrayList){
            tm.setCounter(60);
            ClientWork.clientThreadArrayList.remove(tm);
            return true;
        }
        return false;
    }
}

//Путь програмиста....Самерс
//Совершенный код....Стив Маконовал
//Разработка приложениий на Андроид
//Разработка игр на Андроид...