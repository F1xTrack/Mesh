package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OD0 {
    public final int a;
    public final C1357Re b;
    public final VH c;
    public final Rect d;
    public final int e;
    public final int f;
    public final Matrix g;
    public final WR0 h;
    public final String i;
    public final C0599Hl k;
    public int l = -1;
    public final ArrayList j = new ArrayList();

    public OD0(C1546Tp c1546Tp, C1357Re c1357Re, WR0 wr0, C0599Hl c0599Hl, int i) {
        this.a = i;
        this.b = c1357Re;
        this.c = c1357Re.e;
        this.f = c1357Re.i;
        this.e = c1357Re.h;
        this.d = c1357Re.f;
        this.g = c1357Re.g;
        this.h = wr0;
        this.i = String.valueOf(c1546Tp.hashCode());
        List<C5196iq> list = c1546Tp.a;
        Objects.requireNonNull(list);
        for (C5196iq c5196iq : list) {
            ArrayList arrayList = this.j;
            c5196iq.getClass();
            arrayList.add(0);
        }
        this.k = c0599Hl;
    }

    public final void a(int i) {
        if (this.l != i) {
            this.l = i;
            WR0 wr0 = this.h;
            DV1.a();
            if (wr0.g) {
                return;
            }
            C1357Re c1357Re = wr0.a;
            c1357Re.c.execute(new RunnableC7927x81(c1357Re, i));
        }
    }
}
