package defpackage;

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
public final class C4348iS0 {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final C0462Fr0 e;
    public final InterfaceC6907ro f;
    public final HashMap g;

    public C4348iS0(InterfaceC7480uo interfaceC7480uo, HashSet hashSet) {
        Size sizeE = AbstractC7255tc1.e(interfaceC7480uo.g().P());
        InterfaceC6907ro interfaceC6907roO = interfaceC7480uo.o();
        C0462Fr0 c0462Fr0 = new C0462Fr0(interfaceC6907roO, sizeE);
        this.g = new HashMap();
        this.a = sizeE;
        Rational rational = ((double) sizeE.getWidth()) / ((double) sizeE.getHeight()) > h ? X8.c : X8.a;
        sizeE.toString();
        Objects.toString(rational);
        AbstractC0759Jm0.f("ResolutionsMerger");
        this.b = rational;
        Rational rational2 = X8.a;
        if (rational.equals(rational2)) {
            rational2 = X8.c;
        } else if (!rational.equals(X8.c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.c = rational2;
        this.f = interfaceC6907roO;
        this.d = hashSet;
        this.e = c0462Fr0;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalG = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalG2 = g(size);
        if (rationalG.floatValue() == rationalG2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalG.floatValue() > rationalG2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalG.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalG.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(InterfaceC5361jh1 interfaceC5361jh1) {
        Rational rationalG;
        if (!this.d.contains(interfaceC5361jh1)) {
            throw new IllegalArgumentException("Invalid child config: " + interfaceC5361jh1);
        }
        HashMap map = this.g;
        if (map.containsKey(interfaceC5361jh1)) {
            List list = (List) map.get(interfaceC5361jh1);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = this.e.e(interfaceC5361jh1);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalG = null;
                    break;
                }
                rationalG = (Rational) it.next();
                Rational rational = X8.a;
                if (X8.a(size, rationalG, AbstractC3696f21.c)) {
                    break;
                }
            }
            if (rationalG != null) {
                Size size2 = (Size) map2.get(rationalG);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalG = g(size);
            }
            arrayList.add(size);
            map2.put(rationalG, size);
        }
        map.put(interfaceC5361jh1, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = X8.a;
        Size size2 = AbstractC3696f21.c;
        if (X8.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalG = X8.a;
        if (!X8.a(size, rationalG, size2)) {
            rationalG = X8.c;
            if (!X8.a(size, rationalG, size2)) {
                rationalG = g(size);
            }
        }
        float fFloatValue3 = rationalG.floatValue();
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

    public final ArrayList e(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = X8.a;
        map.put(rational, new ArrayList());
        Rational rational2 = X8.c;
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
                    if (X8.a(size, rational3, AbstractC3696f21.c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalG = g(size);
                    arrayList2.add(rationalG);
                    map.put(rationalG, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new L90(2, g(this.a)));
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(X8.c) && !rational4.equals(X8.a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(f(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = X8.a;
            if (X8.a(size, rational, AbstractC3696f21.c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new C3479dv(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            List<Size> listB = b((InterfaceC5361jh1) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listB) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listB = arrayList3;
            }
            if (listB.isEmpty()) {
                return new ArrayList();
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listB.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (c((Size) it4.next(), size4)) {
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
