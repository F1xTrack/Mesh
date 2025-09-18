package defpackage;

/* renamed from: Mq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003Mq extends C2072a61 implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1003Mq c1003Mq = (C1003Mq) obj;
        if (g(4) == c1003Mq.g(4)) {
            long j = this.g - c1003Mq.g;
            if (j == 0) {
                j = this.k - c1003Mq.k;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!g(4)) {
            return -1;
        }
        return 1;
    }
}
