package p000;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: bQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8850bQ0 implements InterfaceC11314ud1 {

    /* renamed from: a */
    public final /* synthetic */ int f17011a = 0;

    /* renamed from: b */
    public final Object f17012b;

    /* renamed from: c */
    public final Object f17013c;

    /* renamed from: d */
    public final Object f17014d;

    public C8850bQ0(ES1 es1, C3927dQ c3927dQ, C7104wu c7104wu, List list) {
        this.f17012b = es1;
        this.f17013c = c3927dQ;
        this.f17014d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m10453b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!HP0.f4284a.mo1678a(obj, accessibleObject)) {
            throw new C6838sg(AbstractC7222ym.m26232i(PP0.m6362d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // p000.InterfaceC11314ud1
    /* renamed from: a */
    public final AbstractC11058sd1 mo2052a(C9189e20 c9189e20, C11825ye1 c11825ye1) throws NoSuchMethodException, SecurityException {
        AbstractC11058sd1 xp0;
        switch (this.f17011a) {
            case 0:
                Class cls = c11825ye1.f46373a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                CP1.m1181a((List) this.f17014d);
                if (PP0.f9065a.mo4968d(cls)) {
                    xp0 = new ZP0(cls, m10454c(c9189e20, c11825ye1, cls, true));
                } else {
                    ((ES1) this.f17012b).m2298s(c11825ye1);
                    xp0 = new XP0(m10454c(c9189e20, c11825ye1, cls, false));
                }
                return xp0;
            default:
                Class cls2 = (Class) this.f17012b;
                Class cls3 = c11825ye1.f46373a;
                if (cls3 == cls2 || cls3 == ((Class) this.f17013c)) {
                    return (AbstractC11058sd1) this.f17014d;
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        r14 = new p000.C11825ye1(p000.AbstractC6800s4.m24609h(r1, r15, r15.getGenericSuperclass(), new java.util.HashMap()));
        r15 = r14.f46373a;
        r0 = r32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap m10454c(p000.C9189e20 r33, p000.C11825ye1 r34, java.lang.Class r35, boolean r36) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8850bQ0.m10454c(e20, ye1, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    /* renamed from: d */
    public boolean m10455d(Field field, boolean z) {
        Class<?> type = field.getType();
        C3927dQ c3927dQ = (C3927dQ) this.f17013c;
        c3927dQ.getClass();
        if (!C3927dQ.m17603c(type)) {
            c3927dQ.m17604b(z);
            if ((field.getModifiers() & ModuleDescriptor.MODULE_VERSION) == 0 && !field.isSynthetic() && !C3927dQ.m17603c(field.getType())) {
                List list = z ? c3927dQ.f26058a : c3927dQ.f26059b;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        throw AbstractC7222ym.m26227d(it);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f17011a) {
            case 1:
                StringBuilder sb = new StringBuilder("Factory[type=");
                AbstractC0852NX.m5765n((Class) this.f17013c, sb, "+");
                AbstractC0852NX.m5765n((Class) this.f17012b, sb, ",adapter=");
                sb.append((AbstractC11058sd1) this.f17014d);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C8850bQ0(Class cls, Class cls2, AbstractC11058sd1 abstractC11058sd1) {
        this.f17012b = cls;
        this.f17013c = cls2;
        this.f17014d = abstractC11058sd1;
    }
}
