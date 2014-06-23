/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vipsclient.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import vipsclient.Controller;

/**
 *
 * @author LucianDobre
 */
public class ServerControlsPanel extends JPanel implements ActionListener{
    
    Controller ctrl;
    
    JButton jbConnect, jbSettings;
    JComboBox<String> jcbServerSelect;

    public ServerControlsPanel() {
        setPreferredSize(new Dimension(600,50));
        setLayout(new BorderLayout());
    }
    
    /* Call assemble only after all dependencies have been injected*/
    public void assemble(){
        jbConnect = new JButton("Connect");
        add(jbConnect, BorderLayout.WEST);
        
        jbSettings = new JButton("Settings");
        add(jbSettings, BorderLayout.EAST );
        
        Vector<String> mockServers = new Vector<>();
        mockServers.add("VipsAlpha");
        jcbServerSelect = new JComboBox<>(mockServers);
        add(jcbServerSelect, BorderLayout.CENTER);
    }

    public Controller getCtrl() {
        return ctrl;
    }

    public void setCtrl(Controller ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ServerControlsPanel");
    }
    
}
