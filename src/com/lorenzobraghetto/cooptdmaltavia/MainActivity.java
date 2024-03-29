package com.lorenzobraghetto.cooptdmaltavia;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {

	private Button ok;
	private Button about;
	private Button info;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText user = (EditText) findViewById(R.id.edittext_name);
		user.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				if (s.length() > 0)
					ok.setEnabled(true);
				else
					ok.setEnabled(false);
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
			}
		});

		ok = (Button) findViewById(R.id.button_start);
		ok.setEnabled(false);
		ok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent maps = new Intent(MainActivity.this, MapsActivity.class);
				maps.putExtra("user", user.getText().toString());
				startActivity(maps);
			}
		});

		info = (Button) findViewById(R.id.info);
		info.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
				builder.setTitle(R.string.info)
						.setMessage(R.string.testo_info);
				builder.create().show();
			}
		});

		about = (Button) findViewById(R.id.about);
		about.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PackageInfo pInfo = null;
				try {
					pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
				} catch (NameNotFoundException e) {
					e.printStackTrace();
				}
				String version = pInfo.versionName;
				AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
				builder.setTitle(R.string.about)
						.setMessage(Html.fromHtml(getString(R.string.testo_About) + " " + version));
				builder.create().show();
			}
		});

	}
}
