package com.example.dhrpande.mathemagic;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.dhrpande.mathemagic.dummy.DummyContent;

/**
 * A fragment representing a single magicTrick detail screen.
 * This fragment is either contained in a {@link magicTrickListActivity}
 * in two-pane mode (on tablets) or a {@link magicTrickDetailActivity}
 * on handsets.
 */
public class magicTrickDetailFragment extends Fragment {

    private static int present_state=0, future_state=0 ;
    TextView questionText;
    Button nextButton, previousButton;
    ImageView colourImage;
    Drawable numberImage;

    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public magicTrickDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_magictrick_detail, container, false);
        questionText = (TextView) rootView.findViewById(R.id.questionText);
        nextButton = (Button) rootView.findViewById(R.id.nextButton);
        previousButton = (Button) rootView.findViewById(R.id.previousButton);

        // Show the dummy content as text in a TextView.
        if (mItem.id == "10") {
            present_state=0;
            future_state=0;

            questionText.setText("There are many simple questions about numbers that no one has been able to answer");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Start with any number");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("If it is even divide it by 2, if odd multiply by 3 and add 1 then keep going");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Write down the sequence");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("It seems no matter what number you start with you eventually hit a 1.");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Example: starting with 7");
                                present_state = 5;
                            }else if (future_state == 6) {
                                questionText.setText("7 -> 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.\n" +
                                        "\n Isn't it awesome believe me its still an unproven mystery");
                                present_state = 6;
                            }
                            else {
                                questionText.setText("Start with any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG);
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Start with any number");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("If it is even divide it by 2, if odd multiply by 3 and add 1 then keep going");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Write down the sequence");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("It seems no matter what number you start with you eventually hit a 1.");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Example: starting with 7");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("7 -> 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.");
                                future_state=7;
                            }
                            else {
                                questionText.setText("Start with any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "9") {
            present_state=0;
            future_state=0;

            questionText.setText("Hi there..\n" +
                    "\nPress next for the magical ride");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any two numbers between 1 to 9");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Then reverse the two numbers");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("You should have two two-digit numbers");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Subtract the smaller number from the larger one");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Reverse the digits of the total (If <10,ex 5,consider it as 05 -> reverse=50)\n" +
                                        "\nAdd that number to the one you got when you subtracted.");
                                present_state = 5;
                            }else if (future_state == 6) {
                                questionText.setText("The answer is 99");
                                present_state = 6;
                            }
                            else {
                                questionText.setText("Think of any two numbers between 1 to 9");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any two numbers between 1 to 9");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("Then reverse the two numbers");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("You should have two two-digit numbers");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Subtract the smaller number from the larger one");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Reverse the digits of the total and add that number to the one you got when you subtracted");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("The answer is 99.");
                                future_state=7;
                            }
                            else {
                                questionText.setText("Think of any two numbers between 1 to 9");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "8") {
            present_state=0;
            future_state=0;

            questionText.setText("Hey.. you are looking awesome today\n" +
                    "\nPress next to begin");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any number below 10");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Double the number");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Add 6 with the result");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Half the number");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Subtract the number with the number with first number started with");
                                present_state = 5;
                            }else if (future_state == 6) {
                                questionText.setText("Now the number you have is 3.");
                                present_state = 6;
                            }
                            else {
                                questionText.setText("Think of any number below 10");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {


                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any number below 10");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("Double the number");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Add 6 with the result");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Half the number");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Subtract the number with the number with first number started with");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("Now the number you have is 3.");
                                future_state=7;
                            }
                            else {
                                questionText.setText("Think of any number below 10");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "7") {
            present_state=0;
            future_state=0;

            questionText.setText("Hi.. Press Next to begin the magical journey");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any number");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Double the number");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Add 9 with the result");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Subtract 3 with the result");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Finally, Divide the result by 2");
                                present_state = 5;
                            } else if (future_state == 6) {
                                questionText.setText("Subtract the number with the number with first number started with");
                                present_state = 6;
                            }else if (future_state == 7) {
                                questionText.setText(" LoL .. 3 ");
                                present_state = 7;
                            }
                            else {
                                questionText.setText("Think of any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any number");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("Double the number");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Add 9 with the result");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Subtract 3 with the result");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Finally, Divide the result by 2");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("Subtract the number with the number with first number started with");
                                future_state=7;
                            }
                            else if (present_state == 7) {
                                questionText.setText("lol.. 3");
                                future_state=8;
                            }
                            else {
                                questionText.setText("Think of any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "6") {
            present_state=0;
            future_state=0;

            questionText.setText("Whats up buddy\n" +
                    "\nPress next lets have some fun");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any number");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Multiply the number by 3");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Add 6 with the getting result");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Divide the total by 3 ");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Finally, Subtract it from the first number used");
                                present_state = 5;
                            } else if (future_state == 6) {
                                questionText.setText("I know you got 2");
                                present_state = 6;
                            }
                            else {
                                questionText.setText("Think of any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {


                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any number");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("Multiply the number by 3");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Add 6 with the getting result");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Divide the total by 3 ");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Finally, Subtract it from the first number used");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("I know you got 2");
                                future_state=7;
                            }
                            else {
                                questionText.setText("Think of any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "5") {
            present_state=0;
            future_state=0;

            questionText.setText("Looking for some trick ? press Next ");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any number");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Multiply the number by 2");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Add 10 to the number you got");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Now Divide the total by 2 ");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Finally,Subtract the total from the first number you picked");
                                present_state = 5;
                            } else if (future_state == 6) {
                                questionText.setText("Hey! you got 5 isn't it ?");
                                present_state = 6;
                            }
                            else {
                                questionText.setText("Think of any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any number");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("Multiply the number by 2");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Add 10 to the number you got");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Now Divide the total by 2 ");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Finally,Subtract the total from the first number you picked");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("Hey! you got 5 isn't it ?");
                                future_state=7;
                            }
                            else {
                                questionText.setText("Think of any number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }

        else if (mItem.id == "4") {
            present_state=0;
            future_state=0;

            questionText.setText("Hi wassup.. Press next lets begin");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any number between 0 to 9");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Multiply the number by 9");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Now add both digits of the number you got");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Subtract 5 from the number you have ");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Number you have now is 4");
                                present_state = 5;
                            } else {
                                questionText.setText("Think of any number between 2 to 9");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {


                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any number between 2 to 9");
                                future_state=2;

                            }
                            else if (present_state == 2) {
                                questionText.setText("Multiply the number by 9");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Now add both digits of the numbers");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Subtract 5 from the number you have ");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Number you have now is 4");
                                future_state=6;
                            }
                            else {
                                questionText.setText("Think of any number between 2 to 9");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "3") {
            present_state=0;
            future_state=0;

            questionText.setText("Hey.. You got a really nice smile\n" +
                    "\nPress next to begin:");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Think of any number between 2 to 9");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Multiply the number by 2");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Add 14 to the number you got");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Divide the previous result by 2 ");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Subtract the first number you thought from the previous result");
                                present_state = 5;
                            } else if (future_state == 6) {
                                questionText.setText("Now the number you have is 7 ");
                                present_state = 6;
                            } else {
                                questionText.setText("Think of any number between 2 to 9");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {


                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Think of any number between 2 to 9");
                                future_state=2;
                            }
                            else if (present_state == 2) {
                                questionText.setText("Multiply the number by 2");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Add 14 to the number you got");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Divide the previous result by 2 ");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Subtract the first number you thought from the previous result");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("Now the number you have is 7 ");
                                future_state=0;
                            }
                            else {
                                questionText.setText("Think of any number between 2 to 9");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "2") {
            present_state=0;
            future_state=0;

            questionText.setText("Hi .. Wondering how i know you age\n" +
                    "\ntap next to find out");

            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }
                            if (future_state == 1) {
                                questionText.setText("Multiply the first number of the age by 5 (If <10, ex 5, consider it as 05)");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Add 3 to the result");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Double the answer");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Add the second digit of the number with the result");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText("Subtract 6 from it");
                                present_state = 5;
                            } else if (future_state == 6) {
                                questionText.setText("That is your age ");
                                present_state = 6;
                            } else {
                                questionText.setText("Multiply the first number of the age by 5 (If <10, ex 5, consider it as 05)");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {


                            present_state--;

                            if (present_state==1) {
                                questionText.setText("Multiply the first number of the age by 5 (If <10, ex 5, consider it as 05)");
                                future_state=2;
                            }
                            else if (present_state == 2) {
                                questionText.setText("Add 3 to the result");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Double the answer");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Add the second digit of the number with the result");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText("Subtract 6 from it");
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                questionText.setText("That is your age ");
                                future_state=0;
                            }
                            else {
                                questionText.setText("Multiply the first number of the age by 5 (If <10, ex 5, consider it as 05)");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }
        else if (mItem.id == "1") {
            present_state=0;
            future_state=0;

            colourImage = (ImageView) rootView.findViewById(R.id.colourImage);
            numberImage = getResources().getDrawable(R.drawable.colours);

            questionText.setText("Wow your mind is full of beautiful memories.\n\nPress next to begin");


            nextButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            if (present_state == future_state) {
                                future_state++;
                            }

                            if (future_state == 1) {
                                questionText.setText("Think of any 2 digit number");
                                present_state = 1;
                            } else if (future_state == 2) {
                                questionText.setText("Add the 2 digits together");
                                present_state = 2;
                            } else if (future_state == 3) {
                                questionText.setText("Subtract the number from your original number");
                                present_state = 3;
                            } else if (future_state == 4) {
                                questionText.setText("Press next to see what colour your number is ");
                                present_state = 4;
                            } else if (future_state == 5) {
                                questionText.setText(null);
                                colourImage.setImageDrawable(numberImage);
                                present_state = 5;
                            } else if (future_state == 6) {
                                colourImage.setImageBitmap(null);
                                questionText.setText("Your number was RED ");
                                present_state = 6;
                            } else {
                                questionText.setText("Think of any 2 digit number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_LONG).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
            previousButton.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {


                            present_state--;

                            colourImage.setImageBitmap(null); // If user tried to go back from Image View.

                            if (present_state==1) {
                                questionText.setText("Think of any 2 digit number");
                                future_state=2;
                            }
                            else if (present_state == 2) {
                                questionText.setText("Add the 2 digits together");
                                future_state=3;
                            }
                            else if (present_state == 3) {
                                questionText.setText("Subtract the number from your original number");
                                future_state=4;
                            }
                            else if (present_state == 4) {
                                questionText.setText("Press next to see what colour your number is ");
                                future_state=5;
                            }
                            else if (present_state == 5) {
                                questionText.setText(" ");
                                colourImage.setImageDrawable(numberImage);
                                future_state=6;
                            }
                            else if (present_state == 6) {
                                colourImage.setImageBitmap(null);
                                questionText.setText("Your number was RED ");
                                future_state=0;
                            }
                            else {
                                questionText.setText("Think of any 2 digit number");
                                Toast.makeText(getContext(), "Main Menu navigation is on the top left", Toast.LENGTH_SHORT).show();
                                present_state = 0;
                                future_state = 2;
                            }

                        }
                    }
            );
        }

        return rootView;
    }

}