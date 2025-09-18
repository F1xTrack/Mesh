package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Ae implements InterfaceC4675ki {
    public final Context a;
    public final String b = "content://" + a() + "/preload_info";
    public final String c = "tracking_id";
    public final String d = "additional_parameters";

    public Ae(Context context) {
        this.a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:8:0x002b, B:10:0x0031, B:19:0x0062, B:21:0x0068, B:24:0x006f, B:25:0x0077, B:18:0x005c, B:28:0x0096, B:29:0x009e, B:12:0x0047, B:15:0x004e, B:16:0x0055), top: B:37:0x0029, inners: #2 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC4675ki, defpackage.InterfaceC5908mZ
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.He invoke() {
        /*
            r11 = this;
            r0 = 1
            android.content.Context r1 = r11.a
            java.lang.String r2 = "com.yandex.preinstallsatellite.appmetrica.provider"
            boolean r1 = io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.hasContentProvider(r1, r2)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L15
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Satellite content provider with preload info was not found."
            io.appmetrica.analytics.impl.AbstractC4938vi.a(r1, r0)
            return r2
        L15:
            android.content.Context r1 = r11.a     // Catch: java.lang.Throwable -> La6
            android.content.ContentResolver r4 = r1.getContentResolver()     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r11.b     // Catch: java.lang.Throwable -> La6
            android.net.Uri r5 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> La6
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L9e
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L96
            java.lang.String r4 = r11.c     // Catch: java.lang.Throwable -> La7
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = r1.getString(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r11.d     // Catch: java.lang.Throwable -> La7
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L55
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L4e
            goto L55
        L4e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            r7 = r5
            goto L62
        L55:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
        L5a:
            r7 = r4
            goto L62
        L5c:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            r4.<init>()     // Catch: java.lang.Throwable -> La7
            goto L5a
        L62:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La7
            if (r4 != 0) goto L77
            java.lang.Long r4 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r6)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L6f
            goto L77
        L6f:
            java.lang.String r0 = "Tracking id from Satellite is not a number."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4938vi.a(r0, r3)     // Catch: java.lang.Throwable -> La7
            goto La7
        L77:
            java.lang.String r4 = "Preload info from Satellite: {tracking id = %s, additional parameters = %s}"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La7
            r5[r3] = r6     // Catch: java.lang.Throwable -> La7
            r5[r0] = r7     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4938vi.a(r4, r5)     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.He r3 = new io.appmetrica.analytics.impl.He     // Catch: java.lang.Throwable -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La7
            r8 = r4 ^ 1
            io.appmetrica.analytics.impl.P7 r10 = io.appmetrica.analytics.impl.P7.d     // Catch: java.lang.Throwable -> La7
            r9 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.hn.a(r1)
            return r3
        L96:
            java.lang.String r0 = "No Preload Info data in Satellite content provider"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4938vi.a(r0, r3)     // Catch: java.lang.Throwable -> La7
            goto La7
        L9e:
            java.lang.String r0 = "No Satellite content provider found"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La7
            io.appmetrica.analytics.impl.AbstractC4938vi.a(r0, r3)     // Catch: java.lang.Throwable -> La7
            goto La7
        La6:
            r1 = r2
        La7:
            io.appmetrica.analytics.impl.hn.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Ae.invoke():io.appmetrica.analytics.impl.He");
    }
}
