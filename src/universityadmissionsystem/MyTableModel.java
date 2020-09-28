/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package universityadmissionsystem;

import connectivity.DBConnect;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


class MyTableModel extends AbstractTableModel {
    //You can choose any long value for serialVersionUID.
    //I chose 317 because this is CSCI 317.

    String[] AttributeNames;
    String state;
    int NumberOfRows, NumberOfColumns;
    Object[][] MyArray = null;

    public MyTableModel(String[] AttributeNames, int NumberOfRows, int NumberOfColumns, Object[][] MyArray) {
        this.AttributeNames = AttributeNames;
        this.MyArray = MyArray;
        this.NumberOfRows = NumberOfRows;
        this.NumberOfColumns = NumberOfColumns;
    }
    private static final long serialVersionUID = 317L;

    public int getColumnCount() {
        return (NumberOfColumns);
    }

    public int getRowCount() {
        return (NumberOfRows);
    }

    public String getColumnName(int i) {
        return (AttributeNames[i]);
    }

    public java.lang.Object getValueAt(int row, int column) {
        return (MyArray[row][column]);
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 1) {
            return false;
        } else {
            return true;
        }
    }

    public void setValueAt(Object value, int row, int col) {
        MyArray[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public static void queryTable(String query, javax.swing.JTable tableName) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.LEFT);
        tableName.setDefaultRenderer(String.class, centerRenderer);
        tableName.setDefaultRenderer(Integer.class, centerRenderer);
        tableName.setDefaultRenderer(Float.class, centerRenderer);
        String[] AttributeNames;
        String state;
        int NumberOfRows, NumberOfColumns;
        Object[][] MyArray = null;
        try {
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();

            ResultSet res = stm.executeQuery(query);
            ResultSetMetaData RSMD = res.getMetaData();
            NumberOfColumns = RSMD.getColumnCount();
            AttributeNames = new String[NumberOfColumns];
            for (int i = 0; i < NumberOfColumns; i++) {


                AttributeNames[i] = RSMD.getColumnLabel(i + 1);
            }
            MyArray = new Object[10000][NumberOfColumns];
            int R = 0;
            while (res.next()) {
                for (int C = 1; C <= NumberOfColumns; C++) {
                    MyArray[R][C - 1] = res.getObject(C);
                }
                R++;
            }
            res.close();
            NumberOfRows = R;
            Object[][] TempArray = MyArray;
            MyArray = new Object[NumberOfRows][NumberOfColumns];
            for (R = 0; R < NumberOfRows; R++) {
                for (int C = 0; C < NumberOfColumns; C++) {
                    MyArray[R][C] = TempArray[R][C];
                }
            }

            // System.out.println(AttributeNames + "\t" + NumberOfRows + "\t" + NumberOfColumns);

            tableName.setModel(new MyTableModel(AttributeNames, NumberOfRows, NumberOfColumns, MyArray));
            tableName.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

            for (int column = 0; column < tableName.getColumnCount(); column++) {
                TableColumn tableColumn = tableName.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < tableName.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = tableName.getCellRenderer(row, column);
                    Component c = tableName.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + tableName.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    //  We've exceeded the maximum width, no need to check other rows

                    if (preferredWidth >= maxWidth) {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth(preferredWidth);
            }
            tableName.setVisible(true);
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}