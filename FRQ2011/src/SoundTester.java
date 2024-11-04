
public class SoundTester {
	public static void main(String[] args) {
		int [] sample1 = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,9,0,0};
		int [] sample2 = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
		Sound test = new Sound(sample1);
		Sound test2 = new Sound(sample2);
		
		System.out.print(test2.limitAmplitude(2000));
		System.out.println();
		test2.printSamples();
		System.out.println();
		test.trimSilenceFromBeginning();
		//test.printSamples();
	
		}
		
	}

