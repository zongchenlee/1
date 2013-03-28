package activity;

import software.mlee.rev1.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Main extends Activity {
	private ImageView m_CImgView1;
	private ImageView m_CImgView2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		m_CImgView1 = (ImageView)findViewById(R.id.main_image1);
		m_CImgView2 = (ImageView)findViewById(R.id.main_image2);
		
		Animation img1Animation = AnimationUtils.loadAnimation(Main.this, R.anim.main_img_animation);
		m_CImgView1.startAnimation(img1Animation);
		m_CImgView2.startAnimation(img1Animation);
		
		m_CImgView1.setOnClickListener(new ViewClickListener());
		m_CImgView2.setOnClickListener(new ViewClickListener());
		
	}
	
	class ViewClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			
			if (v.equals(m_CImgView1)) {
				Intent intent = new Intent(Main.this, Activity_02.class);
				startActivity(intent);
			}
			else if (v.equals(m_CImgView2)) {
				
			}
			
		}
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_01, menu);
		return true;
	}
 
}
