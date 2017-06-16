package template_method;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

interface URLProcessor {

    void process(URL url) throws IOException;
}

abstract class URLProcessorBase implements URLProcessor {

    // A template method. Should be final.
    public final void process(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        try {
            processURLData(input);
        } finally {
            input.close();
        }
    }

    protected abstract void processURLData(InputStream input) throws IOException;

}

class URLProcessorSimpleRead extends URLProcessorBase {

    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while (data != -1) {
            System.out.print((char) data);
            data = input.read();
        }
    }
}

public class UrlProcessorsDemo {

    public static void main(String[] args) throws IOException {
        URLProcessor urlProcessor = new URLProcessorSimpleRead();
        urlProcessor.process(new URL("http://jenkov.com"));
    }
}
