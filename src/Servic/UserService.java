package Servic;

import Model.User;

public interface UserService {

    void useradd(User users);
      User FindByid(int id) throws MyExseption;
    public void DeletUsers(int id);
    public void GetAllUsers();



    }

