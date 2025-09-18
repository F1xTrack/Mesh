package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1730l;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC3929dS;
import p000.C0524IJ;
import p000.InterfaceC9101dL0;
import p000.RunnableC1192Sx;

@InterfaceC9101dL0(name = NativeDialogManagerAndroidSpec.NAME)
/* loaded from: classes.dex */
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final Map<String, Object> CONSTANTS;
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    private boolean mIsInForeground;

    static {
        HashMap map = new HashMap();
        map.put(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED);
        map.put(ACTION_DISMISSED, ACTION_DISMISSED);
        map.put(KEY_BUTTON_POSITIVE, -1);
        map.put(KEY_BUTTON_NEGATIVE, -2);
        map.put(KEY_BUTTON_NEUTRAL, -3);
        CONSTANTS = map;
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private C0524IJ getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof AbstractActivityC1730l)) {
            return null;
        }
        return new C0524IJ(this, ((AbstractActivityC1730l) currentActivity).m10034e());
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        C0524IJ fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            AbstractC3929dS.m17681n(DialogModule.class);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        SoftAssertions.assertCondition(fragmentManagerHelper.f4891c.mIsInForeground, "showPendingAlert() called in background");
        if (fragmentManagerHelper.f4890b == null) {
            return;
        }
        fragmentManagerHelper.m3813a();
        fragmentManagerHelper.f4890b.show(fragmentManagerHelper.f4889a, FRAGMENT_TAG);
        fragmentManagerHelper.f4890b = null;
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        C0524IJ fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new RunnableC1192Sx(fragmentManagerHelper, bundle, callback2, 1));
    }
}
