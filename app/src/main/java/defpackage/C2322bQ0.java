package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: bQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2322bQ0 implements InterfaceC7449ud1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public C2322bQ0(ES1 es1, C3387dQ c3387dQ, C7879wu c7879wu, List list) {
        this.b = es1;
        this.c = c3387dQ;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!HP0.a.a(obj, accessibleObject)) {
            throw new C7074sg(AbstractC8235ym.i(PP0.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // defpackage.InterfaceC7449ud1
    public final AbstractC7067sd1 a(C3504e20 c3504e20, C8213ye1 c8213ye1) throws NoSuchMethodException, SecurityException {
        AbstractC7067sd1 xp0;
        switch (this.a) {
            case 0:
                Class cls = c8213ye1.a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                CP1.a((List) this.d);
                if (PP0.a.d(cls)) {
                    xp0 = new ZP0(cls, c(c3504e20, c8213ye1, cls, true));
                } else {
                    ((ES1) this.b).s(c8213ye1);
                    xp0 = new XP0(c(c3504e20, c8213ye1, cls, false));
                }
                return xp0;
            default:
                Class cls2 = (Class) this.b;
                Class cls3 = c8213ye1.a;
                if (cls3 == cls2 || cls3 == ((Class) this.c)) {
                    return (AbstractC7067sd1) this.d;
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        r14 = new defpackage.C8213ye1(defpackage.AbstractC6960s4.h(r1, r15, r15.getGenericSuperclass(), new java.util.HashMap()));
        r15 = r14.a;
        r0 = r32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap c(defpackage.C3504e20 r33, defpackage.C8213ye1 r34, java.lang.Class r35, boolean r36) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2322bQ0.c(e20, ye1, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public boolean d(Field field, boolean z) {
        Class<?> type = field.getType();
        C3387dQ c3387dQ = (C3387dQ) this.c;
        c3387dQ.getClass();
        if (!C3387dQ.c(type)) {
            c3387dQ.b(z);
            if ((field.getModifiers() & ModuleDescriptor.MODULE_VERSION) == 0 && !field.isSynthetic() && !C3387dQ.c(field.getType())) {
                List list = z ? c3387dQ.a : c3387dQ.b;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        throw AbstractC8235ym.d(it);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("Factory[type=");
                NX.n((Class) this.c, sb, "+");
                NX.n((Class) this.b, sb, ",adapter=");
                sb.append((AbstractC7067sd1) this.d);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C2322bQ0(Class cls, Class cls2, AbstractC7067sd1 abstractC7067sd1) {
        this.b = cls;
        this.c = cls2;
        this.d = abstractC7067sd1;
    }
}
