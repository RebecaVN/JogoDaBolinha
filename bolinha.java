package CampoMinado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Bolinha extends JFrame {
	ImageIcon iconCaminho = new ImageIcon(getClass().getResource("Caminho.png"));
	ImageIcon iconBolinhaMove = new ImageIcon(getClass().getResource("BolinhaMove.png"));
	ImageIcon iconBolaVerde = new ImageIcon(getClass().getResource("BolaVerde.png"));

	JLabel lCaminho = new JLabel(iconCaminho);
	JLabel lBolaVerde = new JLabel(iconBolaVerde);

	int posBolaVerdeX = 320;
	int posBolaVerdeY = 230;

	public Bolinha() {
		editarJanela();
		editarComponentes();
		addMovimento();
	}

	public void addMovimento() {
		addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {

			}

			public void keyReleased(KeyEvent e) {
				lBolaVerde.setIcon(iconBolaVerde);

			}

			public void keyPressed(KeyEvent e) {
				lBolaVerde.setIcon(iconBolinhaMove);
				if (e.getKeyCode() == 38) {
					if (posBolaVerdeY > 20) {
						posBolaVerdeY -= 10;
					}
				}
				if (e.getKeyCode() == 40) {
					if (posBolaVerdeY < 420) {
						posBolaVerdeY += 10;
					}
				}
				if (e.getKeyCode() == 37) {
					if (posBolaVerdeX > 20) {
						posBolaVerdeX -= 10;
					}
				}
				if (e.getKeyCode() == 39) {
					
					if (posBolaVerdeX < 9500) {
						posBolaVerdeX += 10;
					}
				}
				lBolaVerde.setBounds(posBolaVerdeX, posBolaVerdeY, 103, 202);

			}

		});

	}

	public void editarComponentes() {
		lCaminho.setBounds(0, 0, 1140, 490);
		lBolaVerde.setBounds(posBolaVerdeX, posBolaVerdeY, 103, 202);

	}

	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1155, 550);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(lBolaVerde);
		add(lCaminho);

	}

	public static void main(String[] args) {
		new Bolinha();
	}
}
