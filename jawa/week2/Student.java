public class Student {
	int nrp;
	String nama;
	int rpl;
	int pbo;
	int bd;

	public Student(int nrp, String nama, int rpl, int pbo, int bd){
		this.nrp = nrp;
		this.nama = nama;
		this.rpl = rpl;
		this.pbo = pbo;
		int bd = bd;
	}

	public average(){
		return (rpl + pbo + bd) / 3;
	}

	public getNrp(){
		return this.nrp;
	}

	public getNama(){
		return this.nama;
	}
}

public class tampilkanRerata(){
	public static void main (){
		Student[] students = new Student[4];
		students[0] = new Student(1, "Ahmad", 81, 90, 62);
      		students[1] = new Student(2, "Adang", 50, 83, 87);
        	students[2] = new Student(3, "Dani", 89, 55, 65);
        	students[3] = new Student(4, "Edi", 77, 70, 92);	
	}

	System.out.println("NRP\tNama\tRata-rata");
        System.out.println("--------------------------");

        for (Student student : students) {
            System.out.printf("%d\t%s\t%.2f%n", student.getNrp(), student.getName(), student.calculateAverage());
        }

        System.out.println("--------------------------");

	
}