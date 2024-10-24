package Model.Class_Enum;

public enum Status{
    HADIR(0), ALPHA(1);

    private int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}