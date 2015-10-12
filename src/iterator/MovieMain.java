package iterator;

public class MovieMain {
	public static void main(String[] args) {
		Multiplex multiplex = new Multiplex(100);
		multiplex.addMovie(new Movie("사도"));
		multiplex.addMovie(new Movie("마션"));
		multiplex.addMovie(new Movie("인턴"));
		MyIterator it = multiplex.iterator();
		while (it.hasNext()) {
			Movie movie = (Movie) it.next();
			System.out.print(movie.getName()+"\t");
		}
	}

}
