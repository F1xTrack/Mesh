package p000;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: kP */
/* loaded from: classes2.dex */
public final class C6298kP {

    /* renamed from: a */
    public static final C6298kP f36482a = new C6298kP();

    /* renamed from: b */
    public static final C1662aP f36483b = C1662aP.f15487a;

    /* renamed from: c */
    public static final C1409WO f36484c;

    /* renamed from: d */
    public static final C4177hP f36485d;

    /* renamed from: e */
    public static final C4177hP f36486e;

    /* renamed from: f */
    public static final Set f36487f;

    static {
        EnumC1472XO[] enumC1472XOArr = EnumC1472XO.f13686a;
        f36484c = new C1409WO(C8340Tt0.m7800g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        f36485d = m22197c(EnumC6235jP.f35123h, new String[0]);
        f36486e = m22197c(EnumC6235jP.f35136u, new String[0]);
        f36487f = AbstractC11433vZ0.m25454e(new C1783bP());
    }

    /* renamed from: a */
    public static final C3988eP m22195a(EnumC4051fP enumC4051fP, boolean z, String... strArr) {
        O90.m5968f(strArr, "formatParams");
        if (!z) {
            return new C3988eP(enumC4051fP, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        O90.m5968f(strArr2, "formatParams");
        return new C9260ea1(enumC4051fP, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* renamed from: b */
    public static final C3988eP m22196b(EnumC4051fP enumC4051fP, String... strArr) {
        return m22195a(enumC4051fP, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public static final C4177hP m22197c(EnumC6235jP enumC6235jP, String... strArr) {
        O90.m5968f(enumC6235jP, "kind");
        C0779MN c0779mn = C0779MN.f7117a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        O90.m5968f(strArr2, "formatParams");
        return m22199e(enumC6235jP, c0779mn, m22198d(enumC6235jP, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* renamed from: d */
    public static C4240iP m22198d(EnumC6235jP enumC6235jP, String... strArr) {
        O90.m5968f(enumC6235jP, "kind");
        O90.m5968f(strArr, "formatParams");
        return new C4240iP(enumC6235jP, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public static C4177hP m22199e(EnumC6235jP enumC6235jP, List list, InterfaceC8101Pd1 interfaceC8101Pd1, String... strArr) {
        O90.m5968f(enumC6235jP, "kind");
        O90.m5968f(strArr, "formatParams");
        return new C4177hP(interfaceC8101Pd1, m22196b(EnumC4051fP.f27179e, interfaceC8101Pd1.toString()), enumC6235jP, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public static final boolean m22200f(InterfaceC0140CD interfaceC0140CD) {
        return interfaceC0140CD != null && ((interfaceC0140CD instanceof C1409WO) || (interfaceC0140CD.mo423i() instanceof C1409WO) || interfaceC0140CD == f36483b);
    }
}
