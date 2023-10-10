package classes;

public class User {
  private String userName;
  private String password;

  public User(String userName, String password){
    this.userName = userName;
    this.password = password;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public String getUserName(){
    return this.userName;
  }

  private String getPassword(){
    return this.password;
  }

  public void loginUser(String userName, String password){
    if(password == getPassword()){
      System.out.println("LOGIN BERHASIL");
      return;
    }
    System.out.println("LOGIN GAGAL");
  }
}
