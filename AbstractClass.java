import java.util.Scanner;

abstract class Series {
    public abstract int nextTerm();
}


class GeometricSeries extends Series {
    private int currentTerm;
    private int commonRatio;

    public GeometricSeries(int firstTerm, int commonRatio, int numberOfTerms) {
        this.currentTerm = firstTerm;
        this.commonRatio = commonRatio;
    }

    @Override
    public int nextTerm() {
        
        int termToReturn = currentTerm;
        
        
        currentTerm *= commonRatio; 
        
        return termToReturn;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTerm = sc.nextInt();
        int commonRatio = sc.nextInt();
        int numberOfTerms = sc.nextInt();

        GeometricSeries  geometricSeries = new GeometricSeries(firstTerm, commonRatio, numberOfTerms);
        for(int i = 0; i < numberOfTerms;i++) {
            System.out.print(geometricSeries.nextTerm() + " ");
        }

        sc.close();
    }
}
