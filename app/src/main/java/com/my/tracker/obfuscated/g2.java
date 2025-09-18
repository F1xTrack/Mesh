package com.my.tracker.obfuscated;

import defpackage.NX;

/* loaded from: classes2.dex */
public final class g2 implements e2 {
    private final int a;
    private long b;
    private long c;

    public g2(int i) {
        this(i, 0L, 0L);
    }

    @Override // com.my.tracker.obfuscated.e2
    public void a(long j) {
        this.c += j;
    }

    @Override // com.my.tracker.obfuscated.e2, com.my.tracker.obfuscated.f2
    public long b() {
        return this.b;
    }

    @Override // com.my.tracker.obfuscated.e2
    public void c(long j) {
        this.b += j;
    }

    @Override // com.my.tracker.obfuscated.e2
    public void g() {
        this.b = 0L;
        this.c = 0L;
    }

    @Override // com.my.tracker.obfuscated.e2
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g2 m72clone() {
        try {
            g2 g2Var = (g2) super.clone();
            g2Var.g();
            g2Var.a(this.c);
            g2Var.c(this.b);
            return g2Var;
        } catch (CloneNotSupportedException unused) {
            return new g2(this.a, this.b, this.c);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        String strI = NX.i(new StringBuilder("total time = "), this.b + this.c, " ms : ");
        String str2 = "foreground = " + this.b;
        if (this.a == 0) {
            str = "[App Time   TS] id = " + this.a;
            sb = new StringBuilder("useful background = ");
        } else {
            str = "[Time Based TS] id = " + this.a;
            sb = new StringBuilder("background = ");
        }
        sb.append(this.c);
        return str + ", " + strI + str2 + ", " + sb.toString();
    }

    public g2(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // com.my.tracker.obfuscated.o2, com.my.tracker.obfuscated.f2
    public int a() {
        return this.a;
    }

    @Override // com.my.tracker.obfuscated.e2, com.my.tracker.obfuscated.f2
    public long c() {
        return this.c;
    }
}
