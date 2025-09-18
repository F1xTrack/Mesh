package defpackage;

import android.os.AsyncTask;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.microsoft.codepush.react.CodePushNativeModule;

/* renamed from: au */
/* loaded from: classes2.dex */
public final class AsyncTaskC2220au extends AsyncTask {
    public final /* synthetic */ ReadableMap a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Promise d;
    public final /* synthetic */ CodePushNativeModule e;

    public AsyncTaskC2220au(CodePushNativeModule codePushNativeModule, ReadableMap readableMap, int i, int i2, Promise promise) {
        this.e = codePushNativeModule;
        this.a = readableMap;
        this.b = i;
        this.c = i2;
        this.d = promise;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        String string;
        Promise promise = this.d;
        ReadableMap readableMap = this.a;
        CodePushNativeModule codePushNativeModule = this.e;
        try {
            codePushNativeModule.mUpdateManager.e(AbstractC2522cT1.e(readableMap), codePushNativeModule.mSettingsManager.c(null));
            try {
                string = readableMap.getString("packageHash");
            } catch (NoSuchKeyException unused) {
                string = null;
            }
        } catch (C3286cu e) {
            promise.reject(e);
        }
        if (string == null) {
            throw new C3286cu("Update package to be installed has no hash.");
        }
        codePushNativeModule.mSettingsManager.e(string, false);
        int i = this.b;
        if (i == 2 || i == 0 || i == 3) {
            codePushNativeModule.mMinimumBackgroundDuration = this.c;
            if (codePushNativeModule.mLifecycleEventListener == null) {
                codePushNativeModule.mLifecycleEventListener = new C2026Zt(this);
                codePushNativeModule.getReactApplicationContext().addLifecycleEventListener(codePushNativeModule.mLifecycleEventListener);
            }
        }
        promise.resolve("");
        return null;
    }
}
