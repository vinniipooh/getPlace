package users;

import java.util.ArrayList;

public class UsersList {

    private static ArrayList<UsersInfo> usersInfo = new ArrayList();

    public static void addUser(String id, String geoLocation) {
        usersInfo.add(new UsersInfo(id, geoLocation));
    }

    public static ArrayList getUsers() {
        return usersInfo;
    }

    public static void removeUser(String id) {
        for (UsersInfo user : usersInfo) {
            if (user.getId().equals(id))
                usersInfo.remove(user);
        }
    }
}
