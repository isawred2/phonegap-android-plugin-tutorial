package com.phonegap.toast;

import org.json.JSONArray;
import org.json.JSONException;

import android.widget.Toast;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

public class Tutorial extends Plugin {

	@Override
	public PluginResult execute(String cmd, JSONArray args, String callback) {
		if(cmd.equals("toast"))
		{
			return showToast(args);
		}
		return null;
	}

	private PluginResult showToast(JSONArray args) {
		String message;
		try {
			message = args.getString(0);
			Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
			return new PluginResult(PluginResult.Status.OK);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
		}		
	}	
	
}
