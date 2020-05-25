package com.designpatterns.structural.composite.rowscolumns;

// 2. "Isa" relationship
abstract class Composite implements Component {
    // 3. Couple to interface
    private final Component[] children = new Component[9];
    private int total = 0;
    private final int value;

    public Composite(int val) {
        value = val;
    }

    // 3. Couple to interface
    public void add(Component c) {
        children[total++] = c;
    }

    public void traverse() {
        System.out.print(value + "  ");
        for (int i = 0; i < total; i++) {
            // 4. Delegation and polymorphism
            children[i].traverse();
        }
    }
}
