
public class _student {
    public String name;
    public float[] scores;


    public _student(String name, int num_scores) {
        this.name = name;
        this.scores = new float[num_scores];
    }

    public float getAvg() {
        float total = 0;
        for (int i = 0; i < this.scores.length; i++) {
            total += this.scores[i];
        }
        return (float)total/this.scores.length;
    }

    public float highest() {
        float end = 0;
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i] > end) {
                end = this.scores[i];
            }
        }
        return (float)end;
    }

    public float lowest() {
        float end = 100;
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i] < end) {
                end = this.scores[i];
            }
        }
        return (float)end;
    }

    public boolean verdict() {
        return (this.getAvg() >= 60);
    }

    public void PrintReport() {
        System.out.printf("Student: " + this.name);
        System.out.printf("\n Highest: " + this.highest());
        System.out.printf("\n Lowest: " + this.lowest());
        System.out.printf("\n Average: " + this.getAvg());
        System.out.printf("\n Pass/Fail: %s", this.verdict() ? "Pass" : "Fail");
    }
}
