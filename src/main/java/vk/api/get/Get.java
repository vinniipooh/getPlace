package vk.api.get;

import com.google.gson.Gson;
import json.Json;
import links.VkLinks;
import vk.api.get.dialog.GetDialog;
import vk.api.get.history.GetHistory;


public class Get {

    public static GetDialog getDialog() {
        GetDialog gd;
        while (true) {
            gd =  new Gson().fromJson(Json.getJson(VkLinks.getLinkGetDialog()), GetDialog.class);
            try {
                gd.getResponse().getItems();
                break;
            } catch (NullPointerException e){
                continue;
            }
        }
        return gd;
    }

    public static GetHistory getHistory(String id) {
        GetHistory gh;
        while (true) {
            gh = new Gson().fromJson(Json.getJson(VkLinks.getLinkGetHistory(id)), GetHistory.class);
            try {
                gh.getResponse().getItems();
                break;
            } catch (NullPointerException e){
                continue;
            }
        }
        return gh;
    }
}
