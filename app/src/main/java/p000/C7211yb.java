package p000;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: yb */
/* loaded from: classes.dex */
public final class C7211yb implements InterfaceC8502Ww0 {

    /* renamed from: a */
    public static final C7211yb f46321a = new C7211yb();

    /* renamed from: b */
    public static final C1849cT f46322b = C1849cT.m10701c("baseAddress");

    /* renamed from: c */
    public static final C1849cT f46323c = C1849cT.m10701c("size");

    /* renamed from: d */
    public static final C1849cT f46324d = C1849cT.m10701c("name");

    /* renamed from: e */
    public static final C1849cT f46325e = C1849cT.m10701c(CommonUrlParts.UUID);

    @Override // p000.InterfaceC1844cO
    /* renamed from: a */
    public final void mo104a(Object obj, Object obj2) {
        InterfaceC8554Xw0 interfaceC8554Xw0 = (InterfaceC8554Xw0) obj2;
        C1797bd c1797bd = (C1797bd) ((AbstractC0137CA) obj);
        interfaceC8554Xw0.mo4364f(f46322b, c1797bd.f17093a);
        interfaceC8554Xw0.mo4364f(f46323c, c1797bd.f17094b);
        interfaceC8554Xw0.mo4359a(f46324d, c1797bd.f17095c);
        String str = c1797bd.f17096d;
        interfaceC8554Xw0.mo4359a(f46325e, str != null ? str.getBytes(AbstractC1206TA.f11185a) : null);
    }
}
