package com.wego.web.command;


import lombok.Data;

@Data
public class Command implements Order {
	protected String action, domain, page, view;

	
	@Override

		public void execute() {
	
	}

}
