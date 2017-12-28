package main.java.example;


import main.java.example.model.ReceivablesCycleList;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.JavaResult;
import org.xml.sax.SAXException;

import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 212607215 on 12/13/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException, SAXException {
        File chdxFile = new File("input-message.edi");
        JavaResult cycleDataResults = Main.convertCHDXFileToJava(chdxFile);
        ReceivablesCycleList cyclesObj = cycleDataResults.getBean(ReceivablesCycleList.class);

        System.out.println("==========CHDX Receivable Cycles=========");
        System.out.println(cyclesObj);
    }

    private static JavaResult convertCHDXFileToJava(File chdxFile)throws IOException, SAXException, SmooksException {
        System.out.println("==========Read file content=========");
        byte[] fileContent = fileBytesReading(chdxFile);
        System.out.println(new String(fileContent));
        System.out.println("====================================");

        // Instantiate Smooks with the config...
        Smooks smooks = new Smooks("smooks-configs/smooks-config-chdx-to-java.xml");
        try {
            // Create an exec context - no profiles....
            ExecutionContext executionContext = smooks.createExecutionContext();
            JavaResult javaResult = new JavaResult();

            // Configure the execution context to generate a report...
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

            // Filter the input message to the outputWriter, using the execution context...
            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(fileContent)), javaResult);

            return javaResult;
        } finally {
            smooks.close();
        }
    }

    public static byte[] fileBytesReading(File file) throws IOException {
        byte[] fileBytes = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(fileBytes);
        fis.close();
        return fileBytes;
    }




}

