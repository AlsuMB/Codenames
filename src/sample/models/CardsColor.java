package sample.models;

public enum CardsColor {
    BLUE("#0000FF"),
    RED("#FF0000"),
    BLACK("#5D5363"),
    WHITE("#FFC673"),
    NOBODIES("#FFC673");

    private String code;
    CardsColor(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}
