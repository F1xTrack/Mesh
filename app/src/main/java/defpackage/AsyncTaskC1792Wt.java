package defpackage;

import android.os.AsyncTask;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.microsoft.codepush.react.CodePushNativeModule;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: Wt */
/* loaded from: classes2.dex */
public final class AsyncTaskC1792Wt extends AsyncTask {
    public final /* synthetic */ ReadableMap a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Promise c;
    public final /* synthetic */ CodePushNativeModule d;

    public AsyncTaskC1792Wt(CodePushNativeModule codePushNativeModule, ReadableMap readableMap, boolean z, Promise promise) {
        this.d = codePushNativeModule;
        this.a = readableMap;
        this.b = z;
        this.c = promise;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String string;
        JSONObject jSONObjectF;
        Promise promise = this.c;
        ReadableMap readableMap = this.a;
        CodePushNativeModule codePushNativeModule = this.d;
        try {
            try {
                JSONObject jSONObjectE = AbstractC2522cT1.e(readableMap);
                AbstractC2522cT1.i("binaryModifiedTime", "" + codePushNativeModule.mCodePush.b(), jSONObjectE);
                C3476du c3476du = codePushNativeModule.mUpdateManager;
                String str = codePushNativeModule.mCodePush.b;
                C1714Vt c1714Vt = new C1714Vt(this);
                codePushNativeModule.mCodePush.getClass();
                c3476du.a(jSONObjectE, str, c1714Vt, C1246Pt.l);
                C3476du c3476du2 = codePushNativeModule.mUpdateManager;
                try {
                    string = readableMap.getString("packageHash");
                } catch (NoSuchKeyException unused) {
                    string = null;
                }
                try {
                    jSONObjectF = AbstractC2522cT1.f(AbstractC2522cT1.a(AbstractC2522cT1.a(AbstractC2522cT1.a(c3476du2.a, "CodePush"), string), "app.json"));
                } catch (IOException unused2) {
                    jSONObjectF = null;
                }
                promise.resolve(AbstractC2522cT1.c(jSONObjectF));
            } catch (C1402Rt e) {
                codePushNativeModule.mSettingsManager.d(AbstractC2522cT1.e(readableMap));
                promise.reject(e);
            } catch (C3286cu e2) {
                e = e2;
                promise.reject(e);
            }
        } catch (IOException e3) {
            e = e3;
            promise.reject(e);
            return null;
        }
        return null;
    }
}
