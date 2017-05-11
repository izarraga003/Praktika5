import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.commons.lang3.time.StopWatch;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;


public class Nagusia {

	public static void main(String[] args) throws Exception {
		Instances train = null;
		Instances test = null;
		StopWatch sw = new StopWatch();
		sw.start();
		
		// test eta train kargatu bi aldagaietan
		for (int i = 0; i < args.length; i++) {
			FileReader fi = new FileReader(args[i]);
			BufferedReader bw = new BufferedReader(fi);
			if (args[i].toLowerCase().contains("test"))
				test = new Instances(bw);
			else if (args[i].toLowerCase().contains("train"))
				train = new Instances(bw);

			fi.close();
		}

		train.setClassIndex(train.numAttributes() - 1);
		test.setClassIndex(test.numAttributes() - 1);
		
		RandomForest rf = new RandomForest();
		rf.buildClassifier(train);
		Evaluation ebaluatzailea = new Evaluation(test);
		ebaluatzailea.evaluateModel(rf, test);
		
		System.out.println("Datuak: ------------------------------------------");
		System.out.println(ebaluatzailea.toSummaryString());
		System.out.println(ebaluatzailea.toClassDetailsString());
		System.out.println(ebaluatzailea.toMatrixString());
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home")+"/IkerZarraga_Emaitzak.txt"));
		bw.write(ebaluatzailea.toSummaryString());
		bw.write(ebaluatzailea.toClassDetailsString());
		bw.write(ebaluatzailea.toMatrixString());
		bw.flush();
		bw.close();
		
		sw.stop();
		System.out.println("Programak erabili duen denbora honakoa da: " + sw.getTime() / 1000D + " segundu!!!");
	}
}
