package com.mycompany.waterbilling;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerSummary extends JPanel {

    private final DefaultTableModel tableModel;

    public CustomerSummary() {
        setLayout(new BorderLayout());

        String[] columns = {
            "Bill Month",
            "Account Number",
            "Account Name",
            "Account Address",
            "Total Bill"
        };

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable customerTable = new JTable(tableModel);
        add(new JScrollPane(customerTable), BorderLayout.CENTER);
    }

    public void refreshTable() {
        tableModel.setRowCount(0);

        for (String customer : GUI.Customer) {
            if (customer == null || customer.isBlank()) {
                continue;
            }

            String[] data = customer.split("\\|", -1);

            if (data.length >= 5) {
                tableModel.addRow(new Object[] {
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4].trim()
                });
            }
        }
    }
}