package concurrent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.concurrent.*;

/**
 * Created by player on 2015/8/1.
 */
public class CatchMe {

    private static int width = 200;
    private static int length = 200;

    private static Dimension scrSize=Toolkit.getDefaultToolkit().getScreenSize();

    private static int X = (int) (scrSize.getWidth()/2);
    private static int Y = (int) (scrSize.getHeight()/2);

    private static JButton button;
    private static JFrame frame;

    private static int level = 1;

    private static Future<?> task;

    private static ExecutorService pool = Executors.newSingleThreadExecutor();


    static{
        frame = new JFrame();
        frame.setSize(width, length);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(X, Y);
        frame.setTitle("catch me ~");
        button = new JButton();
        button.setName("Catch Me");
        button.setText("click to start~");
        frame.add(button);
    }


    public static void main(String args[]){
        addScrollListener();
        addCatchListener();
        frame.setVisible(true);
    }

    private static void addScrollListener(){
        button.addMouseWheelListener(new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent event) {
                int wheelRotation = event.getWheelRotation();
                width += (wheelRotation * event.getScrollAmount());
                length += (wheelRotation * event.getScrollAmount());
                frame.setSize(width, length);
            }
        });
    }

    private static void addCatchListener(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText(String.format("level [%d]", level++));
                if(task == null)
                    task = pool.submit(moveTask);
            }
        });
    }

    private static void passBarrier(){
        //stop change speed

    }

    private static void loss(){
        //stop
        if(task != null){
            task.cancel(true);
        }
        //show
        button.setText("mission failed!");
        task = null;
    }

    private static Runnable moveTask = new Runnable() {
        @Override
        public void run() {
            int escape = 0;
            int max = 10;
            while(!Thread.currentThread().isInterrupted()){
                if(escape >= max){
                    loss();
                    escape = 0;
                    level = 0;
                    break;
                }
                X = (int)(Math.random() * 1000);
                Y = (int)(Math.random() * 800);
                frame.setLocation(X, Y);
                escape ++;
                try {
                    TimeUnit.MILLISECONDS.sleep(3000/level);
                } catch (InterruptedException e) {}
            }
        }
    };

}
