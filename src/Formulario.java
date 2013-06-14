import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Formulario extends JFrame implements MouseListener{

	DataAcces data;
	JTextField txtNombre;
	JButton btnGuardar;
	
	public Formulario(){
		this.setSize(500,500);
		this.setTitle("Formulario");
		this.setLayout(null);
		
		data=new DataAcces("MYSQL");
		txtNombre= new JTextField();
		txtNombre.setBounds(50, 50, 150, 30);
		this.add(txtNombre);
		btnGuardar= new JButton("Guardar");
		btnGuardar.addMouseListener(this);
		btnGuardar.setBounds(50, 100, 100, 30);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
