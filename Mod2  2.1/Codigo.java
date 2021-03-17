import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame{
    private static final long serialVersionUID = 1L;
    Toolkit t = Toolkit.getDefaultToolkit();
    Dimension d = t.getScreenSize();

    Retangulo r1, r2, r3; //Definição das variáveis Retangulos

    public Frame(){
        setTitle("Editor");
        setSize(d);
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(true);
        setUndecorated(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Criação dos retângulos // Questão 3
        this.r1 = new Retangulo(100, 100, 100, 100, new Color(250, 0, 0), new Color(0, 250, 0));
        this.r2 = new Retangulo(700, 600, 150, 50, new Color(0, 250, 0), new Color(0, 0 , 250));
        this.r3 = new Retangulo(1600, 100, 200, 500, new Color(0, 0, 250), new Color(250, 0, 0));
    }

    public void paint (Graphics g){
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
    }

    public class Retangulo {
        private int x, y;
        private int w, h;
        private Color cor_fundo; //Cor de fundo // Questão 1
        private Color cor_contorno; // Cor de contorno // Questão 1
    
        public Retangulo(int x, int y, int w, int h, Color cor_contorno, Color cor_fundo){
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.cor_contorno = cor_contorno; // Define a cor de contorno na criação do objeto //Questão 1
            this.cor_fundo = cor_fundo; // Define a cor de fundo na criação do objeto //Questão 1
    
        }
    
        public void paint (Graphics g) {
            Graphics2D graficos = (Graphics2D) g;
            graficos.setColor(cor_contorno); //Define a cor do Java2D para a cor definida para o contorno // Questão 2
            graficos.drawRect(this.x , this.y, this.w, this.h); //Questão 2
            graficos.setColor(cor_fundo); //Define a cor do Java2D para a cor definida para o fundo // Questão 2
            graficos.fillRect((this.x+1), (this.y+1), (this.w-1), (this.h-1)); // Questão 2
            graficos.setColor(Color.BLACK); //Define a cor do Java2D de volta para preto
        };
    }
}
