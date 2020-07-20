package usermanagement;

import java.util.Scanner;

public class UserManagement {
    private int totalUser;
    private User[] users;

    public UserManagement() {
    }

    public UserManagement(int totalUser, User[] users) {
        this.totalUser = this.users.length;
        this.users = users;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User findUserByUserName()
    {
        System.out.println("-----Find User-----");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập Username: ");
        String name  =sc.nextLine();
        User us = new User();

        for(int i=0;i<users.length;i++)
        {
            if(users[i].getName().trim().equalsIgnoreCase(name.trim()))
            {
                    us = users[i];
            }
            else
            {
                us =null;
            }

        }
        return us;
    }

    /*public User login()
    {
        try {
            System.out.println("-----Login-----");
            Scanner sc = new Scanner(System.in);
            System.out.println(" Nhập username: ");
            String us = sc.nextLine();


            for(int  i=0; i<users.length;i++)
            {
                if(users[i].getName().trim().equalsIgnoreCase(us.trim()))
                {

                    System.out.println(" Nhập Password: ");
                    String pw = sc.nextLine();
                    for(int j=0;j<users.length;j++)
                    {
                        try {
                            if (users[j].getPassword().trim().equalsIgnoreCase(pw.trim())) {
                                System.out.println(" Đăng nhập thành công");
                            }
                        }
                        catch (Exception e )
                        {

                        }
                    }
                }
            }
        }
        catch (Exception e)
        {}
    }*/

    public User login(String userNames, String passWords){
        User userAccount = null;
        for (int i = 0; i < totalUser; i++) {
            try {
                if(users[i].getName().equals(userNames)){
                    if (users[i].getPassword().equals(passWords)){
                        userAccount = users[i];
                    }else {
                        System.out.println("Đăng nhập thất bại, sai mật khẩu.");
                    }
                }else {
                    System.out.println("Đăng nhập thất bại, sai tên đăng nhập.");
                }
            }catch (NullPointerException e){
                System.out.println("error, User khong ton tai.");
            }
        }
        return userAccount ;
    }


}
