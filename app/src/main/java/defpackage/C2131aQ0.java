package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aQ0 */
/* loaded from: classes2.dex */
public final class C2131aQ0 implements InterfaceC7258td1 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public C2131aQ0(C5983my c5983my, C2511cQ c2511cQ, C7689vu c7689vu, ArrayList arrayList) {
        this.b = c5983my;
        this.c = c2511cQ;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!GP0.a.a(obj, accessibleObject)) {
            throw new C6682qc0(AbstractC8235ym.i(OP0.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // defpackage.InterfaceC7258td1
    public final AbstractC6876rd1 a(C2226aw c2226aw, C8023xe1 c8023xe1) {
        switch (this.a) {
            case 0:
                Class cls = c8023xe1.a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                AP1.b((ArrayList) this.d);
                return OP0.a.e(cls) ? new YP0(cls, c(c2226aw, c8023xe1, cls, true)) : new WP0(((C5983my) this.b).b(c8023xe1), c(c2226aw, c8023xe1, cls, false));
            default:
                Class cls2 = (Class) this.b;
                Class cls3 = c8023xe1.a;
                if (cls3 == cls2 || cls3 == ((Class) this.c)) {
                    return (AbstractC6876rd1) this.d;
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x020a, code lost:
    
        r35 = r11;
        r12 = new defpackage.C8023xe1(defpackage.AbstractC1717Vu.n(r1, r35, r35.getGenericSuperclass(), new java.util.HashMap()));
        r11 = r12.a;
        r14 = r34;
        r13 = r13;
        r15 = r15;
        r0 = r33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap c(defpackage.C2226aw r34, defpackage.C8023xe1 r35, java.lang.Class r36, boolean r37) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2131aQ0.c(aw, xe1, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public boolean d(Field field, boolean z) {
        Class<?> type = field.getType();
        C2511cQ c2511cQ = (C2511cQ) this.c;
        c2511cQ.getClass();
        if (!C2511cQ.c(type)) {
            c2511cQ.b(z);
            if ((field.getModifiers() & ModuleDescriptor.MODULE_VERSION) == 0 && !field.isSynthetic() && !C2511cQ.c(field.getType())) {
                List list = z ? c2511cQ.a : c2511cQ.b;
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
                sb.append((AbstractC6876rd1) this.d);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C2131aQ0(Class cls, Class cls2, AbstractC6876rd1 abstractC6876rd1) {
        this.b = cls;
        this.c = cls2;
        this.d = abstractC6876rd1;
    }
}
