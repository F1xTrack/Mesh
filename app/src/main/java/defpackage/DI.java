package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class DI extends AbstractC2090aC1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractCollection d;

    public /* synthetic */ DI(AbstractCollection abstractCollection, int i) {
        this.c = i;
        this.d = abstractCollection;
    }

    public static /* synthetic */ void d(int i) {
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

    @Override // defpackage.AbstractC2090aC1
    public final void a(InterfaceC8042xl interfaceC8042xl) {
        switch (this.c) {
            case 0:
                O90.f(interfaceC8042xl, "fakeOverride");
                C7323tz0.r(interfaceC8042xl, null);
                ((ArrayList) this.d).add(interfaceC8042xl);
                return;
            default:
                if (interfaceC8042xl == null) {
                    d(0);
                    throw null;
                }
                C7323tz0.r(interfaceC8042xl, null);
                ((LinkedHashSet) this.d).add(interfaceC8042xl);
                return;
        }
    }

    @Override // defpackage.AbstractC2090aC1
    public final void b(InterfaceC8042xl interfaceC8042xl, InterfaceC8042xl interfaceC8042xl2) {
        switch (this.c) {
            case 0:
                O90.f(interfaceC8042xl2, "fromCurrent");
                if (interfaceC8042xl2 instanceof CZ) {
                    ((CZ) interfaceC8042xl2).F1(KI.a, interfaceC8042xl);
                    return;
                }
                return;
            default:
                if (interfaceC8042xl2 != null) {
                    return;
                }
                d(2);
                throw null;
        }
    }
}
