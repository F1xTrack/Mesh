package p000;

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
public final class C8722aQ0 implements InterfaceC11186td1 {

    /* renamed from: a */
    public final /* synthetic */ int f15501a = 1;

    /* renamed from: b */
    public final Object f15502b;

    /* renamed from: c */
    public final Object f15503c;

    /* renamed from: d */
    public final Object f15504d;

    public C8722aQ0(C6459my c6459my, C1846cQ c1846cQ, C7041vu c7041vu, ArrayList arrayList) {
        this.f15502b = c6459my;
        this.f15503c = c1846cQ;
        this.f15504d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m9729b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!GP0.f3731a.mo1180a(obj, accessibleObject)) {
            throw new C10799qc0(AbstractC7222ym.m26232i(OP0.m6065d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // p000.InterfaceC11186td1
    /* renamed from: a */
    public final AbstractC10930rd1 mo1562a(C1753aw c1753aw, C11698xe1 c11698xe1) {
        switch (this.f15501a) {
            case 0:
                Class cls = c11698xe1.f45725a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                AP1.m177b((ArrayList) this.f15504d);
                return OP0.f8436a.mo4633e(cls) ? new YP0(cls, m9730c(c1753aw, c11698xe1, cls, true)) : new WP0(((C6459my) this.f15502b).m23027b(c11698xe1), m9730c(c1753aw, c11698xe1, cls, false));
            default:
                Class cls2 = (Class) this.f15502b;
                Class cls3 = c11698xe1.f45725a;
                if (cls3 == cls2 || cls3 == ((Class) this.f15503c)) {
                    return (AbstractC10930rd1) this.f15504d;
                }
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x020a, code lost:
    
        r35 = r11;
        r12 = new p000.C11698xe1(p000.AbstractC1378Vu.m8629n(r1, r35, r35.getGenericSuperclass(), new java.util.HashMap()));
        r11 = r12.f45725a;
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedHashMap m9730c(p000.C1753aw r34, p000.C11698xe1 r35, java.lang.Class r36, boolean r37) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8722aQ0.m9730c(aw, xe1, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    /* renamed from: d */
    public boolean m9731d(Field field, boolean z) {
        Class<?> type = field.getType();
        C1846cQ c1846cQ = (C1846cQ) this.f15503c;
        c1846cQ.getClass();
        if (!C1846cQ.m10694c(type)) {
            c1846cQ.m10695b(z);
            if ((field.getModifiers() & ModuleDescriptor.MODULE_VERSION) == 0 && !field.isSynthetic() && !C1846cQ.m10694c(field.getType())) {
                List list = z ? c1846cQ.f17469a : c1846cQ.f17470b;
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
        switch (this.f15501a) {
            case 1:
                StringBuilder sb = new StringBuilder("Factory[type=");
                AbstractC0852NX.m5765n((Class) this.f15503c, sb, "+");
                AbstractC0852NX.m5765n((Class) this.f15502b, sb, ",adapter=");
                sb.append((AbstractC10930rd1) this.f15504d);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C8722aQ0(Class cls, Class cls2, AbstractC10930rd1 abstractC10930rd1) {
        this.f15502b = cls;
        this.f15503c = cls2;
        this.f15504d = abstractC10930rd1;
    }
}
