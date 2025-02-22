import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PiggyBankUI {
    private JFrame frame;
    private JTextField amountField;
    private JTextArea displayArea;
    private Account account;
    private Savings savings;

    public PiggyBankUI() {
        account = new Account();
        savings = new Savings();

        frame = new JFrame("Piggy Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        amountField = new JTextField();
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton balanceButton = new JButton("Check Balance");
        JButton addGoalButton = new JButton("Add Savings Goal");
        displayArea = new JTextArea();

        depositButton.addActionListener(e -> {
            double amount = Double.parseDouble(amountField.getText());
            account.addBalance(amount);
            displayArea.setText("Deposited: ₹" + amount);
            amountField.setText("");
        });

        withdrawButton.addActionListener(e -> {
            double amount = Double.parseDouble(amountField.getText());
            if (account.withdraw(amount)) {
                displayArea.setText("Withdrawn: ₹" + amount);
            } else {
                displayArea.setText("Insufficient funds!");
            }
            amountField.setText("");
        });

        balanceButton.addActionListener(e -> {
            displayArea.setText("Balance: ₹" + account.getBalance());
            amountField.setText("");
        });

        addGoalButton.addActionListener(e -> {
            String category = JOptionPane.showInputDialog("Enter goal category:");
            double budget = Double.parseDouble(JOptionPane.showInputDialog("Enter budget:"));
            savings.addgoal(category, budget);
            displayArea.setText("Goal added: " + category + " - ₹" + budget);
            amountField.setText("");
        });

        ViewDepositAmount.addActionListener(e ->{
            
        })

        panel.add(new JLabel("Enter Amount:"));
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(balanceButton);
        panel.add(addGoalButton);
        panel.add(ViewDepositAmount);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PiggyBankUI();
    }
}
