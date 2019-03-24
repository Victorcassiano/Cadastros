
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose_
 */
public class Salvar {
    private String Cliente;
    private String NPedido;
    private String Cor;
    private String Tamanho;

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getNPedido() {
        return NPedido;
    }

    public void setNPedido(String NPedido) {
        this.NPedido = NPedido;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }
    public String salvar(){
        try {
            FileWriter fw = new FileWriter ("C:\\Users\\jose_\\Desktop\\Pedidos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Cliente: "+this.Cliente+" / Nº do Pedido: "+this.NPedido+" / Cor: "+this.Cor+" / Tamanho: "+this.Tamanho);
            pw.println("-----------------------------------------------------------------------------------------");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Pedido Cadastrado";
    }
}

/*Salvar dados = new Salvar();
        
        dados.setCliente(txtCliente.getText());
        dados.setNPedido(txtPedidos.getText());
        dados.setCor(txtCor.getText());
        dados.setTamanho(txtTamanho.getText());
        
        JOptionPane.showMessageDialog(null, dados.salvar());
        txtCliente.setText("");
        txtPedidos.setText("");
        txtCor.setText("");
        txtTamanho.setText("");*/