package p000;

import java.util.HashMap;

/* renamed from: ab0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8744ab0 {

    /* renamed from: a */
    public static final C7003vI f15575a;

    /* renamed from: b */
    public static final C7003vI f15576b;

    /* renamed from: c */
    public static final C7003vI f15577c;

    /* renamed from: d */
    public static final HashMap f15578d;

    static {
        C7732Ib0 c7732Ib0 = C7732Ib0.f5028d;
        C7003vI c7003vI = new C7003vI(c7732Ib0, 9);
        f15575a = c7003vI;
        C7836Kb0 c7836Kb0 = C7836Kb0.f6222d;
        C7003vI c7003vI2 = new C7003vI(c7836Kb0, 10);
        f15576b = c7003vI2;
        C7784Jb0 c7784Jb0 = C7784Jb0.f5623d;
        C7003vI c7003vI3 = new C7003vI(c7784Jb0, 11);
        f15577c = c7003vI3;
        HashMap map = new HashMap();
        f15578d = map;
        map.put(c7732Ib0, c7003vI);
        map.put(c7836Kb0, c7003vI2);
        map.put(c7784Jb0, c7003vI3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m9767a(int i) {
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

    /* renamed from: b */
    public static boolean m9768b(C7616Fv0 c7616Fv0, InterfaceC0455HD interfaceC0455HD, InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m9767a(1);
            throw null;
        }
        int i = AbstractC6814sI.f42360a;
        if (m9769c(interfaceC0455HD instanceof InterfaceC7158xl ? AbstractC6814sI.m24708t((InterfaceC7158xl) interfaceC0455HD) : interfaceC0455HD, interfaceC0140CD)) {
            return true;
        }
        return AbstractC7066wI.f44762c.m25381a(c7616Fv0, interfaceC0455HD, interfaceC0140CD);
    }

    /* renamed from: c */
    public static boolean m9769c(InterfaceC0455HD interfaceC0455HD, InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0455HD == null) {
            m9767a(2);
            throw null;
        }
        if (interfaceC0140CD == null) {
            m9767a(3);
            throw null;
        }
        InterfaceC11993zz0 interfaceC11993zz0 = (InterfaceC11993zz0) AbstractC6814sI.m24697i(interfaceC0455HD, InterfaceC11993zz0.class, false);
        InterfaceC11993zz0 interfaceC11993zz02 = (InterfaceC11993zz0) AbstractC6814sI.m24697i(interfaceC0140CD, InterfaceC11993zz0.class, false);
        return (interfaceC11993zz02 == null || interfaceC11993zz0 == null || !((AbstractC7364Az0) interfaceC11993zz0).f494f.equals(((AbstractC7364Az0) interfaceC11993zz02).f494f)) ? false : true;
    }
}
