package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CF implements InterfaceC4272i30 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public C0162Bv0 b;
    public boolean c;

    public static void a(int i, ArrayList arrayList) {
        if (AbstractC6955s22.e(d, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public C6666qX b(C6666qX c6666qX) {
        if (!this.c || !this.b.b(c6666qX)) {
            return c6666qX;
        }
        C6475pX c6475pXA = c6666qX.a();
        c6475pXA.l = AbstractC1865Xr0.n("application/x-media3-cues");
        c6475pXA.F = this.b.h(c6666qX);
        StringBuilder sb = new StringBuilder();
        sb.append(c6666qX.m);
        String str = c6666qX.j;
        sb.append(str != null ? " ".concat(str) : "");
        c6475pXA.i = sb.toString();
        c6475pXA.q = Long.MAX_VALUE;
        return new C6666qX(c6475pXA);
    }
}
