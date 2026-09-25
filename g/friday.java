import javax.swing.*;
//import java.util.
import java.awt.*;

public class friday {
    public static void main(String[] args) {

    //frame og size sa frame
    JFrame frame = new JFrame("helloo boss! ");
    frame.setSize(800,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

    //name nimo
    JLabel lblName = new JLabel("Name: ");
    JTextField txtname = new JTextField(30);

    //id nimo
    JLabel lblId = new JLabel("Id: ");
    JTextField txtid = new JTextField(30);

    //year nimo
    JLabel lblYear = new JLabel("Year Level: ");
    String[] yearlevels = {
        "Select Year Level", "1st year","2nd year","3rd year","4th year"
        };
    JComboBox<String> cmbYear = new JComboBox<>(yearlevels);

    //choices sa course
    JLabel lblMultiple = new JLabel("Multiple Choice: "); 
    JRadioButton a = new JRadioButton("BSIT");
    JRadioButton b = new JRadioButton("BFPT");
    JRadioButton c = new JRadioButton("BTLED");
    JRadioButton d = new JRadioButton("TLE");

    //para isa ray ma pili
    ButtonGroup multiplechoice = new ButtonGroup();
    multiplechoice.add(a);
    multiplechoice.add(b);
    multiplechoice.add(c);
    multiplechoice.add(d);

    //menu sa course
    JLabel lblMenu = new JLabel("COUSE AVAILABLE");
    JCheckBox v1 = new JCheckBox("BSIT");
    JCheckBox v2 = new JCheckBox("BFPT");
    JCheckBox v3 = new JCheckBox("BTLED");
    JCheckBox v4 = new JCheckBox("TLE");

    //para sa address kung unsa kadak a
    JLabel lblAddress = new JLabel("Address: ");
    JTextArea txtAddress = new JTextArea(1,30);

    //para di na mo padayun 
    txtAddress.setLineWrap(true);
    txtAddress.setWrapStyleWord(true);

    //para button
    JButton btnStart = new JButton("Start");
    JButton btnGo = new JButton("Go");

    //para ma display and imong gi butang sa taas
    frame.add(lblName);
    frame.add(txtname);

    frame.add(lblId);
    frame.add(txtid);

    frame.add(lblYear);
    frame.add(cmbYear);

    frame.add(lblMultiple);
    frame.add(a);
    frame.add(b);
    frame.add(c);
    frame.add(d);

    frame.add(lblMenu);
    frame.add(v1);
    frame.add(v2);
    frame.add(v3);
    frame.add(v4);

    frame.add(lblAddress);
    frame.add(txtAddress);

    frame.add(btnStart);
    frame.add(btnGo);

    btnStart.addActionListener(e ->{
        String name = txtname.getText().trim();
        String idText = txtid.getText().trim();
        String yearLevel = cmbYear.getSelectedItem().toString();
        String choice = multiplechoice.toString();
        if (a.isSelected()){
            choice = "BSIT";
        }else if (b.isSelected()) {
            choice = "BFPT";
            }else if (c.isSelected()) {
            choice = "BTLED";
            }else if (d.isSelected()) {
            choice = "TLE";
        }

        String menu = "";
        if (v1.isSelected()) {
            menu += "BSIT";
        }if (v2.isSelected()) {
            menu += " BFPT";
        }if (v3.isSelected()) {
            menu += " BTLED";
        }if (v4.isSelected()) {
            menu += " TLE";

        }

        menu = menu.substring(0, menu.length() -2);
        

        String message = "DATA ENTRY\n\n" + "NAME: " + name + "\nId: " + idText + "\nYearLevel: " + yearLevel + "\nMultiple: " + choice + "\nMenu: " + menu;

        JOptionPane.showMessageDialog(frame,message);

    });


    //para makita ang frame and dapat true jud na
    frame.setVisible(true);
    }
}

