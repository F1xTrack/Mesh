package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4987xj implements InterfaceC4884tc {
    public final sn a;
    public final String b = "startup_state";
    public final AESEncrypter c;

    public C4987xj(sn snVar) {
        this.a = snVar;
        C4413a c4413a = new C4413a(C4667ka.h().e());
        this.c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4413a.b(), c4413a.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4884tc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = Z6.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                C4907ub c4907ubA = a(readableDatabase);
                C4654jl c4654jl = new C4654jl(new C5020z4(new C4972x4()));
                if (c4907ubA != null) {
                    a(this.a, c4654jl, c4907ubA);
                    c4654jl.p = c4907ubA.c;
                    c4654jl.r = c4907ubA.b;
                }
                C4678kl c4678kl = new C4678kl(c4654jl);
                Sl slA = Rl.a(C4678kl.class);
                slA.a(context, slA.d(context)).save(c4678kl);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(sn snVar, C4654jl c4654jl, C4907ub c4907ub) {
        String strOptStringOrNull;
        synchronized (snVar) {
            strOptStringOrNull = JsonUtils.optStringOrNull(snVar.a.a(), AnalyticsBaseParamsConstantsKt.DEVICE_ID);
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(c4907ub.d)) {
                snVar.a(c4907ub.d);
            }
            if (!TextUtils.isEmpty(c4907ub.e)) {
                snVar.b(c4907ub.e);
            }
            if (TextUtils.isEmpty(c4907ub.a)) {
                return;
            }
            c4654jl.a = c4907ub.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4907ub a(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "binary_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "data_key = ?"
            java.lang.String r2 = r10.b     // Catch: java.lang.Throwable -> L4b
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
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r2 = r10.c     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r2.decrypt(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.ub r2 = new io.appmetrica.analytics.impl.ub     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.protobuf.nano.MessageNano r0 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r2, r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.ub r0 = (io.appmetrica.analytics.impl.C4907ub) r0     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r0
        L45:
            if (r11 == 0) goto L4c
            r11.getCount()     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L4b:
            r11 = r1
        L4c:
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4987xj.a(android.database.sqlite.SQLiteDatabase):io.appmetrica.analytics.impl.ub");
    }
}
