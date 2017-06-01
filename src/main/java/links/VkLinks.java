package links;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class VkLinks {

    public static String getLinkGetDialog() {
        return "https://api.vk.com/method/messages.getDialogs?access_token=393786eb71385aee22ebb53f6d91fcbaae9c62b8272f7df919cb8f4a41867d1374ba1829dd02165fb5c11&count=200&v=5.63";
    }

    public static String getLinkGetHistory(String id) {
        return "https://api.vk.com/method/messages.getHistory?count=20&user_id=" + id + "&access_token=393786eb71385aee22ebb53f6d91fcbaae9c62b8272f7df919cb8f4a41867d1374ba1829dd02165fb5c11&v=5.63";
    }

    public static String getLinkSendMessage(String id, String txtMsg) {
        String txt = null;
        try {
            txt = URLEncoder.encode(txtMsg, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "https://api.vk.com/method/messages.send?access_token=393786eb71385aee22ebb53f6d91fcbaae9c62b8272f7df919cb8f4a41867d1374ba1829dd02165fb5c11&user_id="+id+"&message="+txt+"&v=5.63";
    }

    public static String getLinksDeleteDialog(String id){
        return "https://api.vk.com/method/messages.deleteDialog?access_token=393786eb71385aee22ebb53f6d91fcbaae9c62b8272f7df919cb8f4a41867d1374ba1829dd02165fb5c11&user_id="+id+"&count=10000&v=5.63";
    }
}
