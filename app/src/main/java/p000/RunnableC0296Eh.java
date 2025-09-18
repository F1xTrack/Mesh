package p000;

import java.lang.ref.WeakReference;

/* renamed from: Eh */
/* loaded from: classes.dex */
public final class RunnableC0296Eh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2839a;

    /* renamed from: b */
    public final WeakReference f2840b;

    public RunnableC0296Eh(DialogC6245jZ dialogC6245jZ) {
        this.f2839a = 3;
        O90.m5968f(dialogC6245jZ, "fullScreenPlayerView");
        this.f2840b = new WeakReference(dialogC6245jZ);
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
            int r0 = r7.f2839a
            switch(r0) {
                case 0: goto L85;
                case 1: goto L73;
                case 2: goto L61;
                default: goto L5;
            }
        L5:
            java.lang.ref.WeakReference r0 = r7.f2840b     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L45
            jZ r0 = (p000.DialogC6245jZ) r0     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L60
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L4a
            fR r2 = r0.f35223a     // Catch: java.lang.Exception -> L45
            androidx.media3.exoplayer.ExoPlayer r2 = r2.f27194g     // Catch: java.lang.Exception -> L45
            r3 = 0
            if (r2 == 0) goto L3d
            U0 r2 = (p000.AbstractC1259U0) r2     // Catch: java.lang.Exception -> L45
            XQ r2 = (p000.C1474XQ) r2     // Catch: java.lang.Exception -> L45
            int r4 = r2.m9014K1()     // Catch: java.lang.Exception -> L45
            r5 = 3
            r6 = 1
            if (r4 != r5) goto L39
            boolean r4 = r2.m9013J1()     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L39
            r2.m9035g2()     // Catch: java.lang.Exception -> L45
            BB0 r2 = r2.f13743u1     // Catch: java.lang.Exception -> L45
            int r2 = r2.f636n     // Catch: java.lang.Exception -> L45
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
            android.os.Handler r0 = r0.f35230h     // Catch: java.lang.Exception -> L45
            r1 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r7, r1)     // Catch: java.lang.Exception -> L45
            goto L60
        L52:
            java.lang.String r1 = "ExoPlayer Exception"
            java.lang.String r2 = "Failed to flag FLAG_KEEP_SCREEN_ON on fullscreen."
            p000.AbstractC10922rZ1.m24429c(r1, r2)
            java.lang.String r0 = r0.toString()
            p000.AbstractC10922rZ1.m24429c(r1, r0)
        L60:
            return
        L61:
            java.lang.ref.WeakReference r0 = r7.f2840b
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L72
            java.lang.Object r0 = r0.get()
            Ph r0 = (p000.C0988Ph) r0
            r1 = 0
            r0.f9240q = r1
        L72:
            return
        L73:
            java.lang.ref.WeakReference r0 = r7.f2840b
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L84
            java.lang.Object r0 = r0.get()
            Ph r0 = (p000.C0988Ph) r0
            r1 = 0
            r0.f9239p = r1
        L84:
            return
        L85:
            java.lang.ref.WeakReference r0 = r7.f2840b
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L96
            java.lang.Object r0 = r0.get()
            Fh r0 = (p000.C0359Fh) r0
            r0.m2747z()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0296Eh.run():void");
    }

    public RunnableC0296Eh(C0359Fh c0359Fh) {
        this.f2839a = 0;
        this.f2840b = new WeakReference(c0359Fh);
    }

    public RunnableC0296Eh(C0988Ph c0988Ph, int i) {
        this.f2839a = i;
        switch (i) {
            case 2:
                this.f2840b = new WeakReference(c0988Ph);
                break;
            default:
                this.f2840b = new WeakReference(c0988Ph);
                break;
        }
    }
}
