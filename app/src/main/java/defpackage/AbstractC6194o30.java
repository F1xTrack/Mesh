package defpackage;

/* renamed from: o30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6194o30 implements Comparable {
    public final String a;
    public final C6003n30 b;
    public final long c;
    public final int d;
    public final long e;
    public final JL f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public AbstractC6194o30(String str, C6003n30 c6003n30, long j, int i, long j2, JL jl, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = c6003n30;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = jl;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
