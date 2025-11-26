package com.chromis.main;

import javax.swing.*;

public class AppView {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}
            com.chromis.pos.forms.JFrmLogin login = new com.chromis.pos.forms.JFrmLogin();
            login.setVisible(true);
        });
    }
}
