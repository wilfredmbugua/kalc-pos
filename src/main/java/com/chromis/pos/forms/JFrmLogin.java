package com.chromis.pos.forms;

import javax.swing.*;
import java.awt.*;

public class JFrmLogin extends JFrame {
    public JFrmLogin() {
        setTitle(""KALC POS - Login"");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JLabel(""KALC POS Login (placeholder)""), BorderLayout.CENTER);
    }
}
