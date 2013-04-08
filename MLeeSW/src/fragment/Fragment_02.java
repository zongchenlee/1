package fragment;

import software.mlee.rev1.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_02 extends Fragment {
	private TextView  m_CTextView;
	
	private ImageView m_CImgView1;
	private ImageView m_CImgView2;
	private ImageView m_CImgView3;
	private ImageView m_CImgView4;
	private ImageView m_CImgView5;
	private ImageView m_CImgView6;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_02, null, true);
		m_CTextView = (TextView)view.findViewById(R.id.main_textview);
		
		m_CImgView1 = (ImageView)view.findViewById(R.id.main_image1);
		m_CImgView2 = (ImageView)view.findViewById(R.id.main_image2);
		m_CImgView3 = (ImageView)view.findViewById(R.id.main_image3);
		m_CImgView4 = (ImageView)view.findViewById(R.id.main_image4);
		m_CImgView5 = (ImageView)view.findViewById(R.id.main_image5);
		m_CImgView6 = (ImageView)view.findViewById(R.id.main_image6);
		/*
		Animation alphaAnim 	= AnimationUtils.loadAnimation(Fragment_02.this, R.anim.main_img_alpha);
		Animation scaleAnim 	= AnimationUtils.loadAnimation(Main.this, R.anim.main_img_scale);
		Animation tranlateAnim 	= new TranslateAnimation	(Animation.RELATIVE_TO_SELF, 0f,Animation.RELATIVE_TO_SELF, 0f,
															 Animation.RELATIVE_TO_PARENT, 1f, Animation.RELATIVE_TO_PARENT, 0f);
		tranlateAnim.setDuration(3000);
		
		m_CTextView.startAnimation(scaleAnim);
		
		m_CImgView1.startAnimation(scaleAnim);
		m_CImgView2.startAnimation(scaleAnim);
		m_CImgView3.startAnimation(alphaAnim);
		m_CImgView4.startAnimation(alphaAnim);
		m_CImgView5.startAnimation(tranlateAnim);
		m_CImgView6.startAnimation(tranlateAnim);
		
		m_CImgView1.setOnClickListener(new ViewClickListener());
		m_CImgView2.setOnClickListener(new ViewClickListener());
		m_CImgView3.setOnClickListener(new ViewClickListener());
		m_CImgView4.setOnClickListener(new ViewClickListener());
		m_CImgView5.setOnClickListener(new ViewClickListener());
		m_CImgView6.setOnClickListener(new ViewClickListener());
		*/
		return view;
	}
	
	class ViewClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			
			if (v.equals(m_CImgView1)) {
//				Intent intent = new Intent(Main.this, Fragment_Activity.class);
//				startActivity(intent);
			}
			else if (v.equals(m_CImgView2)) {
				Animation rotateAnim = new RotateAnimation(0, 720,Animation.RELATIVE_TO_SELF, 0.5f,
						   											Animation.RELATIVE_TO_SELF, 0.5f);
				rotateAnim.setDuration(1500);
				rotateAnim.setInterpolator(new AccelerateDecelerateInterpolator());
				m_CImgView2.startAnimation(rotateAnim);
			}
			else if (v.equals(m_CImgView3)) {
//				Intent intent = new Intent(Main.this, MediaPlayerActivity.class);
//				startActivity(intent);
			}
			else if (v.equals(m_CImgView4)) {
				Animation rotateAnim = new RotateAnimation(360, 0, Animation.RELATIVE_TO_SELF, 1f,
																   Animation.RELATIVE_TO_SELF, 0f);
				rotateAnim.setDuration(1500);
				m_CImgView4.startAnimation(rotateAnim);
			}
			else if (v.equals(m_CImgView5)) {
				AlphaAnimation alphaAnimation = new AlphaAnimation((float) 0.5, 1);
				alphaAnimation.setDuration(4000);
				alphaAnimation.setInterpolator(new BounceInterpolator());
				m_CImgView5.startAnimation(alphaAnimation);
			}
			else if (v.equals(m_CImgView6)) {
				AnimationSet aSet = new AnimationSet(true);
				ScaleAnimation scaleAnimation = new ScaleAnimation(0f, 1f, 0f, 1f, 
																	Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF, 
																	Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF);
				scaleAnimation.setDuration(3000);
				Animation traslateAnimation = new TranslateAnimation
						(Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0f, 
								Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0f);
				traslateAnimation.setDuration(3000);
				aSet.addAnimation(traslateAnimation);
				aSet.addAnimation(scaleAnimation);
				m_CImgView6.startAnimation(aSet);
			}
		}
	}
	
	class AnimListener implements AnimationListener{

		@Override
		public void onAnimationEnd(Animation animation) {
			
		}

		@Override
		public void onAnimationRepeat(Animation animation) {
			
		}

		@Override
		public void onAnimationStart(Animation animation) {
			
		}
		
	}

}
