package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public class IP0 {
    public InterfaceC1667Vd0 b(Class cls) {
        return new C0464Fs(cls);
    }

    public InterfaceC5733le0 c(Class cls, String str) {
        return new C0564Gz0(cls, str);
    }

    public String h(InterfaceC7435uZ interfaceC7435uZ) {
        String string = interfaceC7435uZ.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(AbstractC1676Vg0 abstractC1676Vg0) {
        return h(abstractC1676Vg0);
    }

    public InterfaceC7454uf0 j(InterfaceC1667Vd0 interfaceC1667Vd0, List list, boolean z) {
        return new C6879re1(interfaceC1667Vd0, list, z);
    }

    public InterfaceC6878re0 a(EZ ez) {
        return ez;
    }

    public InterfaceC0189Ce0 d(C0624Ht0 c0624Ht0) {
        return c0624Ht0;
    }

    public InterfaceC1904Ye0 e(C2000Zk0 c2000Zk0) {
        return c2000Zk0;
    }

    public InterfaceC3433df0 f(GE0 ge0) {
        return ge0;
    }

    public InterfaceC4386if0 g(HE0 he0) {
        return he0;
    }
}
