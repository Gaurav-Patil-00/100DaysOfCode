class Channels{
	int channelNum;
	static int trp;
	Channels(int channelNum,int trp){
		this.channelNum = channelNum; 
		this.trp = trp;
		System.out.println("Category : ");
	}
	void serials(){
		System.out.println("Serials : ");
		class MarathiSerials{
			MarathiSerials(){
				System.out.println("Marathi Serial channel number : "+channelNum);
				System.out.println("Marathi Serial trp count : "+trp);
			}
			void aaiKutheKayKarte(){
				System.out.println("      Aai kuthe kay karte! : "+channelNum );
				System.out.println("TRP : "+trp);
			}
		}
		new MarathiSerials().aaiKutheKayKarte();
	}	
}
class Viewer{
	public static void main(String[] args){
		new Channels(234,40000).serials();
	}	
}