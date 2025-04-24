package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account a = new Account();
        try {
            a.deposit(10000);
            System.out.println(a.getBalance());
            a.withdraw(5000);
            System.out.println(a.getBalance());
            a.withdraw(7000);
            System.out.println(a.getBalance());
        } catch (InsufficientException e) {
            System.out.println("출금에 실패하였습니다.");
        }
    }
}
