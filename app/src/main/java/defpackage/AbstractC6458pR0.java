package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pR0 */
/* loaded from: classes.dex */
public abstract class AbstractC6458pR0 {
    public final C6666qX a;
    public final P70 b;
    public final long c;
    public final List d;
    public final C3939gJ0 e;

    public AbstractC6458pR0(C6666qX c6666qX, P70 p70, QX0 qx0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        YN1.c(!p70.isEmpty());
        this.a = c6666qX;
        this.b = P70.u(p70);
        this.d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.e = qx0.a(this);
        int i = AbstractC0277Dh1.a;
        this.c = AbstractC0277Dh1.Y(qx0.c, 1000000L, qx0.b, RoundingMode.FLOOR);
    }

    public abstract String b();

    public abstract InterfaceC8127yC c();

    public abstract C3939gJ0 d();
}
