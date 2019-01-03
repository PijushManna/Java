import java.awt.*;

class MenuBarDemo{
    public static void main(String[] args) {
        Frame f = new Frame("Menubar");
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        // Create menubar
        MenuBar mbr = new MenuBar();
        Menu mnu = new Menu("My menu");
        Menu submnu = new Menu("My Sub menu");
        MenuItem mItem1 = new MenuItem("Item 1");
        MenuItem mItem2 = new MenuItem("Item 2");
        MenuItem mItem3 = new MenuItem("Item 3");
        MenuItem mItem4 = new MenuItem("Item 4");
        MenuItem mItem5 = new MenuItem("Item 5");
        MenuItem mItem6 = new MenuItem("Item 6");
        MenuItem mItem7 = new MenuItem("Item 7");

        // Adding components
        f.setMenuBar(mbr);
        mbr.add(mnu);
        mnu.add(submnu);
        mnu.add(mItem1);
        mnu.add(mItem2);
        mnu.add(mItem3);
        mnu.add(mItem4);
        submnu.add(mItem5);
        submnu.add(mItem6);
        submnu.add(mItem7);
    }
}