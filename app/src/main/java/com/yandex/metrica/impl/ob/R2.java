package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class R2 {
    private final Om a;

    public R2() {
        this(new Nm());
    }

    private boolean a(long j, long j2, long j3) {
        return j < j2 || j - j2 >= j3;
    }

    public boolean b(long j, long j2, String str) {
        return a(this.a.b(), j, j2);
    }

    public R2(Om om) {
        this.a = om;
    }

    public boolean a(long j, long j2, String str) {
        return a(this.a.a(), j, j2);
    }
}
