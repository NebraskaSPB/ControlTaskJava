import java.io.FileWriter;
import java.io.IOException;

public class File {
    private String fileName;
    private String logString;

    public File(String fileName, String logString) throws IOException {
        this.fileName = fileName;
        this.logString = logString;

        this.writeInLog();
    }

    public File(String logString) throws IOException {
        this("log.txt", logString);
    }

    private void writeInLog() throws IOException {
        StringBuilder sb = new StringBuilder();
        java.io.File file = new java.io.File(this.fileName);

        if(!file.exists()) {
            file.createNewFile();
        }

        sb.append(logString).append("\n");

        FileWriter fw = new FileWriter(file, true);
        fw.write(sb.toString());
        fw.close();
    }
}
