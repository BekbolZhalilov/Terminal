import Dao.UserDao;
import Model.GENDER;
import Model.User;
import Servic.MyExseption;
import Servic.UserService;
import impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


   User users1= new User(1,"Sultan",26,GENDER.MALE);
    User users2=new User(2,"Aamina",26,GENDER.FEMALE);
    User users3 = new User(3,"Aidar",26,GENDER.MALE);

        UserServiceImpl userService = new UserServiceImpl();
        userService.useradd(users1);
        userService.useradd(users2);
        userService.useradd(users3);


        try {
            System.out.println(userService.FindByid(1));
           userService.GetAllUsers();
           userService.DeletUsers(1);
           userService.GetAllUsers();

        } catch (MyExseption e){
            System.out.println(e.getMessage());
        }



    }

}


