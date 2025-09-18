package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class Hj implements Dj {
    private final Context a;
    private final L0 b;

    public Hj(Context context, L0 l0) {
        this.a = context;
        this.b = l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b() {
        /*
            r5 = this;
            r0 = 21
            boolean r0 = com.yandex.metrica.impl.ob.U2.a(r0)
            r1 = 1
            java.lang.String r2 = "metrica_data.db"
            r3 = 0
            if (r0 == 0) goto L2b
            com.yandex.metrica.impl.ob.L0 r0 = r5.b
            android.content.Context r4 = r5.a
            r0.getClass()
            java.io.File r0 = r4.getNoBackupFilesDir()
            if (r0 != 0) goto L1b
            r0 = 0
            goto L21
        L1b:
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r2)
            r0 = r4
        L21:
            if (r0 == 0) goto L2b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2b
            r0 = r1
            goto L2c
        L2b:
            r0 = r3
        L2c:
            if (r0 != 0) goto L44
            com.yandex.metrica.impl.ob.L0 r0 = r5.b
            android.content.Context r4 = r5.a
            r0.getClass()
            java.io.File r0 = r4.getDatabasePath(r2)
            if (r0 == 0) goto L42
            boolean r0 = r0.exists()
            if (r0 == 0) goto L42
            goto L45
        L42:
            r1 = r3
            goto L45
        L44:
            r1 = r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Hj.b():boolean");
    }

    @Override // com.yandex.metrica.impl.ob.Dj
    public boolean a() {
        return !b();
    }
}
