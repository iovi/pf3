package iovi.pf3;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    //FragmentTransaction transaction;

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

        if (id == R.id.action_newgame) {
            FragmentTransaction transaction=getFragmentManager().beginTransaction();
            Fragment topFragment=new PlayerGuessFragment();
            Fragment bottomFragment=new AnswersFragment();
            transaction.add(R.id.topFrame,topFragment);
            transaction.add(R.id.bottomFrame,bottomFragment);
            transaction.commit();
        }

        return super.onOptionsItemSelected(item);
    }
}
