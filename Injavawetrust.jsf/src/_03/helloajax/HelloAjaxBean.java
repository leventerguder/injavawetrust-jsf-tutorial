package _03.helloajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class HelloAjaxBean {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGreeting() {
		if (name != null && name.length() > 0) {
			return "Welcome to www.injavawetrust.com , " + name + "!";
		} else {
			return "";
		}
	}
}
