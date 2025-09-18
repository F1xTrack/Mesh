package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;

/* renamed from: io.appmetrica.analytics.impl.xj */
/* loaded from: classes2.dex */
public final class C5578xj implements InterfaceC5471tc {

    /* renamed from: a */
    public final C5457sn f32828a;

    /* renamed from: b */
    public final String f32829b = "startup_state";

    /* renamed from: c */
    public final AESEncrypter f32830c;

    public C5578xj(C5457sn c5457sn) {
        this.f32828a = c5457sn;
        C4983a c4983a = new C4983a(C5244ka.m20614h().m20621e());
        this.f32830c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4983a.m20096b(), c4983a.m20095a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5471tc
    /* renamed from: a */
    public final void mo21078a(Context context) {
        SQLiteDatabase readableDatabase = C4966Z6.m20064a(context).m20075h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                C5495ub c5495ubM21208a = m21208a(readableDatabase);
                C5230jl c5230jl = new C5230jl(new C5613z4(new C5563x4()));
                if (c5495ubM21208a != null) {
                    m21207a(this.f32828a, c5230jl, c5495ubM21208a);
                    c5230jl.f32011p = c5495ubM21208a.f32685c;
                    c5230jl.f32013r = c5495ubM21208a.f32684b;
                }
                C5255kl c5255kl = new C5255kl(c5230jl);
                AbstractC4813Sl abstractC4813SlM19787a = C4789Rl.m19787a(C5255kl.class);
                abstractC4813SlM19787a.mo19602a(context, abstractC4813SlM19787a.mo19604d(context)).save(c5255kl);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m21207a(C5457sn c5457sn, C5230jl c5230jl, C5495ub c5495ub) {
        String strOptStringOrNull;
        synchronized (c5457sn) {
            strOptStringOrNull = JsonUtils.optStringOrNull(c5457sn.f32586a.m21151a(), AnalyticsBaseParamsConstantsKt.DEVICE_ID);
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(c5495ub.f32686d)) {
                c5457sn.m21059a(c5495ub.f32686d);
            }
            if (!TextUtils.isEmpty(c5495ub.f32687e)) {
                c5457sn.m21061b(c5495ub.f32687e);
            }
            if (TextUtils.isEmpty(c5495ub.f32683a)) {
                return;
            }
            c5230jl.f31996a = c5495ub.f32683a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5495ub m21208a(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "binary_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "data_key = ?"
            java.lang.String r2 = r10.f32829b     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L4b
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L45
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L4c
            r3 = 1
            if (r2 != r3) goto L45
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L45
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r11.getBlob(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r2 = r10.f32830c     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r2.decrypt(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.ub r2 = new io.appmetrica.analytics.impl.ub     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.protobuf.nano.MessageNano r0 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r2, r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.ub r0 = (io.appmetrica.analytics.impl.C5495ub) r0     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.p028io.CloseableUtilsKt.closeSafely(r11)
            return r0
        L45:
            if (r11 == 0) goto L4c
            r11.getCount()     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L4b:
            r11 = r1
        L4c:
            io.appmetrica.analytics.coreutils.internal.p028io.CloseableUtilsKt.closeSafely(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5578xj.m21208a(android.database.sqlite.SQLiteDatabase):io.appmetrica.analytics.impl.ub");
    }
}
