package p000;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.microsoft.codepush.react.CodePushNativeModule;

/* renamed from: Xt */
/* loaded from: classes2.dex */
public final class AsyncTaskC1503Xt extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ Promise f14033a;

    /* renamed from: b */
    public final /* synthetic */ int f14034b;

    /* renamed from: c */
    public final /* synthetic */ CodePushNativeModule f14035c;

    public AsyncTaskC1503Xt(CodePushNativeModule codePushNativeModule, Promise promise, int i) {
        this.f14035c = codePushNativeModule;
        this.f14033a = promise;
        this.f14034b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: cu -> 0x0018, St -> 0x001b, TRY_ENTER, TryCatch #3 {St -> 0x001b, cu -> 0x0018, blocks: (B:3:0x0009, B:5:0x0013, B:10:0x001e, B:12:0x0026, B:15:0x003b, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:27:0x0077, B:28:0x007b, B:24:0x005f, B:25:0x0071, B:29:0x0083, B:31:0x008e, B:32:0x0095), top: B:40:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: cu -> 0x0018, St -> 0x001b, TryCatch #3 {St -> 0x001b, cu -> 0x0018, blocks: (B:3:0x0009, B:5:0x0013, B:10:0x001e, B:12:0x0026, B:15:0x003b, B:17:0x0041, B:19:0x0047, B:21:0x004d, B:27:0x0077, B:28:0x007b, B:24:0x005f, B:25:0x0071, B:29:0x0083, B:31:0x008e, B:32:0x0095), top: B:40:0x0009 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = "packageHash"
            com.microsoft.codepush.react.CodePushNativeModule r0 = r6.f14035c
            com.facebook.react.bridge.Promise r1 = r6.f14033a
            r2 = 0
            du r3 = com.microsoft.codepush.react.CodePushNativeModule.m12738f(r0)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            org.json.JSONObject r3 = r3.m17770b()     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            if (r3 != 0) goto L1e
            r1.resolve(r2)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            goto Laf
        L18:
            r7 = move-exception
            goto La2
        L1b:
            r7 = move-exception
            goto La6
        L1e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            boolean r5 = r3.has(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            if (r5 == 0) goto L36
            java.lang.String r7 = r3.optString(r7, r2)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            HZ0 r4 = com.microsoft.codepush.react.CodePushNativeModule.m12736d(r0)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            boolean r7 = r4.m3501c(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
        L36:
            r7 = 1
            int r5 = r6.f14034b
            if (r5 != r7) goto L45
            boolean r7 = r4.booleanValue()     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            if (r7 != 0) goto L45
            r1.resolve(r2)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            goto Laf
        L45:
            if (r5 != 0) goto L83
            boolean r7 = r4.booleanValue()     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            if (r7 == 0) goto L83
            du r7 = com.microsoft.codepush.react.CodePushNativeModule.m12738f(r0)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            org.json.JSONObject r3 = r7.m17772d()     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            java.lang.String r4 = "previousPackage"
            java.lang.String r3 = r3.optString(r4, r2)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            if (r3 != 0) goto L5f
        L5d:
            r7 = r2
            goto L75
        L5f:
            java.lang.String r4 = "CodePush"
            java.lang.String r7 = r7.f26382a     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            java.lang.String r7 = p000.AbstractC8985cT1.m10704a(r7, r4)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            java.lang.String r7 = p000.AbstractC8985cT1.m10704a(r7, r3)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            java.lang.String r3 = "app.json"
            java.lang.String r7 = p000.AbstractC8985cT1.m10704a(r7, r3)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            org.json.JSONObject r7 = p000.AbstractC8985cT1.m10709f(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b java.io.IOException -> L5d
        L75:
            if (r7 != 0) goto L7b
            r1.resolve(r2)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            goto Laf
        L7b:
            com.facebook.react.bridge.WritableMap r7 = p000.AbstractC8985cT1.m10706c(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            r1.resolve(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            goto Laf
        L83:
            Pt r7 = com.microsoft.codepush.react.CodePushNativeModule.m12733a(r0)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            r7.getClass()     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            boolean r7 = p000.C1000Pt.f9323h     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            if (r7 == 0) goto L95
            java.lang.String r7 = "_isDebugOnly"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            p000.AbstractC8985cT1.m10712i(r7, r5, r3)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
        L95:
            java.lang.String r7 = "isPending"
            p000.AbstractC8985cT1.m10712i(r7, r4, r3)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            com.facebook.react.bridge.WritableMap r7 = p000.AbstractC8985cT1.m10706c(r3)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            r1.resolve(r7)     // Catch: p000.C3894cu -> L18 p000.C1188St -> L1b
            goto Laf
        La2:
            r1.reject(r7)
            goto Laf
        La6:
            r7.getMessage()
            r0.clearUpdates()
            r1.resolve(r2)
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC1503Xt.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
