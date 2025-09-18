package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: my, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5983my {
    public final /* synthetic */ int a;
    public final ArrayList b;
    public final HashMap c;

    public C5983my() {
        this.a = 1;
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC1490Sw0 b(defpackage.C8023xe1 r9) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5983my.b(xe1):Sw0");
    }

    public synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.b.contains(str)) {
                this.b.add(str);
            }
            arrayList = (List) this.c.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.c.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<C6270oS0> list = (List) this.c.get((String) it.next());
            if (list != null) {
                for (C6270oS0 c6270oS0 : list) {
                    if ((c6270oS0.a.isAssignableFrom(cls) && cls2.isAssignableFrom(c6270oS0.b)) && !arrayList.contains(c6270oS0.b)) {
                        arrayList.add(c6270oS0.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.c.toString();
            default:
                return super.toString();
        }
    }

    public C5983my(HashMap map, ArrayList arrayList) {
        this.a = 0;
        this.c = map;
        this.b = arrayList;
    }
}
