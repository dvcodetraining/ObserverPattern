package com.damianvaz.observerpattern.demo.controller;

import com.damianvaz.observerpattern.demo.LoginEvent;
import com.damianvaz.observerpattern.demo.model.Model;
import com.damianvaz.observerpattern.demo.view.LoginListener;
import com.damianvaz.observerpattern.demo.view.MainFrame;

public class Controller implements LoginListener
{
	private MainFrame view;
	private Model model;
	public Controller(Model model, MainFrame view)
	{
		this.view = view;
		this.model = model;
	}
	@Override
	public void loginPerformed(LoginEvent e)
	{
		System.out.println("Login Performed");
		System.out.println("Welcome " + e.getUsername() + "; " + e.getPassword());
	}
	
	
}
