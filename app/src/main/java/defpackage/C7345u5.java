package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7345u5 implements InterfaceC0755Jl {
    public final Class a;
    public final ArrayList b;
    public final EnumC6963s5 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public C7345u5(Class cls, ArrayList arrayList, EnumC6963s5 enumC6963s5, EnumC7154t5 enumC7154t5, List list) {
        O90.f(cls, "jClass");
        O90.f(list, "methods");
        this.a = cls;
        this.b = arrayList;
        this.c = enumC6963s5;
        this.d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list3 = this.d;
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(list3));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            O90.c(returnType);
            List list4 = VO0.a;
            Class<?> cls2 = (Class) VO0.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list5 = this.d;
        ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(list5));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == EnumC6963s5.b && enumC7154t5 == EnumC7154t5.a) {
            ArrayList arrayList5 = this.b;
            O90.f(arrayList5, "<this>");
            ArrayList arrayList6 = new ArrayList(AbstractC8449zu.k(arrayList5));
            boolean z = false;
            for (Object obj : arrayList5) {
                boolean z2 = true;
                if (!z && O90.a(obj, "value")) {
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

    @Override // defpackage.InterfaceC0755Jl
    public final List a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    @Override // defpackage.InterfaceC0755Jl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7345u5.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ C7345u5(Class cls, ArrayList arrayList, EnumC6963s5 enumC6963s5) {
        EnumC7154t5 enumC7154t5 = EnumC7154t5.b;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, enumC6963s5, enumC7154t5, arrayList2);
    }
}
