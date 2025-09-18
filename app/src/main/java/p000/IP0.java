package p000;

import java.util.List;

/* loaded from: classes2.dex */
public class IP0 {
    /* renamed from: b */
    public InterfaceC8412Vd0 mo3846b(Class cls) {
        return new C0370Fs(cls);
    }

    /* renamed from: c */
    public InterfaceC10163le0 mo3847c(Class cls, String str) {
        return new C7676Gz0(cls, str);
    }

    /* renamed from: h */
    public String mo3852h(InterfaceC6957uZ interfaceC6957uZ) {
        String string = interfaceC6957uZ.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* renamed from: i */
    public String mo3853i(AbstractC8418Vg0 abstractC8418Vg0) {
        return mo3852h(abstractC8418Vg0);
    }

    /* renamed from: j */
    public InterfaceC11317uf0 mo3854j(InterfaceC8412Vd0 interfaceC8412Vd0, List list, boolean z) {
        return new C10932re1(interfaceC8412Vd0, list, z);
    }

    /* renamed from: a */
    public InterfaceC10931re0 mo3845a(AbstractC0288EZ abstractC0288EZ) {
        return abstractC0288EZ;
    }

    /* renamed from: d */
    public InterfaceC7426Ce0 mo3848d(C7716Ht0 c7716Ht0) {
        return c7716Ht0;
    }

    /* renamed from: e */
    public InterfaceC8570Ye0 mo3849e(C8634Zk0 c8634Zk0) {
        return c8634Zk0;
    }

    /* renamed from: f */
    public InterfaceC9141df0 mo3850f(GE0 ge0) {
        return ge0;
    }

    /* renamed from: g */
    public InterfaceC9781if0 mo3851g(HE0 he0) {
        return he0;
    }
}
