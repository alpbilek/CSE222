import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util  .logging.SimpleFormatter;
import java.util.concurrent.TimeUnit;
public class main
{
    public static void main(String[] args)throws Exception
    {
        Logger logger = null;
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("default.log");
        }
        catch(Exception e) {
            System.out.printf("\n %s \n", e.toString());
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger = Logger.getLogger("ste");
        logger.addHandler(fileHandler);
        long StartTime=System.nanoTime();
        long StartTimef=System.nanoTime();

        SimpleTextEditor a=new SimpleTextEditor();
        a.setPathname("input.txt");
        System.out.println("---LOOP PART---");
        a.readLOOP();
        System.out.println("This is the list:");
        a.printer();
        System.out.println("This is the list after addition process:");
        a.adderLOOP("alpemir",4);
        a.printer();
        System.out.println("The index of the given string is "+a.finderITERATOR("alp"));
        a.replacerLOOP(4,'q');
        System.out.println("This is the list after replace process:");
        a.printer();
        long EndTime=System.nanoTime();
        long time=EndTime-StartTime;
        long StartTimeI=System.nanoTime();
        SimpleTextEditor b=new SimpleTextEditor();
        b.setPathname("input.txt");
        System.out.println("---ITERATOR PART---");
        b.readITERATOR();
        System.out.println("This is the list:");
        b.printer();
        b.adderITERATOR("Memhet",6);
        System.out.println("This is the list after addition process:");
        b.printer();
        System.out.println("The index's head is "+b.finderITERATOR("emMemhet"));
        b.replacerITERATOR(4,'o');
        System.out.println("This the list after replace process");
        b.printer();
        long EndTimeI=System.nanoTime();
        long timeI=EndTimeI-StartTimeI;
        long EndTimef=System.nanoTime();
        System.out.println("This is the LOOP's time in ns:"+time);
        logger.info("This is the LOOP's time in ns:"+time);
        System.out.println("Iterator's time in ns:"+timeI);
        logger.info("Iterator's time in ns:"+timeI);
        timeI=EndTimef-StartTimef;
        System.out.println("This is the all system's time in ns:"+timeI);
        logger.info("This is the all system's time in ns:"+timeI);

    }
}