package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import java.util.List;
import kotlin.Pair;

/* renamed from: mN */
/* loaded from: classes2.dex */
public final class C5872mN extends AbstractC7886ww0 {
    public final InterfaceC7454uf0 b;
    public final InterfaceC7454uf0 c;
    public final InterfaceC7454uf0 d;
    public final AbstractC1512Td1 e;
    public final AbstractC1512Td1 f;
    public final AbstractC1512Td1 g;
    public final ExpectedType h;
    public final ExpectedType i;
    public final ExpectedType j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5872mN(C1668Vd1 c1668Vd1, InterfaceC7454uf0 interfaceC7454uf0) {
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
        C0114Bf0 c0114Bf03 = (C0114Bf0) AbstractC8069xu.D(2, interfaceC7454uf0.h());
        C7835wf0 c7835wf03 = c0114Bf03 != null ? c0114Bf03.b : null;
        if (c7835wf03 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.d = c7835wf03;
        AbstractC1512Td1 abstractC1512Td1B = c1668Vd1.b(c7835wf0);
        this.e = abstractC1512Td1B;
        AbstractC1512Td1 abstractC1512Td1B2 = c1668Vd1.b(c7835wf02);
        this.f = abstractC1512Td1B2;
        AbstractC1512Td1 abstractC1512Td1B3 = c1668Vd1.b(c7835wf03);
        this.g = abstractC1512Td1B3;
        this.h = abstractC1512Td1B.b();
        this.i = abstractC1512Td1B2.b();
        this.j = abstractC1512Td1B3.b();
    }

    @Override // defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        return this.h.a(this.i).a(this.j);
    }

    @Override // defpackage.AbstractC7886ww0
    public final Object d(Object obj, C7 c7) {
        O90.f(obj, "value");
        List listF = AbstractC8259yu.f(this.b, this.c, this.d);
        return new C5681lN(obj, AbstractC8069xu.d0(AbstractC7520v02.a(obj, c7, AbstractC8259yu.f(new Pair(this.h, this.e), new Pair(this.i, this.f), new Pair(this.j, this.g)), listF)), listF);
    }
}
