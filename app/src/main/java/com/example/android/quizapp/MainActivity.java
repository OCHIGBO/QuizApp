package com.example.android.quizapp;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Gravity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice2;
    // Question 2
    RadioButton question2_choice1;
    // Question 3
    RadioButton question3_choice1;
    // Question 4
    EditText Question4;
    // Question 5
    CheckBox check_box1;
    CheckBox check_box2;
    CheckBox check_box3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }



    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice2));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is "Kunal Chawla"
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice2 = (RadioButton) this.findViewById(R.id.question1_choice2);
        answer1 = question1_choice2.isChecked();
        if (answer1) {
            answer1_score = 2;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "Katherine Kuan"
        //------------------------------------------------------------------------------------------
        Boolean answer2;

        question2_choice1 = (RadioButton) this.findViewById(R.id.question2_choice1);
        answer2 = question2_choice1.isChecked();
        if (answer2) {
            answer2_score = 2;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct "Yes"
        //------------------------------------------------------------------------------------------
        Boolean answer3;

        question3_choice1 = (RadioButton) this.findViewById(R.id.question3_choice1);
        answer3 = question3_choice1.isChecked();
        if (answer3) {
            answer3_score = 2;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "Andela Learning Community"
        //------------------------------------------------------------------------------------------
        String answer4;
        Question4 = (EditText) this.findViewById(R.id.Question4);
        answer4 = Question4.getText().toString().toLowerCase();
        if (answer4.equals("Andela Learning Community") || answer4.equals("andela learning community")) {
            answer4_score = 2;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is "Layouts, Viewgroups, OOP"
        //------------------------------------------------------------------------------------------

        Boolean answer5_choice1;
        Boolean answer5_choice2;
        Boolean answer5_choice3;
        check_box1 = (CheckBox) this.findViewById(R.id.check_box1);
        check_box2 = (CheckBox) this.findViewById(R.id.check_box2);
        check_box3 = (CheckBox) this.findViewById(R.id.check_box3);
        answer5_choice1 = check_box1.isChecked();
        answer5_choice2 = check_box2.isChecked();
        answer5_choice3 = check_box3.isChecked();
        if (answer5_choice1 && answer5_choice2 && answer5_choice3) {
            answer5_score = 2;
        } else {
            answer5_score = 0;
        }
        //------------------------------------------------------------------------------------------


        EditText submitAnswers =(EditText) findViewById(R.id.Name);
        String name = submitAnswers.getText().toString();

        // Final Score

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score;

        if (final_score == 10) {
            resultsDisplay ="Perfect! " + name + " You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. " + name + " You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }
    //------------------------------------------------------------------------------------------


}





