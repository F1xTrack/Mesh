package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: u5 */
/* loaded from: classes2.dex */
public final class C6927u5 implements InterfaceC0615Jl {

    /* renamed from: a */
    public final Class f43495a;

    /* renamed from: b */
    public final ArrayList f43496b;

    /* renamed from: c */
    public final EnumC6801s5 f43497c;

    /* renamed from: d */
    public final List f43498d;

    /* renamed from: e */
    public final ArrayList f43499e;

    /* renamed from: f */
    public final ArrayList f43500f;

    /* renamed from: g */
    public final ArrayList f43501g;

    public C6927u5(Class cls, ArrayList arrayList, EnumC6801s5 enumC6801s5, EnumC6864t5 enumC6864t5, List list) {
        O90.m5968f(cls, "jClass");
        O90.m5968f(list, "methods");
        this.f43495a = cls;
        this.f43496b = arrayList;
        this.f43497c = enumC6801s5;
        this.f43498d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f43499e = arrayList2;
        List list3 = this.f43498d;
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(list3));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            O90.m5965c(returnType);
            List list4 = VO0.f12536a;
            Class<?> cls2 = (Class) VO0.f12538c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f43500f = arrayList3;
        List list5 = this.f43498d;
        ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(list5));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f43501g = arrayList4;
        if (this.f43497c == EnumC6801s5.f42250b && enumC6864t5 == EnumC6864t5.f42825a) {
            ArrayList arrayList5 = this.f43496b;
            O90.m5968f(arrayList5, "<this>");
            ArrayList arrayList6 = new ArrayList(AbstractC7293zu.m26586k(arrayList5));
            boolean z = false;
            for (Object obj : arrayList5) {
                boolean z2 = true;
                if (!z && O90.m5963a(obj, "value")) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList6.add(obj);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: a */
    public final List mo3319a() {
        return this.f43499e;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo3320b() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    @Override // p000.InterfaceC0615Jl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6927u5.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // p000.InterfaceC0615Jl
    public final Type getReturnType() {
        return this.f43495a;
    }

    public /* synthetic */ C6927u5(Class cls, ArrayList arrayList, EnumC6801s5 enumC6801s5) {
        EnumC6864t5 enumC6864t5 = EnumC6864t5.f42826b;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, enumC6801s5, enumC6864t5, arrayList2);
    }
}
