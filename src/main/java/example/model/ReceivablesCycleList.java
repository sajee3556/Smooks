package main.java.example.model;

import java.util.List;

/**
 * Created by 212607215 on 12/14/2017.
 */
public class ReceivablesCycleList {
    List<ReceivablesCycle> cycleList;

    public List<ReceivablesCycle> getCycleList() {
        return cycleList;
    }

    public void setCycleList(List<ReceivablesCycle> cycleList) {
        this.cycleList = cycleList;
    }

    @Override
    public String toString() {
        StringBuffer desc = new StringBuffer();

        for(int i = 0; i < cycleList.size(); i++) {
            desc.append("\n\n" + "(" + i + "): " + cycleList.get(i)).append("");
        }

        return desc.toString();
    }
}
