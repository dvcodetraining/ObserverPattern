package com.damianvaz.observerpattern.demo.view;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.damianvaz.observerpattern.demo.LoginEvent;
import com.damianvaz.observerpattern.demo.model.Model;

public class MainFrame extends JFrame implements ActionListener
{
	private Model model;
	private JButton loginButton;
	private JLabel username;
	private JLabel password;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	private LoginListener loginListener;
	
	public MainFrame(Model model) throws HeadlessException
	{
		super("MVC demo by Damian Vaz");
		this.model = model;
		layout = new GridBagLayout();
		constraints = new GridBagConstraints();
		setLayout(layout);
		
		// create components
		username = new JLabel("Username:");
		password = new JLabel("Password:");
		usernameField = new JTextField(10);
		passwordField = new JPasswordField(10);
		loginButton = new JButton("Login");
		
		//adding Components to Frame
		addComponent(username, 1, 1, 1, 1);
		addComponent(usernameField, 1, 2, 1, 1);
		addComponent(password, 2, 1, 1, 1);
		addComponent(passwordField, 2, 2, 1, 1);
		constraints.fill = GridBagConstraints.BOTH;
		addComponent(loginButton, 3, 2, 1, 1);
		
		loginButton.addActionListener(this);
		
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void addComponent(Component component, int row, int col, int width, int height)
	{
		constraints.gridx = col;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		layout.setConstraints(component, constraints);
		add(component);
	}
	public void setLoginListener(LoginListener loginListener)
	{
		this.loginListener = loginListener;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String username = usernameField.getText();
		String password = new String(passwordField.getPassword());
		
		if(loginListener != null)
		{
			loginListener.loginPerformed(new LoginEvent(username, password));
		}
	}
	

}
