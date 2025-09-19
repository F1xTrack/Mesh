package com.reactnativecommunity.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import p000.ClipboardManagerOnPrimaryClipChangedListenerC4081ft;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = ClipboardModule.NAME)
/* loaded from: classes2.dex */
public class ClipboardModule extends NativeClipboardModuleSpec {
    public static final String CLIPBOARD_TEXT_CHANGED = "RNCClipboard_TEXT_CHANGED";
    public static final String MIMETYPE_HEIC = "image/heic";
    public static final String MIMETYPE_HEIF = "image/heif";
    public static final String MIMETYPE_JPEG = "image/jpeg";
    public static final String MIMETYPE_JPG = "image/jpg";
    public static final String MIMETYPE_PNG = "image/png";
    public static final String MIMETYPE_WEBP = "image/webp";
    public static final String NAME = "RNCClipboard";
    private ClipboardManager.OnPrimaryClipChangedListener listener;
    private ReactApplicationContext reactContext;

    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.listener = null;
        this.reactContext = reactApplicationContext;
    }

    private ClipboardManager getClipboardService() {
        return (ClipboardManager) this.reactContext.getSystemService("clipboard");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @ReactMethod
    public void addListener(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getImage(com.facebook.react.bridge.Promise r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.clipboard.ClipboardModule.getImage(com.facebook.react.bridge.Promise):void");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void getImageJPG(Promise promise) {
        promise.reject("Clipboard:getImageJPG", "getImageJPG is not supported on Android");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void getImagePNG(Promise promise) {
        promise.reject("Clipboard:getImagePNG", "getImagePNG is not supported on Android");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                promise.resolve("");
            } else {
                promise.resolve("" + ((Object) primaryClip.getItemAt(0).getText()));
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void getStrings(Promise promise) {
        promise.reject("Clipboard:getStrings", "getStrings is not supported on Android");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void hasImage(Promise promise) {
        promise.reject("Clipboard:hasImage", "hasImage is not supported on Android");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void hasNumber(Promise promise) {
        promise.reject("Clipboard:hasNumber", "hasNumber is not supported on Android");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void hasString(com.facebook.react.bridge.Promise r3) {
        /*
            r2 = this;
            android.content.ClipboardManager r0 = r2.getClipboardService()     // Catch: java.lang.Exception -> L12
            android.content.ClipData r0 = r0.getPrimaryClip()     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L14
            int r0 = r0.getItemCount()     // Catch: java.lang.Exception -> L12
            r1 = 1
            if (r0 < r1) goto L14
            goto L15
        L12:
            r0 = move-exception
            goto L1d
        L14:
            r1 = 0
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L12
            r3.resolve(r0)     // Catch: java.lang.Exception -> L12
            goto L20
        L1d:
            r3.reject(r0)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.clipboard.ClipboardModule.hasString(com.facebook.react.bridge.Promise):void");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void hasURL(Promise promise) {
        promise.reject("Clipboard:hasURL", "hasURL is not supported on Android");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void hasWebURL(Promise promise) {
        promise.reject("Clipboard:hasWebURL", "hasWebURL is not supported on Android");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @ReactMethod
    public void removeListener() {
        if (this.listener != null) {
            try {
                getClipboardService().removePrimaryClipChangedListener(this.listener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void setImage(String str, Promise promise) {
        promise.reject("Clipboard:setImage", "setImage is not supported on Android");
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @ReactMethod
    public void setListener() {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipboardManagerOnPrimaryClipChangedListenerC4081ft clipboardManagerOnPrimaryClipChangedListenerC4081ft = new ClipboardManagerOnPrimaryClipChangedListenerC4081ft(this);
            this.listener = clipboardManagerOnPrimaryClipChangedListenerC4081ft;
            clipboardService.addPrimaryClipChangedListener(clipboardManagerOnPrimaryClipChangedListenerC4081ft);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    @ReactMethod
    public void setString(String str) {
        try {
            getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.reactnativecommunity.clipboard.NativeClipboardModuleSpec
    public void setStrings(ReadableArray readableArray) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
