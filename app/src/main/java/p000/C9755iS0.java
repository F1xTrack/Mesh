package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* renamed from: iS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9755iS0 {

    /* renamed from: h */
    public static final double f29129h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a */
    public final Size f29130a;

    /* renamed from: b */
    public final Rational f29131b;

    /* renamed from: c */
    public final Rational f29132c;

    /* renamed from: d */
    public final HashSet f29133d;

    /* renamed from: e */
    public final C7608Fr0 f29134e;

    /* renamed from: f */
    public final InterfaceC6766ro f29135f;

    /* renamed from: g */
    public final HashMap f29136g;

    public C9755iS0(InterfaceC6972uo interfaceC6972uo, HashSet hashSet) {
        Size sizeM24951e = AbstractC11184tc1.m24951e(interfaceC6972uo.mo1333g().mo905P());
        InterfaceC6766ro interfaceC6766roMo1341o = interfaceC6972uo.mo1341o();
        C7608Fr0 c7608Fr0 = new C7608Fr0(interfaceC6766roMo1341o, sizeM24951e);
        this.f29136g = new HashMap();
        this.f29130a = sizeM24951e;
        Rational rational = ((double) sizeM24951e.getWidth()) / ((double) sizeM24951e.getHeight()) > f29129h ? AbstractC1456X8.f13570c : AbstractC1456X8.f13568a;
        sizeM24951e.toString();
        Objects.toString(rational);
        AbstractC7806Jm0.m4412f("ResolutionsMerger");
        this.f29131b = rational;
        Rational rational2 = AbstractC1456X8.f13568a;
        if (rational.equals(rational2)) {
            rational2 = AbstractC1456X8.f13570c;
        } else if (!rational.equals(AbstractC1456X8.f13570c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f29132c = rational2;
        this.f29135f = interfaceC6766roMo1341o;
        this.f29133d = hashSet;
        this.f29134e = c7608Fr0;
    }

    /* renamed from: a */
    public static Rect m19041a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalM19043g = m19043g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM19043g2 = m19043g(size);
        if (rationalM19043g.floatValue() == rationalM19043g2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalM19043g.floatValue() > rationalM19043g2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalM19043g.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalM19043g.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    /* renamed from: c */
    public static boolean m19042c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    /* renamed from: g */
    public static Rational m19043g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: b */
    public final List m19044b(InterfaceC9914jh1 interfaceC9914jh1) {
        Rational rationalM19043g;
        if (!this.f29133d.contains(interfaceC9914jh1)) {
            throw new IllegalArgumentException("Invalid child config: " + interfaceC9914jh1);
        }
        HashMap map = this.f29136g;
        if (map.containsKey(interfaceC9914jh1)) {
            List list = (List) map.get(interfaceC9914jh1);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listM2803e = this.f29134e.m2803e(interfaceC9914jh1);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : listM2803e) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalM19043g = null;
                    break;
                }
                rationalM19043g = (Rational) it.next();
                Rational rational = AbstractC1456X8.f13568a;
                if (AbstractC1456X8.m8936a(size, rationalM19043g, AbstractC9318f21.f27018c)) {
                    break;
                }
            }
            if (rationalM19043g != null) {
                Size size2 = (Size) map2.get(rationalM19043g);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM19043g = m19043g(size);
            }
            arrayList.add(size);
            map2.put(rationalM19043g, size);
        }
        map.put(interfaceC9914jh1, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public final boolean m19045d(Rational rational, Size size) {
        Rational rational2 = this.f29131b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AbstractC1456X8.f13568a;
        Size size2 = AbstractC9318f21.f27018c;
        if (AbstractC1456X8.m8936a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalM19043g = AbstractC1456X8.f13568a;
        if (!AbstractC1456X8.m8936a(size, rationalM19043g, size2)) {
            rationalM19043g = AbstractC1456X8.f13570c;
            if (!AbstractC1456X8.m8936a(size, rationalM19043g, size2)) {
                rationalM19043g = m19043g(size);
            }
        }
        float fFloatValue3 = rationalM19043g.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            if (fFloatValue2 >= fFloatValue3) {
                return false;
            }
        } else if (fFloatValue2 <= fFloatValue3) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final ArrayList m19046e(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AbstractC1456X8.f13568a;
        map.put(rational, new ArrayList());
        Rational rational2 = AbstractC1456X8.f13570c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AbstractC1456X8.m8936a(size, rational3, AbstractC9318f21.f27018c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM19043g = m19043g(size);
                    arrayList2.add(rationalM19043g);
                    map.put(rationalM19043g, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new L90(2, m19043g(this.f29130a)));
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(AbstractC1456X8.f13570c) && !rational4.equals(AbstractC1456X8.f13568a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(m19047f(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    /* renamed from: f */
    public final ArrayList m19047f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = AbstractC1456X8.f13568a;
            if (AbstractC1456X8.m8936a(size, rational, AbstractC9318f21.f27018c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new C3957dv(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f29133d.iterator();
        while (it2.hasNext()) {
            List<Size> listM19044b = m19044b((InterfaceC9914jh1) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listM19044b) {
                    if (!m19045d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listM19044b = arrayList3;
            }
            if (listM19044b.isEmpty()) {
                return new ArrayList();
            }
            if (listM19044b.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listM19044b.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!m19042c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listM19044b.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listM19044b.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (m19042c((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
