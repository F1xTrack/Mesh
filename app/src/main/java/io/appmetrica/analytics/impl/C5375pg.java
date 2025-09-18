package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.pg */
/* loaded from: classes2.dex */
public final class C5375pg extends AbstractC5200ig {

    /* renamed from: b */
    public final SafePackageManager f32399b;

    public C5375pg(C5139g5 c5139g5) {
        this(c5139g5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:50:0x0043, B:52:0x004d, B:53:0x005d, B:54:0x0066, B:56:0x006c, B:58:0x008f, B:59:0x0094, B:60:0x0098), top: B:64:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:50:0x0043, B:52:0x004d, B:53:0x005d, B:54:0x0066, B:56:0x006c, B:58:0x008f, B:59:0x0094, B:60:0x0098), top: B:64:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo19341a(io.appmetrica.analytics.impl.C4821T5 r10) {
        /*
            r9 = this;
            io.appmetrica.analytics.impl.g5 r0 = r9.f31942a
            io.appmetrica.analytics.impl.tn r1 = r0.f31743v
            boolean r1 = r1.m21104c()
            r2 = 0
            if (r1 == 0) goto Ld0
            boolean r1 = r0.m20434y()
            if (r1 == 0) goto Ld0
            io.appmetrica.analytics.impl.ne r1 = r0.f31724c
            io.appmetrica.analytics.impl.g5 r3 = r9.f31942a
            io.appmetrica.analytics.impl.ne r3 = r3.f31724c
            java.lang.String r3 = r3.m20826e()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L22
            goto L42
        L22:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L42
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L42
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r3 = r2
        L2d:
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L42
            if (r3 >= r6) goto L43
            io.appmetrica.analytics.impl.O9 r6 = new io.appmetrica.analytics.impl.O9     // Catch: java.lang.Throwable -> L42
            org.json.JSONObject r7 = r5.getJSONObject(r3)     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            r4.add(r6)     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + 1
            goto L2d
        L42:
            r4 = 0
        L43:
            java.util.ArrayList r3 = r9.m20916b()     // Catch: java.lang.Throwable -> Ld0
            boolean r4 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(r4, r3)     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto L5d
            io.appmetrica.analytics.impl.i9 r10 = r0.f31736o     // Catch: java.lang.Throwable -> Ld0
            int r0 = r10.f31927k     // Catch: java.lang.Throwable -> Ld0
            r10.f31929m = r0     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.ne r10 = r10.f31917a     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.ne r10 = r10.m20818a(r0)     // Catch: java.lang.Throwable -> Ld0
            r10.m20875b()     // Catch: java.lang.Throwable -> Ld0
            goto Ld0
        L5d:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld0
        L66:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto L98
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.O9 r5 = (io.appmetrica.analytics.impl.C4706O9) r5     // Catch: java.lang.Throwable -> Ld0
            r5.getClass()     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld0
            r6.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f30551a     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "required"
            boolean r8 = r5.f30553c     // Catch: java.lang.Throwable -> Ld0
            org.json.JSONObject r6 = r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld0
            int r5 = r5.f30552b     // Catch: java.lang.Throwable -> Ld0
            r7 = -1
            if (r5 == r7) goto L94
            java.lang.String r7 = "version"
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> Ld0
        L94:
            r4.put(r6)     // Catch: java.lang.Throwable -> Ld0
            goto L66
        L98:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "features"
            org.json.JSONObject r3 = r3.put(r5, r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.T5 r10 = io.appmetrica.analytics.impl.C4821T5.m19837a(r10, r3)     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.i9 r0 = r0.f31736o     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Uj r3 = r0.f31919c     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Gj r3 = r3.m19892b(r10)     // Catch: java.lang.Throwable -> Ld0
            long r5 = r10.f30769i     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.Wj r3 = io.appmetrica.analytics.impl.C4859Uj.m19888a(r3, r5)     // Catch: java.lang.Throwable -> Ld0
            r0.m20572a(r10, r3)     // Catch: java.lang.Throwable -> Ld0
            int r10 = r0.f31927k     // Catch: java.lang.Throwable -> Ld0
            r0.f31929m = r10     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.ne r0 = r0.f31917a     // Catch: java.lang.Throwable -> Ld0
            io.appmetrica.analytics.impl.ne r10 = r0.m20818a(r10)     // Catch: java.lang.Throwable -> Ld0
            r10.m20875b()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> Ld0
            r1.m20831i(r10)     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5375pg.mo19341a(io.appmetrica.analytics.impl.T5):boolean");
    }

    /* renamed from: b */
    public final ArrayList m20916b() {
        FeatureInfo[] featureInfoArr;
        try {
            C5139g5 c5139g5 = this.f31942a;
            SafePackageManager safePackageManager = this.f32399b;
            Context context = c5139g5.f31722a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC4682N9 c4634l9 = AndroidUtils.isApiAchieved(24) ? new C4634L9() : new C4658M9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c4634l9.m19654a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C5375pg(C5139g5 c5139g5, SafePackageManager safePackageManager) {
        super(c5139g5);
        this.f32399b = safePackageManager;
    }
}
