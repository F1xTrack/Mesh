package p000;

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
public final class C1121Rp {

    /* renamed from: a */
    public final LinkedHashMap f10436a = new LinkedHashMap();

    /* renamed from: b */
    public final TreeMap f10437b = new TreeMap(new C3957dv(false));

    /* renamed from: c */
    public final C1614Ze f10438c;

    /* renamed from: d */
    public final C1614Ze f10439d;

    public C1121Rp(C10910rT1 c10910rT1) {
        C6630pe c6630pe = C6630pe.f40248d;
        Iterator it = new ArrayList(C6630pe.f40256l).iterator();
        while (true) {
            C1614Ze c1614Ze = null;
            if (!it.hasNext()) {
                break;
            }
            C6630pe c6630pe2 = (C6630pe) it.next();
            AbstractC9104dM1.m17550i(c6630pe2 instanceof C6630pe, "Currently only support ConstantQuality");
            InterfaceC6946uO interfaceC6946uOM24386w = c10910rT1.m24386w(c6630pe2.f40257a);
            if (interfaceC6946uOM24386w != null) {
                interfaceC6946uOM24386w.toString();
                AbstractC7806Jm0.m4412f("CapabilitiesByQuality");
                if (!interfaceC6946uOM24386w.mo9564d().isEmpty()) {
                    int iMo9561a = interfaceC6946uOM24386w.mo9561a();
                    int iMo9562b = interfaceC6946uOM24386w.mo9562b();
                    List listMo9563c = interfaceC6946uOM24386w.mo9563c();
                    List listMo9564d = interfaceC6946uOM24386w.mo9564d();
                    AbstractC9104dM1.m17545d("Should contain at least one VideoProfile.", !listMo9564d.isEmpty());
                    c1614Ze = new C1614Ze(iMo9561a, iMo9562b, Collections.unmodifiableList(new ArrayList(listMo9563c)), Collections.unmodifiableList(new ArrayList(listMo9564d)), listMo9563c.isEmpty() ? null : (C7150xd) listMo9563c.get(0), (C7276zd) listMo9564d.get(0));
                }
                if (c1614Ze == null) {
                    Objects.toString(c6630pe2);
                    AbstractC7806Jm0.m4412f("CapabilitiesByQuality");
                } else {
                    C7276zd c7276zd = c1614Ze.f15068f;
                    this.f10437b.put(new Size(c7276zd.f46903e, c7276zd.f46904f), c6630pe2);
                    this.f10436a.put(c6630pe2, c1614Ze);
                }
            }
        }
        if (this.f10436a.isEmpty()) {
            AbstractC7806Jm0.m4412f("CapabilitiesByQuality");
            this.f10439d = null;
            this.f10438c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f10436a.values());
            this.f10438c = (C1614Ze) arrayDeque.peekFirst();
            this.f10439d = (C1614Ze) arrayDeque.peekLast();
        }
    }

    /* renamed from: a */
    public final C1614Ze m7119a(C6630pe c6630pe) {
        AbstractC9104dM1.m17545d("Unknown quality: " + c6630pe, C6630pe.f40255k.contains(c6630pe));
        return c6630pe == C6630pe.f40253i ? this.f10438c : c6630pe == C6630pe.f40252h ? this.f10439d : (C1614Ze) this.f10436a.get(c6630pe);
    }
}
