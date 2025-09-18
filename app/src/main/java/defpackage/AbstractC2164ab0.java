package defpackage;

import java.util.HashMap;

/* renamed from: ab0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2164ab0 {
    public static final C7575vI a;
    public static final C7575vI b;
    public static final C7575vI c;
    public static final HashMap d;

    static {
        C0648Ib0 c0648Ib0 = C0648Ib0.d;
        C7575vI c7575vI = new C7575vI(c0648Ib0, 9);
        a = c7575vI;
        C0804Kb0 c0804Kb0 = C0804Kb0.d;
        C7575vI c7575vI2 = new C7575vI(c0804Kb0, 10);
        b = c7575vI2;
        C0726Jb0 c0726Jb0 = C0726Jb0.d;
        C7575vI c7575vI3 = new C7575vI(c0726Jb0, 11);
        c = c7575vI3;
        HashMap map = new HashMap();
        d = map;
        map.put(c0648Ib0, c7575vI);
        map.put(c0804Kb0, c7575vI2);
        map.put(c0726Jb0, c7575vI3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(C0474Fv0 c0474Fv0, HD hd, CD cd) {
        if (cd == null) {
            a(1);
            throw null;
        }
        int i = AbstractC7002sI.a;
        if (c(hd instanceof InterfaceC8042xl ? AbstractC7002sI.t((InterfaceC8042xl) hd) : hd, cd)) {
            return true;
        }
        return AbstractC7765wI.c.a(c0474Fv0, hd, cd);
    }

    public static boolean c(HD hd, CD cd) {
        if (hd == null) {
            a(2);
            throw null;
        }
        if (cd == null) {
            a(3);
            throw null;
        }
        InterfaceC8465zz0 interfaceC8465zz0 = (InterfaceC8465zz0) AbstractC7002sI.i(hd, InterfaceC8465zz0.class, false);
        InterfaceC8465zz0 interfaceC8465zz02 = (InterfaceC8465zz0) AbstractC7002sI.i(cd, InterfaceC8465zz0.class, false);
        return (interfaceC8465zz02 == null || interfaceC8465zz0 == null || !((AbstractC0096Az0) interfaceC8465zz0).f.equals(((AbstractC0096Az0) interfaceC8465zz02).f)) ? false : true;
    }
}
