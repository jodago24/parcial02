import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
public class FormularioClases extends JFrame implements ActionListener {
	    private JTextField nombreClaseField;
	    private JTextField horarioField;
	    private JTextField docenteField;
	    private JComboBox<String> estadoCombo;
	    private JButton guardarButton;

public FormularioClases() {
	        setTitle("Formulario de Clases");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(5, 2));

	        JLabel nombreLabel = new JLabel("Nombre de la Clase:");
	        nombreClaseField = new JTextField();

	        JLabel horarioLabel = new JLabel("Horario de la Clase:");
	        horarioField = new JTextField();

	        JLabel docenteLabel = new JLabel("Docente a Cargo:");
	        docenteField = new JTextField();

	        JLabel estadoLabel = new JLabel("Estado de la Clase:");
	        String[] estados = {"Activa", "Inactiva"};
	        estadoCombo = new JComboBox<>(estados);

	        guardarButton = new JButton("Guardar");
	        guardarButton.addActionListener(this);

	        add(nombreLabel);
	        add(nombreClaseField);
	        add(horarioLabel);
	        add(horarioField);
	        add(docenteLabel);
	        add(docenteField);
	        add(estadoLabel);
	        add(estadoCombo);
	        add(new JLabel());
	        add(guardarButton);
	    }

	    @Override
public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == guardarButton) {
	            String nombreClase = nombreClaseField.getText();
	            String horario = horarioField.getText();
	            String docente = docenteField.getText();
	            String estado = estadoCombo.getSelectedItem().toString();

	         
	            System.out.println("Nombre de la Clase: " + nombreClase);
	            System.out.println("Horario de la Clase: " + horario);
	            System.out.println("Docente a Cargo: " + docente);
	            System.out.println("Estado de la Clase: " + estado);
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            FormularioClases formulario = new FormularioClases();
	            formulario.setVisible(true);
	        });
	    }
	}

