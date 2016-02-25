package uk.co.deanwild.materialshowcaseviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseView;

/**
 * Created by Joseph Moscatiello on 2/25/16.
 */
public class ToolTipExample extends AppCompatActivity implements View.OnClickListener {

    Button buttonTop;
    Button buttonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tooltip_example);
        buttonBottom = (Button) findViewById(R.id.btn_bottom);
        buttonTop = (Button) findViewById(R.id.btn_top);

        buttonTop.setOnClickListener(this);
        buttonBottom.setOnClickListener(this);

    }

    @Override
    public void onClick(View target) {

        final View tooltipView = this.getLayoutInflater().inflate(R.layout.layout_tooltip, null, false);
        final MaterialShowcaseView.Builder builder = new MaterialShowcaseView.Builder(this, tooltipView).setTarget(target)
                .setMaskColour(getApplicationContext().getResources().getColor(R.color.transparent_black));


        builder.showPointer();
        builder.setFadeDuration(500);
        builder.setDismissOnTouch(true);


        final MaterialShowcaseView showcaseView = builder.show();

    }

}
