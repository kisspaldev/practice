package app;

public class App {
	    public static void main(String[] args) throws Exception {
	        System.out.println("Xmass Tree");
	        System.out.println("");
	        draw_tree(40);
	        draw_tree(20);
	        draw_tree(13);
	        draw_tree(12);
	        draw_tree(11);
	        draw_tree(10);
	        draw_tree(9);
	        draw_tree(8);
	        draw_tree(7);
	        draw_tree(6);
	        draw_tree(5);
	        draw_tree(4);
	        draw_tree(3);
	        draw_tree(2);
	        draw_tree(1);
	        draw_tree(0);
	    }

	    private static void draw_tree(int height) {
	    	System.out.println("_".repeat(height*2+1));
	    	System.out.println("Ez egy "+height+" magas fa:");
	    	System.out.println("");
	    	//további paraméterek a magasság alapján
	    	int trunk_height = (int) Math.ceil(height / 3.0); // a fa egyharmada a törzs hossza
	    	int trunk_width =  (int) (Math.round(height / 12.0)*2)+1; //mindig páratlan
	    	int trunk_space = height-(trunk_width-1)/2;
	    	int leaf_width = 0;
	    	int leaf_space = 0;
	    	//ciklus a csúcstól az aljáig és tovább a törzsre
	    	//mindegyik sor középre igazítva
	    	for (int i = 0; i<= height+trunk_height-1; i++) {
	    		if (i<height) {
	    			leaf_width = i*2+1;
	    			leaf_space = height - i;
	    			String branch = " ".repeat(leaf_space)+"X".repeat(leaf_width);
	    			System.out.println(branch);
	    		}else {
	    			String trunk = " ".repeat(trunk_space)+"H".repeat(trunk_width);
	    			System.out.println(trunk);
	    		}
	    	}
	    	System.out.println("_".repeat(height*2+1));
	    }
}
