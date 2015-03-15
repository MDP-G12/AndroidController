package mdp.grp12.chenwenjie.androidcontroller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView gridview = (GridView) findViewById(R.id.map);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();

                adapter.setItem(position, "obstacle");
//                adapter.notifyDataSetChanged();
//                gridview.setAdapter(adapter);
//                gridview.invalidateViews();
//                Log.d("Main", Arrays.toString(adapter.map));
            }
        });

//        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
//            // Change the image and state for this item.
//            int nextState;
//            switch(mStates.get(position)) {
//                case WHITE:
//                    nextState = TEAL;
//                    break;
//                case TEAL:
//                    nextState = MAROON;
//                    break;
//                case MAROON:
//                    nextState = WHITE;
//                    break;
//            }
//
//            // Set the new state and image for this item.
//            mStates.put(position, nextState);
//            int resId = mStateResources.get(nextState);
//            image.setImageResource(resId);
//        }
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
}
