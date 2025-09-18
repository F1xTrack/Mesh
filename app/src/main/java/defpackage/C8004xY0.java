package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: xY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8004xY0 extends AbstractC7242tY0 {
    public final FC j = new FC(9);
    public boolean k = true;
    public boolean l = false;
    public final ArrayList m = new ArrayList();

    public final void a(C8194yY0 c8194yY0) {
        Object objW;
        C1702Vp c1702Vp = c8194yY0.g;
        int i = c1702Vp.c;
        C2005Zm c2005Zm = this.b;
        if (i != -1) {
            this.l = true;
            int i2 = c2005Zm.a;
            Integer numValueOf = Integer.valueOf(i);
            List list = C8194yY0.j;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            c2005Zm.a = i;
        }
        C0572Hc c0572Hc = C1702Vp.k;
        Object objW2 = C0500Ge.f;
        C0873Ky0 c0873Ky0 = c1702Vp.b;
        try {
            objW2 = c0873Ky0.w(c0572Hc);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objW2;
        Objects.requireNonNull(range);
        Range range2 = C0500Ge.f;
        if (!range.equals(range2)) {
            C0468Ft0 c0468Ft0 = (C0468Ft0) c2005Zm.e;
            C0572Hc c0572Hc2 = C1702Vp.k;
            c0468Ft0.getClass();
            try {
                objW = c0468Ft0.w(c0572Hc2);
            } catch (IllegalArgumentException unused2) {
                objW = range2;
            }
            if (((Range) objW).equals(range2)) {
                ((C0468Ft0) c2005Zm.e).e(C1702Vp.k, range);
            } else {
                C0468Ft0 c0468Ft02 = (C0468Ft0) c2005Zm.e;
                C0572Hc c0572Hc3 = C1702Vp.k;
                Object objW3 = C0500Ge.f;
                c0468Ft02.getClass();
                try {
                    objW3 = c0468Ft02.w(c0572Hc3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) objW3).equals(range)) {
                    this.k = false;
                    AbstractC0759Jm0.f("ValidatingBuilder");
                }
            }
        }
        int iB = c1702Vp.b();
        if (iB != 0) {
            c2005Zm.getClass();
            if (iB != 0) {
                ((C0468Ft0) c2005Zm.e).e(InterfaceC5361jh1.d1, Integer.valueOf(iB));
            }
        }
        int iC = c1702Vp.c();
        if (iC != 0) {
            c2005Zm.getClass();
            if (iC != 0) {
                ((C0468Ft0) c2005Zm.e).e(InterfaceC5361jh1.e1, Integer.valueOf(iC));
            }
        }
        C1702Vp c1702Vp2 = c8194yY0.g;
        ((C0858Kt0) c2005Zm.g).a.putAll((Map) c1702Vp2.g.a);
        this.c.addAll(c8194yY0.c);
        this.d.addAll(c8194yY0.d);
        c2005Zm.a(c1702Vp2.e);
        this.e.addAll(c8194yY0.e);
        InterfaceC7814wY0 interfaceC7814wY0 = c8194yY0.f;
        if (interfaceC7814wY0 != null) {
            this.m.add(interfaceC7814wY0);
        }
        InputConfiguration inputConfiguration = c8194yY0.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        LinkedHashSet<C8211ye> linkedHashSet = this.a;
        linkedHashSet.addAll(c8194yY0.a);
        HashSet hashSet = (HashSet) c2005Zm.d;
        hashSet.addAll(Collections.unmodifiableList(c1702Vp.a));
        ArrayList arrayList = new ArrayList();
        for (C8211ye c8211ye : linkedHashSet) {
            arrayList.add(c8211ye.a);
            Iterator it = c8211ye.b.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC4314iH) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            AbstractC0759Jm0.f("ValidatingBuilder");
            this.k = false;
        }
        int i3 = this.h;
        int i4 = c8194yY0.h;
        if (i4 != i3 && i4 != 0 && i3 != 0) {
            AbstractC0759Jm0.f("ValidatingBuilder");
            this.k = false;
        } else if (i4 != 0) {
            this.h = i4;
        }
        C8211ye c8211ye2 = c8194yY0.b;
        if (c8211ye2 != null) {
            C8211ye c8211ye3 = this.i;
            if (c8211ye3 == c8211ye2 || c8211ye3 == null) {
                this.i = c8211ye2;
            } else {
                AbstractC0759Jm0.f("ValidatingBuilder");
                this.k = false;
            }
        }
        c2005Zm.c(c0873Ky0);
    }

    public final C8194yY0 b() {
        if (!this.k) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.a);
        FC fc = this.j;
        if (fc.a) {
            Collections.sort(arrayList, new C4243hv(3, fc));
        }
        return new C8194yY0(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.e(), !this.m.isEmpty() ? new C2452c60(4, this) : null, this.g, this.h, this.i);
    }
}
