    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int num = in.nextInt();
        SortedSet<String> sets=new TreeSet<String>();

        for(int i=0;i<=S.length()-num;i++){
            sets.add(S.substring(i,i+num));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());



    }}
