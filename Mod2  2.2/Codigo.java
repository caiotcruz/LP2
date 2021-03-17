import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame{
    private static final long serialVersionUID = 1L;
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension d = t.getScreenSize();

    Elipse e1, e2, e3; //Definição das variáveis Elipse

    public Frame(){
        setTitle("Editor");
        setSize(d);
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(true);
        setUndecorated(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //Criação das Elipses // Questão 3
        this.e1 = new Elipse(500, 200, 300, 300, new Color(250, 0, 250), new Color(250, 250, 250));
        this.e2 = new Elipse(1600,800, 100, 100, new Color(250, 250, 0), new Color(0, 250, 250));
        this.e3 = new Elipse(100,500, 500, 500, new Color(100, 100, 100), new Color(250, 100, 100));
    }

    public void paint (Graphics g){
        super.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
    }

    public class Elipse {
        private int x, y;
        private int w, h;
        private Color cor_fundo; // Cor de fundo // Questão 1
        private Color cor_contorno; // Cor de contorno // Questão 1
    
        public Elipse(int x, int y, int w, int h, Color cor_contorno, Color cor_fundo){
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.cor_contorno = cor_contorno; // Define a cor de contorno na criação do objeto //Questão 1
            this.cor_fundo = cor_fundo; // Define a cor de fundo na criação do objeto //Questão 1
        }
    
        public void paint (Graphics g) {
            Graphics2D graficos = (Graphics2D) g;
            graficos.setColor(cor_fundo); //Define a cor do Java2D para a cor definida para o fundo // Questão 2
            graficos.fillOval((this.x), (this.y), (this.w), (this.h)); // Questão 2
            graficos.setColor(cor_contorno); //Define a cor do Java2D para a cor definida para o contorno // Questão 2
            graficos.drawOval(this.x , this.y, this.w, this.h); // Questão 2
            graficos.setColor(Color.BLACK); //Define a cor do Java2D de volta para o preto
        };
    }
}
