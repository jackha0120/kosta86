package ex1;

public class DaoImple implements Dao{

	@Override
	public void fifth() {
			String[] ar = {"김길동","윤혜인","지은숙","송미인","박고은"};
			for(int i=0; i<= ar.length; i++){
				System.out.println("비지니스 로직! :"+ar[i]);
			}
	}

}
