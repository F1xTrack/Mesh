package defpackage;

/* renamed from: p81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6402p81 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public C6402p81(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6402p81 c6402p81 = (C6402p81) obj;
        O90.f(c6402p81, "other");
        int i = this.a - c6402p81.a;
        return i == 0 ? this.b - c6402p81.b : i;
    }
}
