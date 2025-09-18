package defpackage;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.microsoft.codepush.react.CodePushNativeModule;

/* renamed from: Yt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC1948Yt extends AsyncTask {
    public final /* synthetic */ Promise a;
    public final /* synthetic */ CodePushNativeModule b;

    public AsyncTaskC1948Yt(CodePushNativeModule codePushNativeModule, Promise promise) {
        this.b = codePushNativeModule;
        this.a = promise;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: cu -> 0x0054, TryCatch #1 {cu -> 0x0054, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x002a, B:36:0x00cc, B:12:0x0058, B:13:0x005f, B:14:0x0060, B:16:0x0068, B:18:0x0072, B:20:0x0080, B:21:0x0084, B:23:0x008f, B:25:0x00a2, B:26:0x00a6, B:28:0x00b4, B:29:0x00b7, B:35:0x00c8, B:32:0x00c2), top: B:42:0x0007, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: cu -> 0x0054, TRY_LEAVE, TryCatch #1 {cu -> 0x0054, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x002a, B:36:0x00cc, B:12:0x0058, B:13:0x005f, B:14:0x0060, B:16:0x0068, B:18:0x0072, B:20:0x0080, B:21:0x0084, B:23:0x008f, B:25:0x00a2, B:26:0x00a6, B:28:0x00b4, B:29:0x00b7, B:35:0x00c8, B:32:0x00c2), top: B:42:0x0007, inners: #0, #2 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            com.facebook.react.bridge.Promise r5 = r4.a
            com.microsoft.codepush.react.CodePushNativeModule r0 = r4.b
            r1 = 0
            Pt r2 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: defpackage.C3286cu -> L54
            r2.getClass()     // Catch: defpackage.C3286cu -> L54
            boolean r2 = defpackage.C1246Pt.i     // Catch: defpackage.C3286cu -> L54
            if (r2 == 0) goto L60
            Pt r2 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: defpackage.C3286cu -> L54
            r2.getClass()     // Catch: defpackage.C3286cu -> L54
            r2 = 0
            defpackage.C1246Pt.i = r2     // Catch: defpackage.C3286cu -> L54
            HZ0 r2 = com.microsoft.codepush.react.CodePushNativeModule.d(r0)     // Catch: defpackage.C3286cu -> L54
            org.json.JSONArray r2 = r2.a()     // Catch: defpackage.C3286cu -> L54
            int r3 = r2.length()     // Catch: defpackage.C3286cu -> L54
            if (r3 <= 0) goto Lcc
            int r3 = r2.length()     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            int r3 = r3 + (-1)
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            com.facebook.react.bridge.WritableMap r2 = defpackage.AbstractC2522cT1.c(r2)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            bu r0 = com.microsoft.codepush.react.CodePushNativeModule.e(r0)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            r0.getClass()     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            java.lang.String r3 = "package"
            r0.putMap(r3, r2)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            java.lang.String r2 = "status"
            java.lang.String r3 = "DeploymentFailed"
            r0.putString(r2, r3)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            r5.resolve(r0)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> L57
            goto Ld5
        L54:
            r0 = move-exception
            goto Ld2
        L57:
            r0 = move-exception
            cu r2 = new cu     // Catch: defpackage.C3286cu -> L54
            java.lang.String r3 = "Unable to read failed updates information stored in SharedPreferences."
            r2.<init>(r3, r0)     // Catch: defpackage.C3286cu -> L54
            throw r2     // Catch: defpackage.C3286cu -> L54
        L60:
            Pt r2 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: defpackage.C3286cu -> L54
            boolean r2 = r2.a     // Catch: defpackage.C3286cu -> L54
            if (r2 == 0) goto L84
            du r2 = com.microsoft.codepush.react.CodePushNativeModule.f(r0)     // Catch: defpackage.C3286cu -> L54
            org.json.JSONObject r2 = r2.b()     // Catch: defpackage.C3286cu -> L54
            if (r2 == 0) goto Lcc
            bu r0 = com.microsoft.codepush.react.CodePushNativeModule.e(r0)     // Catch: defpackage.C3286cu -> L54
            com.facebook.react.bridge.WritableMap r2 = defpackage.AbstractC2522cT1.c(r2)     // Catch: defpackage.C3286cu -> L54
            com.facebook.react.bridge.WritableMap r0 = r0.d(r2)     // Catch: defpackage.C3286cu -> L54
            if (r0 == 0) goto Lcc
            r5.resolve(r0)     // Catch: defpackage.C3286cu -> L54
            goto Ld5
        L84:
            Pt r2 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: defpackage.C3286cu -> L54
            r2.getClass()     // Catch: defpackage.C3286cu -> L54
            boolean r2 = defpackage.C1246Pt.h     // Catch: defpackage.C3286cu -> L54
            if (r2 == 0) goto La6
            bu r2 = com.microsoft.codepush.react.CodePushNativeModule.e(r0)     // Catch: defpackage.C3286cu -> L54
            Pt r0 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: defpackage.C3286cu -> L54
            r0.getClass()     // Catch: defpackage.C3286cu -> L54
            java.lang.String r0 = defpackage.C1246Pt.j     // Catch: defpackage.C3286cu -> L54
            com.facebook.react.bridge.WritableMap r0 = r2.b(r0)     // Catch: defpackage.C3286cu -> L54
            if (r0 == 0) goto Lcc
            r5.resolve(r0)     // Catch: defpackage.C3286cu -> L54
            goto Ld5
        La6:
            bu r0 = com.microsoft.codepush.react.CodePushNativeModule.e(r0)     // Catch: defpackage.C3286cu -> L54
            android.content.SharedPreferences r2 = r0.a     // Catch: defpackage.C3286cu -> L54
            java.lang.String r3 = "CODE_PUSH_RETRY_DEPLOYMENT_REPORT"
            java.lang.String r2 = r2.getString(r3, r1)     // Catch: defpackage.C3286cu -> L54
            if (r2 == 0) goto Lc5
            r0.a()     // Catch: defpackage.C3286cu -> L54
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> Lc1
            r0.<init>(r2)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> Lc1
            com.facebook.react.bridge.WritableMap r0 = defpackage.AbstractC2522cT1.c(r0)     // Catch: defpackage.C3286cu -> L54 org.json.JSONException -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            r0.printStackTrace()     // Catch: defpackage.C3286cu -> L54
        Lc5:
            r0 = r1
        Lc6:
            if (r0 == 0) goto Lcc
            r5.resolve(r0)     // Catch: defpackage.C3286cu -> L54
            goto Ld5
        Lcc:
            java.lang.String r0 = ""
            r5.resolve(r0)     // Catch: defpackage.C3286cu -> L54
            goto Ld5
        Ld2:
            r5.reject(r0)
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncTaskC1948Yt.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
