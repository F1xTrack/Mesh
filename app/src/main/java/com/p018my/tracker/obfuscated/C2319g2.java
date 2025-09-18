package com.p018my.tracker.obfuscated;

import p000.AbstractC0852NX;

/* renamed from: com.my.tracker.obfuscated.g2 */
/* loaded from: classes2.dex */
public final class C2319g2 implements InterfaceC2311e2 {

    /* renamed from: a */
    private final int f19958a;

    /* renamed from: b */
    private long f19959b;

    /* renamed from: c */
    private long f19960c;

    public C2319g2(int i) {
        this(i, 0L, 0L);
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2311e2
    /* renamed from: a */
    public void mo12953a(long j) {
        this.f19960c += j;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2311e2, com.p018my.tracker.obfuscated.InterfaceC2315f2
    /* renamed from: b */
    public long mo12954b() {
        return this.f19959b;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2311e2
    /* renamed from: c */
    public void mo12956c(long j) {
        this.f19959b += j;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2311e2
    /* renamed from: g */
    public void mo12957g() {
        this.f19959b = 0L;
        this.f19960c = 0L;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2311e2
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2319g2 m26666clone() {
        try {
            C2319g2 c2319g2 = (C2319g2) super.clone();
            c2319g2.mo12957g();
            c2319g2.mo12953a(this.f19960c);
            c2319g2.mo12956c(this.f19959b);
            return c2319g2;
        } catch (CloneNotSupportedException unused) {
            return new C2319g2(this.f19958a, this.f19959b, this.f19960c);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        String strM5760i = AbstractC0852NX.m5760i(new StringBuilder("total time = "), this.f19959b + this.f19960c, " ms : ");
        String str2 = "foreground = " + this.f19959b;
        if (this.f19958a == 0) {
            str = "[App Time   TS] id = " + this.f19958a;
            sb = new StringBuilder("useful background = ");
        } else {
            str = "[Time Based TS] id = " + this.f19958a;
            sb = new StringBuilder("background = ");
        }
        sb.append(this.f19960c);
        return str + ", " + strM5760i + str2 + ", " + sb.toString();
    }

    public C2319g2(int i, long j, long j2) {
        this.f19958a = i;
        this.f19959b = j;
        this.f19960c = j2;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2351o2, com.p018my.tracker.obfuscated.InterfaceC2315f2
    /* renamed from: a */
    public int mo13090a() {
        return this.f19958a;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2311e2, com.p018my.tracker.obfuscated.InterfaceC2315f2
    /* renamed from: c */
    public long mo12955c() {
        return this.f19960c;
    }
}
