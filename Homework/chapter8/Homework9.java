package chapter8;

public class Homework9 {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("Black", 1929, 230.07);
        System.out.println(labeledPoint.getLabel() + "\t" + labeledPoint.getxLabel() + "\t" + labeledPoint.getyLabel());
    }
}

class Point{
    private double xLabel;
    private double yLabel;
    public Point(double xLabel, double yLable){
        this.xLabel = xLabel;
        this.yLabel = yLable;
    }

    public double getxLabel() {
        return xLabel;
    }

    public double getyLabel() {
        return yLabel;
    }
}

class LabeledPoint extends Point{
    private String label;
    public LabeledPoint(String label, double xLabel, double yLable){
        super(xLabel, yLable);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}