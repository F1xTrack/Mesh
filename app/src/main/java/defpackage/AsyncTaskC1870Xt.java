package defpackage;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.microsoft.codepush.react.CodePushNativeModule;

/* renamed from: Xt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC1870Xt extends AsyncTask {
    public final /* synthetic */ Promise a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CodePushNativeModule c;

    public AsyncTaskC1870Xt(CodePushNativeModule codePushNativeModule, Promise promise, int i) {
        this.c = codePushNativeModule;
        this.a = promise;
        this.b = i;
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
            com.microsoft.codepush.react.CodePushNativeModule r0 = r6.c
            com.facebook.react.bridge.Promise r1 = r6.a
            r2 = 0
            du r3 = com.microsoft.codepush.react.CodePushNativeModule.f(r0)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            org.json.JSONObject r3 = r3.b()     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            if (r3 != 0) goto L1e
            r1.resolve(r2)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            goto Laf
        L18:
            r7 = move-exception
            goto La2
        L1b:
            r7 = move-exception
            goto La6
        L1e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            boolean r5 = r3.has(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            if (r5 == 0) goto L36
            java.lang.String r7 = r3.optString(r7, r2)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            HZ0 r4 = com.microsoft.codepush.react.CodePushNativeModule.d(r0)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            boolean r7 = r4.c(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
        L36:
            r7 = 1
            int r5 = r6.b
            if (r5 != r7) goto L45
            boolean r7 = r4.booleanValue()     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            if (r7 != 0) goto L45
            r1.resolve(r2)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            goto Laf
        L45:
            if (r5 != 0) goto L83
            boolean r7 = r4.booleanValue()     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            if (r7 == 0) goto L83
            du r7 = com.microsoft.codepush.react.CodePushNativeModule.f(r0)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            org.json.JSONObject r3 = r7.d()     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            java.lang.String r4 = "previousPackage"
            java.lang.String r3 = r3.optString(r4, r2)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            if (r3 != 0) goto L5f
        L5d:
            r7 = r2
            goto L75
        L5f:
            java.lang.String r4 = "CodePush"
            java.lang.String r7 = r7.a     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            java.lang.String r7 = defpackage.AbstractC2522cT1.a(r7, r4)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            java.lang.String r7 = defpackage.AbstractC2522cT1.a(r7, r3)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            java.lang.String r3 = "app.json"
            java.lang.String r7 = defpackage.AbstractC2522cT1.a(r7, r3)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            org.json.JSONObject r7 = defpackage.AbstractC2522cT1.f(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b java.io.IOException -> L5d
        L75:
            if (r7 != 0) goto L7b
            r1.resolve(r2)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            goto Laf
        L7b:
            com.facebook.react.bridge.WritableMap r7 = defpackage.AbstractC2522cT1.c(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            r1.resolve(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            goto Laf
        L83:
            Pt r7 = com.microsoft.codepush.react.CodePushNativeModule.a(r0)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            r7.getClass()     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            boolean r7 = defpackage.C1246Pt.h     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            if (r7 == 0) goto L95
            java.lang.String r7 = "_isDebugOnly"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            defpackage.AbstractC2522cT1.i(r7, r5, r3)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
        L95:
            java.lang.String r7 = "isPending"
            defpackage.AbstractC2522cT1.i(r7, r4, r3)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            com.facebook.react.bridge.WritableMap r7 = defpackage.AbstractC2522cT1.c(r3)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
            r1.resolve(r7)     // Catch: defpackage.C3286cu -> L18 defpackage.C1480St -> L1b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncTaskC1870Xt.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
