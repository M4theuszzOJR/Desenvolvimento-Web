import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria o objeto janela
        JFrame janela = new JFrame();
        // Cria o objeto botão
        JButton botaoLogar = new JButton("Validar");
        // Label (rótulo) é um texto apenas
        JLabel labelUsuario = new JLabel("Validador de usuário e senha");
        // Define a localização e tamanho do texto
        labelUsuario.setBounds(100, 10, 200, 30);

        JLabel labelcampo1 = new JLabel("Usuário:");
        labelcampo1.setBounds(100, 50, 200, 9);
        JLabel labelcampo2 = new JLabel("Senha:");
        labelcampo2.setBounds(100, 90, 200, 9);

        // Cria um campo para receber o nome do usuário
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(100, 60, 200, 30);

        // Cria um campo para receber a senha
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(100, 100, 200, 30);

        // Define o tamanho e localização do botão
        botaoLogar.setBounds(100,160,200,30);
        // Adiciona um metodo para reagir ao clique do botão
        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword()); // Para senha precisa fazer assim, pois retorna um array do tipo char
                System.out.format("Usuario: %s Senha: %s\n",usuario, senha);
                campoUsuario.setText("");
                campoSenha.setText("");
            }
        });

        Border borda = BorderFactory.createLineBorder(Color.BLACK, 2);
         labelUsuario.setBorder(borda);

        // Adiciona o botão na janela
        janela.add(botaoLogar);
        // Adiciona um novo label a janela
        janela.add(labelUsuario);
        // Adiciona um novo campo para receber usuário
        janela.add(labelcampo1);
        janela.add(campoUsuario);
        // Adiciona o campo senha;
        janela.add(labelcampo2);
        janela.add(campoSenha);
        // Desativa as configurações padrões das janelas
        janela.setLayout(null);

        // Define o local de começo da aplicação e o tamanho
        janela.setBounds(300,30,400,600);
        // Define que a aplicação encerra quando a janela é fechada
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Inicializa a janela
        janela.setVisible(true);

         
         
    }
}
