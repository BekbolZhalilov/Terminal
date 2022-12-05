package impl;

import Dao.UserDao;
import Model.User;
import Servic.MyExeption;
import Servic.MyExseption;
import Servic.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao =new UserDao();


    @Override
    public void useradd(User users) {
        userDao.getUserrs().add(users);
    }

    @Override
    public User FindByid(int id) throws MyExseption {
        return userDao.getUserrs().stream()
                .filter(x->x.getId()==id)
                .findFirst().orElseThrow(()->new MyExseption(id +"is not found"));
    }

    @Override
    public void DeletUsers(int id) {
        for (User userid:userDao.getUserrs()){
            if (userid.getId()==id){
                userDao.getUserrs().remove(userid);
            }
        }


    }

    @Override
    public void GetAllUsers() {
        userDao.getUserrs();

    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                '}';
    }
}

