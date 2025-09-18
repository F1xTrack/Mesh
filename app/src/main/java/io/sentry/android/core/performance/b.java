package io.sentry.android.core.performance;

/* loaded from: classes2.dex */
public final class b implements Comparable {
    public final f a = new f();
    public final f b = new f();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int iCompare = Long.compare(this.a.c, bVar.a.c);
        return iCompare == 0 ? Long.compare(this.b.c, bVar.b.c) : iCompare;
    }
}
