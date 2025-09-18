package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.b0 */
/* loaded from: classes2.dex */
public final class C5009b0 {

    /* renamed from: a */
    public C5396qc f31272a;

    /* renamed from: b */
    public long f31273b;

    /* renamed from: c */
    public boolean f31274c;

    /* renamed from: d */
    public final C5454sk f31275d;

    public C5009b0(String str, long j, C5454sk c5454sk) {
        this.f31273b = j;
        try {
            this.f31272a = new C5396qc(str);
        } catch (Throwable unused) {
            this.f31272a = new C5396qc();
        }
        this.f31275d = c5454sk;
    }

    /* renamed from: a */
    public final synchronized void m20133a(Pair pair) {
        if (this.f31275d.m21050b(this.f31272a, (String) pair.first, (String) pair.second)) {
            this.f31274c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f31272a.size() + ". Is changed " + this.f31274c + ". Current revision " + this.f31273b;
    }

    /* renamed from: a */
    public final synchronized C4984a0 m20132a() {
        try {
            if (this.f31274c) {
                this.f31273b++;
                this.f31274c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C4984a0(AbstractC5020bb.m20174b(this.f31272a), this.f31273b);
    }
}
