package defpackage;

import android.view.ViewGroup;

/* renamed from: gr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4040gr extends AbstractC0496Gc1 {
    public boolean a = false;
    public final ViewGroup b;

    public C4040gr(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.AbstractC0496Gc1, defpackage.InterfaceC0340Ec1
    public final void b() {
        H02.b(this.b, false);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        if (!this.a) {
            H02.b(this.b, false);
        }
        abstractC0418Fc1.z(this);
    }

    @Override // defpackage.AbstractC0496Gc1, defpackage.InterfaceC0340Ec1
    public final void f() {
        H02.b(this.b, true);
    }

    @Override // defpackage.AbstractC0496Gc1, defpackage.InterfaceC0340Ec1
    public final void g(AbstractC0418Fc1 abstractC0418Fc1) {
        H02.b(this.b, false);
        this.a = true;
    }
}
