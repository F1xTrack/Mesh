package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import java.util.List;
import kotlin.Pair;

/* renamed from: nN */
/* loaded from: classes2.dex */
public final class C6063nN extends AbstractC7886ww0 {
    public final InterfaceC7454uf0 b;
    public final InterfaceC7454uf0 c;
    public final AbstractC1512Td1 d;
    public final AbstractC1512Td1 e;
    public final ExpectedType f;
    public final ExpectedType g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6063nN(C1668Vd1 c1668Vd1, InterfaceC7454uf0 interfaceC7454uf0) {
        super(interfaceC7454uf0.e());
        O90.f(interfaceC7454uf0, "eitherType");
        C0114Bf0 c0114Bf0 = (C0114Bf0) AbstractC8069xu.D(0, interfaceC7454uf0.h());
        C7835wf0 c7835wf0 = c0114Bf0 != null ? c0114Bf0.b : null;
        if (c7835wf0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.b = c7835wf0;
        C0114Bf0 c0114Bf02 = (C0114Bf0) AbstractC8069xu.D(1, interfaceC7454uf0.h());
        C7835wf0 c7835wf02 = c0114Bf02 != null ? c0114Bf02.b : null;
        if (c7835wf02 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.c = c7835wf02;
        AbstractC1512Td1 abstractC1512Td1B = c1668Vd1.b(c7835wf0);
        this.d = abstractC1512Td1B;
        AbstractC1512Td1 abstractC1512Td1B2 = c1668Vd1.b(c7835wf02);
        this.e = abstractC1512Td1B2;
        this.f = abstractC1512Td1B.b();
        this.g = abstractC1512Td1B2.b();
    }

    @Override // defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        return this.f.a(this.g);
    }

    @Override // defpackage.AbstractC1512Td1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.AbstractC7886ww0
    public final Object d(Object obj, C7 c7) {
        O90.f(obj, "value");
        List listF = AbstractC8259yu.f(this.b, this.c);
        return new C4332iN(obj, AbstractC8069xu.d0(AbstractC7520v02.a(obj, c7, AbstractC8259yu.f(new Pair(this.f, this.d), new Pair(this.g, this.e)), listF)), listF);
    }
}
