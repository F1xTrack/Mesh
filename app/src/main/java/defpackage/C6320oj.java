package defpackage;

/* renamed from: oj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6320oj {
    public float a;
    public float b;
    public long c;
    public long d;
    public long e;

    public C6320oj() {
        float f = (float) (-1.0d);
        this.a = f;
        this.b = f;
        long j = -1;
        this.c = j;
        this.d = j;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6320oj)) {
            return false;
        }
        C6320oj c6320oj = (C6320oj) obj;
        return this.a == c6320oj.a && this.b == c6320oj.b && this.c == c6320oj.c && this.d == c6320oj.d && this.e == c6320oj.e;
    }
}
