package observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        try {
            File f = File.createTempFile("TempPressure", ".txt");
            //Temp file in \AppData\Local\Temp
            PrintWriter pw = new PrintWriter(f);
            pw.print("The weather has been changed: temperature = "+temp + ", pressure = "+pressure);
            pw.println();
            pw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
