import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLogger implements MessageLogger {

	private Writer writer;
	
	// Override not overload used, since it is the same signiture but uses different implementation code
	
	@Override
	public void logMessage(String message) {
		try {
			writer.write(java.time.LocalDateTime.now().toString() + " : ");
			writer.write(message + "\n");
			writer.flush();
		}
		catch(IOException e) {
			System.err.print("FileLogger failed to log : " + message);
		}
	}

	FileLogger(String filename) throws IOException {
		writer = new FileWriter(filename, true);
	}
	
}
