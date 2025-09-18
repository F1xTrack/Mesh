package p000;

import android.content.Intent;

/* renamed from: pX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10662pX1 extends VA1 {

    /* renamed from: e */
    public final /* synthetic */ int f40180e;

    /* renamed from: f */
    public final /* synthetic */ Object f40181f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10662pX1(Object obj, OQ1 oq1, int i) {
        super(oq1);
        this.f40180e = i;
        this.f40181f = obj;
    }

    @Override // p000.VA1
    /* renamed from: c */
    public final void mo185c() {
        switch (this.f40180e) {
            case 0:
                C0451H9 c0451h9 = (C0451H9) this.f40181f;
                ((WW1) c0451h9.f4149d).mo7681v1();
                WW1 ww1 = (WW1) c0451h9.f4149d;
                c0451h9.m3318c(((C9110dP1) ww1.f11615b).f26044n.elapsedRealtime(), false, false);
                C9110dP1 c9110dP1 = (C9110dP1) ww1.f11615b;
                C7933Lx1 c7933Lx1 = c9110dP1.f26047q;
                C9110dP1.m17591d(c7933Lx1);
                c7933Lx1.m5166z1(c9110dP1.f26044n.elapsedRealtime());
                break;
            case 1:
                EX1 ex1 = (EX1) this.f40181f;
                ex1.m2330C1();
                ex1.mo6070n().f8386o.m24555d("Starting upload from DelayedRunnable");
                ex1.f5586c.m22490h0();
                break;
            default:
                C10152lY1 c10152lY1 = (C10152lY1) this.f40181f;
                c10152lY1.mo6071p0().mo7681v1();
                String str = (String) c10152lY1.f37139q.pollFirst();
                if (str != null) {
                    c10152lY1.f37121I = c10152lY1.zzb().elapsedRealtime();
                    c10152lY1.mo6070n().f8386o.m24554c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    c10152lY1.f37134l.f26031a.sendBroadcast(intent);
                }
                c10152lY1.m22458G();
                break;
        }
    }
}
