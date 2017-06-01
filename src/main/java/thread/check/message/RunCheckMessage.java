package thread.check.message;

import thread.work.client.ClientWork;
import vk.api.get.Get;
import vk.api.get.dialog.GetDialog;
import java.util.ArrayList;

public class RunCheckMessage implements Runnable {

    private static GetDialog ogd = Get.getDialog();
    public static ArrayList<String> listOfclient = new ArrayList<>();


    public static void setOgd(GetDialog ogd) {
        RunCheckMessage.ogd = ogd;
    }

    public synchronized void run() {
        GetDialog ngd;

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ngd = Get.getDialog();

            if (ngd.getResponse().getCount().equals(ogd.getResponse().getCount())) {
                continue;
            } else {
                listOfclient.add(ngd.getResponse().getItems()[0].getMessage().getUser_id());
                Thread thread = new Thread(new ClientWork(ngd.getResponse().getItems()[0].getMessage().getUser_id()));
                thread.start();
                ogd = Get.getDialog();
                continue;
            }
        }
    }
}
