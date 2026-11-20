public class threads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("Order the food");
        });
        Thread t2=new Thread(()->{
            System.out.println("Confirm by restaurant");
        });
        Thread t3=new Thread(()->{
            System.out.println("Serve the food");
        });
        Thread t4=new Thread(()->{
            System.out.println("Food Completed ");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();


       System.out.println(t1.getPriority());
       System.out.println(t2.getPriority());
       System.out.println(t3.getPriority());
       System.out.println(t4.getPriority());
    }
        
}
