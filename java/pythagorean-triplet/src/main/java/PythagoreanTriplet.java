import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PythagoreanTriplet {
    private int a, b, c;
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    static Builder makeTripletsList() {
        return new Builder();
    }
    static class Builder {
        private int factors = 0;
        private int sum = 0;
        public Builder withFactorsLessThanOrEqualTo(int factors) {
            this.factors = factors;
            return this;
        }
        public Builder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            if(sum % 2 != 0) return Collections.emptyList();
            ArrayList<PythagoreanTriplet> pythagoreanTriplets = new ArrayList<>();
            for(int i = 1; i <= sum/3; i++)
                for(int j = i+1; j <= sum/2; j++) {
                    int k = sum - i - j;
                    if (k*k == (i*i + j*j))
                        pythagoreanTriplets.add(new PythagoreanTriplet(i, j, k));
                }
            return pythagoreanTriplets;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj instanceof PythagoreanTriplet) {
            PythagoreanTriplet pythagoreanTriplet = (PythagoreanTriplet) obj;
            if((this.a == pythagoreanTriplet.a && this.b == pythagoreanTriplet.b && this.c == pythagoreanTriplet.c)
                    || (this.a == pythagoreanTriplet.b) && (this.b == pythagoreanTriplet.a) && (this.c == pythagoreanTriplet.c)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

