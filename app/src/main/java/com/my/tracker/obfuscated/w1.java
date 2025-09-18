package com.my.tracker.obfuscated;

/* loaded from: classes2.dex */
public final class w1 implements v1 {
    private final int a;
    private long b;

    public w1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // com.my.tracker.obfuscated.o2, com.my.tracker.obfuscated.f2
    public int a() {
        return this.a;
    }

    @Override // com.my.tracker.obfuscated.v1
    public void b(long j) {
        this.b = j;
    }

    @Override // com.my.tracker.obfuscated.v1
    public long e() {
        return this.b;
    }
}
