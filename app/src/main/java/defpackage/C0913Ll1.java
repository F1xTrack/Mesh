package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* renamed from: Ll1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913Ll1 implements InterfaceC3630eh1 {
    public final HashSet a;
    public final C5568kn e;
    public final InterfaceC7480uo f;
    public final InterfaceC7480uo g;
    public final HashSet i;
    public final HashMap j;
    public final C4348iS0 k;
    public final C4348iS0 l;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final C2014Zp h = new C2014Zp(2, this);

    public C0913Ll1(InterfaceC7480uo interfaceC7480uo, InterfaceC7480uo interfaceC7480uo2, HashSet hashSet, C5568kn c5568kn, C1724Vw0 c1724Vw0) {
        this.f = interfaceC7480uo;
        this.g = interfaceC7480uo2;
        this.e = c5568kn;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            map.put(abstractC3821fh1, abstractC3821fh1.o(interfaceC7480uo.o(), null, abstractC3821fh1.g(true, c5568kn)));
        }
        this.j = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.i = hashSet2;
        this.k = new C4348iS0(interfaceC7480uo, hashSet2);
        if (this.g != null) {
            this.l = new C4348iS0(this.g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            AbstractC3821fh1 abstractC3821fh12 = (AbstractC3821fh1) it2.next();
            this.d.put(abstractC3821fh12, Boolean.FALSE);
            this.c.put(abstractC3821fh12, new C0835Kl1(interfaceC7480uo, this, c1724Vw0));
        }
    }

    public static void r(R61 r61, AbstractC4314iH abstractC4314iH, C8194yY0 c8194yY0) {
        r61.e();
        try {
            DV1.a();
            r61.b();
            Q61 q61 = r61.l;
            Objects.requireNonNull(q61);
            q61.g(abstractC4314iH, new M61(q61, 0));
        } catch (C4123hH unused) {
            InterfaceC7814wY0 interfaceC7814wY0 = c8194yY0.f;
            if (interfaceC7814wY0 != null) {
                interfaceC7814wY0.a(c8194yY0);
            }
        }
    }

    public static AbstractC4314iH s(AbstractC3821fh1 abstractC3821fh1) {
        List listB = abstractC3821fh1 instanceof C7349u60 ? abstractC3821fh1.m.b() : Collections.unmodifiableList(abstractC3821fh1.m.g.a);
        AbstractC3377dM1.i(listB.size() <= 1, null);
        if (listB.size() == 1) {
            return (AbstractC4314iH) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void d(AbstractC3821fh1 abstractC3821fh1) {
        AbstractC4314iH abstractC4314iHS;
        DV1.a();
        R61 r61 = (R61) this.b.get(abstractC3821fh1);
        Objects.requireNonNull(r61);
        if (t(abstractC3821fh1) && (abstractC4314iHS = s(abstractC3821fh1)) != null) {
            r(r61, abstractC4314iHS, abstractC3821fh1.m);
        }
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void f(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        if (t(abstractC3821fh1)) {
            return;
        }
        this.d.put(abstractC3821fh1, Boolean.TRUE);
        AbstractC4314iH abstractC4314iHS = s(abstractC3821fh1);
        if (abstractC4314iHS != null) {
            R61 r61 = (R61) this.b.get(abstractC3821fh1);
            Objects.requireNonNull(r61);
            r(r61, abstractC4314iHS, abstractC3821fh1.m);
        }
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void i(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        if (t(abstractC3821fh1)) {
            R61 r61 = (R61) this.b.get(abstractC3821fh1);
            Objects.requireNonNull(r61);
            AbstractC4314iH abstractC4314iHS = s(abstractC3821fh1);
            if (abstractC4314iHS != null) {
                r(r61, abstractC4314iHS, abstractC3821fh1.m);
                return;
            }
            DV1.a();
            r61.b();
            r61.l.a();
        }
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void p(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        if (t(abstractC3821fh1)) {
            this.d.put(abstractC3821fh1, Boolean.FALSE);
            R61 r61 = (R61) this.b.get(abstractC3821fh1);
            Objects.requireNonNull(r61);
            DV1.a();
            r61.b();
            r61.l.a();
        }
    }

    public final C2553ce q(AbstractC3821fh1 abstractC3821fh1, C4348iS0 c4348iS0, InterfaceC7480uo interfaceC7480uo, R61 r61, int i, boolean z) {
        boolean z2;
        Size sizeE;
        int iP = interfaceC7480uo.b().p(i);
        Matrix matrix = r61.b;
        RectF rectF = AbstractC7255tc1.a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
        InterfaceC5361jh1 interfaceC5361jh1 = (InterfaceC5361jh1) this.j.get(abstractC3821fh1);
        Objects.requireNonNull(interfaceC5361jh1);
        r61.b.getValues(new float[9]);
        int iH = AbstractC7255tc1.h((int) Math.round(Math.atan2(r9[3], r9[0]) * 57.29577951308232d));
        c4348iS0.getClass();
        boolean zC = AbstractC7255tc1.c(iH);
        Rect rectA = r61.d;
        if (zC) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            sizeE = AbstractC7255tc1.e(rectA);
            Iterator it = c4348iS0.b(interfaceC5361jh1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size sizeE2 = AbstractC7255tc1.e(C4348iS0.a((Size) it.next(), sizeE));
                if (!C4348iS0.c(sizeE2, sizeE)) {
                    sizeE = sizeE2;
                    break;
                }
            }
        } else {
            Size sizeE3 = AbstractC7255tc1.e(rectA);
            List listB = c4348iS0.b(interfaceC5361jh1);
            Iterator it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeE = sizeE3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!C4348iS0.c(size, sizeE3)) {
                            sizeE = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalG = X8.a;
                    Size size3 = AbstractC3696f21.c;
                    if (!X8.a(sizeE3, rationalG, size3)) {
                        rationalG = X8.c;
                        if (!X8.a(sizeE3, rationalG, size3)) {
                            rationalG = C4348iS0.g(sizeE3);
                        }
                    }
                    if (!c4348iS0.d(rationalG, size2) && !C4348iS0.c(size2, sizeE3)) {
                        sizeE = size2;
                        break;
                    }
                }
            }
            rectA = C4348iS0.a(sizeE3, sizeE);
        }
        Pair pair = new Pair(rectA, sizeE);
        Rect rect = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z2) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect, size4);
        Rect rect2 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int iP2 = this.f.b().p(((Y60) abstractC3821fh1.f).n0(0));
        C0835Kl1 c0835Kl1 = (C0835Kl1) this.c.get(abstractC3821fh1);
        Objects.requireNonNull(c0835Kl1);
        c0835Kl1.c.c = iP2;
        int iH2 = AbstractC7255tc1.h((r61.i + iP2) - iP);
        return new C2553ce(UUID.randomUUID(), abstractC3821fh1 instanceof C3349dD0 ? 1 : abstractC3821fh1 instanceof C7349u60 ? 4 : 2, abstractC3821fh1 instanceof C7349u60 ? 256 : 34, rect2, AbstractC7255tc1.g(size6, iH2), iH2, abstractC3821fh1.n(interfaceC7480uo) ^ z3);
    }

    public final boolean t(AbstractC3821fh1 abstractC3821fh1) {
        Boolean bool = (Boolean) this.d.get(abstractC3821fh1);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void u(HashMap map) {
        HashMap map2 = this.b;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) entry.getKey();
            R61 r61 = (R61) entry.getValue();
            abstractC3821fh1.C(r61.d);
            abstractC3821fh1.A(r61.b);
            abstractC3821fh1.g = abstractC3821fh1.y(r61.g, null);
            abstractC3821fh1.r();
        }
    }
}
