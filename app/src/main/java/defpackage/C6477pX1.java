package defpackage;

import android.content.Intent;

/* renamed from: pX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6477pX1 extends VA1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6477pX1(Object obj, OQ1 oq1, int i) {
        super(oq1);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.VA1
    public final void c() {
        switch (this.e) {
            case 0:
                H9 h9 = (H9) this.f;
                ((WW1) h9.d).v1();
                WW1 ww1 = (WW1) h9.d;
                h9.c(((C3386dP1) ww1.b).n.elapsedRealtime(), false, false);
                C3386dP1 c3386dP1 = (C3386dP1) ww1.b;
                C0948Lx1 c0948Lx1 = c3386dP1.q;
                C3386dP1.d(c0948Lx1);
                c0948Lx1.z1(c3386dP1.n.elapsedRealtime());
                break;
            case 1:
                EX1 ex1 = (EX1) this.f;
                ex1.C1();
                ex1.n().o.d("Starting upload from DelayedRunnable");
                ex1.c.h0();
                break;
            default:
                C5716lY1 c5716lY1 = (C5716lY1) this.f;
                c5716lY1.p0().v1();
                String str = (String) c5716lY1.q.pollFirst();
                if (str != null) {
                    c5716lY1.I = c5716lY1.zzb().elapsedRealtime();
                    c5716lY1.n().o.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    c5716lY1.l.a.sendBroadcast(intent);
                }
                c5716lY1.G();
                break;
        }
    }
}
