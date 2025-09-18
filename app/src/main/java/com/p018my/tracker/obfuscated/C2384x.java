package com.p018my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.x */
/* loaded from: classes2.dex */
public final class C2384x implements InterfaceC2376v {

    /* renamed from: a */
    private final int f20146a;

    /* renamed from: b */
    private int f20147b;

    public C2384x(int i) {
        this.f20146a = i;
        m13531g();
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2351o2, com.p018my.tracker.obfuscated.InterfaceC2315f2
    /* renamed from: a */
    public int mo13090a() {
        return this.f20146a;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2376v, com.p018my.tracker.obfuscated.InterfaceC2380w
    /* renamed from: d */
    public int mo13516d() {
        return this.f20147b;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2376v
    /* renamed from: f */
    public void mo13517f() {
        this.f20147b++;
    }

    /* renamed from: g */
    public void m13531g() {
        this.f20147b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.f20146a + ", count = " + this.f20147b;
    }
}
