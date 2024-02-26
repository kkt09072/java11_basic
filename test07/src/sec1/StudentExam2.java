package sec1;

public class StudentExam2 {
	public static void main(String[] args) {
		//2차원 배열(5x4)
		int s[][] = {{1,90,90,90},{2,80,70,60},{3,90,80,70},{4,60,90,70},{5,70,90,90}};
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i=0;i<s.length;i++) {
			int tot = 0;
			double avg = 0.0f;
			String hak = "F"; 
			for(int j=1;j<s[i].length;j++) {
				tot+=s[i][j];
			}
			avg = tot / 3.0f;
			if(avg>=90) {
				hak = "A";
			} else if(avg>=80) {
				hak = "B";
			} else if(avg>=70) {
				hak = "C";
			} else if(avg>=60) {
				hak = "D";
			} else {
				hak = "F";
			}
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",s[i][0],s[i][1],
					s[i][2],s[i][3],tot,avg,hak);
		}

	}
}
