package defpackage;

/* renamed from: ln1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5761ln1 implements Comparable {
    public final int a;
    public final C4221hn1 b;

    public C5761ln1(int i, C4221hn1 c4221hn1) {
        this.a = i;
        this.b = c4221hn1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((C5761ln1) obj).a);
    }
}
