import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Создаем JFrame
        JFrame frame = new JFrame("Демонстрация менеджеров компоновки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        
        // Устанавливаем BorderLayout для JFrame
        frame.setLayout(new BorderLayout());
        
        // Создаем кнопки для BorderLayout
        JButton northButton = new JButton("Север (NORTH)");
        JButton southButton = new JButton("Юг (SOUTH)");
        JButton eastButton = new JButton("Восток (EAST)");
        JButton westButton = new JButton("Запад (WEST)");
        
        // Добавляем кнопки в соответствующие области BorderLayout
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        
        // Создаем JPanel с FlowLayout для центральной области
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        centerPanel.setBackground(Color.LIGHT_GRAY);
        
        // Добавляем кнопки в панель с FlowLayout
        for (int i = 1; i <= 5; i++) {
            JButton button = new JButton("Кнопка " + i);
            centerPanel.add(button);
        }
        
        // Добавляем панель в центральную область BorderLayout
        frame.add(centerPanel, BorderLayout.CENTER);
        
        // Делаем окно видимым
        frame.setVisible(true);
    }
}
