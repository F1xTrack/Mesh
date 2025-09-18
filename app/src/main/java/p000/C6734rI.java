package p000;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: rI */
/* loaded from: classes2.dex */
public final class C6734rI extends AbstractC8695aC1 {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1845cP f41507c;

    /* renamed from: d */
    public final /* synthetic */ LinkedHashSet f41508d;

    /* renamed from: e */
    public final /* synthetic */ boolean f41509e;

    public C6734rI(InterfaceC1845cP interfaceC1845cP, LinkedHashSet linkedHashSet, boolean z) {
        this.f41507c = interfaceC1845cP;
        this.f41508d = linkedHashSet;
        this.f41509e = z;
    }

    /* renamed from: d */
    public static /* synthetic */ void m24253d(int i) {
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

    @Override // p000.AbstractC8695aC1
    /* renamed from: a */
    public final void mo1622a(InterfaceC7158xl interfaceC7158xl) {
        if (interfaceC7158xl == null) {
            m24253d(0);
            throw null;
        }
        C11229tz0.m25058r(interfaceC7158xl, new C0063B(1, this));
        this.f41508d.add(interfaceC7158xl);
    }

    @Override // p000.AbstractC8695aC1
    /* renamed from: b */
    public final void mo1623b(InterfaceC7158xl interfaceC7158xl, InterfaceC7158xl interfaceC7158xl2) {
        if (interfaceC7158xl2 != null) {
            return;
        }
        m24253d(2);
        throw null;
    }

    @Override // p000.AbstractC8695aC1
    /* renamed from: c */
    public final void mo9682c(InterfaceC7158xl interfaceC7158xl, Collection collection) {
        if (interfaceC7158xl == null) {
            m24253d(3);
            throw null;
        }
        if (!this.f41509e || interfaceC7158xl.mo116l() == 2) {
            interfaceC7158xl.mo109H0(collection);
        }
    }
}
