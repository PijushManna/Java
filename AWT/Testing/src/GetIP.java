class GetIP{
    public static void main(String[] args) throws Exception {
        String host= System.console().readLine("Enter the host:");
        System.console().printf("Ip : %s",java.net.InetAddress.getByName(host));
    }
}