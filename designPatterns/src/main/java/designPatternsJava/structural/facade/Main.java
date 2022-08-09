package designPatternsJava.structural.facade;

/*
The facade pattern is appropriate when we have a complex system that we want to expose to clients in a simplified way. 
Its purpose is to hide internal complexity behind a single interface that appears simple from the outside.

Facade also decouples the code that uses the system from the details of the subsystems, making it easier to modify the system later.

2. Real world facade examples
To understand the facade, let’s take a very simple example of a desktop computer machine. When we have to start a computer, 
all we have to do is press the start button. We really do not care what all things go inside the computer hardware and software. 
It is an example of Facade pattern.

In Java programming, we must have connected to a database to fetch some data. We simply call the method dataSource.getConnection() 
to get the connection but internally a lot of things happen such as loading the driver, creating connection or fetching connection 
from pool, update stats and then return the connection reference to caller method. It is another example of Facade pattern in the 
programming world.
*/
public class Main {
	public static void main(String[] args) throws Exception {
		ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

		reportGeneratorFacade.generateReport(ReportType.HTML, null, null);

		reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
	}
}
