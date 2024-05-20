package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Font;

public class storeLimit extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private  int limit=1;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			storeLimit dialog = new storeLimit();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int getLimit() {
		return limit;
	}


	/**
	 * Create the dialog.
	 */
	public storeLimit() {
		setBounds(100, 100, 461, 129);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			JLabel lblNewLabel = new JLabel("Số đại lý tối đa mỗi quận");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(lblNewLabel);
		}
		{
			 spinner = new JSpinner(new SpinnerNumberModel(limit, 1, 100, 1));
			contentPanel.add(spinner);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(e->{
					limit=(int)spinner.getValue();
					spinner.setValue(limit);
					dispose();
				});
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(e->{
					dispose();
				});
			}
		}
	}

}
