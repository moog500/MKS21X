
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class TempConversionWindow extends JFrame implements ActionListener{
	private Container pane;
	private JButton b;
	private JLabel l;
	private JTextField t;
	private JRadioButton c;
	private JRadioButton f;
	private ButtonGroup dog;

	public TempConversionWindow() {
		this.setTitle("Temp Conversions");
		this.setSize(600,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		pane = this.getContentPane();
		pane.setLayout(new FlowLayout());

		b = new JButton("make the convert");
		b.addActionListener(this);

	
			
		
		l = new JLabel("insert the value you want",null,JLabel.CENTER);
		t = new JTextField(12);
		c = new JRadioButton("F to c");
		f = new JRadioButton("C to f");
		dog = new ButtonGroup();
		dog.add(c);
		dog.add(f);
		pane.add(l);
		pane.add(b);
		pane.add(t);
		pane.add(c);
		pane.add(f);
	}
	
	public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked!");
				if (c.isSelected()){
					FtoC();
				}
				if (f.isSelected()){
					CtoF();
				}
			}
		

	public void FtoC(){
	try {
		int cels = (Integer.parseInt(t.getText()) - 32) * 5/9;
		String strified = "This was your input: " + t.getText() + " This is your converted value: " +
				cels;
		System.out.println(strified);}
	catch (IllegalArgumentException e) {
		System.out.println("a number, not a fish.");}}

	public void CtoF(){
	try {
		int fahr = (Integer.parseInt(t.getText()) * 9/5) + 32;
		String strified2 = "This was your input: " + t.getText() + " This is your converted value: " +
				fahr;
		System.out.println(strified2);}
	catch (IllegalArgumentException e) {
		System.out.println("a number, not a fish.");}}





	


}
