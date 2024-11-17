import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JTextField nameField, addressField, phoneField;
    private JCheckBox steakCheckBox, spaghettiCheckBox, pizzaCheckBox;
    private JLabel totalLabel;
    private JTextArea orderDetailsArea;
    private int totalCost = 0;

    public SimpleGUI() {
        setTitle("APLIKASI PEMESANAN MAKANAN");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel titleLabel = new JLabel("APLIKASI PEMESANAN", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(titleLabel, BorderLayout.NORTH);

        // Customer Panel
        JPanel customerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        customerPanel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        customerPanel.add(new JLabel("Nama:"));
        nameField = new JTextField(10);
        customerPanel.add(nameField);
        customerPanel.add(new JLabel("Alamat:"));
        addressField = new JTextField(10);
        customerPanel.add(addressField);
        customerPanel.add(new JLabel("No Telp:"));
        phoneField = new JTextField(10);
        customerPanel.add(phoneField);

        // Menu Panel
        JPanel menuPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        steakCheckBox = new JCheckBox("Steak (50000)");
        spaghettiCheckBox = new JCheckBox("Spaghetti (40000)");
        pizzaCheckBox = new JCheckBox("Pizza (80000)");
        menuPanel.add(steakCheckBox);
        menuPanel.add(spaghettiCheckBox);
        menuPanel.add(pizzaCheckBox);

        // Total Panel
        JPanel totalPanel = new JPanel(new BorderLayout());
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel.setOpaque(false);

        JLabel totalTextLabel = new JLabel("TOTAL BAYAR");
        labelPanel.add(totalTextLabel);

        totalLabel = new JLabel("0", SwingConstants.LEFT);
        totalLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        totalLabel.setOpaque(true);
        totalLabel.setBackground(Color.BLACK);
        totalLabel.setForeground(Color.YELLOW);
        totalLabel.setPreferredSize(new Dimension(100, 30));
        labelPanel.add(totalLabel);

        totalPanel.add(labelPanel, BorderLayout.NORTH);

        JButton addButton = new JButton("TAMBAH");
        totalPanel.add(addButton, BorderLayout.SOUTH);

        // Data Penjualan Panel
        orderDetailsArea = new JTextArea(10, 40);
        orderDetailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderDetailsArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));

        // Layout Adjustment
        JPanel leftPanel = new JPanel(new BorderLayout(10, 10));
        leftPanel.add(customerPanel, BorderLayout.NORTH);

        JPanel rightPanel = new JPanel(new BorderLayout(10, 10));
        rightPanel.add(menuPanel, BorderLayout.NORTH);
        rightPanel.add(totalPanel, BorderLayout.CENTER);

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(scrollPane, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addOrder();
            }
        });

        ActionListener checkBoxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        };

        steakCheckBox.addActionListener(checkBoxListener);
        spaghettiCheckBox.addActionListener(checkBoxListener);
        pizzaCheckBox.addActionListener(checkBoxListener);
    }

    private void calculateTotal() {
        totalCost = 0;
        if (steakCheckBox.isSelected())
            totalCost += 50000;
        if (spaghettiCheckBox.isSelected())
            totalCost += 40000;
        if (pizzaCheckBox.isSelected())
            totalCost += 80000;
        totalLabel.setText(String.valueOf(totalCost));
    }

    private void addOrder() {
        String name = nameField.getText().trim();
        String address = addressField.getText().trim();
        String phone = phoneField.getText().trim();
    
        if (name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua harus diisi!", "Error", JOptionPane.WARNING_MESSAGE);
            return; 
        }
    
        if (!steakCheckBox.isSelected() && !spaghettiCheckBox.isSelected() && !pizzaCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Plilih minimal satu menu!", "Error", JOptionPane.WARNING_MESSAGE);
            return; 
        }
    
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Nama: ").append(name).append("\n");
        orderDetails.append("Alamat: ").append(address).append("\n");
        orderDetails.append("Telp: ").append(phone).append("\n");
        orderDetails.append("--------------------------\n");
        orderDetails.append("Pesanan:\n");
    
        if (steakCheckBox.isSelected())
            orderDetails.append("- Steak (50000)\n");
        if (spaghettiCheckBox.isSelected())
            orderDetails.append("- Spaghetti (40000)\n");
        if (pizzaCheckBox.isSelected())
            orderDetails.append("- Pizza (80000)\n");
    
        orderDetails.append("--------------------------\n");
        orderDetails.append("Total Bayar : Rp. ").append(totalCost).append("\n\n");
    
        orderDetailsArea.append(orderDetails.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleGUI().setVisible(true);
        });
    }
}
