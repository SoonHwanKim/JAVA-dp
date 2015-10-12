package iterator;

public class HanbitIterator implements MyIterator{
	private HanbitENI hanbbiteni;
	private int index;
	public HanbitIterator(HanbitENI hanbbiteni) {
		this.hanbbiteni = hanbbiteni;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if (index < hanbbiteni.getLast()) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Object next() {
		Student student = hanbbiteni.getStudentAt(index);
		index++;
		return student;
	}

}
