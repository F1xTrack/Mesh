package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10616pA1 {

    /* renamed from: a */
    public final ArrayList f39879a = new ArrayList();

    /* renamed from: b */
    public final /* synthetic */ int f39880b;

    public C10616pA1(int i) {
        this.f39880b = i;
    }

    /* renamed from: b */
    public static InterfaceC7885Kz1 m23623b(AB1 ab1, Iterator it, InterfaceC7885Kz1 interfaceC7885Kz1) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC7885Kz1 interfaceC7885Kz1M24412K = ab1.mo103d((InterfaceC7885Kz1) it.next()).m24412K((C11228ty1) interfaceC7885Kz1);
                if (interfaceC7885Kz1M24412K instanceof C8299Sy1) {
                    C8299Sy1 c8299Sy1 = (C8299Sy1) interfaceC7885Kz1M24412K;
                    if ("break".equals(c8299Sy1.f11084b)) {
                        return InterfaceC7885Kz1.f6417i1;
                    }
                    if ("return".equals(c8299Sy1.f11084b)) {
                        return c8299Sy1;
                    }
                }
            }
        }
        return InterfaceC7885Kz1.f6417i1;
    }

    /* renamed from: c */
    public static C8197Qz1 m23624c(C10919rY0 c10919rY0, ArrayList arrayList) {
        AbstractC10983s22.m24596r(EnumC9724iC1.FN, 2, arrayList);
        InterfaceC7885Kz1 interfaceC7885Kz1M9804d = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(0));
        InterfaceC7885Kz1 interfaceC7885Kz1M9804d2 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(1));
        if (!(interfaceC7885Kz1M9804d2 instanceof C11228ty1)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("FN requires an ArrayValue of parameter names found ", interfaceC7885Kz1M9804d2.getClass().getCanonicalName()));
        }
        ArrayList arrayListM25045z = ((C11228ty1) interfaceC7885Kz1M9804d2).m25045z();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C8197Qz1(interfaceC7885Kz1M9804d.zzf(), arrayListM25045z, arrayList2, c10919rY0);
    }

    /* renamed from: e */
    public static boolean m23625e(InterfaceC7885Kz1 interfaceC7885Kz1, InterfaceC7885Kz1 interfaceC7885Kz12) {
        InterfaceC7885Kz1 c7987My1;
        InterfaceC7885Kz1 c7987My12;
        while (!interfaceC7885Kz1.getClass().equals(interfaceC7885Kz12.getClass())) {
            if (((interfaceC7885Kz1 instanceof C11000sA1) || (interfaceC7885Kz1 instanceof C11867yz1)) && ((interfaceC7885Kz12 instanceof C11000sA1) || (interfaceC7885Kz12 instanceof C11867yz1))) {
                return true;
            }
            boolean z = interfaceC7885Kz1 instanceof C7987My1;
            if (z && (interfaceC7885Kz12 instanceof C8509Wz1)) {
                c7987My12 = new C7987My1(interfaceC7885Kz12.zze());
            } else {
                boolean z2 = interfaceC7885Kz1 instanceof C8509Wz1;
                if (z2 && (interfaceC7885Kz12 instanceof C7987My1)) {
                    c7987My1 = new C7987My1(interfaceC7885Kz1.zze());
                } else if (interfaceC7885Kz1 instanceof C11865yy1) {
                    c7987My1 = new C7987My1(interfaceC7885Kz1.zze());
                } else if (interfaceC7885Kz12 instanceof C11865yy1) {
                    c7987My12 = new C7987My1(interfaceC7885Kz12.zze());
                } else if ((z2 || z) && (interfaceC7885Kz12 instanceof InterfaceC8663Zy1)) {
                    c7987My12 = new C8509Wz1(interfaceC7885Kz12.zzf());
                } else {
                    if (!(interfaceC7885Kz1 instanceof InterfaceC8663Zy1) || (!(interfaceC7885Kz12 instanceof C8509Wz1) && !(interfaceC7885Kz12 instanceof C7987My1))) {
                        return false;
                    }
                    c7987My1 = new C8509Wz1(interfaceC7885Kz1.zzf());
                }
                interfaceC7885Kz1 = c7987My1;
            }
            interfaceC7885Kz12 = c7987My12;
        }
        if ((interfaceC7885Kz1 instanceof C11000sA1) || (interfaceC7885Kz1 instanceof C11867yz1)) {
            return true;
        }
        return interfaceC7885Kz1 instanceof C7987My1 ? (Double.isNaN(interfaceC7885Kz1.zze().doubleValue()) || Double.isNaN(interfaceC7885Kz12.zze().doubleValue()) || interfaceC7885Kz1.zze().doubleValue() != interfaceC7885Kz12.zze().doubleValue()) ? false : true : interfaceC7885Kz1 instanceof C8509Wz1 ? interfaceC7885Kz1.zzf().equals(interfaceC7885Kz12.zzf()) : interfaceC7885Kz1 instanceof C11865yy1 ? interfaceC7885Kz1.zzd().equals(interfaceC7885Kz12.zzd()) : interfaceC7885Kz1 == interfaceC7885Kz12;
    }

    /* renamed from: f */
    public static InterfaceC7885Kz1 m23626f(AB1 ab1, InterfaceC7885Kz1 interfaceC7885Kz1, InterfaceC7885Kz1 interfaceC7885Kz12) {
        if (interfaceC7885Kz1 instanceof Iterable) {
            return m23623b(ab1, ((Iterable) interfaceC7885Kz1).iterator(), interfaceC7885Kz12);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: g */
    public static boolean m23627g(InterfaceC7885Kz1 interfaceC7885Kz1, InterfaceC7885Kz1 interfaceC7885Kz12) {
        if (interfaceC7885Kz1 instanceof InterfaceC8663Zy1) {
            interfaceC7885Kz1 = new C8509Wz1(interfaceC7885Kz1.zzf());
        }
        if (interfaceC7885Kz12 instanceof InterfaceC8663Zy1) {
            interfaceC7885Kz12 = new C8509Wz1(interfaceC7885Kz12.zzf());
        }
        if ((interfaceC7885Kz1 instanceof C8509Wz1) && (interfaceC7885Kz12 instanceof C8509Wz1)) {
            return ((C8509Wz1) interfaceC7885Kz1).f13472a.compareTo(((C8509Wz1) interfaceC7885Kz12).f13472a) < 0;
        }
        double dDoubleValue = interfaceC7885Kz1.zze().doubleValue();
        double dDoubleValue2 = interfaceC7885Kz12.zze().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == ConfigValue.DOUBLE_DEFAULT_VALUE) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* renamed from: h */
    public static boolean m23628h(InterfaceC7885Kz1 interfaceC7885Kz1, InterfaceC7885Kz1 interfaceC7885Kz12) {
        if (interfaceC7885Kz1 instanceof InterfaceC8663Zy1) {
            interfaceC7885Kz1 = new C8509Wz1(interfaceC7885Kz1.zzf());
        }
        if (interfaceC7885Kz12 instanceof InterfaceC8663Zy1) {
            interfaceC7885Kz12 = new C8509Wz1(interfaceC7885Kz12.zzf());
        }
        return (((interfaceC7885Kz1 instanceof C8509Wz1) && (interfaceC7885Kz12 instanceof C8509Wz1)) || !(Double.isNaN(interfaceC7885Kz1.zze().doubleValue()) || Double.isNaN(interfaceC7885Kz12.zze().doubleValue()))) && !m23627g(interfaceC7885Kz12, interfaceC7885Kz1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:422:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v52, types: [ty1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, rY0] */
    /* JADX WARN: Type inference failed for: r14v45, types: [ty1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC7885Kz1 m23629a(java.lang.String r12, p000.C10919rY0 r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10616pA1.m23629a(java.lang.String, rY0, java.util.ArrayList):Kz1");
    }

    /* renamed from: d */
    public final void m23630d(String str) {
        if (!this.f39879a.contains(AbstractC10983s22.m24589k(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(AbstractC7222ym.m26245v("Command not implemented: ", str));
    }
}
