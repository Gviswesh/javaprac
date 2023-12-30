import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class vectr_add {
    public static void main(String[] args) {
        int n = 1000000; // Number of elements in the vectors
        double[] vectorA = new double[n];
        double[] vectorB = new double[n];
        double[] result = new double[n];

        for (int i = 0; i < n; i++) {
            vectorA[i] = Math.random();
            vectorB[i] = Math.random();
        }

        ForkJoinPool pool = new ForkJoinPool();
        VectorAddTask task = new VectorAddTask(vectorA, vectorB, result, 0, n);
        pool.invoke(task);

        // Print a few elements of the result
        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }
    }

    static class VectorAddTask extends RecursiveAction {
        private static final int THRESHOLD = 10000;
        private double[] vectorA;
        private double[] vectorB;
        private double[] result;
        private int start;
        private int end;

        public VectorAddTask(double[] vectorA, double[] vectorB, double[] result, int start, int end) {
            this.vectorA = vectorA;
            this.vectorB = vectorB;
            this.result = result;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    result[i] = vectorA[i] + vectorB[i];
                }
            } else {
                int mid = start + (end - start) / 2;
                VectorAddTask leftTask = new VectorAddTask(vectorA, vectorB, result, start, mid);
                VectorAddTask rightTask = new VectorAddTask(vectorA, vectorB, result, mid, end);
                invokeAll(leftTask, rightTask);
            }
        }
    }
}
