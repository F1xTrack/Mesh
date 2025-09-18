package defpackage;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: Rp */
/* loaded from: classes.dex */
public final class C1390Rp {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new C3479dv(false));
    public final C1981Ze c;
    public final C1981Ze d;

    public C1390Rp(C6846rT1 c6846rT1) {
        C6496pe c6496pe = C6496pe.d;
        Iterator it = new ArrayList(C6496pe.l).iterator();
        while (true) {
            C1981Ze c1981Ze = null;
            if (!it.hasNext()) {
                break;
            }
            C6496pe c6496pe2 = (C6496pe) it.next();
            AbstractC3377dM1.i(c6496pe2 instanceof C6496pe, "Currently only support ConstantQuality");
            InterfaceC7402uO interfaceC7402uOW = c6846rT1.w(c6496pe2.a);
            if (interfaceC7402uOW != null) {
                interfaceC7402uOW.toString();
                AbstractC0759Jm0.f("CapabilitiesByQuality");
                if (!interfaceC7402uOW.d().isEmpty()) {
                    int iA = interfaceC7402uOW.a();
                    int iB = interfaceC7402uOW.b();
                    List listC = interfaceC7402uOW.c();
                    List listD = interfaceC7402uOW.d();
                    AbstractC3377dM1.d("Should contain at least one VideoProfile.", !listD.isEmpty());
                    c1981Ze = new C1981Ze(iA, iB, Collections.unmodifiableList(new ArrayList(listC)), Collections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : (C8018xd) listC.get(0), (C8398zd) listD.get(0));
                }
                if (c1981Ze == null) {
                    Objects.toString(c6496pe2);
                    AbstractC0759Jm0.f("CapabilitiesByQuality");
                } else {
                    C8398zd c8398zd = c1981Ze.f;
                    this.b.put(new Size(c8398zd.e, c8398zd.f), c6496pe2);
                    this.a.put(c6496pe2, c1981Ze);
                }
            }
        }
        if (this.a.isEmpty()) {
            AbstractC0759Jm0.f("CapabilitiesByQuality");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (C1981Ze) arrayDeque.peekFirst();
            this.d = (C1981Ze) arrayDeque.peekLast();
        }
    }

    public final C1981Ze a(C6496pe c6496pe) {
        AbstractC3377dM1.d("Unknown quality: " + c6496pe, C6496pe.k.contains(c6496pe));
        return c6496pe == C6496pe.i ? this.c : c6496pe == C6496pe.h ? this.d : (C1981Ze) this.a.get(c6496pe);
    }
}
