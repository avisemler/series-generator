import java.lang.Math;

class Main{
    public static void main(String[] args) {
        //How many terms to generate
        final int terms = 100;

        //Create an array to store the sequence in
        int[] sequence = new int [terms];

        //The sequence starts with 2
        sequence[0] = 2;

        for (int i=1; i < terms; i++){
            int location = find_location(sequence, i + 1);

            if (location != -1){
                //If the term number occurs, apply the rule
                sequence[i] = 3 * location;
            } else{
                //Otherwise, it will always be one greater than the term
                //before it
                sequence[i] = sequence[i -1] + 1;
            }
        }
        
        //display the sequence
        int count = 1;
        for (int term: sequence){
            System.out.println("Term " + String.valueOf(count) + ": " + String.valueOf(term));

            count += 1;
        }
    }

    public static int find_location(int[] array, int value){
        int count = 0;
        for(int element: array){
            if (element == value){
                return count + 1;
            }
            count += 1;
        }
        return -1;
    }
}
