package activity;

import java.io.IOException;
import software.mlee.rev1.R;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Environment;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;

public class MediaPlayerActivity extends Activity implements SurfaceHolder.Callback,OnCompletionListener,OnPreparedListener{
	private SurfaceView 	m_CSurfaceView;
	private SurfaceHolder 	m_CSurfaceHolder;
	private MediaPlayer     m_CMediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mediaplayer);
	
		m_CSurfaceView 		=	(SurfaceView)findViewById(R.id.surfaceView);
		m_CSurfaceHolder 	=	 m_CSurfaceView.getHolder();
		m_CSurfaceHolder.addCallback(this);
		
		m_CMediaPlayer 	= new MediaPlayer();
		m_CMediaPlayer.setOnPreparedListener(this);
		m_CMediaPlayer.setOnCompletionListener(this);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,int height) {
		System.out.println("surfaceChanged");
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		System.out.println("surfaceCreated");
		
		try 
		{
			String fileDir = Environment.getExternalStorageDirectory()+"/2V2.mp4";
			m_CMediaPlayer.setDataSource(fileDir);
			m_CMediaPlayer.prepare();
		} 
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		} 
		catch (SecurityException e) {
			e.printStackTrace();
		} 
		catch (IllegalStateException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		System.out.println("surfaceCreated");
	}

	@Override
	public void onPrepared(MediaPlayer mp) {
		m_CMediaPlayer.start();
	}

	@Override
	public void onCompletion(MediaPlayer mp) {
		m_CMediaPlayer.release();
		MediaPlayerActivity.this.finish();
	}

	@Override
	protected void onStop() {
		super.onStop();
		m_CMediaPlayer.release();
	}
	
	

}
