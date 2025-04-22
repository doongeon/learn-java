package ch07.adv.exam01;

public class Database {
    private static final Database instance = new Database();
    private final String connection = "MySQL";

    private Database() {};

    public static Database getInstance() {
        return instance;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }
}
