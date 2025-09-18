package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: iI */
/* loaded from: classes2.dex */
public final class C4233iI {

    /* renamed from: c */
    public static final C7512Dv0 f29048c = new C7512Dv0(12);

    /* renamed from: d */
    public static final int f29049d;

    /* renamed from: e */
    public static final int f29050e;

    /* renamed from: f */
    public static final int f29051f;

    /* renamed from: g */
    public static final int f29052g;

    /* renamed from: h */
    public static final int f29053h;

    /* renamed from: i */
    public static final int f29054i;

    /* renamed from: j */
    public static final int f29055j;

    /* renamed from: k */
    public static final int f29056k;

    /* renamed from: l */
    public static final int f29057l;

    /* renamed from: m */
    public static final C4233iI f29058m;

    /* renamed from: n */
    public static final C4233iI f29059n;

    /* renamed from: o */
    public static final C4233iI f29060o;

    /* renamed from: p */
    public static final C4233iI f29061p;

    /* renamed from: q */
    public static final C4233iI f29062q;

    /* renamed from: r */
    public static final ArrayList f29063r;

    /* renamed from: s */
    public static final ArrayList f29064s;

    /* renamed from: a */
    public final List f29065a;

    /* renamed from: b */
    public final int f29066b;

    static {
        C4170hI c4170hI;
        int i = f29049d;
        int i2 = i << 1;
        f29050e = i;
        int i3 = i << 2;
        f29051f = i2;
        int i4 = i << 3;
        f29052g = i3;
        int i5 = i << 4;
        f29053h = i4;
        int i6 = i << 5;
        f29054i = i5;
        f29055j = i6;
        f29049d = i << 7;
        int i7 = (i << 6) - 1;
        f29056k = i7;
        int i8 = i | i2 | i3;
        f29057l = i8;
        f29058m = new C4233iI(i7);
        f29059n = new C4233iI(i5 | i6);
        new C4233iI(i);
        new C4233iI(i2);
        new C4233iI(i3);
        f29060o = new C4233iI(i8);
        new C4233iI(i4);
        f29061p = new C4233iI(i5);
        f29062q = new C4233iI(i6);
        new C4233iI(i2 | i5 | i6);
        Field[] fields = C4233iI.class.getFields();
        O90.m5967e(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C4170hI c4170hI2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C4233iI c4233iI = obj instanceof C4233iI ? (C4233iI) obj : null;
            if (c4233iI != null) {
                String name = field2.getName();
                O90.m5967e(name, "getName(...)");
                c4170hI2 = new C4170hI(c4233iI.f29066b, name);
            }
            if (c4170hI2 != null) {
                arrayList2.add(c4170hI2);
            }
        }
        f29063r = arrayList2;
        Field[] fields2 = C4233iI.class.getFields();
        O90.m5967e(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (O90.m5963a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                O90.m5967e(name2, "getName(...)");
                c4170hI = new C4170hI(iIntValue, name2);
            } else {
                c4170hI = null;
            }
            if (c4170hI != null) {
                arrayList5.add(c4170hI);
            }
        }
        f29064s = arrayList5;
    }

    public C4233iI(int i, List list) {
        O90.m5968f(list, "excludes");
        this.f29065a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((AbstractC4107gI) it.next()).mo17896a();
        }
        this.f29066b = i;
    }

    /* renamed from: a */
    public final boolean m18998a(int i) {
        return (i & this.f29066b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4233iI.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C4233iI c4233iI = (C4233iI) obj;
        return O90.m5963a(this.f29065a, c4233iI.f29065a) && this.f29066b == c4233iI.f29066b;
    }

    public final int hashCode() {
        return (this.f29065a.hashCode() * 31) + this.f29066b;
    }

    public final String toString() {
        Object next;
        Iterator it = f29063r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C4170hI) next).f28369a == this.f29066b) {
                break;
            }
        }
        C4170hI c4170hI = (C4170hI) next;
        String strM25962H = c4170hI != null ? c4170hI.f28370b : null;
        if (strM25962H == null) {
            ArrayList arrayList = f29064s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C4170hI c4170hI2 = (C4170hI) it2.next();
                String str = m18998a(c4170hI2.f28369a) ? c4170hI2.f28370b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strM25962H = AbstractC7167xu.m25962H(arrayList2, " | ", null, null, null, 62);
        }
        return AbstractC11153tN0.m24883A(AbstractC7222ym.m26240q("DescriptorKindFilter(", strM25962H, ", "), this.f29065a, ')');
    }

    public /* synthetic */ C4233iI(int i) {
        this(i, C0779MN.f7117a);
    }
}
