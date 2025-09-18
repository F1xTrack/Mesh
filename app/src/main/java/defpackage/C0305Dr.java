package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: Dr */
/* loaded from: classes2.dex */
public final class C0305Dr {
    public final C1559Tt0 a;
    public final C2512cQ0 b;
    public final Collection c;
    public final InterfaceC6099nZ d;
    public final InterfaceC8440zr[] e;

    public C0305Dr(C1559Tt0 c1559Tt0, C2512cQ0 c2512cQ0, Collection collection, InterfaceC6099nZ interfaceC6099nZ, InterfaceC8440zr... interfaceC8440zrArr) {
        this.a = c1559Tt0;
        this.b = c2512cQ0;
        this.c = collection;
        this.d = interfaceC6099nZ;
        this.e = interfaceC8440zrArr;
    }

    public /* synthetic */ C0305Dr(C1559Tt0 c1559Tt0, InterfaceC8440zr[] interfaceC8440zrArr) {
        this(c1559Tt0, interfaceC8440zrArr, C4258i.w);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0305Dr(C1559Tt0 c1559Tt0, InterfaceC8440zr[] interfaceC8440zrArr, InterfaceC6099nZ interfaceC6099nZ) {
        this(c1559Tt0, null, null, interfaceC6099nZ, (InterfaceC8440zr[]) Arrays.copyOf(interfaceC8440zrArr, interfaceC8440zrArr.length));
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC6099nZ, "additionalChecks");
    }

    public /* synthetic */ C0305Dr(Set set, InterfaceC8440zr[] interfaceC8440zrArr) {
        this(set, interfaceC8440zrArr, C4258i.y);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0305Dr(Collection collection, InterfaceC8440zr[] interfaceC8440zrArr, InterfaceC6099nZ interfaceC6099nZ) {
        this(null, null, collection, interfaceC6099nZ, (InterfaceC8440zr[]) Arrays.copyOf(interfaceC8440zrArr, interfaceC8440zrArr.length));
        O90.f(collection, "nameList");
        O90.f(interfaceC6099nZ, "additionalChecks");
    }
}
