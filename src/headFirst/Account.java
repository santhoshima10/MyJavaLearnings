package headFirst;

public class Account {

    int a;
    int b;

    public void setData(int c, int d){
        a = c;
        b = d;
    }

    public void showData(){
        System.out.println("The value of a"+a);
        System.out.println("The value of b"+b);
    }

    public static void main(String[] args){
        Account account = new Account();
        account.setData(200,300);
        account.showData();
    }


}
