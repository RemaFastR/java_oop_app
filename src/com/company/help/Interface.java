package com.company.help;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.company.Main.*;

public class Interface extends JFrame {
    public static JFrame frame = new JFrame("Информационная система детского кружка");

    public Interface() throws HeadlessException {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createSectionsMenuItem());
        menuBar.add(createSectionChooseMenuItem());
        menuBar.add(createCalculateMenuItem());
        frame.setJMenuBar(menuBar);


        Box startLabelBox = new Box(BoxLayout.X_AXIS);
        JLabel startLabel = new JLabel("Добро пожаловть в наш дом детского творчества");
        startLabel.setAlignmentY(Component.CENTER_ALIGNMENT);
        startLabelBox.add(startLabel);
        // Вывод окна на экран
        frame.setContentPane(startLabel);

        frame.setSize(1000,500);
        frame.setVisible(true);
    }


    // Простая таблица
    JTable batikTable = new JTable(batikArray, columnsHeader);
    JTable watercolorTable = new JTable(watercolorArray, columnsHeader);
    JTable clayTable = new JTable(clayArray, columnsHeader);
    JTable floursaltTable = new JTable(floursaltArray, columnsHeader);
    JTable woodburningTable = new JTable(woodburningArray, columnsHeader);
    JTable woodsawingTable = new JTable(woodsawingArray, columnsHeader);

    private JMenu createSectionsMenuItem(){
        JMenu sections = new JMenu("Список кружков");

        JMenuItem batikMI = new JMenuItem(new MenuAction(batikTable, "Батик"));
        JMenuItem watercolorMI = new JMenuItem(new MenuAction(watercolorTable, "Акварель"));
        JMenuItem clayMI = new JMenuItem(new MenuAction(clayTable, "Лепка"));
        JMenuItem floursaltMI = new JMenuItem(new MenuAction(floursaltTable, "Мукасоль"));
        JMenuItem woodburningMI = new JMenuItem(new MenuAction(woodburningTable, "Выжигание"));
        JMenuItem woodsawingMI = new JMenuItem(new MenuAction(woodsawingTable, "Выпиливание"));

        sections.add(batikMI);
        sections.add(watercolorMI);
        sections.add(clayMI);
        sections.add(floursaltMI);
        sections.add(woodburningMI);
        sections.add(woodsawingMI);

        /*sections.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("You choose Sections list");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });*/
        return sections;
    }

    private JMenu createSectionChooseMenuItem(){
        JMenu sectionChoose = new JMenu("Выбрать кружок");

        sectionChoose.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("You choose Section Choose Menu");

                Box enterSectionBox = new Box(BoxLayout.Y_AXIS);

                Box enterAgeBox = new Box(BoxLayout.X_AXIS);
                JLabel enterAgeLabel = new JLabel("Введите возраст: ");
                JTextField ageTF = new JTextField();
                JButton enterAgeButton = new JButton("OK");

                enterAgeBox.add(enterAgeLabel);
                enterAgeBox.add(ageTF);
                enterAgeBox.add(enterAgeButton);

                enterSectionBox.add(enterAgeBox);
                frame.setContentPane(enterSectionBox);
                frame.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        return sectionChoose;
    }

    private JMenu createCalculateMenuItem(){
        JMenu calculate = new JMenu("Расчет стоимости занятий");

        /*calculate.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println("You choose Calculate Menu");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });*/

        return calculate;
    }
}

class MenuAction extends AbstractAction
{
    private static final long serialVersionUID = 1L;
    private JTable table;
    private String menuName;
    MenuAction(JTable table, String menuName) {
        putValue(NAME, menuName);
        this.table = table;
        this.menuName = "Вы выбрали кружок - " + menuName;
    }
    public void actionPerformed(ActionEvent e) {
        JLabel sectionNameLabel = new JLabel(menuName);
        sectionNameLabel.setHorizontalAlignment(JLabel.CENTER);
        sectionNameLabel.setHorizontalTextPosition(JLabel.CENTER);
        sectionNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(sectionNameLabel);
        contents.add(new JScrollPane(table));

        // Вывод окна на экран
        Interface.frame.setContentPane(contents);
        Interface.frame.setVisible(true);
        System.out.println("You choose Sections list");
    }
}
