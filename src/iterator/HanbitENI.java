package iterator;

import javax.naming.directory.SearchControls;
import javax.security.auth.Subject;

public class HanbitENI implements HanbitService {
 	private Student[] students;
	private int last = 0;
	
	public HanbitENI(int size){
		this.students = new Student[size];
	}


	// 학생추가	
	public void add(Student student) {
		this.students[last] = student;
		last++;
		
	}
    // 검색
	public Student getStudentAt(int index) {
		return students[index];
	}

	public int getLast() {
		return last;
	}
	// 이름으로 검색하기
	public Student serchByName(String name){
		MyIterator it = this.iterator();
		Student temp = null;
		while (it.hasNext()) {
			temp = (Student) it.next();
			if (temp.getName().equals(name)) {
			}
		}
		return temp;
	}
	// 과목으로 검색하기
	public Student searchBySubject(String subject){
		MyIterator it = this.iterator();
		int i = 0;
		Student temp = null;
		while (it.hasNext()) {
			temp = (Student) it.next();
			if (temp.getSubject().equals(subject)) {
				i++;
			}
		}
		
		return temp;
		
	}
	

	@Override
	public MyIterator iterator() {
		return new HanbitIterator(this);
	}

}
