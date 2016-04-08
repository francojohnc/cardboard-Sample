package com.apkmarvel.cardboardsample;

import android.os.Bundle;
import android.util.Log;

import com.google.vrtoolkit.cardboard.CardboardActivity;
import com.google.vrtoolkit.cardboard.CardboardView;
import com.google.vrtoolkit.cardboard.Eye;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.google.vrtoolkit.cardboard.Viewport;

import javax.microedition.khronos.egl.EGLConfig;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Camera;
import android.opengl.GLES20;

public class CardBoardCamera extends CardboardActivity {
    public static final String TAG = ViewRederer.class.getSimpleName();
    private CardboardView cardboardView;
    /*hud*/
    private CardboardHUD cardboardHUD;
    /**
     * Sets the view to our CardboardView and initializes the transformation matrices we will use
     * to render our scene.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardboard_camera);
        cardboardView = (CardboardView) findViewById(R.id.cardboard_view);
        cardboardView.setRenderer(new ViewRederer());
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
