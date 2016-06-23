package io.github.wagnjun.spring.demo.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.oxm.Marshaller;

import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bata on 16/5/7.
 */
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Marshaller marshaller = context.getBean(Marshaller.class);
        Settings settings = new Settings();
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("settings.xml");
            marshaller.marshal(settings, new StreamResult(os));
        } finally {
            if (os != null) {
                os.close();
            }
        }

        logger.info(settings.toString());
    }
}
