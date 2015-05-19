package com.pubnub.api;

import org.json.*;

public class PnJsonObject {
	
	JSONObject jso;
	
	public PnJsonObject() {
		jso = new JSONObject();
	}
	
	public PnJsonObject(String response) throws PnJsonException {
		try {
			this.jso = new JSONObject(response);
		} catch (JSONException e) {
			throw new PnJsonException(e);
		}
	}

	public void put(String key, Object value) throws PnJsonException {
		
	}

	public String getString(String key) throws PnJsonException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(String key) throws PnJsonException {
		try {
			return jso.get(key);
		} catch (org.json.JSONException e) {
			throw new PnJsonException(e);
		}
	}

	public void remove(String key) {
		jso.remove(key);
	}

	public int length() {
		return jso.length();
	}

	public PnJsonObject getJSONObject(String key) throws PnJsonException {
		try {
			return (PnJsonObject) jso.get(key);
		} catch (JSONException e) {
			throw new PnJsonException(e);
		}
	}
}
