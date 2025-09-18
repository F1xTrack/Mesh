package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: h71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4095h71 {
    public static final C0234Ct0 a;

    static {
        C5496kP c5496kP = C5496kP.a;
        ON on = new ON(C5496kP.b, AbstractC6581q41.f, 0);
        EnumC0152Bs enumC0152Bs = EnumC0152Bs.a;
        C1559Tt0 c1559Tt0F = AbstractC6581q41.g.f();
        C1220Pk0 c1220Pk0 = C1922Yk0.e;
        C0234Ct0 c0234Ct0 = new C0234Ct0(on, c1559Tt0F, c1220Pk0);
        c0234Ct0.h = EnumC6348os0.e;
        C7575vI c7575vI = AbstractC7765wI.e;
        if (c7575vI == null) {
            C0234Ct0.r(9);
            throw null;
        }
        c0234Ct0.i = c7575vI;
        List listE = AbstractC8259yu.e(C6116ne1.B1(c0234Ct0, EnumC4015gi1.d, C1559Tt0.e("T"), 0, c1220Pk0));
        if (c0234Ct0.k != null) {
            throw new IllegalStateException("Type parameters are already set for " + c0234Ct0.getName());
        }
        ArrayList arrayList = new ArrayList(listE);
        c0234Ct0.k = arrayList;
        c0234Ct0.j = new C0620Hs(c0234Ct0, arrayList, c0234Ct0.l, c0234Ct0.m);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            C0234Ct0.r(13);
            throw null;
        }
        Iterator it = setEmptySet.iterator();
        while (it.hasNext()) {
            ((C6729qs) ((AZ) it.next())).h = c0234Ct0.m();
        }
        a = c0234Ct0;
    }
}
