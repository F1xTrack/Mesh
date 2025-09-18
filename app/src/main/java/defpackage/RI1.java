package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class RI1 {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int f(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 99;
            default:
                throw null;
        }
    }

    public static C2520cT g(int i, C4332iN c4332iN) {
        c4332iN.C(new XH1(i));
        return c4332iN.k();
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static XH1 i(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new XH1(i);
    }

    public static C2528cV1 j(C3386dP1 c3386dP1) {
        C2528cV1 c2528cV1O = c3386dP1.o();
        c2528cV1O.v1();
        c2528cV1O.A1();
        return c2528cV1O;
    }

    public static void k(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void l(InterfaceC7383uH1 interfaceC7383uH1) {
        if (interfaceC7383uH1 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void m(C8340zJ1 c8340zJ1) {
        if (c8340zJ1 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void n(LS1 ls1) {
        if (ls1 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void o(YU1 yu1) {
        if (yu1 != null) {
            throw new ClassCastException();
        }
    }

    public static void p(C5716lY1 c5716lY1) {
        c5716lY1.p0().v1();
        c5716lY1.g0();
    }
}
