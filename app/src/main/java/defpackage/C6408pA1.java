package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6408pA1 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public C6408pA1(int i) {
        this.b = i;
    }

    public static InterfaceC0877Kz1 b(AB1 ab1, Iterator it, InterfaceC0877Kz1 interfaceC0877Kz1) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0877Kz1 interfaceC0877Kz1K = ab1.d((InterfaceC0877Kz1) it.next()).K((C7321ty1) interfaceC0877Kz1);
                if (interfaceC0877Kz1K instanceof C1497Sy1) {
                    C1497Sy1 c1497Sy1 = (C1497Sy1) interfaceC0877Kz1K;
                    if ("break".equals(c1497Sy1.b)) {
                        return InterfaceC0877Kz1.i1;
                    }
                    if ("return".equals(c1497Sy1.b)) {
                        return c1497Sy1;
                    }
                }
            }
        }
        return InterfaceC0877Kz1.i1;
    }

    public static C1344Qz1 c(C6860rY0 c6860rY0, ArrayList arrayList) {
        AbstractC6955s22.r(EnumC4301iC1.FN, 2, arrayList);
        InterfaceC0877Kz1 interfaceC0877Kz1D = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(0));
        InterfaceC0877Kz1 interfaceC0877Kz1D2 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(1));
        if (!(interfaceC0877Kz1D2 instanceof C7321ty1)) {
            throw new IllegalArgumentException(AbstractC8235ym.v("FN requires an ArrayValue of parameter names found ", interfaceC0877Kz1D2.getClass().getCanonicalName()));
        }
        ArrayList arrayListZ = ((C7321ty1) interfaceC0877Kz1D2).z();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C1344Qz1(interfaceC0877Kz1D.zzf(), arrayListZ, arrayList2, c6860rY0);
    }

    public static boolean e(InterfaceC0877Kz1 interfaceC0877Kz1, InterfaceC0877Kz1 interfaceC0877Kz12) {
        InterfaceC0877Kz1 c1029My1;
        InterfaceC0877Kz1 c1029My12;
        while (!interfaceC0877Kz1.getClass().equals(interfaceC0877Kz12.getClass())) {
            if (((interfaceC0877Kz1 instanceof C6980sA1) || (interfaceC0877Kz1 instanceof C8276yz1)) && ((interfaceC0877Kz12 instanceof C6980sA1) || (interfaceC0877Kz12 instanceof C8276yz1))) {
                return true;
            }
            boolean z = interfaceC0877Kz1 instanceof C1029My1;
            if (z && (interfaceC0877Kz12 instanceof C1812Wz1)) {
                c1029My12 = new C1029My1(interfaceC0877Kz12.zze());
            } else {
                boolean z2 = interfaceC0877Kz1 instanceof C1812Wz1;
                if (z2 && (interfaceC0877Kz12 instanceof C1029My1)) {
                    c1029My1 = new C1029My1(interfaceC0877Kz1.zze());
                } else if (interfaceC0877Kz1 instanceof C8273yy1) {
                    c1029My1 = new C1029My1(interfaceC0877Kz1.zze());
                } else if (interfaceC0877Kz12 instanceof C8273yy1) {
                    c1029My12 = new C1029My1(interfaceC0877Kz12.zze());
                } else if ((z2 || z) && (interfaceC0877Kz12 instanceof InterfaceC2043Zy1)) {
                    c1029My12 = new C1812Wz1(interfaceC0877Kz12.zzf());
                } else {
                    if (!(interfaceC0877Kz1 instanceof InterfaceC2043Zy1) || (!(interfaceC0877Kz12 instanceof C1812Wz1) && !(interfaceC0877Kz12 instanceof C1029My1))) {
                        return false;
                    }
                    c1029My1 = new C1812Wz1(interfaceC0877Kz1.zzf());
                }
                interfaceC0877Kz1 = c1029My1;
            }
            interfaceC0877Kz12 = c1029My12;
        }
        if ((interfaceC0877Kz1 instanceof C6980sA1) || (interfaceC0877Kz1 instanceof C8276yz1)) {
            return true;
        }
        return interfaceC0877Kz1 instanceof C1029My1 ? (Double.isNaN(interfaceC0877Kz1.zze().doubleValue()) || Double.isNaN(interfaceC0877Kz12.zze().doubleValue()) || interfaceC0877Kz1.zze().doubleValue() != interfaceC0877Kz12.zze().doubleValue()) ? false : true : interfaceC0877Kz1 instanceof C1812Wz1 ? interfaceC0877Kz1.zzf().equals(interfaceC0877Kz12.zzf()) : interfaceC0877Kz1 instanceof C8273yy1 ? interfaceC0877Kz1.zzd().equals(interfaceC0877Kz12.zzd()) : interfaceC0877Kz1 == interfaceC0877Kz12;
    }

    public static InterfaceC0877Kz1 f(AB1 ab1, InterfaceC0877Kz1 interfaceC0877Kz1, InterfaceC0877Kz1 interfaceC0877Kz12) {
        if (interfaceC0877Kz1 instanceof Iterable) {
            return b(ab1, ((Iterable) interfaceC0877Kz1).iterator(), interfaceC0877Kz12);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean g(InterfaceC0877Kz1 interfaceC0877Kz1, InterfaceC0877Kz1 interfaceC0877Kz12) {
        if (interfaceC0877Kz1 instanceof InterfaceC2043Zy1) {
            interfaceC0877Kz1 = new C1812Wz1(interfaceC0877Kz1.zzf());
        }
        if (interfaceC0877Kz12 instanceof InterfaceC2043Zy1) {
            interfaceC0877Kz12 = new C1812Wz1(interfaceC0877Kz12.zzf());
        }
        if ((interfaceC0877Kz1 instanceof C1812Wz1) && (interfaceC0877Kz12 instanceof C1812Wz1)) {
            return ((C1812Wz1) interfaceC0877Kz1).a.compareTo(((C1812Wz1) interfaceC0877Kz12).a) < 0;
        }
        double dDoubleValue = interfaceC0877Kz1.zze().doubleValue();
        double dDoubleValue2 = interfaceC0877Kz12.zze().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == ConfigValue.DOUBLE_DEFAULT_VALUE) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean h(InterfaceC0877Kz1 interfaceC0877Kz1, InterfaceC0877Kz1 interfaceC0877Kz12) {
        if (interfaceC0877Kz1 instanceof InterfaceC2043Zy1) {
            interfaceC0877Kz1 = new C1812Wz1(interfaceC0877Kz1.zzf());
        }
        if (interfaceC0877Kz12 instanceof InterfaceC2043Zy1) {
            interfaceC0877Kz12 = new C1812Wz1(interfaceC0877Kz12.zzf());
        }
        return (((interfaceC0877Kz1 instanceof C1812Wz1) && (interfaceC0877Kz12 instanceof C1812Wz1)) || !(Double.isNaN(interfaceC0877Kz1.zze().doubleValue()) || Double.isNaN(interfaceC0877Kz12.zze().doubleValue()))) && !g(interfaceC0877Kz12, interfaceC0877Kz1);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC0877Kz1 a(java.lang.String r12, defpackage.C6860rY0 r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6408pA1.a(java.lang.String, rY0, java.util.ArrayList):Kz1");
    }

    public final void d(String str) {
        if (!this.a.contains(AbstractC6955s22.k(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(AbstractC8235ym.v("Command not implemented: ", str));
    }
}
