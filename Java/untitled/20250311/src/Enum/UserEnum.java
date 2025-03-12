package Enum;

public enum UserEnum {
    USER("用户","user"),
    ADMIN("管理员","admin"),
    BAN("被封号","ban");


    private String name;
    private String root;

    UserEnum() {
    }


    UserEnum(String name, String root) {
        this.name = name;
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
