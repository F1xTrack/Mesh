package p000;

import android.os.AsyncTask;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.microsoft.codepush.react.CodePushNativeModule;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: Wt */
/* loaded from: classes2.dex */
public final class AsyncTaskC1440Wt extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ ReadableMap f13435a;

    /* renamed from: b */
    public final /* synthetic */ boolean f13436b;

    /* renamed from: c */
    public final /* synthetic */ Promise f13437c;

    /* renamed from: d */
    public final /* synthetic */ CodePushNativeModule f13438d;

    public AsyncTaskC1440Wt(CodePushNativeModule codePushNativeModule, ReadableMap readableMap, boolean z, Promise promise) {
        this.f13438d = codePushNativeModule;
        this.f13435a = readableMap;
        this.f13436b = z;
        this.f13437c = promise;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String string;
        JSONObject jSONObjectM10709f;
        Promise promise = this.f13437c;
        ReadableMap readableMap = this.f13435a;
        CodePushNativeModule codePushNativeModule = this.f13438d;
        try {
            try {
                JSONObject jSONObjectM10708e = AbstractC8985cT1.m10708e(readableMap);
                AbstractC8985cT1.m10712i("binaryModifiedTime", "" + codePushNativeModule.mCodePush.m6465b(), jSONObjectM10708e);
                C3956du c3956du = codePushNativeModule.mUpdateManager;
                String str = codePushNativeModule.mCodePush.f9330b;
                C1377Vt c1377Vt = new C1377Vt(this);
                codePushNativeModule.mCodePush.getClass();
                c3956du.m17769a(jSONObjectM10708e, str, c1377Vt, C1000Pt.f9327l);
                C3956du c3956du2 = codePushNativeModule.mUpdateManager;
                try {
                    string = readableMap.getString("packageHash");
                } catch (NoSuchKeyException unused) {
                    string = null;
                }
                try {
                    jSONObjectM10709f = AbstractC8985cT1.m10709f(AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(c3956du2.f26382a, "CodePush"), string), "app.json"));
                } catch (IOException unused2) {
                    jSONObjectM10709f = null;
                }
                promise.resolve(AbstractC8985cT1.m10706c(jSONObjectM10709f));
            } catch (C1125Rt e) {
                codePushNativeModule.mSettingsManager.m3502d(AbstractC8985cT1.m10708e(readableMap));
                promise.reject(e);
            } catch (C3894cu e2) {
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
