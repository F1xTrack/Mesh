package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: rI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6811rI extends AbstractC2090aC1 {
    public final /* synthetic */ InterfaceC2508cP c;
    public final /* synthetic */ LinkedHashSet d;
    public final /* synthetic */ boolean e;

    public C6811rI(InterfaceC2508cP interfaceC2508cP, LinkedHashSet linkedHashSet, boolean z) {
        this.c = interfaceC2508cP;
        this.d = linkedHashSet;
        this.e = z;
    }

    public static /* synthetic */ void d(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC2090aC1
    public final void a(InterfaceC8042xl interfaceC8042xl) {
        if (interfaceC8042xl == null) {
            d(0);
            throw null;
        }
        C7323tz0.r(interfaceC8042xl, new B(1, this));
        this.d.add(interfaceC8042xl);
    }

    @Override // defpackage.AbstractC2090aC1
    public final void b(InterfaceC8042xl interfaceC8042xl, InterfaceC8042xl interfaceC8042xl2) {
        if (interfaceC8042xl2 != null) {
            return;
        }
        d(2);
        throw null;
    }

    @Override // defpackage.AbstractC2090aC1
    public final void c(InterfaceC8042xl interfaceC8042xl, Collection collection) {
        if (interfaceC8042xl == null) {
            d(3);
            throw null;
        }
        if (!this.e || interfaceC8042xl.l() == 2) {
            interfaceC8042xl.H0(collection);
        }
    }
}
