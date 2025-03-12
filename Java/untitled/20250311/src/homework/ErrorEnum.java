package homework;

public enum UserEnum {
    PHONE_ERROR(101,"手机号码格式错误"),
    USER_NAME(102,"姓名长度过长"),
    USER_ROOT(103,"用户权限不足");


    private int value;
    private String description;

    UserEnum() {
    }

    UserEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
