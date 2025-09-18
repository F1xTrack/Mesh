package defpackage;

import java.util.UUID;

/* renamed from: Nl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068Nl1 extends AbstractC6856rX {
    public final String b;
    public int c;

    public C1068Nl1(InterfaceC6907ro interfaceC6907ro) {
        super(interfaceC6907ro);
        this.b = "virtual-" + interfaceC6907ro.e() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final int c() {
        return p(0);
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final String e() {
        return this.b;
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final int p(int i) {
        return AbstractC7255tc1.h(this.a.p(i) - this.c);
    }
}
