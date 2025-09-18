package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: iP */
/* loaded from: classes2.dex */
public final class C4240iP implements InterfaceC8101Pd1 {

    /* renamed from: a */
    public final EnumC6235jP f29118a;

    /* renamed from: b */
    public final String[] f29119b;

    /* renamed from: c */
    public final String f29120c;

    public C4240iP(EnumC6235jP enumC6235jP, String... strArr) {
        O90.m5968f(enumC6235jP, "kind");
        O90.m5968f(strArr, "formatParams");
        this.f29118a = enumC6235jP;
        this.f29119b = strArr;
        EnumC1472XO[] enumC1472XOArr = EnumC1472XO.f13686a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f29120c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(enumC6235jP.f35142a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        C6298kP.f36482a.getClass();
        return C6298kP.f36484c;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: b */
    public final Collection mo5276b() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return false;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        return (C1147SE) C1147SE.f10643f.getValue();
    }

    public final String toString() {
        return this.f29120c;
    }
}
