package example.com.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static final String toastTextForBtn = "This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*This is used in the launch of the Spotify Streaming App*/
    public void spotifyStreamerApp(View view) {
        Toast.makeText(this, toastTextForBtn + "Spotify Streamer app!", Toast.LENGTH_LONG).show();
    }

    /*This is used in the launch of the Scores App*/
    public void scoresApp(View view) {
        Toast.makeText(this, toastTextForBtn + "Scores app!", Toast.LENGTH_LONG).show();
    }

    /*This is used in the launch of the Library App*/
    public void libraryApp(View view) {
        Toast.makeText(this, toastTextForBtn + "Library app!", Toast.LENGTH_LONG).show();
    }

    /*This is used in the launch of the Build it Bigger App*/
    public void buildItBiggerApp(View view) {
        Toast.makeText(this, toastTextForBtn + "Build It Bigger app!", Toast.LENGTH_LONG).show();
    }

    /*This is used in the launch of the XYZ Reader App*/
    public void xyzReaderApp(View view) {
        Toast.makeText(this, toastTextForBtn + "XYZ Reader app!", Toast.LENGTH_LONG).show();
    }

    /*This is used in the launch of the Capstone - My App*/
    public void capstoneApp(View view) {
        Toast.makeText(this, toastTextForBtn + "capstone app!", Toast.LENGTH_LONG).show();
    }
}
