package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: iI */
/* loaded from: classes2.dex */
public final class C4317iI {
    public static final C0318Dv0 c = new C0318Dv0(12);
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final C4317iI m;
    public static final C4317iI n;
    public static final C4317iI o;
    public static final C4317iI p;
    public static final C4317iI q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List a;
    public final int b;

    static {
        C4126hI c4126hI;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new C4317iI(i8);
        n = new C4317iI(i6 | i7);
        new C4317iI(i2);
        new C4317iI(i3);
        new C4317iI(i4);
        o = new C4317iI(i9);
        new C4317iI(i5);
        p = new C4317iI(i6);
        q = new C4317iI(i7);
        new C4317iI(i3 | i6 | i7);
        Field[] fields = C4317iI.class.getFields();
        O90.e(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C4126hI c4126hI2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C4317iI c4317iI = obj instanceof C4317iI ? (C4317iI) obj : null;
            if (c4317iI != null) {
                String name = field2.getName();
                O90.e(name, "getName(...)");
                c4126hI2 = new C4126hI(c4317iI.b, name);
            }
            if (c4126hI2 != null) {
                arrayList2.add(c4126hI2);
            }
        }
        r = arrayList2;
        Field[] fields2 = C4317iI.class.getFields();
        O90.e(fields2, "getFields(...)");
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
            if (O90.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            O90.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                O90.e(name2, "getName(...)");
                c4126hI = new C4126hI(iIntValue, name2);
            } else {
                c4126hI = null;
            }
            if (c4126hI != null) {
                arrayList5.add(c4126hI);
            }
        }
        s = arrayList5;
    }

    public C4317iI(int i2, List list) {
        O90.f(list, "excludes");
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((AbstractC3935gI) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (i2 & this.b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4317iI.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C4317iI c4317iI = (C4317iI) obj;
        return O90.a(this.a, c4317iI.a) && this.b == c4317iI.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object next;
        Iterator it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C4126hI) next).a == this.b) {
                break;
            }
        }
        C4126hI c4126hI = (C4126hI) next;
        String strH = c4126hI != null ? c4126hI.b : null;
        if (strH == null) {
            ArrayList arrayList = s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C4126hI c4126hI2 = (C4126hI) it2.next();
                String str = a(c4126hI2.a) ? c4126hI2.b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strH = AbstractC8069xu.H(arrayList2, " | ", null, null, null, 62);
        }
        return AbstractC7209tN0.A(AbstractC8235ym.q("DescriptorKindFilter(", strH, ", "), this.a, ')');
    }

    public /* synthetic */ C4317iI(int i2) {
        this(i2, MN.a);
    }
}
