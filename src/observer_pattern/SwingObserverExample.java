package observer_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 동작 설정

        JButton button = new JButton("Go? Stop?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        // 패널 생성 및 버튼 추가
        JPanel panel = new JPanel();
        panel.add(button);

        // 프레임에 패널 추가
        frame.getContentPane().add(BorderLayout.CENTER, panel); // BorderLayout 사용

        // 프레임 크기 설정 및 화면에 표시
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Go");
        }
    }

    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Stop");
        }
    }
}
