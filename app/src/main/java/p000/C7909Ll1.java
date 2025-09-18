package p000;

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
public final class C7909Ll1 implements InterfaceC9274eh1 {

    /* renamed from: a */
    public final HashSet f6835a;

    /* renamed from: e */
    public final C6322kn f6839e;

    /* renamed from: f */
    public final InterfaceC6972uo f6840f;

    /* renamed from: g */
    public final InterfaceC6972uo f6841g;

    /* renamed from: i */
    public final HashSet f6843i;

    /* renamed from: j */
    public final HashMap f6844j;

    /* renamed from: k */
    public final C9755iS0 f6845k;

    /* renamed from: l */
    public final C9755iS0 f6846l;

    /* renamed from: b */
    public final HashMap f6836b = new HashMap();

    /* renamed from: c */
    public final HashMap f6837c = new HashMap();

    /* renamed from: d */
    public final HashMap f6838d = new HashMap();

    /* renamed from: h */
    public final C1625Zp f6842h = new C1625Zp(2, this);

    public C7909Ll1(InterfaceC6972uo interfaceC6972uo, InterfaceC6972uo interfaceC6972uo2, HashSet hashSet, C6322kn c6322kn, C8450Vw0 c8450Vw0) {
        this.f6840f = interfaceC6972uo;
        this.f6841g = interfaceC6972uo2;
        this.f6839e = c6322kn;
        this.f6835a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            map.put(abstractC9402fh1, abstractC9402fh1.m18282o(interfaceC6972uo.mo1341o(), null, abstractC9402fh1.mo7101g(true, c6322kn)));
        }
        this.f6844j = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f6843i = hashSet2;
        this.f6845k = new C9755iS0(interfaceC6972uo, hashSet2);
        if (this.f6841g != null) {
            this.f6846l = new C9755iS0(this.f6841g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            AbstractC9402fh1 abstractC9402fh12 = (AbstractC9402fh1) it2.next();
            this.f6838d.put(abstractC9402fh12, Boolean.FALSE);
            this.f6837c.put(abstractC9402fh12, new C7857Kl1(interfaceC6972uo, this, c8450Vw0));
        }
    }

    /* renamed from: r */
    public static void m5099r(R61 r61, AbstractC4232iH abstractC4232iH, C11812yY0 c11812yY0) {
        r61.m6900e();
        try {
            DV1.m1716a();
            r61.m6897b();
            Q61 q61 = r61.f10013l;
            Objects.requireNonNull(q61);
            q61.m6574g(abstractC4232iH, new M61(q61, 0));
        } catch (C4169hH unused) {
            InterfaceC11558wY0 interfaceC11558wY0 = c11812yY0.f46303f;
            if (interfaceC11558wY0 != null) {
                interfaceC11558wY0.mo10586a(c11812yY0);
            }
        }
    }

