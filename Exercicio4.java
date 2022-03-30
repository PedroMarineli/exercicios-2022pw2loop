public class Exercicio4 {
    public static void main(String[] args){
        int numeros[] = {16, 23, 55, 11, 85, 36, 77, 59, 66, 29};
        
        for(int i = 0;i < numeros.length;i++){
            boolean ePrimo = true;
            for(int valor = 2;valor < numeros[i];valor++){
                if(numeros[i] % valor == 0){
                    ePrimo = false;
                    break;
                }
            }
            if(ePrimo){
                System.out.println(numeros[i]);
            }
        }
    }
}