package p000;

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
public final class C7953Mh1 implements InterfaceC0615Jl {

    /* renamed from: a */
    public final Method f7302a;

    /* renamed from: b */
    public final Method f7303b;

    /* renamed from: c */
    public final ArrayList f7304c;

    /* renamed from: d */
    public final ArrayList f7305d;

    /* renamed from: e */
    public final ArrayList f7306e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public C7953Mh1(InterfaceC0036AZ interfaceC0036AZ, AbstractC10675pe0 abstractC10675pe0, String str, List list) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ?? M26274e;
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(str, "constructorDesc");
        Method methodM23829m = abstractC10675pe0.m23829m("constructor-impl", str);
        O90.m5965c(methodM23829m);
        this.f7302a = methodM23829m;
        Method methodM23829m2 = abstractC10675pe0.m23829m("box-impl", AbstractC11374v51.m25336K("V", str) + VO0.m8434b(abstractC10675pe0.mo2807b()));
        O90.m5965c(methodM23829m2);
        this.f7303b = methodM23829m2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it = list2.iterator();
        while (true) {
            List listM26274e = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC7742Ig0 type = ((InterfaceC8946cA0) it.next()).getType();
            O90.m5967e(type, "getType(...)");
            X01 x01M26170a = AbstractC11815yZ1.m26170a(type);
            ArrayList arrayListM25298f = AbstractC11361v02.m25298f(x01M26170a);
            if (arrayListM25298f == null) {
                Class clsM25301i = AbstractC11361v02.m25301i(x01M26170a);
                if (clsM25301i != null) {
                    listM26274e = AbstractC7230yu.m26274e(AbstractC11361v02.m25297e(clsM25301i, interfaceC0036AZ));
                }
            } else {
                listM26274e = arrayListM25298f;
            }
            arrayList.add(listM26274e);
        }
        this.f7304c = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            InterfaceC0873Ns interfaceC0873NsMo1962a = ((InterfaceC8946cA0) obj).getType().mo3797E().mo1962a();
            O90.m5966d(interfaceC0873NsMo1962a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC6976us interfaceC6976us = (InterfaceC6976us) interfaceC0873NsMo1962a;
            List list3 = (List) this.f7304c.get(i);
            if (list3 != null) {
                List list4 = list3;
                M26274e = new ArrayList(AbstractC7293zu.m26586k(list4));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    M26274e.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsM2759k = AbstractC7589Fh1.m2759k(interfaceC6976us);
                O90.m5965c(clsM2759k);
                M26274e = AbstractC7230yu.m26274e(clsM2759k);
            }
            arrayList2.add(M26274e);
            i = i2;
        }
        this.f7305d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC0246Du.m1920m(arrayList3, (Iterable) it3.next());
        }
        this.f7306e = arrayList3;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: a */
    public final List mo3319a() {
        return this.f7306e;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo3320b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? M26274e;
        O90.m5968f(objArr, "args");
        ArrayList arrayList = this.f7304c;
        O90.m5968f(arrayList, "other");
        int length = objArr.length;
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC7293zu.m26586k(arrayList), length));
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
            Object obj2 = pair.f36702a;
            List list = (List) pair.f36703b;
            if (list != null) {
                List list2 = list;
                M26274e = new ArrayList(AbstractC7293zu.m26586k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    M26274e.add(((Method) it2.next()).invoke(obj2, null));
                }
            } else {
                M26274e = AbstractC7230yu.m26274e(obj2);
            }
            AbstractC0246Du.m1920m(arrayList3, (Iterable) M26274e);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.f7302a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f7303b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // p000.InterfaceC0615Jl
    public final Type getReturnType() {
        Class<?> returnType = this.f7303b.getReturnType();
        O90.m5967e(returnType, "getReturnType(...)");
        return returnType;
    }
}
