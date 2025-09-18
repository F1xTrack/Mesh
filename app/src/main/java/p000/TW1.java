package p000;

/* loaded from: classes.dex */
public final class TW1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11411a;

    /* renamed from: b */
    public final /* synthetic */ long f11412b;

    /* renamed from: c */
    public final /* synthetic */ WW1 f11413c;

    public /* synthetic */ TW1(WW1 ww1, long j, int i) {
        this.f11411a = i;
        this.f11412b = j;
        this.f11413c = ww1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11411a) {
            case 0:
                WW1 ww1 = this.f11413c;
                ww1.mo7681v1();
                ww1.m8803C1();
                OL1 ol1Mo6070n = ww1.mo6070n();
                long j = this.f11412b;
                ol1Mo6070n.f8386o.m24554c(Long.valueOf(j), "Activity resumed, time");
                C9110dP1 c9110dP1 = (C9110dP1) ww1.f11615b;
                boolean zM6511E1 = c9110dP1.f26037g.m6511E1(null, IB1.f4773W0);
                C8143Py1 c8143Py1 = c9110dP1.f26037g;
                C0451H9 c0451h9 = ww1.f13245g;
                if (zM6511E1) {
                    if (c8143Py1.m6513G1() || ww1.f13243e) {
                        ((WW1) c0451h9.f4149d).mo7681v1();
                        ((C10662pX1) c0451h9.f4148c).m8321a();
                        c0451h9.f4146a = j;
                        c0451h9.f4147b = j;
                    }
                } else if (c8143Py1.m6513G1() || ww1.m7851t1().f11760u.m17921b()) {
                    ((WW1) c0451h9.f4149d).mo7681v1();
                    ((C10662pX1) c0451h9.f4148c).m8321a();
                    c0451h9.f4146a = j;
                    c0451h9.f4147b = j;
                }
                ES1 es1 = ww1.f13246h;
                WW1 ww12 = (WW1) es1.f2709c;
                ww12.mo7681v1();
                RunnableC10278mX1 runnableC10278mX1 = (RunnableC10278mX1) es1.f2708b;
                if (runnableC10278mX1 != null) {
                    ww12.f13242d.removeCallbacks(runnableC10278mX1);
                }
                ww12.m7851t1().f11760u.m17920a(false);
                ww12.mo7681v1();
                ww12.f13243e = false;
                if (((C9110dP1) ww12.f11615b).f26037g.m6511E1(null, IB1.f4769U0) && ww12.m7682w1().f3216o) {
                    ww12.mo6070n().f8386o.m24555d("Retrying trigger URI registration in foreground");
                    ww12.m7682w1().m2650U1();
                }
                C10909rT0 c10909rT0 = ww1.f13244f;
                ((WW1) c10909rT0.f41672a).mo7681v1();
                WW1 ww13 = (WW1) c10909rT0.f41672a;
                if (((C9110dP1) ww13.f11615b).m17593f()) {
                    c10909rT0.m24359o(((C9110dP1) ww13.f11615b).f26044n.currentTimeMillis(), false);
                    break;
                }
                break;
            default:
                WW1 ww14 = this.f11413c;
                ww14.mo7681v1();
                ww14.m8803C1();
                OL1 ol1Mo6070n2 = ww14.mo6070n();
                long j2 = this.f11412b;
                ol1Mo6070n2.f8386o.m24554c(Long.valueOf(j2), "Activity paused, time");
                ES1 es12 = ww14.f13246h;
                WW1 ww15 = (WW1) es12.f2709c;
                RunnableC10278mX1 runnableC10278mX12 = new RunnableC10278mX1(es12, ((C9110dP1) ww15.f11615b).f26044n.currentTimeMillis(), j2);
                es12.f2708b = runnableC10278mX12;
                ww15.f13242d.postDelayed(runnableC10278mX12, 2000L);
                if (((C9110dP1) ww14.f11615b).f26037g.m6513G1()) {
                    ((C10662pX1) ww14.f13245g.f4148c).m8321a();
                    break;
                }
                break;
        }
    }
}
