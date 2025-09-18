package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: my */
/* loaded from: classes2.dex */
public final class C6459my {

    /* renamed from: a */
    public final /* synthetic */ int f38004a;

    /* renamed from: b */
    public final ArrayList f38005b;

    /* renamed from: c */
    public final HashMap f38006c;

    public C6459my() {
        this.f38004a = 1;
        this.f38005b = new ArrayList();
        this.f38006c = new HashMap();
    }

    /* renamed from: a */
    public static String m23026a(Class cls) {
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC8294Sw0 m23027b(p000.C11698xe1 r9) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6459my.m23027b(xe1):Sw0");
    }

    /* renamed from: c */
    public synchronized List m23028c(String str) {
        List arrayList;
        try {
            if (!this.f38005b.contains(str)) {
                this.f38005b.add(str);
            }
            arrayList = (List) this.f38006c.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f38006c.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized ArrayList m23029d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f38005b.iterator();
        while (it.hasNext()) {
            List<C10523oS0> list = (List) this.f38006c.get((String) it.next());
            if (list != null) {
                for (C10523oS0 c10523oS0 : list) {
                    if ((c10523oS0.f39020a.isAssignableFrom(cls) && cls2.isAssignableFrom(c10523oS0.f39021b)) && !arrayList.contains(c10523oS0.f39021b)) {
                        arrayList.add(c10523oS0.f39021b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f38004a) {
            case 0:
                return this.f38006c.toString();
            default:
                return super.toString();
        }
    }

    public C6459my(HashMap map, ArrayList arrayList) {
        this.f38004a = 0;
        this.f38006c = map;
        this.f38005b = arrayList;
    }
}
