import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

class Jmenu_Jtable_JcomboBox {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    Jmenu_Jtable_JcomboBox() {
        JFrame f = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Click here to see Menu and MenuItem");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        JTable table = new JTable(5, 5);
        Font font = new Font("Verdana", Font.PLAIN, 12);
        table.setFont(font);
        table.setRowHeight(30);
        table.setBackground(Color.orange);
        table.setForeground(Color.white);
        TableColumn testColumn = table.getColumnModel().getColumn(0);
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Asia");
        comboBox.addItem("Europe");
        comboBox.addItem("North America");
        comboBox.addItem("South America");
        comboBox.addItem("Africa");
        comboBox.addItem("Antartica");
        comboBox.addItem("Australia");
        testColumn.setCellEditor(new DefaultCellEditor(comboBox));
        f.add(new JScrollPane(table));
        f.setSize(600, 400);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new Jmenu_Jtable_JcomboBox();
    }
}