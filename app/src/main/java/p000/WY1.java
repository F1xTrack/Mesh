package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class WY1 {
    /* renamed from: a */
    public static Object m8805a(Collection collection, InterfaceC6411mC interfaceC6411mC, UY1 uy1) {
        C7978Mu0 c7978Mu0 = new C7978Mu0(10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m8806b(it.next(), interfaceC6411mC, c7978Mu0, uy1);
        }
        return uy1.mo7088c();
    }

    /* renamed from: b */
    public static void m8806b(Object obj, InterfaceC6411mC interfaceC6411mC, C7978Mu0 c7978Mu0, UY1 uy1) {
        if (obj != null) {
            if (((HashSet) c7978Mu0.f7393b).add(obj) && uy1.mo7087b(obj)) {
                Iterator it = interfaceC6411mC.mo2553k(obj).iterator();
                while (it.hasNext()) {
                    m8806b(it.next(), interfaceC6411mC, c7978Mu0, uy1);
                }
                uy1.mo8082a(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    /* renamed from: c */
    public static Boolean m8807c(Collection collection, InterfaceC6411mC interfaceC6411mC, InterfaceC6497nZ interfaceC6497nZ) {
        return (Boolean) m8805a(collection, interfaceC6411mC, new C6348lC(interfaceC6497nZ, new boolean[1], 0));
    }

    /* renamed from: d */
    public static long m8808d(C9591hA0 c9591hA0, int i, int i2) {
        c9591hA0.m18741G(i);
        if (c9591hA0.m18743a() < 5) {
            return -9223372036854775807L;
        }
        int iM18749g = c9591hA0.m18749g();
        if ((8388608 & iM18749g) != 0 || ((2096896 & iM18749g) >> 8) != i2 || (iM18749g & 32) == 0 || c9591hA0.m18763u() < 7 || c9591hA0.m18743a() < 7 || (c9591hA0.m18763u() & 16) != 16) {
            return -9223372036854775807L;
        }
        c9591hA0.m18747e(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
