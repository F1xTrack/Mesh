package com.my.tracker.obfuscated;

/* loaded from: classes2.dex */
public final class x implements v {
    private final int a;
    private int b;

    public x(int i) {
        this.a = i;
        g();
    }

    @Override // com.my.tracker.obfuscated.o2, com.my.tracker.obfuscated.f2
    public int a() {
        return this.a;
    }

    @Override // com.my.tracker.obfuscated.v, com.my.tracker.obfuscated.w
    public int d() {
        return this.b;
    }

    @Override // com.my.tracker.obfuscated.v
    public void f() {
        this.b++;
    }

    public void g() {
        this.b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.a + ", count = " + this.b;
    }
}
