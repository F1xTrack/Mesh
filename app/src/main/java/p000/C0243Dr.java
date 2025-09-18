package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: Dr */
/* loaded from: classes2.dex */
public final class C0243Dr {

    /* renamed from: a */
    public final C8340Tt0 f2273a;

    /* renamed from: b */
    public final C8978cQ0 f2274b;

    /* renamed from: c */
    public final Collection f2275c;

    /* renamed from: d */
    public final InterfaceC6497nZ f2276d;

    /* renamed from: e */
    public final InterfaceC7290zr[] f2277e;

    public C0243Dr(C8340Tt0 c8340Tt0, C8978cQ0 c8978cQ0, Collection collection, InterfaceC6497nZ interfaceC6497nZ, InterfaceC7290zr... interfaceC7290zrArr) {
        this.f2273a = c8340Tt0;
        this.f2274b = c8978cQ0;
        this.f2275c = collection;
        this.f2276d = interfaceC6497nZ;
        this.f2277e = interfaceC7290zrArr;
    }

    public /* synthetic */ C0243Dr(C8340Tt0 c8340Tt0, InterfaceC7290zr[] interfaceC7290zrArr) {
        this(c8340Tt0, interfaceC7290zrArr, C4214i.f28738w);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0243Dr(C8340Tt0 c8340Tt0, InterfaceC7290zr[] interfaceC7290zrArr, InterfaceC6497nZ interfaceC6497nZ) {
        this(c8340Tt0, null, null, interfaceC6497nZ, (InterfaceC7290zr[]) Arrays.copyOf(interfaceC7290zrArr, interfaceC7290zrArr.length));
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC6497nZ, "additionalChecks");
    }

    public /* synthetic */ C0243Dr(Set set, InterfaceC7290zr[] interfaceC7290zrArr) {
        this(set, interfaceC7290zrArr, C4214i.f28740y);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0243Dr(Collection collection, InterfaceC7290zr[] interfaceC7290zrArr, InterfaceC6497nZ interfaceC6497nZ) {
        this(null, null, collection, interfaceC6497nZ, (InterfaceC7290zr[]) Arrays.copyOf(interfaceC7290zrArr, interfaceC7290zrArr.length));
        O90.m5968f(collection, "nameList");
        O90.m5968f(interfaceC6497nZ, "additionalChecks");
    }
}
