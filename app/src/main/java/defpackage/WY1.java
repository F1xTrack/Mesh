package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class WY1 {
    public static Object a(Collection collection, InterfaceC5839mC interfaceC5839mC, UY1 uy1) {
        C1016Mu0 c1016Mu0 = new C1016Mu0(10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(it.next(), interfaceC5839mC, c1016Mu0, uy1);
        }
        return uy1.c();
    }

    public static void b(Object obj, InterfaceC5839mC interfaceC5839mC, C1016Mu0 c1016Mu0, UY1 uy1) {
        if (obj != null) {
            if (((HashSet) c1016Mu0.b).add(obj) && uy1.b(obj)) {
                Iterator it = interfaceC5839mC.k(obj).iterator();
                while (it.hasNext()) {
                    b(it.next(), interfaceC5839mC, c1016Mu0, uy1);
                }
                uy1.a(obj);
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
    public static Boolean c(Collection collection, InterfaceC5839mC interfaceC5839mC, InterfaceC6099nZ interfaceC6099nZ) {
        return (Boolean) a(collection, interfaceC5839mC, new C5648lC(interfaceC6099nZ, new boolean[1], 0));
    }

    public static long d(C4103hA0 c4103hA0, int i, int i2) {
        c4103hA0.G(i);
        if (c4103hA0.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = c4103hA0.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i2 || (iG & 32) == 0 || c4103hA0.u() < 7 || c4103hA0.a() < 7 || (c4103hA0.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        c4103hA0.e(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
