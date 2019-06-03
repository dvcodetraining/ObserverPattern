package com.damianvaz.observerpattern.demo;

import javax.swing.SwingUtilities;

import com.damianvaz.observerpattern.demo.controller.Controller;
import com.damianvaz.observerpattern.demo.model.Model;
import com.damianvaz.observerpattern.demo.view.MainFrame;

public class Application
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				runApp();
			}
		});
	}
	
	public static void runApp()
	{
		Model model = new Model();
		MainFrame view = new MainFrame(model);
		Controller controller = new Controller(model, view);
		
		view.setLoginListener(controller);
	}
}
