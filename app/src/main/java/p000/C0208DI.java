package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: DI */
/* loaded from: classes2.dex */
public final class C0208DI extends AbstractC8695aC1 {

    /* renamed from: c */
    public final /* synthetic */ int f1963c;

    /* renamed from: d */
    public final /* synthetic */ AbstractCollection f1964d;

    public /* synthetic */ C0208DI(AbstractCollection abstractCollection, int i) {
        this.f1963c = i;
        this.f1964d = abstractCollection;
    }

    /* renamed from: d */
    public static /* synthetic */ void m1621d(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p000.AbstractC8695aC1
    /* renamed from: a */
    public final void mo1622a(InterfaceC7158xl interfaceC7158xl) {
        switch (this.f1963c) {
            case 0:
                O90.m5968f(interfaceC7158xl, "fakeOverride");
                C11229tz0.m25058r(interfaceC7158xl, null);
                ((ArrayList) this.f1964d).add(interfaceC7158xl);
                return;
            default:
                if (interfaceC7158xl == null) {
                    m1621d(0);
                    throw null;
                }
                C11229tz0.m25058r(interfaceC7158xl, null);
                ((LinkedHashSet) this.f1964d).add(interfaceC7158xl);
                return;
        }
    }

    @Override // p000.AbstractC8695aC1
    /* renamed from: b */
    public final void mo1623b(InterfaceC7158xl interfaceC7158xl, InterfaceC7158xl interfaceC7158xl2) {
        switch (this.f1963c) {
            case 0:
                O90.m5968f(interfaceC7158xl2, "fromCurrent");
                if (interfaceC7158xl2 instanceof AbstractC0162CZ) {
                    ((AbstractC0162CZ) interfaceC7158xl2).m1217F1(C0649KI.f5983a, interfaceC7158xl);
                    return;
                }
                return;
            default:
                if (interfaceC7158xl2 != null) {
                    return;
                }
                m1621d(2);
                throw null;
        }
    }
}
