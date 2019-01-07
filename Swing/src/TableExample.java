import javax.swing.*;

public class TableExample {
    TableExample() {
        // Data
        String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
        String column[] = { "ID", "NAME", "SALARY" };

        //Create Components
        JFrame f = new JFrame("Table Example");
        JTable table = new JTable(data,column);
        JScrollPane pane = new JScrollPane(table);

        // set Bounds
        f.setSize(500,500);
        table.setBounds(30,40,200,300);

        // add components
        f.add(pane);

        // Set the frame
       
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}