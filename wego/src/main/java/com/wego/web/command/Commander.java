package com.wego.web.command;

import javax.servlet.http.HttpServletRequest;

import com.wego.web.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE :  break;
		case SEARCH : break;
		case MOVE :  break;
		case LOGIN :  break;
		default : break; 
		}
		return cmd;
	}
}
