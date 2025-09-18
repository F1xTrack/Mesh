package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: Eh */
/* loaded from: classes.dex */
public final class RunnableC0353Eh implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public RunnableC0353Eh(DialogC5335jZ dialogC5335jZ) {
        this.a = 3;
        O90.f(dialogC5335jZ, "fullScreenPlayerView");
        this.b = new WeakReference(dialogC5335jZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L85;
                case 1: goto L73;
                case 2: goto L61;
                default: goto L5;
            }
        L5:
            java.lang.ref.WeakReference r0 = r7.b     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L45
            jZ r0 = (defpackage.DialogC5335jZ) r0     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L60
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L4a
            fR r2 = r0.a     // Catch: java.lang.Exception -> L45
            androidx.media3.exoplayer.ExoPlayer r2 = r2.g     // Catch: java.lang.Exception -> L45
            r3 = 0
            if (r2 == 0) goto L3d
            U0 r2 = (defpackage.U0) r2     // Catch: java.lang.Exception -> L45
            XQ r2 = (defpackage.XQ) r2     // Catch: java.lang.Exception -> L45
            int r4 = r2.K1()     // Catch: java.lang.Exception -> L45
            r5 = 3
            r6 = 1
            if (r4 != r5) goto L39
            boolean r4 = r2.J1()     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L39
            r2.g2()     // Catch: java.lang.Exception -> L45
            BB0 r2 = r2.u1     // Catch: java.lang.Exception -> L45
            int r2 = r2.n     // Catch: java.lang.Exception -> L45
            if (r2 != 0) goto L39
            r2 = r6
            goto L3a
        L39:
            r2 = r3
        L3a:
            if (r2 != r6) goto L3d
            r3 = r6
        L3d:
            r2 = 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L47
            r1.addFlags(r2)     // Catch: java.lang.Exception -> L45
            goto L4a
        L45:
            r0 = move-exception
            goto L52
        L47:
            r1.clearFlags(r2)     // Catch: java.lang.Exception -> L45
        L4a:
            android.os.Handler r0 = r0.h     // Catch: java.lang.Exception -> L45
            r1 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r7, r1)     // Catch: java.lang.Exception -> L45
            goto L60
        L52:
            java.lang.String r1 = "ExoPlayer Exception"
            java.lang.String r2 = "Failed to flag FLAG_KEEP_SCREEN_ON on fullscreen."
            defpackage.AbstractC6864rZ1.c(r1, r2)
            java.lang.String r0 = r0.toString()
            defpackage.AbstractC6864rZ1.c(r1, r0)
        L60:
            return
        L61:
            java.lang.ref.WeakReference r0 = r7.b
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L72
            java.lang.Object r0 = r0.get()
            Ph r0 = (defpackage.C1210Ph) r0
            r1 = 0
            r0.q = r1
        L72:
            return
        L73:
            java.lang.ref.WeakReference r0 = r7.b
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L84
            java.lang.Object r0 = r0.get()
            Ph r0 = (defpackage.C1210Ph) r0
            r1 = 0
            r0.p = r1
        L84:
            return
        L85:
            java.lang.ref.WeakReference r0 = r7.b
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L96
            java.lang.Object r0 = r0.get()
            Fh r0 = (defpackage.C0431Fh) r0
            r0.z()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC0353Eh.run():void");
    }

    public RunnableC0353Eh(C0431Fh c0431Fh) {
        this.a = 0;
        this.b = new WeakReference(c0431Fh);
    }

    public RunnableC0353Eh(C1210Ph c1210Ph, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(c1210Ph);
                break;
            default:
                this.b = new WeakReference(c1210Ph);
                break;
        }
    }
}
