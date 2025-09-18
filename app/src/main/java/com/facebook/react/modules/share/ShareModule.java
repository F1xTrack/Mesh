package com.facebook.react.modules.share;

import android.app.Activity;
import android.content.Intent;
import com.facebook.fbreact.specs.NativeShareModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import p000.C9952k01;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = NativeShareModuleSpec.NAME)
@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m22267d2 = {"Lcom/facebook/react/modules/share/ShareModule;", "Lcom/facebook/fbreact/specs/NativeShareModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableMap;", RemoteMessageConst.Notification.CONTENT, "", "dialogTitle", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "share", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Companion", "k01", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ShareModule extends NativeShareModuleSpec {
    private static final String ACTION_SHARED = "sharedAction";
    public static final C9952k01 Companion = new C9952k01();
    public static final String ERROR_INVALID_CONTENT = "E_INVALID_CONTENT";
    private static final String ERROR_UNABLE_TO_OPEN_DIALOG = "E_UNABLE_TO_OPEN_DIALOG";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    @Override // com.facebook.fbreact.specs.NativeShareModuleSpec
    public void share(ReadableMap content, String dialogTitle, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (content == null) {
            promise.reject(ERROR_INVALID_CONTENT, "Content cannot be null");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setTypeAndNormalize("text/plain");
            if (content.hasKey("title")) {
                intent.putExtra("android.intent.extra.SUBJECT", content.getString("title"));
            }
            if (content.hasKey("message")) {
                intent.putExtra("android.intent.extra.TEXT", content.getString("message"));
            }
            Intent intentCreateChooser = Intent.createChooser(intent, dialogTitle);
            intentCreateChooser.addCategory("android.intent.category.DEFAULT");
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intentCreateChooser);
            } else {
                getReactApplicationContext().startActivity(intentCreateChooser);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(NotificationConstants.ACTION, ACTION_SHARED);
            promise.resolve(writableMapCreateMap);
        } catch (Exception unused) {
            promise.reject(ERROR_UNABLE_TO_OPEN_DIALOG, "Failed to open share dialog");
        }
    }
}
