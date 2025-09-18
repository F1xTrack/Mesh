package p000;

/* renamed from: Mq */
/* loaded from: classes.dex */
public final class C0808Mq extends C8683a61 implements Comparable {

    /* renamed from: k */
    public long f7367k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0808Mq c0808Mq = (C0808Mq) obj;
        if (m2501g(4) == c0808Mq.m2501g(4)) {
            long j = this.f14800g - c0808Mq.f14800g;
            if (j == 0) {
                j = this.f7367k - c0808Mq.f7367k;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!m2501g(4)) {
            return -1;
        }
        return 1;
    }
}
