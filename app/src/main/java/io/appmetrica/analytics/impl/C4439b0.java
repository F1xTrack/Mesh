package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4439b0 {
    public C4813qc a;
    public long b;
    public boolean c;
    public final C4868sk d;

    public C4439b0(String str, long j, C4868sk c4868sk) {
        this.b = j;
        try {
            this.a = new C4813qc(str);
        } catch (Throwable unused) {
            this.a = new C4813qc();
        }
        this.d = c4868sk;
    }

    public final synchronized void a(Pair pair) {
        if (this.d.b(this.a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public final synchronized C4414a0 a() {
        try {
            if (this.c) {
                this.b++;
                this.c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C4414a0(AbstractC4450bb.b(this.a), this.b);
    }
}
