class MiniMultiMedia{
	class CringeContent{
		void content(){
			System.out.println("Cringe content exists!");
		}
	}
	public static void main(String[] args){
		MiniMultiMedia content = new MiniMultiMedia();

		System.out.println("If tiktok exists then ");
		CringeContent tiktok = content.new CringeContent();
		tiktok.content(); 
		
		System.out.println("If reels exists then ");
		CringeContent reels = new MiniMultiMedia().new CringeContent();	
		reels.content();
			
		System.out.println("Hence, if mini MultiMedia exists then");
		new MiniMultiMedia().new CringeContent().content();
	}
}