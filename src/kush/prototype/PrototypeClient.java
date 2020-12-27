package kush.prototype;

public class PrototypeClient {
	public static void main(String[] args) throws CloneNotSupportedException{
		MachineImage linux=new MachineImage("Linux", "symantec");
		MachineImage window=new MachineImage("window", "macfree");
		
		// clone linux and install web server
		MachineImage webServer=linux.clone();
		webServer.install(" + web server s/w ");
		
		// create a copy of the web server and install app server
		MachineImage webAppServer=webServer.clone();
		webAppServer.install(" + Database server s/w ");
		
		// clone linux and install dbserver
		MachineImage dbServer=linux.clone();
		dbServer.install(" + Database server s/w ");
		
		// create a test machine from window image
		MachineImage testMachine=window.clone();
		
		System.out.print("Web server configuration :");
		webServer.printSw();
		
		System.out.print("App server configuration :");
		webAppServer.printSw();
		
		System.out.print("DB server configuration :");
		dbServer.printSw();
		
		System.out.print("Test Machine configuration :");
		testMachine.printSw();
		
	}
}
