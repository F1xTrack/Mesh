package com.killserver.screenshotprev;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import p000.OI0;
import p000.RunnableC1251Tt;
import p000.RunnableC1483XZ;

/* loaded from: classes2.dex */
public class RNScreenshotPreventModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private RelativeLayout overlayLayout;
    private final ReactApplicationContext reactContext;
    private boolean secureFlagWasSet;

    public RNScreenshotPreventModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private void createOverlay(Activity activity, String str) {
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        this.overlayLayout = relativeLayout;
        relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        ImageView imageView = new ImageView(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        imageView.setLayoutParams(layoutParams);
        Bitmap bitmapDecodeImageUrl = decodeImageUrl(str);
        if (bitmapDecodeImageUrl != null) {
            imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmapDecodeImageUrl, activity.getResources().getDisplayMetrics().widthPixels, (int) ((activity.getResources().getDisplayMetrics().widthPixels / bitmapDecodeImageUrl.getWidth()) * bitmapDecodeImageUrl.getHeight()), true));
        }
        this.overlayLayout.addView(imageView);
    }

    private Bitmap decodeImageUrl(String str) {
        try {
            return BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @ReactMethod
    public void disableSecureView() {
        Activity currentActivity;
        if (!this.reactContext.hasCurrentActivity() || (currentActivity = this.reactContext.getCurrentActivity()) == null) {
            return;
        }
        currentActivity.runOnUiThread(new OI0(this, currentActivity, 0));
    }

    @ReactMethod
    public void enableSecureView(String str) {
        Activity currentActivity;
        if (!this.reactContext.hasCurrentActivity() || (currentActivity = this.reactContext.getCurrentActivity()) == null) {
            return;
        }
        if (this.overlayLayout == null) {
            createOverlay(currentActivity, str);
        }
        currentActivity.runOnUiThread(new RunnableC1251Tt(currentActivity, 3));
    }

    @ReactMethod
    public void enabled(boolean z) {
        Activity currentActivity;
        if (!this.reactContext.hasCurrentActivity() || (currentActivity = this.reactContext.getCurrentActivity()) == null) {
            return;
        }
        if (z) {
            currentActivity.runOnUiThread(new RunnableC1251Tt(currentActivity, 1));
        } else {
            currentActivity.runOnUiThread(new RunnableC1251Tt(currentActivity, 2));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNScreenshotPrevent";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || this.overlayLayout == null) {
            return;
        }
        currentActivity.runOnUiThread(new OI0(this, currentActivity, 1));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || this.overlayLayout == null) {
            return;
        }
        currentActivity.runOnUiThread(new RunnableC1483XZ(this, currentActivity, false, 14));
    }
}
