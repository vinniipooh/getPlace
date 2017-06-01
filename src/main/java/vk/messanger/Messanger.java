package vk.messanger;

import fs.answer.FsApi;
import fs.explore.Explore;
import fs.explore.Items;
import json.Json;
import links.VkLinks;

public class Messanger implements interfaces.Messanger {

    public void sendMessage(String id, String txt) {
        Json.getJson(VkLinks.getLinkSendMessage(id, txt));
    }

    @Override
    public String formTxtMessage(FsApi fsapi) {
        String answer = "";
        try {
            answer += fsapi.getResponse().getVenues()[0].getName() + "\n";
            if (fsapi.getResponse().getVenues()[0].getLocation().getAddress() != null)
                answer += "Адресс: " + fsapi.getResponse().getVenues()[0].getLocation().getAddress() + "\n";
            if (fsapi.getResponse().getVenues()[0].getContact().getPhone() != null)
                answer += "Телефон: " + fsapi.getResponse().getVenues()[0].getContact().getPhone();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Простите ничего не найдено";
        }
        return answer;
    }

    @Override
    public String formTxtMessage(Explore explore) {
        String answer = "";

        for (int i = 0; i < 3; i++) {
            Items items = explore.getResponse().getGroups()[0].getItems()[i];
            answer += items.getVenue().getName() + "\t" + items.getVenue().getRating() + "\n";
            answer += items.getVenue().getCategories()[0].getPluralName() + "\n";
            if (items.getVenue().getLocation().getAddress() != null)
            answer += "Адрес: " + items.getVenue().getLocation().getAddress() + "\n";
            if (!(items.getVenue().getContact().getPhone() == null))
            answer += "Телефон: " + items.getVenue().getContact().getPhone() + "\n";
            try {
                answer += "Последний отзыв: " + items.getTips()[0].getText() + "\n\n";
            }catch (NullPointerException e){}
        }
        return answer;
    }

    public void deleteDialog(String id) {
        Json.getJson(VkLinks.getLinksDeleteDialog(id));
    }
}
