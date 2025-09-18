package defpackage;

/* loaded from: classes.dex */
public final class RG implements Comparable {
    public final boolean a;
    public final boolean b;

    public RG(C6666qX c6666qX, int i) {
        this.a = (c6666qX.e & 1) != 0;
        this.b = AbstractC7209tN0.s(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RG rg = (RG) obj;
        return AbstractC4052gv.a.c(this.b, rg.b).c(this.a, rg.a).e();
    }
}
