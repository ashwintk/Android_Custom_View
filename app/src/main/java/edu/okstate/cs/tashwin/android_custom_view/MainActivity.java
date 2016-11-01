package edu.okstate.cs.tashwin.android_custom_view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


class myView extends View{
    public myView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        //Create a paint object to fill the shape with
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        //Draw a shape on the canvas & write a text
        canvas.drawCircle(250, 250, 150, paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(50);
        canvas.drawText("Hello World !", 200, 500, paint);
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new myView(this));
    }
}
