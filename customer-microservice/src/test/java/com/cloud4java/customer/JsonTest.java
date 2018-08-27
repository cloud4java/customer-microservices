package com.cloud4java.customer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) throws JSONException {

		String str = "{\"elenco\":[\"Json Leigh\", \"Mary Stylesheet\", \"David Markupovny\"]}";
		JSONObject json = new JSONObject(str);
		Object object = (JSONArray) json.get("elenco");
		System.out.println(json.get("elenco"));
	}
}
