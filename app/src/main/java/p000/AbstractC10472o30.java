package p000;

/* renamed from: o30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10472o30 implements Comparable {

    /* renamed from: a */
    public final String f38735a;

    /* renamed from: b */
    public final C10344n30 f38736b;

    /* renamed from: c */
    public final long f38737c;

    /* renamed from: d */
    public final int f38738d;

    /* renamed from: e */
    public final long f38739e;

    /* renamed from: f */
    public final C0589JL f38740f;

    /* renamed from: g */
    public final String f38741g;

    /* renamed from: h */
    public final String f38742h;

    /* renamed from: i */
    public final long f38743i;

    /* renamed from: j */
    public final long f38744j;

    /* renamed from: k */
    public final boolean f38745k;

    public AbstractC10472o30(String str, C10344n30 c10344n30, long j, int i, long j2, C0589JL c0589jl, String str2, String str3, long j3, long j4, boolean z) {
        this.f38735a = str;
        this.f38736b = c10344n30;
        this.f38737c = j;
        this.f38738d = i;
        this.f38739e = j2;
        this.f38740f = c0589jl;
        this.f38741g = str2;
        this.f38742h = str3;
        this.f38743i = j3;
        this.f38744j = j4;
        this.f38745k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.f38739e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
