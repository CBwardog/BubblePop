package com.example.cbwardog.bubblepop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by CBwardog on 16-08-23.
 */



public class PopGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_bubble);

        //retry button
        ImageButton retry = (ImageButton) findViewById(R.id.btn_retry);
        retry.setOnClickListener(new View.OnClickListener()




        {

            @Override
            public void onClick (View view){
                Intent retry = new Intent(PopGame.this, PopGame.class);
                startActivity(retry);
            }


        });



    }







    //if back key pressed
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Do you want to exit application?")

                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        finish();
                        //close();


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();



    }









        public boolean onTouchEvent(MotionEvent event) {
            // do something when the screen is clicked
            // we will handle click here ??? We don't know
            int action = MotionEventCompat.getActionMasked(event);
            // So we will make
            switch (action) {
                case (MotionEvent.ACTION_DOWN) :



                    // move when the screen is clicked





                    ImageView img_animation = (ImageView) findViewById(R.id.bubble2);


                    TranslateAnimation animation = new TranslateAnimation(0.0f, 0.0f,
                            0.0f, -1005.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
                    animation.setDuration(1000);  // animation duration
                    animation.setRepeatCount(0);  // animation repeat count
                    animation.setRepeatMode(0);   // repeat animation (left to right, right to left )
                    animation.setFillAfter(true);

                    img_animation.startAnimation(animation);  // start animation



                    return true;


                    default:
                        return super.onTouchEvent(event);



            }


    //public boolean onTouchEvent(MotionEvent event) {
        // do something when the screen is clicked



        // move when the bubble is clicked
      //  ImageView img_animation = (ImageView) findViewById(R.id.bubble2);

        //float touchX = event.getX(); //get users X-touch coordinate
        //float touchY = event.getY(); //get users Y-touch coordinate

        //float userX = 0;
        //float userY = 0;

        //int action = MotionEventCompat.getActionMasked(event);
        // So we will make
        //switch (event.getAction()) {
                // case (MotionEvent.ACTION_DOWN):
                //userX = touchX; //getting user coordinates
                //userY = touchY;

                //float ballX = userX;
                //float ballY = userY;

                //ballX += userX;
                //ballY += userY;

               // TranslateAnimation animation = new TranslateAnimation(100f, -200f,
                 //       1000f, -500f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
                //animation.setDuration(1000);  // animation duration
                //animation.setRepeatCount(0);  // animation repeat count
                //animation.setRepeatMode(0);   // repeat animation (left to right, right to left )
                //animation.setFillAfter(true);

                //img_animation.startAnimation(animation);  // start animation
                //return true;
            //default:
              //  return true;

//        }

        }


    }











