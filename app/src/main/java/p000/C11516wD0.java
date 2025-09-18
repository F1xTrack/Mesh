package p000;

/* renamed from: wD0 */
/* loaded from: classes.dex */
public final class C11516wD0 implements Comparable {

    /* renamed from: a */
    public P21 f44713a;

    /* renamed from: b */
    public final /* synthetic */ C11643xD0 f44714b;

    public C11516wD0(C11643xD0 c11643xD0) {
        this.f44714b = c11643xD0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f44713a.f8793b - ((P21) obj).f8793b;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f44713a != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM26238o = AbstractC7222ym.m26238o(string);
                sbM26238o.append(this.f44713a.f8799h[i]);
                sbM26238o.append(" ");
                string = sbM26238o.toString();
            }
        }
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(string, "] ");
        sbM5762k.append(this.f44713a);
        return sbM5762k.toString();
    }
}
