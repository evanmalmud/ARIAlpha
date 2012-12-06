package appliedradar.bluetooth.gui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class DisplayArchive extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_archive);
		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setTitle("Data Archive");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_display_archive, menu);

		// // Locate MenuItem with ShareActionProvider
		// MenuItem menuItem = menu.findItem(R.id.menu_item_share);
		//
		// // Fetch and store ShareActionProvider
		// mShareActionProvider = (ShareActionProvider)
		// menuItem.getActionProvider();

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	// // Call to update the share intent
	// private void setShareIntent(Intent shareIntent) {
	// if (mShareActionProvider != null) {
	// mShareActionProvider.setShareIntent(shareIntent);
	// }
	// }
}

//
// // Find the directory for the SD Card using the API
// File sdcard = Environment.getExternalStorageDirectory();
//
// // Get the text file
// File file = new File(sdcard, "simuData.txt");
//
// if (file.exists())
// {
// ArrayList<String> readed = new ArrayList<String>();
//
// try {
// BufferedReader br = new BufferedReader(new FileReader(file));
// String line;
//
// while ((line = br.readLine()) != null) {
// readed.add(line);
//
// }
// }
// catch (IOException e) {
// Log.e("MainActivity", "IOError"); // You'll need to add proper error
// // handling here
// }
// }

/*
 * try { ArrayBuffer<Integer> data = new ArrayBuffer(new FileReader(file)); //
 * BufferedReader br = new BufferedReader(new FileReader(file)); String line;
 * int x = 0;
 * 
 * while ((line = br.readLine()) != null & (x != 4000)) { x = x + 1; int y =
 * Integer.parseInt(line); dataSeries.add(x, y); } br.close(); } catch
 * (IOException e) { Log.e("MainActivity", "IOError"); // You'll need to add
 * proper error // handling here }
 */

