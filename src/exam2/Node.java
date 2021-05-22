package exam2;

public class Node {
    private String heading;
    private String text;
    private String firstResult;
    private String secondResult;


    public Node(String heading, String text, String firstResult, String secondResult) {
        this.heading = heading;
        this.text = text;
        this.firstResult = firstResult;
        this.secondResult = secondResult;

    }


    public String getHeading() {
        return heading;
    }


    public String getText() {
        return text;
    }


    public String getFirstResult() {
        return firstResult;
    }


    public String getSecondResult() {
        return secondResult;
    }


}