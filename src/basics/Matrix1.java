void main(String[] args){
   int n = (args.length>0) ? Integer.parseInt(args[0]) : 5;

        for(int i=1;i<=n; i++){
            for(int j=1;j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
}
