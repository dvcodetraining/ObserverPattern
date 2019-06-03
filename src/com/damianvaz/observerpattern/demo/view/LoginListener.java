package com.damianvaz.observerpattern.demo.view;

import com.damianvaz.observerpattern.demo.LoginEvent;

public interface LoginListener
{
	public void loginPerformed(LoginEvent e);
}
