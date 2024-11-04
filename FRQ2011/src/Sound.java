
public class Sound {
	private int [] samples;
	
	public Sound (int[] samples) {
		this.samples = samples;
	}
	
	public void printSamples() {
		for (int i=0; i<samples.length; i++) {
			System.out.print(samples[i] + " ");
		}
	}
	public int limitAmplitude(int limit) {
		int changes = 0;
		for (int i=0; i<samples.length; i++) {
			if (samples[i] > limit) {
				samples[i] = limit;
				changes++;
			} else if (samples[i] < limit/-1) {
				samples[i] = limit/-1;
				changes++;
			}
		}
		return changes;
	}

	public void trimSilenceFromBeginning() {
		int i = 0;
		while (samples[i] == 0) {
			i++;
			}
		int[] newSamples = new int[this.samples.length - i];
		for (int j=0; j <newSamples.length-1; j++) {
			newSamples[j] = samples[j+4];
			
		} 
		samples = newSamples;
		for (int l =0; l<samples.length;l++) {
			System.out.print(samples[l] + " ");
		}
	}
}
