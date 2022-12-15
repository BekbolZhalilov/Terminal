package Servic;

import Model.User;

public interface UserService {

    void useradd(User users);



    User findByid(int id) throws MyExseption;

    void deletUsers(int id);

    void getAllUsers();


}

