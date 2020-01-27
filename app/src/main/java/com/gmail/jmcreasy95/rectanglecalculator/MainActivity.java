package com.gmail.jmcreasy95.rectanglecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Program Constants
    final double MININPUT = 0.00;
    final double MAXINPUT = 10000.00;
    final String OORINPUT = "Input is out of range. \nTry entering a number between 0 and 10000";

    //Program widget variables
    EditText editTextHeight;
    EditText editTextWidth;
    EditText editTextPerimeter;
    EditText editTextArea;
    Button buttonCalculate;
    Button buttonClear;

    //Program Non-Widget Variables
    double height = 0.00;
    double width = 0.00;
    double area = 0.00;
    double perimeter = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWidth = (EditText) findViewById(R.id.editTextWidth);
        editTextPerimeter = (EditText) findViewById(R.id.editTextPerimeter);
        editTextArea = (EditText) findViewById(R.id.editTextArea);
        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean keepGoing = true;

                   /*if (keepGoing)
                   {
                       keepGoing = validateHeight();
                   }*/

                if (keepGoing) {
                    keepGoing = validateWidth();
                }

                if (keepGoing) {
                    //perimeter = calculatePerimeter();
                    //area = calculateArea();
                }

            }
        });
    }

      /*  private boolean validateHeight()
           {
               try
               {
                   height = Double.parseDouble(editTextHeight.getText().toString());

                   while ((height < MININPUT) || (height > MAXINPUT)) ;
                   {
                       height = 0.00;
                       editTextHeight.setText("");
                       editTextHeight.requestFocus();
                       throw new NumberFormatException();
                   }
                       return true;
                   }


               catch (NumberFormatException nfe)
               {
                   Toast toast = Toast.makeText(getApplicationContext(),
                                                OORINPUT,
                                                Toast.LENGTH_LONG);
                   toast.show();

                   return false;
               }
           }*/

    private boolean validateWidth() {
        try {
            width = Double.parseDouble(editTextWidth.getText().toString());

            while ((width < MININPUT) || (width > MAXINPUT)) {
                width = 0;
                editTextWidth.setText("");
                editTextWidth.requestFocus();
                throw new NumberFormatException();
            }

            return true;
        } catch (NumberFormatException nfe) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    OORINPUT,
                    Toast.LENGTH_LONG);
            toast.show();

            return false;
        }
    }

   /* private double calculatePerimeter() {

        perimeter = (2 * height) + (2 * width);


    }
*/


    }







