// package cordova.plugin.mathcalculator;
package cordova.plugin.mathcalculator.MathCalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MathCalculator extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        callbackContext.success();

        return true;
    }

    private void add(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try {
                callback.success("" + 10);
            } catch(Exception ex) {
                callback.error("Something went wrong " + ex);
            }
        } else {
            callback.error("Please don't pass null value");
        }
    }

    private void substract(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                callback.success("" + (p1 * p2));
            } catch(Exception ex) {
                callback.error("Something went wrong " + ex);
            }
        } else {
            callback.error("Please don't pass null value");
        }
    }
}
