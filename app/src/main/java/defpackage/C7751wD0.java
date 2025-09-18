package defpackage;

/* renamed from: wD0 */
/* loaded from: classes.dex */
public final class C7751wD0 implements Comparable {
    public P21 a;
    public final /* synthetic */ C7941xD0 b;

    public C7751wD0(C7941xD0 c7941xD0) {
        this.b = c7941xD0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.b - ((P21) obj).b;
    }

    public final String toString() {
        String string = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbO = AbstractC8235ym.o(string);
                sbO.append(this.a.h[i]);
                sbO.append(" ");
                string = sbO.toString();
            }
        }
        StringBuilder sbK = NX.k(string, "] ");
        sbK.append(this.a);
        return sbK.toString();
    }
}
