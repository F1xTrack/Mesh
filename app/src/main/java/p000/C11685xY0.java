package p000;

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
public final class C11685xY0 extends AbstractC11175tY0 {

    /* renamed from: j */
    public final C0328FC f45673j = new C0328FC(9);

    /* renamed from: k */
    public boolean f45674k = true;

    /* renamed from: l */
    public boolean f45675l = false;

    /* renamed from: m */
    public final ArrayList f45676m = new ArrayList();

    /* renamed from: a */
    public final void m25911a(C11812yY0 c11812yY0) {
        Object objMo4794w;
        C1373Vp c1373Vp = c11812yY0.f46304g;
        int i = c1373Vp.f12780c;
        C1622Zm c1622Zm = this.f43134b;
        if (i != -1) {
            this.f45675l = true;
            int i2 = c1622Zm.f15113a;
            Integer numValueOf = Integer.valueOf(i);
            List list = C11812yY0.f46297j;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            c1622Zm.f15113a = i;
        }
        C0480Hc c0480Hc = C1373Vp.f12777k;
        Object objMo4794w2 = C0419Ge.f3838f;
        C7882Ky0 c7882Ky0 = c1373Vp.f12779b;
        try {
            objMo4794w2 = c7882Ky0.mo4794w(c0480Hc);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo4794w2;
        Objects.requireNonNull(range);
        Range range2 = C0419Ge.f3838f;
        if (!range.equals(range2)) {
            C7612Ft0 c7612Ft0 = (C7612Ft0) c1622Zm.f15117e;
            C0480Hc c0480Hc2 = C1373Vp.f12777k;
            c7612Ft0.getClass();
            try {
                objMo4794w = c7612Ft0.mo4794w(c0480Hc2);
            } catch (IllegalArgumentException unused2) {
                objMo4794w = range2;
            }
            if (((Range) objMo4794w).equals(range2)) {
                ((C7612Ft0) c1622Zm.f15117e).m2815e(C1373Vp.f12777k, range);
            } else {
                C7612Ft0 c7612Ft02 = (C7612Ft0) c1622Zm.f15117e;
                C0480Hc c0480Hc3 = C1373Vp.f12777k;
                Object objMo4794w3 = C0419Ge.f3838f;
                c7612Ft02.getClass();
                try {
                    objMo4794w3 = c7612Ft02.mo4794w(c0480Hc3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) objMo4794w3).equals(range)) {
                    this.f45674k = false;
                    AbstractC7806Jm0.m4412f("ValidatingBuilder");
                }
            }
        }
        int iM8576b = c1373Vp.m8576b();
        if (iM8576b != 0) {
            c1622Zm.getClass();
            if (iM8576b != 0) {
                ((C7612Ft0) c1622Zm.f15117e).m2815e(InterfaceC9914jh1.f35333d1, Integer.valueOf(iM8576b));
            }
        }
        int iM8577c = c1373Vp.m8577c();
        if (iM8577c != 0) {
            c1622Zm.getClass();
            if (iM8577c != 0) {
                ((C7612Ft0) c1622Zm.f15117e).m2815e(InterfaceC9914jh1.f35334e1, Integer.valueOf(iM8577c));
            }
        }
        C1373Vp c1373Vp2 = c11812yY0.f46304g;
        ((C7872Kt0) c1622Zm.f15119g).f42279a.putAll((Map) c1373Vp2.f12784g.f42279a);
        this.f43135c.addAll(c11812yY0.f46300c);
        this.f43136d.addAll(c11812yY0.f46301d);
        c1622Zm.m9588a(c1373Vp2.f12782e);
        this.f43137e.addAll(c11812yY0.f46302e);
        InterfaceC11558wY0 interfaceC11558wY0 = c11812yY0.f46303f;
        if (interfaceC11558wY0 != null) {
            this.f45676m.add(interfaceC11558wY0);
        }
        InputConfiguration inputConfiguration = c11812yY0.f46306i;
        if (inputConfiguration != null) {
            this.f43139g = inputConfiguration;
        }
        LinkedHashSet<C7214ye> linkedHashSet = this.f43133a;
        linkedHashSet.addAll(c11812yY0.f46298a);
        HashSet hashSet = (HashSet) c1622Zm.f15116d;
        hashSet.addAll(Collections.unmodifiableList(c1373Vp.f12778a));
        ArrayList arrayList = new ArrayList();
        for (C7214ye c7214ye : linkedHashSet) {
            arrayList.add(c7214ye.f46367a);
            Iterator it = c7214ye.f46368b.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC4232iH) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            AbstractC7806Jm0.m4412f("ValidatingBuilder");
            this.f45674k = false;
        }
        int i3 = this.f43140h;
        int i4 = c11812yY0.f46305h;
        if (i4 != i3 && i4 != 0 && i3 != 0) {
            AbstractC7806Jm0.m4412f("ValidatingBuilder");
            this.f45674k = false;
        } else if (i4 != 0) {
            this.f43140h = i4;
        }
        C7214ye c7214ye2 = c11812yY0.f46299b;
        if (c7214ye2 != null) {
            C7214ye c7214ye3 = this.f43141i;
            if (c7214ye3 == c7214ye2 || c7214ye3 == null) {
                this.f43141i = c7214ye2;
            } else {
                AbstractC7806Jm0.m4412f("ValidatingBuilder");
                this.f45674k = false;
            }
        }
        c1622Zm.m9590c(c7882Ky0);
    }

    /* renamed from: b */
    public final C11812yY0 m25912b() {
        if (!this.f45674k) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.f43133a);
        C0328FC c0328fc = this.f45673j;
        if (c0328fc.f3086a) {
            Collections.sort(arrayList, new C4209hv(3, c0328fc));
        }
        return new C11812yY0(arrayList, new ArrayList(this.f43135c), new ArrayList(this.f43136d), new ArrayList(this.f43137e), this.f43134b.m9592e(), !this.f45676m.isEmpty() ? new C8938c60(4, this) : null, this.f43139g, this.f43140h, this.f43141i);
    }
}
