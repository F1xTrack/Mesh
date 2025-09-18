package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: Mh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0978Mh1 implements InterfaceC0755Jl {
    public final Method a;
    public final Method b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public C0978Mh1(AZ az, AbstractC6497pe0 abstractC6497pe0, String str, List list) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ?? E;
        O90.f(abstractC6497pe0, "container");
        O90.f(str, "constructorDesc");
        Method methodM = abstractC6497pe0.m("constructor-impl", str);
        O90.c(methodM);
        this.a = methodM;
        Method methodM2 = abstractC6497pe0.m("box-impl", AbstractC7538v51.K("V", str) + VO0.b(abstractC6497pe0.b()));
        O90.c(methodM2);
        this.b = methodM2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it = list2.iterator();
        while (true) {
            List listE = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC0663Ig0 type = ((InterfaceC2464cA0) it.next()).getType();
            O90.e(type, "getType(...)");
            X01 x01A = AbstractC8198yZ1.a(type);
            ArrayList arrayListF = AbstractC7520v02.f(x01A);
            if (arrayListF == null) {
                Class clsI = AbstractC7520v02.i(x01A);
                if (clsI != null) {
                    listE = AbstractC8259yu.e(AbstractC7520v02.e(clsI, az));
                }
            } else {
                listE = arrayListF;
            }
            arrayList.add(listE);
        }
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            InterfaceC1087Ns interfaceC1087NsA = ((InterfaceC2464cA0) obj).getType().E().a();
            O90.d(interfaceC1087NsA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC7492us interfaceC7492us = (InterfaceC7492us) interfaceC1087NsA;
            List list3 = (List) this.c.get(i);
            if (list3 != null) {
                List list4 = list3;
                E = new ArrayList(AbstractC8449zu.k(list4));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    E.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsK = AbstractC0433Fh1.k(interfaceC7492us);
                O90.c(clsK);
                E = AbstractC8259yu.e(clsK);
            }
            arrayList2.add(E);
            i = i2;
        }
        this.d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC0314Du.m(arrayList3, (Iterable) it3.next());
        }
        this.e = arrayList3;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final List a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? E;
        O90.f(objArr, "args");
        ArrayList arrayList = this.c;
        O90.f(arrayList, "other");
        int length = objArr.length;
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC8449zu.k(arrayList), length));
        int i = 0;
        for (Object obj : arrayList) {
            if (i >= length) {
                break;
            }
            arrayList2.add(new Pair(objArr[i], obj));
            i++;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj2 = pair.a;
            List list = (List) pair.b;
            if (list != null) {
                List list2 = list;
                E = new ArrayList(AbstractC8449zu.k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    E.add(((Method) it2.next()).invoke(obj2, null));
                }
            } else {
                E = AbstractC8259yu.e(obj2);
            }
            AbstractC0314Du.m(arrayList3, (Iterable) E);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.a.invoke(null, Arrays.copyOf(array, array.length));
        return this.b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Type getReturnType() {
        Class<?> returnType = this.b.getReturnType();
        O90.e(returnType, "getReturnType(...)");
        return returnType;
    }
}
