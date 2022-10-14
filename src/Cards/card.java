package Cards;

import java.util.Collection;
import java.util.Iterator;

public class card {
    private String color;
    private String size;
    private int index;

    public card() {
    }

    public card(String color, String size,int index) {
        this.color = color;
        this.size = size;
        this.index=index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String toString() {
        return color+size;
    }
}
