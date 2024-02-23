class Thread1 {
    public static void main(String args[]) {
        System.out.println("Let us start JAVA Programming");
        Thread t = Thread.currentThread();
        System.out.println("currentThread=" + t);
        System.out.println("Its name=" + t.getName());
    }
}
