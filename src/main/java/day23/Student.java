package day23;

public class Student {


    public String name= "Tom Hanks";
    private String stId= "TH123";
    private double stdGpa=3.8;
    private String disease= "Heart Disease";
private boolean successful = false;
    public String getStId() {
        return stId;
    }

    public double getStdGpa() {
        return stdGpa;
    }
// if the data type is boolean get method name starts with "is"
    public boolean isSuccessful() {
        return successful;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public static void main(String[] args) {




    }
}
/*
                                    Encapsulation
        Encapsulation is "data hiding"
        To hide a data we make the access modifier "private"
        After "hiding data", you may need to "read" or "update" the data.
        To "read" or "update" the data we will create some methods.
        To "read" "encapsulated data" you should create "get()" methods, we name it "getters"
        To "update" "encapsulated data" you should create "set()" methods, we name it "setters"
 */