package puzzleleaf.tistory.com.targeteffectexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

public class MainActivity extends AppCompatActivity {


    MaterialTapTargetPrompt.Builder myTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.leftbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTarget = new MaterialTapTargetPrompt.Builder(MainActivity.this,R.style.MyColor)
                        .setTarget(R.id.toppuzzleleaf)
                        .setPrimaryText("Puzzleleaf")
                        .setSecondaryText("이것은 상단 퍼즐잎 로고 입니다!.")
                        .setBackgroundColour(Integer.parseInt("9ACA66",16)) //큰 원의 배경 색상
                        .setFocalColour(Integer.parseInt("ffffff",16)) // 안쪽 작은 원의 배경색
                        .setAutoDismiss(false)
                        .setOnHidePromptListener(new MaterialTapTargetPrompt.OnHidePromptListener() {
                            @Override
                            public void onHidePrompt(MotionEvent event, boolean tappedTarget) {
                            }
                            @Override
                            public void onHidePromptComplete() {
                                Toast.makeText(getApplicationContext(),"Top",Toast.LENGTH_LONG).show();
                            }
                        })

                        .setIcon(R.drawable.puzzleleaf);
                myTarget.show();
            }
        });

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTarget = new MaterialTapTargetPrompt.Builder(MainActivity.this,R.style.MyColor)
                        .setTarget(R.id.puzzleleaf)
                        .setPrimaryText("Puzzleleaf")
                        .setSecondaryText("이것은 중간 퍼즐잎 로고 입니다.")
                        .setBackgroundColour(Integer.parseInt("9ACA66",16)) //큰 원의 배경 색상
                        .setFocalColour(Integer.parseInt("ffffff",16)) // 안쪽 작은 원의 배경색
                        .setAutoDismiss(false)
                        .setOnHidePromptListener(new MaterialTapTargetPrompt.OnHidePromptListener() {
                            @Override
                            public void onHidePrompt(MotionEvent event, boolean tappedTarget) {
                            }
                            @Override
                            public void onHidePromptComplete() {
                                Toast.makeText(getApplicationContext(),"Center",Toast.LENGTH_LONG).show();
                            }
                        })
                        .setIcon(R.drawable.puzzleleaf);
                myTarget.show();
            }
        });

        findViewById(R.id.rightbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTarget = new MaterialTapTargetPrompt.Builder(MainActivity.this,R.style.Bottom)
                        .setAutoDismiss(false)
                        .setOnHidePromptListener(new MaterialTapTargetPrompt.OnHidePromptListener() {
                            @Override
                            public void onHidePrompt(MotionEvent event, boolean tappedTarget) {
                            }
                            @Override
                            public void onHidePromptComplete() {
                                Toast.makeText(getApplicationContext(),"Bottom",Toast.LENGTH_LONG).show();
                            }
                        })
                        .setIcon(R.drawable.puzzleleaf);
                myTarget.show();
            }
        });
    }
}
