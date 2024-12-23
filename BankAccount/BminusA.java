package BankAccount;


 
	
	class BminusA {

			public static void main(String[] args) {
				int[] a = {1,2,3,4,5,6};
				int[] b = {100,200,1,2,4,300,400};
				// B - A---- 100,200,300,400
				
				int[] BminusA = new int[a.length];
				
				int index=0;
				for(int i=0;i<b.length;i++) {
					if(checkDuplicate(a,b[i])== false) {
						BminusA[index++] = b[i];	
					}//if
				}// for
				System.out.println("A array elements");
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println("\n B array elements");
				for(int i=0;i<b.length;i++) {
					System.out.print(b[i]+" ");
				}
				System.out.println("\n B-A array elements");
				// print a-b
				for(int i=0;i<index;i++) {
					System.out.print(BminusA[i]+" ");
				}
			}

			private static boolean checkDuplicate(int[] aub, int bv) {
				
				for(int i=0;i<aub.length;i++) {
					if(aub[i] == bv) return true;
				}
				
				return false;
			}

		}
		 





