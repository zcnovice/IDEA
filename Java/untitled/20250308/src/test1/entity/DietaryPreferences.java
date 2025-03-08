package test1.entity;

public  class DietaryPreferences {

    public DietaryPreferences(int appetite, String preferences) {
        this.appetite = appetite;
        this.preferences = preferences;
    }

    //食量
    private int appetite = 10;
    //饮食偏好
    private String preferences;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
