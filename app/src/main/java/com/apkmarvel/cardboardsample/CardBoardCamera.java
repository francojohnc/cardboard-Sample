package com.apkmarvel.cardboardsample;

import android.os.Bundle;
import android.util.Log;

import com.google.vrtoolkit.cardboard.CardboardActivity;
import com.google.vrtoolkit.cardboard.CardboardView;

public class CardBoardCamera extends CardboardActivity {
    public static final String TAG = ViewRenderer.class.getSimpleName();
    private CardboardView cardboardView;
    /*hud*/ 
    private CardboardHUD cardboardHUD;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardboard_camera);
        cardboardView = (CardboardView) findViewById(R.id.cardboard_view);
        cardboardView.setRenderer(new ViewRenderer());
        setCardboardView(cardboardView);
        cast();
    }
    private void cast() {
        cardboardHUD = (CardboardHUD) findViewById(R.id.hud);
        cardboardHUD.show3DToast("HUD created");
    }
    @Override
    public void onCardboardTrigger() {
        Log.e(TAG,"onCardboardTrigger");
        cardboardHUD.show3DToast("Pull the magnet when you find an object.");
    }

}
