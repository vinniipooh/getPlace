package thread.work.client;

import com.google.gson.Gson;
import fs.answer.FsApi;
import fs.explore.Explore;
import json.Json;
import links.FsLinks;
import thread.check.message.RunCheckMessage;
import vk.api.get.Get;
import vk.api.get.history.GetHistory;
import vk.api.get.history.Items;
import vk.messanger.Messanger;

public class OneClientThread {

    private String user_id;
    private GetHistory gh;
    private Messanger messanger = new Messanger();
    private String coordinats = "";
    private int counter = 0;

    public OneClientThread(String user_id) {
        this.user_id = user_id;
    }

    public void clientWork() {
        gh = Get.getHistory(user_id);
        while (counter < 60) {

            while (!geoData()) {
                treatmentBody(gh.getResponse().getItems()[0]);
                if (!waitForMessage()) {
                    break;
                }
            }

            if (!waitForMessage()) {
                break;
            }

            if (gh.getResponse().getItems()[0].getBody().equals("1")) {
                messanger.sendMessage(user_id, "Введите название места!");
                gh = Get.getHistory(user_id);
                if (!waitForMessage()) {
                    break;
                }

                FsApi fsApi = new Gson().fromJson(Json.getJson(FsLinks.getLinkPlace(coordinats, gh.getResponse().getItems()[0].getBody())), FsApi.class);

                messanger.sendMessage(user_id, messanger.formTxtMessage(fsApi));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                messanger.sendMessage(user_id, "Выберите режим\n1. Поиск места по названию\n2. Поиск места по близости\n\n3.Изменение геолокации");
                gh = Get.getHistory(user_id);
                continue;

            } else if (gh.getResponse().getItems()[0].getBody().equals("2")) {
                messanger.sendMessage(user_id, "Выберите категорию\n1.Еда\n2.Напитки.");
                gh = Get.getHistory(user_id);
                if (!waitForMessage()) {
                    break;
                }

                if (gh.getResponse().getItems()[0].getBody().equals("1")) {
                    Explore explore = new Gson().fromJson(Json.getJson(FsLinks.getLinkExplore(coordinats, "food")), Explore.class);
                    messanger.sendMessage(user_id, messanger.formTxtMessage(explore));

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    messanger.sendMessage(user_id, "Выберите режим\n1. Поиск места по названию\n2. Поиск места по близости\n\n3.Изменение геолокации");

                    gh = Get.getHistory(user_id);
                    continue;

                } else if (gh.getResponse().getItems()[0].getBody().equals("2")) {
                    Explore explore = new Gson().fromJson(Json.getJson(FsLinks.getLinkExplore(coordinats, "drinks")), Explore.class);
                    messanger.sendMessage(user_id, messanger.formTxtMessage(explore));

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    messanger.sendMessage(user_id, "Выберите режим\n1. Поиск места по названию\n2. Поиск места по близости\n\n3.Изменение геолокации");

                    gh = Get.getHistory(user_id);
                    continue;
                }
            } else if (gh.getResponse().getItems()[0].getBody().equals("3")) {
                coordinats = "";
                gh = Get.getHistory(user_id);
                continue;

            } else if (gh.getResponse().getItems()[0].getBody().equals("666")) {
                break;

            } else {
                messanger.sendMessage(user_id, "Неправильный ввод");
                gh = Get.getHistory(user_id);
                continue;
            }
        }
        messanger.sendMessage(user_id, "Досвидания");
        RunCheckMessage.listOfclient.remove(user_id);
        messanger.deleteDialog(user_id);
        RunCheckMessage.setOgd(Get.getDialog());
    }

    private synchronized boolean waitForMessage() {
        while (!checkNewMessege()) {
            try {
                Thread.sleep(1000);
                if (counter > 60) {
                    return false;
                }
                counter++;
            } catch (InterruptedException e) {}
        }
        counter = 0;
        gh = Get.getHistory(user_id);
        return true;
    }


    private synchronized boolean checkNewMessege() {
        GetHistory ngh = Get.getHistory(user_id);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        if (gh.getResponse().getCount().equals(ngh.getResponse().getCount()))
            return false;
        return true;
    }

    private synchronized void treatmentBody(Items items) {
        if (items.getGeo() == null) {
            messanger.sendMessage(user_id, "Для начала работы отправьте геолокацию!");
            gh = Get.getHistory(user_id);
            return;
        } else {
            coordinats = items.getGeo().getCoordinates();
            messanger.sendMessage(user_id, "Выберите режим\n1. Поиск места по названию\n2. Поиск места по близости\n\n3.Изменение геолокации");
            return;
        }
    }

    private synchronized boolean geoData() {
        if (coordinats.equals("")) {
            return false;
        } else return true;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getUser_id() {
        return user_id;
    }
}
