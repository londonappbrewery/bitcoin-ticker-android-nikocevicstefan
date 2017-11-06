package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by stefan on 06-Nov-17.
 */

public class BitcoinPriceModel {

    private String btcPrice;

    public static BitcoinPriceModel fromJson(JSONObject jsonObject)
    {
      BitcoinPriceModel bitcoinPrice = new BitcoinPriceModel();
        try {
            bitcoinPrice.btcPrice = jsonObject.getJSONObject("averages").getString("day");
            return bitcoinPrice;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getBtcPrice() {
        return btcPrice;
    }
}
