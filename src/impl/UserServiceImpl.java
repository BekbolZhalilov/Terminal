package impl;

import Dao.UserDao;
import Model.User;
import Servic.MyExseption;
import Servic.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao =new UserDao();


    @Override
    public void useradd(User users) {
        userDao.getUsers().add(users);
    }






    @Override
    public User findByid(int id) throws MyExseption {
        return userDao.getUsers().stream().
                filter(x-> x.getId()==id).
                findFirst().orElseThrow(()-> new MyExseption(id+"is not found"));
    }

    @Override
    public void deletUsers(int id) {

    }

    @Override
    public void getAllUsers() {

    }


}





