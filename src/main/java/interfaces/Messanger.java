package interfaces;

import fs.answer.FsApi;
import fs.explore.Explore;
import vk.api.get.message.GetMessage;

public interface Messanger {

    void sendMessage(String id, String txt);

    String formTxtMessage(FsApi fsapi);
    String formTxtMessage(Explore explore);

}
