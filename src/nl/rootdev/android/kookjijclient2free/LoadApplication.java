package nl.rootdev.android.kookjijclient2free;

import nl.rootdev.android.kookjijcore.Main;
import nl.rootdev.android.kookjijcore.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class LoadApplication extends SherlockFragmentActivity {
	private Handler _handler;
	
	private Runnable runnable = new Runnable() {		
		@Override
		public void run() {
			Intent intent = new Intent(LoadApplication.this, Main.class);
			startActivity(intent);	
			finish();
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.load_app);
		
		_handler = new Handler();
		_handler.postDelayed(runnable, 1000L);
	}
}
