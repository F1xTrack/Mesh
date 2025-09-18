package p000;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: vG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11395vG0 {

    /* renamed from: b */
    public static final HashMap f44310b;

    /* renamed from: c */
    public static final HashMap f44311c;

    /* renamed from: a */
    public final HashMap f44312a = new HashMap();

    static {
        HashMap map = new HashMap();
        f44310b = map;
        map.put(C6630pe.f40251g, Range.create(2160, 4319));
        map.put(C6630pe.f40250f, Range.create(1080, 1439));
        map.put(C6630pe.f40249e, Range.create(720, 1079));
        map.put(C6630pe.f40248d, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f44311c = map2;
        map2.put(0, AbstractC1456X8.f13568a);
        map2.put(1, AbstractC1456X8.f13570c);
    }

    public C11395vG0(List list, HashMap map) {
        HashMap map2;
        Integer num;
        C6630pe c6630pe;
        HashMap map3 = f44310b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f44311c;
            if (!zHasNext) {
                break;
            }
            C6630pe c6630pe2 = (C6630pe) it.next();
            this.f44312a.put(new C6565oe(c6630pe2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f44312a.put(new C6565oe(c6630pe2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f44312a.get(new C6565oe((C6630pe) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    c6630pe = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    c6630pe = (C6630pe) entry2.getKey();
                    break;
                }
            }
            if (c6630pe != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (AbstractC1456X8.m8936a(size, (Rational) entry3.getValue(), AbstractC9318f21.f27017b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f44312a.get(new C6565oe(c6630pe, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f44312a.entrySet()) {
            Size size2 = (Size) map.get(((C6565oe) entry4.getKey()).f39148a);
            if (size2 != null) {
                Size size3 = AbstractC9318f21.f27016a;
                Collections.sort((List) entry4.getValue(), new C3937da(size2.getHeight() * size2.getWidth(), 1));
            }
        }
    }
}
