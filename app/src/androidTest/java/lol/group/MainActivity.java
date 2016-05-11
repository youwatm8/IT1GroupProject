package lol.group;
import android.app.Application;
import android.test.ApplicationTestCase;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by aaron.carmen on 5/11/2016.
 */
public class MainActivity extends Activity implements OnClickListener {
    private Button scanBtn;
    private TextView formatTxt, contentTxt;

    public void onClick(View v) {
        //respond to clicks
        if(v.getId()==R.id.scan_button){
            //scan
            IntentIntegrator scanIntegrator = new IntentIntegrator(this);
            scanIntegrator.initiateScan();
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
        scanBtn = (Button)findViewById(R.id.scan_button);
        scanBtn.setOnClickListener(this);
        formatTxt = (TextView)findViewById(R.id.scan_format);
        contentTxt = (TextView)findViewById(R.id.scan_content);
}
}
