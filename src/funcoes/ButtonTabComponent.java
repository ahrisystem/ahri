package funcoes;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonTabComponent extends JPanel {
    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane) {
        //definir o layout da aba
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);
        
        //fazer JLabel ler títulos de JTabbedPane
        JLabel titulo = new JLabel() {
            public String getText() {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1) {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };
        //Propriedades do titulo
        titulo.setFont(new java.awt.Font("Century Gothic", 1, 14));
        titulo.setForeground(new java.awt.Color(51, 105, 191));
        add(titulo);
        
        //adicionar espaço entre o titulo e o botão
        titulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        //tab button (botão fechar na aba)
        JButton button = new TabButton();
        add(button);
        //adicionar espaço em cima do componente
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    private class TabButton extends JButton implements ActionListener {
        public TabButton() {
            int size = 18;
            //Fechar a aba com o clique(adicionar ações)
            addActionListener(this);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Fazê-lo transparente
            setContentAreaFilled(false);
            setFocusable(false);
            setFont(new java.awt.Font("Consolas", 1, 12));
            setHorizontalAlignment(CENTER);
            // Fazendo um bom efeito de capotamento
            // usamos o mesmo ouvinte para todos os botões
            addMouseListener(buttonMouseListener);
            setPreferredSize(new Dimension(size, size));
            setRolloverEnabled(true);
            setText("X");
            //Faça o botão parecer o mesmo para todos os do Laf's
            setUI(new BasicButtonUI());
        }

        public void actionPerformed(ActionEvent e) {
            int i = pane.indexOfTabComponent(ButtonTabComponent.this);
            if (i != -1) {
                pane.remove(i);
            }
        }
    }

    private final static MouseListener buttonMouseListener = new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
                button.setForeground(Color.red);
            }
        }

        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
                button.setForeground(Color.black);
            }
        }
    };
}