    /* renamed from: s */
    public static AbstractC4232iH m5100s(AbstractC9402fh1 abstractC9402fh1) {
        List listM26164b = abstractC9402fh1 instanceof C11247u60 ? abstractC9402fh1.f27344m.m26164b() : Collections.unmodifiableList(abstractC9402fh1.f27344m.f46304g.f12778a);
        AbstractC9104dM1.m17550i(listM26164b.size() <= 1, null);
        if (listM26164b.size() == 1) {
            return (AbstractC4232iH) listM26164b.get(0);
        }
        return null;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: d */
    public final void mo1330d(AbstractC9402fh1 abstractC9402fh1) {
        AbstractC4232iH abstractC4232iHM5100s;
        DV1.m1716a();
        R61 r61 = (R61) this.f6836b.get(abstractC9402fh1);
        Objects.requireNonNull(r61);
        if (m5102t(abstractC9402fh1) && (abstractC4232iHM5100s = m5100s(abstractC9402fh1)) != null) {
            m5099r(r61, abstractC4232iHM5100s, abstractC9402fh1.f27344m);
        }
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: f */
    public final void mo1332f(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        if (m5102t(abstractC9402fh1)) {
            return;
        }
        this.f6838d.put(abstractC9402fh1, Boolean.TRUE);
        AbstractC4232iH abstractC4232iHM5100s = m5100s(abstractC9402fh1);
        if (abstractC4232iHM5100s != null) {
            R61 r61 = (R61) this.f6836b.get(abstractC9402fh1);
            Objects.requireNonNull(r61);
            m5099r(r61, abstractC4232iHM5100s, abstractC9402fh1.f27344m);
        }
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: i */
    public final void mo1335i(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        if (m5102t(abstractC9402fh1)) {
            R61 r61 = (R61) this.f6836b.get(abstractC9402fh1);
            Objects.requireNonNull(r61);
            AbstractC4232iH abstractC4232iHM5100s = m5100s(abstractC9402fh1);
            if (abstractC4232iHM5100s != null) {
                m5099r(r61, abstractC4232iHM5100s, abstractC9402fh1.f27344m);
                return;
            }
            DV1.m1716a();
            r61.m6897b();
            r61.f10013l.mo6573a();
        }
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: p */
    public final void mo1342p(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        if (m5102t(abstractC9402fh1)) {
            this.f6838d.put(abstractC9402fh1, Boolean.FALSE);
            R61 r61 = (R61) this.f6836b.get(abstractC9402fh1);
            Objects.requireNonNull(r61);
            DV1.m1716a();
            r61.m6897b();
            r61.f10013l.mo6573a();
        }
    }

    /* renamed from: q */
    public final C1860ce m5101q(AbstractC9402fh1 abstractC9402fh1, C9755iS0 c9755iS0, InterfaceC6972uo interfaceC6972uo, R61 r61, int i, boolean z) {
        boolean z2;
        Size sizeM24951e;
        int iMo2404p = interfaceC6972uo.mo1328b().mo2404p(i);
        Matrix matrix = r61.f10003b;
        RectF rectF = AbstractC11184tc1.f43173a;
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
        InterfaceC9914jh1 interfaceC9914jh1 = (InterfaceC9914jh1) this.f6844j.get(abstractC9402fh1);
        Objects.requireNonNull(interfaceC9914jh1);
        r61.f10003b.getValues(new float[9]);
        int iM24954h = AbstractC11184tc1.m24954h((int) Math.round(Math.atan2(r9[3], r9[0]) * 57.29577951308232d));
        c9755iS0.getClass();
        boolean zM24949c = AbstractC11184tc1.m24949c(iM24954h);
        Rect rectM19041a = r61.f10005d;
        if (zM24949c) {
            rectM19041a = new Rect(rectM19041a.top, rectM19041a.left, rectM19041a.bottom, rectM19041a.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            sizeM24951e = AbstractC11184tc1.m24951e(rectM19041a);
            Iterator it = c9755iS0.m19044b(interfaceC9914jh1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size sizeM24951e2 = AbstractC11184tc1.m24951e(C9755iS0.m19041a((Size) it.next(), sizeM24951e));
                if (!C9755iS0.m19042c(sizeM24951e2, sizeM24951e)) {
                    sizeM24951e = sizeM24951e2;
                    break;
                }
            }
        } else {
            Size sizeM24951e3 = AbstractC11184tc1.m24951e(rectM19041a);
            List listM19044b = c9755iS0.m19044b(interfaceC9914jh1);
            Iterator it2 = listM19044b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listM19044b.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeM24951e = sizeM24951e3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!C9755iS0.m19042c(size, sizeM24951e3)) {
                            sizeM24951e = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalM19043g = AbstractC1456X8.f13568a;
                    Size size3 = AbstractC9318f21.f27018c;
                    if (!AbstractC1456X8.m8936a(sizeM24951e3, rationalM19043g, size3)) {
                        rationalM19043g = AbstractC1456X8.f13570c;
                        if (!AbstractC1456X8.m8936a(sizeM24951e3, rationalM19043g, size3)) {
                            rationalM19043g = C9755iS0.m19043g(sizeM24951e3);
                        }
                    }
                    if (!c9755iS0.m19045d(rationalM19043g, size2) && !C9755iS0.m19042c(size2, sizeM24951e3)) {
                        sizeM24951e = size2;
                        break;
                    }
                }
            }
            rectM19041a = C9755iS0.m19041a(sizeM24951e3, sizeM24951e);
        }
        Pair pair = new Pair(rectM19041a, sizeM24951e);
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
        int iMo2404p2 = this.f6840f.mo1328b().mo2404p(((Y60) abstractC9402fh1.f27337f).mo7429n0(0));
        C7857Kl1 c7857Kl1 = (C7857Kl1) this.f6837c.get(abstractC9402fh1);
        Objects.requireNonNull(c7857Kl1);
        c7857Kl1.f6275c.f7989c = iMo2404p2;
        int iM24954h2 = AbstractC11184tc1.m24954h((r61.f10010i + iMo2404p2) - iMo2404p);
        return new C1860ce(UUID.randomUUID(), abstractC9402fh1 instanceof C9085dD0 ? 1 : abstractC9402fh1 instanceof C11247u60 ? 4 : 2, abstractC9402fh1 instanceof C11247u60 ? 256 : 34, rect2, AbstractC11184tc1.m24953g(size6, iM24954h2), iM24954h2, abstractC9402fh1.m18281n(interfaceC6972uo) ^ z3);
    }

    /* renamed from: t */
    public final boolean m5102t(AbstractC9402fh1 abstractC9402fh1) {
        Boolean bool = (Boolean) this.f6838d.get(abstractC9402fh1);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: u */
    public final void m5103u(HashMap map) {
        HashMap map2 = this.f6836b;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) entry.getKey();
            R61 r61 = (R61) entry.getValue();
            abstractC9402fh1.mo7092C(r61.f10005d);
            abstractC9402fh1.mo18267A(r61.f10003b);
            abstractC9402fh1.f27338g = abstractC9402fh1.mo7108y(r61.f10008g, null);
            abstractC9402fh1.m18285r();
        }
    }
}
