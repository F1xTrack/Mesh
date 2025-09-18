package p000;

import android.os.AsyncTask;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.microsoft.codepush.react.CodePushNativeModule;

/* renamed from: au */
/* loaded from: classes2.dex */
public final class AsyncTaskC1751au extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ ReadableMap f16648a;

    /* renamed from: b */
    public final /* synthetic */ int f16649b;

    /* renamed from: c */
    public final /* synthetic */ int f16650c;

    /* renamed from: d */
    public final /* synthetic */ Promise f16651d;

    /* renamed from: e */
    public final /* synthetic */ CodePushNativeModule f16652e;

    public AsyncTaskC1751au(CodePushNativeModule codePushNativeModule, ReadableMap readableMap, int i, int i2, Promise promise) {
        this.f16652e = codePushNativeModule;
        this.f16648a = readableMap;
        this.f16649b = i;
        this.f16650c = i2;
        this.f16651d = promise;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        String string;
        Promise promise = this.f16651d;
        ReadableMap readableMap = this.f16648a;
        CodePushNativeModule codePushNativeModule = this.f16652e;
        try {
            codePushNativeModule.mUpdateManager.m17773e(AbstractC8985cT1.m10708e(readableMap), codePushNativeModule.mSettingsManager.m3501c(null));
            try {
                string = readableMap.getString("packageHash");
            } catch (NoSuchKeyException unused) {
                string = null;
            }
        } catch (C3894cu e) {
            promise.reject(e);
        }
        if (string == null) {
            throw new C3894cu("Update package to be installed has no hash.");
        }
        codePushNativeModule.mSettingsManager.m3503e(string, false);
        int i = this.f16649b;
        if (i == 2 || i == 0 || i == 3) {
            codePushNativeModule.mMinimumBackgroundDuration = this.f16650c;
            if (codePushNativeModule.mLifecycleEventListener == null) {
                codePushNativeModule.mLifecycleEventListener = new C1629Zt(this);
                codePushNativeModule.getReactApplicationContext().addLifecycleEventListener(codePushNativeModule.mLifecycleEventListener);
            }
        }
        promise.resolve("");
        return null;
    }
}
