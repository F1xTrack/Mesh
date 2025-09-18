package p000;

/* renamed from: p81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10612p81 implements Comparable {

    /* renamed from: a */
    public final int f39862a;

    /* renamed from: b */
    public final int f39863b;

    /* renamed from: c */
    public final String f39864c;

    /* renamed from: d */
    public final String f39865d;

    public C10612p81(int i, String str, int i2, String str2) {
        this.f39862a = i;
        this.f39863b = i2;
        this.f39864c = str;
        this.f39865d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C10612p81 c10612p81 = (C10612p81) obj;
        O90.m5968f(c10612p81, "other");
        int i = this.f39862a - c10612p81.f39862a;
        return i == 0 ? this.f39863b - c10612p81.f39863b : i;
    }
}
