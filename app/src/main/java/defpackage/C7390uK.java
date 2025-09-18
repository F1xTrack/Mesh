package defpackage;

/* renamed from: uK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7390uK {
    public boolean a;
    public long b;
    public long c;

    public final synchronized long a() {
        return this.b;
    }

    public final synchronized void b(long j, long j2) {
        if (this.a) {
            this.b += j;
            this.c += j2;
        }
    }

    public final synchronized void c() {
        this.a = false;
        this.c = -1L;
        this.b = -1L;
    }

    public final synchronized void d(long j, long j2) {
        this.c = j2;
        this.b = j;
        this.a = true;
    }
}
