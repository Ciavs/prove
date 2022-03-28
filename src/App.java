public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 0 ; i < 3 ; i++){

            new Thread(new Campana("din", 1)).start();
            Thread.sleep(0);
            new Thread(new Campana("don", 1)).start();
            Thread.sleep(5);
            new Thread(new Campana("dan", 1)).start();
            Thread.sleep(10);
        }
       
        

}
}
