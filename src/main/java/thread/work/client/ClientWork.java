package thread.work.client;

import java.util.ArrayList;

public class ClientWork implements Runnable {

    private String user_id;
    public static ArrayList<OneClientThread> clientThreadArrayList = new ArrayList<>();

    public ClientWork(String user_id) {
        this.user_id = user_id;
    }

    public void run() {

        OneClientThread oneClientThread = new OneClientThread(user_id);
        clientThreadArrayList.add(oneClientThread);
        oneClientThread.clientWork();
    }

}
