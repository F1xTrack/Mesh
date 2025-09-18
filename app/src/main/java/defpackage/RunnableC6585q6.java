package defpackage;

import android.content.Context;

/* renamed from: q6 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6585q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ RunnableC6585q6(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ab  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3d;
                case 2: goto L37;
                case 3: goto L1a;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r11.b
            com.my.tracker.obfuscated.c1.e(r0)
            return
        Lb:
            h8 r0 = new h8
            r1 = 2
            r0.<init>(r1)
            Tm0 r1 = defpackage.AbstractC3534eB1.a
            r2 = 0
            android.content.Context r3 = r11.b
            defpackage.AbstractC3534eB1.d(r3, r0, r1, r2)
            return
        L1a:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            q6 r1 = new q6
            android.content.Context r2 = r11.b
            r3 = 4
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L37:
            android.content.Context r0 = r11.b
            ru.ok.tracer.heap.dumps.HeapDumpInitializer.a(r0)
            return
        L3d:
            android.content.Context r0 = r11.b
            ru.ok.tracer.disk.usage.DiskUsageInitializer.a(r0)
            return
        L43:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lc3
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto Lc3
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L9c
            C8 r0 = defpackage.AbstractC7348u6.g
            r0.getClass()
            s8 r2 = new s8
            r2.<init>(r0)
        L6b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            u6 r0 = (defpackage.AbstractC7348u6) r0
            if (r0 == 0) goto L6b
            H6 r0 = (defpackage.H6) r0
            android.content.Context r0 = r0.k
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L8b
        L8a:
            r0 = 0
        L8b:
            if (r0 == 0) goto La1
            android.os.LocaleList r0 = defpackage.AbstractC6966s6.a(r0)
            Ik0 r2 = new Ik0
            Mk0 r6 = new Mk0
            r6.<init>(r0)
            r2.<init>(r6)
            goto La3
        L9c:
            Ik0 r2 = defpackage.AbstractC7348u6.c
            if (r2 == 0) goto La1
            goto La3
        La1:
            Ik0 r2 = defpackage.C0675Ik0.b
        La3:
            Kk0 r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lbc
            java.lang.String r0 = defpackage.AbstractC2136aS.d(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto Lbc
            android.os.LocaleList r0 = defpackage.AbstractC6775r6.a(r0)
            defpackage.AbstractC6966s6.b(r2, r0)
        Lbc:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lc3:
            defpackage.AbstractC7348u6.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC6585q6.run():void");
    }
}
