
import java.util.ArrayList;
import java.util.Collections;
public class _student {
    public String name;
    public float[] scores;
    public ArrayList<Float> scores_d;
    


    public _student(String name, int num_scores) {
        this.name = name;
        this.scores_d = new ArrayList<>();
    }

    public float getAvg() {
        float total = 0;
        for (float s : scores_d) {
            total += s;
        }
        return (float)total/this.scores_d.size();
    }

    public float highest() {
        return Collections.max(this.scores_d);
    }

    public float lowest() {
        return Collections.min(this.scores_d);
    }

    public boolean verdict() {
        return (this.getAvg() >= 60);
    }

    public void PrintReport() {
        System.out.printf("Student: " + this.name);
        System.out.printf("\n Scores: ");
        
        for (float i : scores_d) {
            System.out.printf("\n %s ", i);
        }

        System.out.printf("\n Highest: " + this.highest());
        System.out.printf("\n Lowest: " + this.lowest());
        System.out.printf("\n Average: " + this.getAvg());
        System.out.printf("\n Pass/Fail: %s", this.verdict() ? "Pass" : "Fail");
    }
}
