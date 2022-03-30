public class exercicio3{
    public static void main(String[] args){
      int valores[] = {15, 20, 55, 10, 85, 36, 77, 56, 66, 25};
            for(int i = 0;i < valores.length - 1;i++){
                if(valores[i] > valores[i+1]){
                    int aux = valores[i];
                    valores[i] = valores[i+1];
                    valores[i+1] = aux;
                    i = -1;
                }
            }
      for(int i = 0;i < valores.length;i++) {
          System.out.println(valores[i]);
        }
    }
}