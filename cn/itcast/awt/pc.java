
class MotherBoard{
	public void run(){
		System.out.println("run");
	}
	
	public void usePci(Pci p){
		p.open();
		p.close();
	}
}
//
//

