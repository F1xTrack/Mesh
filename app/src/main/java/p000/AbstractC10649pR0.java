package p000;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pR0 */
/* loaded from: classes.dex */
public abstract class AbstractC10649pR0 {

    /* renamed from: a */
    public final C6686qX f40076a;

    /* renamed from: b */
    public final P70 f40077b;

    /* renamed from: c */
    public final long f40078c;

    /* renamed from: d */
    public final List f40079d;

    /* renamed from: e */
    public final C9481gJ0 f40080e;

    public AbstractC10649pR0(C6686qX c6686qX, P70 p70, QX0 qx0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        YN1.m9278c(!p70.isEmpty());
        this.f40076a = c6686qX;
        this.f40077b = P70.m6234u(p70);
        this.f40079d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f40080e = qx0.mo5776a(this);
        int i = AbstractC7485Dh1.f2166a;
        this.f40078c = AbstractC7485Dh1.m1810Y(qx0.f9658c, 1000000L, qx0.f9657b, RoundingMode.FLOOR);
    }

    /* renamed from: b */
    public abstract String mo23138b();

    /* renamed from: c */
    public abstract InterfaceC7186yC mo23139c();

    /* renamed from: d */
    public abstract C9481gJ0 mo23140d();
}
