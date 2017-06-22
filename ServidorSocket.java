import java.io.*;
import java.net.*;

class ServidorSocket
{
   private static int portaServidor = 6789;

   public static void main(String argv[]) throws Exception{

      ServerSocket ServerSocket = null;
      ServerSocket = new ServerSocket(portaServidor);

      while(true){

            System.out.println("Servidor iniciado!");
            Socket socket = ServerSocket.accept();

            //recebe mensagem do cliente - mensagem vai ser passada por meio do botão android
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Mensagem do cliente " + br.readLine()); // ok

            //envia mensagem para o cliente - talvez não precise
            //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //bw.write("Dados cadastrados com sucesso!");
            //bw.newLine();
            //bw.flush();


      }
   }
}
