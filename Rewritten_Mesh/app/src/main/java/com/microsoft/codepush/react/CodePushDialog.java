package com.microsoft.codepush.react;

import android.app.Activity;
import android.app.AlertDialog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p000.C1063Qt;
import p000.DialogInterfaceOnClickListenerC0925Oh;

/* loaded from: classes2.dex */
public class CodePushDialog extends ReactContextBaseJavaModule {
    public CodePushDialog(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialogInternal(String str, String str2, String str3, String str4, Callback callback, Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        DialogInterfaceOnClickListenerC0925Oh dialogInterfaceOnClickListenerC0925Oh = new DialogInterfaceOnClickListenerC0925Oh(1, callback);
        if (str != null) {
            builder.setTitle(str);
        }
        if (str2 != null) {
            builder.setMessage(str2);
        }
        if (str3 != null) {
            builder.setPositiveButton(str3, dialogInterfaceOnClickListenerC0925Oh);
        }
        if (str4 != null) {
            builder.setNegativeButton(str4, dialogInterfaceOnClickListenerC0925Oh);
        }
        builder.create().show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CodePushDialog";
    }

    @ReactMethod
    public void showDialog(String str, String str2, String str3, String str4, Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            getReactApplicationContext().addLifecycleEventListener(new C1063Qt(this, str, str2, str3, str4, callback));
        } else {
            showDialogInternal(str, str2, str3, str4, callback, currentActivity);
        }
    }
}
