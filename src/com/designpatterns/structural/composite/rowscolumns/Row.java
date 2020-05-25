package com.designpatterns.structural.composite.rowscolumns;

// Two different kinds of "container" classes.  Most of the
// "meat" is in the Composite base class.
class Row extends Composite {
    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}
