package com.vinzscam.reactnativefileviewer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.io.File;
import p000.AbstractC0345FT;
import p000.C11905zH0;

/* loaded from: classes2.dex */
public class RNFileViewerModule extends ReactContextBaseJavaModule {
    private static final String DISMISS_EVENT = "RNFileViewerDidDismiss";
    private static final String OPEN_EVENT = "RNFileViewerDidOpen";
    private static final Integer RN_FILE_VIEWER_REQUEST = 33341;
    private static final String SHOW_OPEN_WITH_DIALOG = "showOpenWithDialog";
    private static final String SHOW_STORE_SUGGESTIONS = "showAppsSuggestions";
    private final ActivityEventListener mActivityEventListener;
    private final ReactApplicationContext reactContext;

    public RNFileViewerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C11905zH0 c11905zH0 = new C11905zH0(this, 1);
        this.mActivityEventListener = c11905zH0;
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(c11905zH0);
    }

    public void sendEvent(String str, Integer num, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, num.intValue());
        if (str2 != null) {
            writableMapCreateMap.putString("error", str2);
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMapCreateMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFileViewer";
    }

    @ReactMethod
    public void open(String str, Integer num, ReadableMap readableMap) throws Exception {
        Uri uriM2663d;
        boolean z = readableMap.hasKey(SHOW_OPEN_WITH_DIALOG) ? readableMap.getBoolean(SHOW_OPEN_WITH_DIALOG) : false;
        boolean z2 = readableMap.hasKey(SHOW_STORE_SUGGESTIONS) ? readableMap.getBoolean(SHOW_STORE_SUGGESTIONS) : false;
        if (str.startsWith("content://")) {
            uriM2663d = Uri.parse(str);
        } else {
            File file = new File(str);
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                sendEvent(OPEN_EVENT, num, "Activity doesn't exist");
                return;
            }
            try {
                uriM2663d = AbstractC0345FT.m2663d(currentActivity, currentActivity.getPackageName() + ".provider", file);
            } catch (IllegalArgumentException e) {
                sendEvent(OPEN_EVENT, num, e.getMessage());
                return;
            }
        }
        if (uriM2663d == null) {
            sendEvent(OPEN_EVENT, num, "Invalid file");
            return;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.setDataAndType(uriM2663d, mimeTypeFromExtension);
        intent.putExtra("android.intent.extra.STREAM", uriM2663d);
        Intent intentCreateChooser = z ? Intent.createChooser(intent, "Open with") : intent;
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            try {
                getCurrentActivity().startActivityForResult(intentCreateChooser, num.intValue() + RN_FILE_VIEWER_REQUEST.intValue());
                sendEvent(OPEN_EVENT, num, null);
                return;
            } catch (Exception e2) {
                sendEvent(OPEN_EVENT, num, e2.getMessage());
                return;
            }
        }
        try {
            if (z2) {
                if (mimeTypeFromExtension == null) {
                    throw new Exception("It wasn't possible to detect the type of the file");
                }
                getCurrentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=" + mimeTypeFromExtension + "&c=apps")));
            }
            throw new Exception("No app associated with this mime type");
        } catch (Exception e3) {
            sendEvent(OPEN_EVENT, num, e3.getMessage());
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
