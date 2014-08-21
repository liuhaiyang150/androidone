package com.sd.one.activity.collection;

import android.os.Bundle;
import android.view.KeyEvent;

import com.sd.one.R;
import com.sd.one.activity.BaseActivity;

/**   
 * [A brief description]
 * @author: devin.hu
 * @version: 1.0
 * @date:   Nov 28, 2013    
 */
public class CollectionActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.collection_layout);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		return getParent().onKeyDown(keyCode, event);
	}
}