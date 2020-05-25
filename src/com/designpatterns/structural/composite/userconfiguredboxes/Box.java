package com.designpatterns.structural.composite.userconfiguredboxes;

import java.util.ArrayList;
import java.util.List;

class Box extends Entity {
    private List children = new ArrayList();
    private int value;

    public Box(int val) {
        value = val;
    }

    public void add(Entity c) {
        children.add(c);
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
            indent.append("   ");
        }
        level++;
        for (int i = 0; i < children.size(); i++)
            ((Entity) children.get(i)).traverse(levels);
        level--;
        if (printThisLevel(levels))
            indent.setLength(indent.length() - 3);
    }
}
