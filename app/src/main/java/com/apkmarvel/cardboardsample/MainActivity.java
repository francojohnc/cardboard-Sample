package com.apkmarvel.cardboardsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.vrtoolkit.cardboard.CardboardActivity;
import com.google.vrtoolkit.cardboard.CardboardView;
import com.google.vrtoolkit.cardboard.Eye;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.google.vrtoolkit.cardboard.Viewport;

import javax.microedition.khronos.egl.EGLConfig;

public class MainActivity extends CardboardActivity implements CardboardView.StereoRenderer {
private static final String TAG = MainActivity.class.getSimpleName();
private CardboardOverlayView overlayView;
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardboardView cardboardView = (CardboardView) findViewById(R.id.cardboard_view);
        cardboardView.setRestoreGLStateEnabled(false);
        cardboardView.setRenderer(this);
        setCardboardView(cardboardView);

        overlayView = (CardboardOverlayView) findViewById(R.id.overlay);
        overlayView.show3DToast("Pull the magnet when you find an object.");
        }

@Override
public void onPause() {
        super.onPause();
        }


@Override
public void onSurfaceChanged(int width, int height) {
        Log.e(TAG, "onSurfaceChanged");
        }

@Override
public void onSurfaceCreated(EGLConfig eglConfig) {

        }

@Override
public void onRendererShutdown() {
        Log.e(TAG,"onRendererShutdown");
        }


@Override
public void onNewFrame(HeadTransform headTransform) {

        }

@Override
public void onDrawEye(Eye eye) {

        }
@Override
public void onFinishFrame(Viewport viewport) {
        Log.e(TAG,"onFinishFrame");
        }

/**
 * Called when the Cardboard trigger is pulled.
 */
@Override
public void onCardboardTrigger() {
        Log.e(TAG,"onCardboardTrigger");
        }

        }
