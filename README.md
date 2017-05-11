5Praktika:

Programa hau, Eclipse Neon.3 eta JDK 8 dependentziekin probatu da.
Programa instalatzeko pausuak honakoak dira:
	- Eclipsen inportatu proiektua.
	- Programa exekutatu, klase bakarra dauka, nagusia.java delakoa

Programa honek ondorengoa egiten du: 
	- Hasieran, instantziak kargatzen ditu.
	- Ondoren, RandomForest sailkatzailea entrenatzen du train datu multzoa erabiliz.
	- Azkenik, test multzoa erabiliz sailkatzailearen kalitatea ebaluatzen du, emaitzak inprimatuz.
	Programa honi,train eta test .arff fitxategiak pasatuko zaizkio.
	Programa honek, pantailan inprimatuko ditu datuak eta .txt batean gordeko ditu, zure karpeta pertsonalean.
	Bukatzean, erabilitako denbora inprimatuko du segunduetan neurtuta.
		
	
	Aurre-baldintza: Bi .arff fixategi sartu, bat train eta bestea test, edozein ordenetan.
	Post-baldintza: .txt bat zure karpeta pertsonalean gordetzen du.
	 
	Erabileraren adibidea:
		Sarrera:
			java -jar IkerZarragaPraktika5.jar path\train-digits.arff path\test-digits.arff
		Irteera:
			Zure karpeta pertsonalean gordetzen du .txt bat IkerZarraga_Emaitzak.txt hain zuzen
