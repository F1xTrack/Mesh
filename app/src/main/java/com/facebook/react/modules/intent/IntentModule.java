package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p000.AbstractC10485o90;
import p000.AbstractC7222ym;
import p000.C10357n90;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = NativeIntentAndroidSpec.NAME)
/* loaded from: classes.dex */
public class IntentModule extends NativeIntentAndroidSpec {
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    private LifecycleEventListener mInitialURLListener;

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mInitialURLListener = null;
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        Activity currentActivity = getCurrentActivity();
        String packageName = getReactApplicationContext().getPackageName();
        ComponentName componentNameResolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
        String packageName2 = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : "";
        if (bool.booleanValue() || currentActivity == null || !packageName.equals(packageName2)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private void waitForActivityAndGetInitialURL(Promise promise) {
        if (this.mInitialURLListener != null) {
            promise.reject(new IllegalStateException("Cannot await activity from more than one call to getInitialURL"));
        } else {
            this.mInitialURLListener = new C10357n90(this, promise);
            getReactApplicationContext().addLifecycleEventListener(this.mInitialURLListener);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Invalid URL: ", str)));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
        } catch (Exception e) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Could not check if URL '", str, "' can be opened: ");
            sbM26240q.append(e.getMessage());
            promise.reject(new JSApplicationIllegalArgumentException(sbM26240q.toString()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            promise.resolve((data == null || !("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) ? null : data.toString());
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        if (this.mInitialURLListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mInitialURLListener);
            this.mInitialURLListener = null;
        }
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Invalid URL: ", str)));
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), Boolean.FALSE);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Could not open URL '", str, "': ");
            sbM26240q.append(e.getMessage());
            promise.reject(new JSApplicationIllegalArgumentException(sbM26240q.toString()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException(AbstractC7222ym.m26234k("Invalid Action: ", str, ".")));
            return;
        }
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
            promise.reject(new JSApplicationIllegalArgumentException(AbstractC7222ym.m26234k("Could not launch Intent with action ", str, ".")));
            return;
        }
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                String string = map.getString("key");
                int i2 = AbstractC10485o90.f38833a[map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal()];
                if (i2 == 1) {
                    intent.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                } else if (i2 == 2) {
                    intent.putExtra(string, Double.valueOf(map.getDouble(EXTRA_MAP_KEY_FOR_VALUE)));
                } else {
                    if (i2 != 3) {
                        promise.reject(new JSApplicationIllegalArgumentException(AbstractC7222ym.m26234k("Extra type for ", string, " not supported.")));
                        return;
                    }
                    intent.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                }
            }
        }
        sendOSIntent(intent, Boolean.TRUE);
    }
}
