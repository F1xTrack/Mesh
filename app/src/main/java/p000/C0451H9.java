package p000;

import android.os.Bundle;

/* renamed from: H9 */
/* loaded from: classes.dex */
public final class C0451H9 implements InterfaceC10201lx0 {

    /* renamed from: a */
    public long f4146a;

    /* renamed from: b */
    public long f4147b;

    /* renamed from: c */
    public Object f4148c;

    /* renamed from: d */
    public Object f4149d;

    public C0451H9(long j, int i) {
        YN1.m9281f(((C0822N3) this.f4148c) == null);
        this.f4146a = j;
        this.f4147b = j + i;
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: a */
    public long mo1936a(C7000vF c7000vF) {
        long j = this.f4147b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f4147b = -1L;
        return j2;
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: b */
    public CX0 mo1937b() {
        YN1.m9281f(this.f4146a != -1);
        return new C4130gf((C1290UV) this.f4148c, this.f4146a, 1);
    }

    /* renamed from: c */
    public boolean m3318c(long j, boolean z, boolean z2) {
        WW1 ww1 = (WW1) this.f4149d;
        ww1.mo7681v1();
        ww1.m18793A1();
        C9110dP1 c9110dP1 = (C9110dP1) ww1.f11615b;
        if (c9110dP1.m17593f()) {
            ww1.m7851t1().f11757r.m18963h(c9110dP1.f26044n.currentTimeMillis());
        }
        long j2 = j - this.f4146a;
        if (!z && j2 < 1000) {
            ww1.mo6070n().f8386o.m24554c(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f4147b;
            this.f4147b = j;
        }
        ww1.mo6070n().f8386o.m24554c(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        C10282mZ1.m22846Y1(ww1.m7683x1().m4329C1(!c9110dP1.f26037g.m6513G1()), bundle, true);
        if (!z2) {
            ww1.m7682w1().m2653X1("auto", "_e", bundle);
        }
        this.f4146a = j;
        C10662pX1 c10662pX1 = (C10662pX1) this.f4148c;
        c10662pX1.m8321a();
        c10662pX1.m8322b(((Long) IB1.f4809l0.m3028a(null)).longValue());
        return true;
    }

    @Override // p000.InterfaceC10201lx0
    /* renamed from: d */
    public void mo1938d(long j) {
        long[] jArr = (long[]) ((ES1) this.f4149d).f2708b;
        this.f4147b = jArr[AbstractC7485Dh1.m1821f(jArr, j, true)];
    }

    public C0451H9(long j, String str, long j2, byte[] bArr) {
        this.f4148c = str;
        this.f4149d = bArr;
        this.f4146a = j;
        this.f4147b = j2;
    }
}
