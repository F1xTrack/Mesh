package p000;

import java.util.UUID;

/* renamed from: Nl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8013Nl1 extends AbstractC6749rX {

    /* renamed from: b */
    public final String f7988b;

    /* renamed from: c */
    public int f7989c;

    public C8013Nl1(InterfaceC6766ro interfaceC6766ro) {
        super(interfaceC6766ro);
        this.f7988b = "virtual-" + interfaceC6766ro.mo2393e() + "-" + UUID.randomUUID().toString();
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: c */
    public final int mo2391c() {
        return mo2404p(0);
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: e */
    public final String mo2393e() {
        return this.f7988b;
    }

    @Override // p000.AbstractC6749rX, p000.InterfaceC6766ro
    /* renamed from: p */
    public final int mo2404p(int i) {
        return AbstractC11184tc1.m24954h(this.f41720a.mo2404p(i) - this.f7989c);
    }
}
