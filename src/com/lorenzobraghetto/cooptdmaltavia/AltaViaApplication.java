package com.lorenzobraghetto.cooptdmaltavia;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.mapsforge.map.android.graphics.AndroidGraphicFactory;

import android.app.Application;
import android.content.res.AssetManager;
import android.util.Log;

public class AltaViaApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		AndroidGraphicFactory.createInstance(this);
		if (!getMapFile().exists())
			copyAssets();
	}

	protected File getMapFile() {
		return new File(getExternalFilesDir(null), this.getMapFileName());
	}

	/**
	 * @return the map file name to be used
	 */
	protected String getMapFileName() {
		return "altaVia.map";
	}

	private void copyAssets() {
		AssetManager assetManager = getAssets();
		String[] files = null;
		try {
			files = assetManager.list("");
		} catch (IOException e) {
			Log.e("tag", "Failed to get asset file list.", e);
		}
		for (String filename : files) {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = assetManager.open(filename);
				File outFile = new File(getExternalFilesDir(null), filename);
				out = new FileOutputStream(outFile);
				copyFile(in, out);
				in.close();
				in = null;
				out.flush();
				out.close();
				out = null;
			} catch (IOException e) {
				Log.e("tag", "Failed to copy asset file: " + filename, e);
			}
		}
	}

	private void copyFile(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1) {
			out.write(buffer, 0, read);
		}
	}
}
