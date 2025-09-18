package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: iP */
/* loaded from: classes2.dex */
public final class C4338iP implements InterfaceC1200Pd1 {
    public final EnumC5305jP a;
    public final String[] b;
    public final String c;

    public C4338iP(EnumC5305jP enumC5305jP, String... strArr) {
        O90.f(enumC5305jP, "kind");
        O90.f(strArr, "formatParams");
        this.a = enumC5305jP;
        this.b = strArr;
        XO[] xoArr = XO.a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(enumC5305jP.a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        C5496kP.a.getClass();
        return C5496kP.c;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final Collection b() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        return (SE) SE.f.getValue();
    }

    public final String toString() {
        return this.c;
    }
}
