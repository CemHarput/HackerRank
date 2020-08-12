public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> listINT=new ArrayList<Integer>();
        String action;

        int index;

        int num;
        for(int i=0;i<n;i++){

            int values=sc.nextInt();
            listINT.add(values);

        }
        int query=sc.nextInt();
        
        for(int i=0;i<query;i++){
          action=sc.next();
            if(action.equals("INSERT")){
             index=sc.nextInt();
             num=sc.nextInt();
             listINT.add(index,num);

            }
            if(action.equals("DELETE")){
              int deletedIndex=sc.nextInt();
                listINT.remove(deletedIndex);

            }
        }
        sc.close();

        for (Integer integer : listINT) {
            System.out.print(integer+" ");
        }


}}
