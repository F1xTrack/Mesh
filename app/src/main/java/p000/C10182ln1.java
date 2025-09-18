package p000;

/* renamed from: ln1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10182ln1 implements Comparable {

    /* renamed from: a */
    public final int f37290a;

    /* renamed from: b */
    public final C9670hn1 f37291b;

    public C10182ln1(int i, C9670hn1 c9670hn1) {
        this.f37290a = i;
        this.f37291b = c9670hn1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f37290a, ((C10182ln1) obj).f37290a);
    }
}
