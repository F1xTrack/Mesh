package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import kotlin.Pair;

/* renamed from: kN */
/* loaded from: classes2.dex */
public final class C5490kN extends AbstractC7886ww0 {
    public final InterfaceC7454uf0 b;
    public final InterfaceC7454uf0 c;
    public final InterfaceC7454uf0 d;
    public final InterfaceC7454uf0 e;
    public final AbstractC1512Td1 f;
    public final AbstractC1512Td1 g;
    public final AbstractC1512Td1 h;
    public final AbstractC1512Td1 i;
    public final ExpectedType j;
    public final ExpectedType k;
    public final ExpectedType l;
    public final ExpectedType m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5490kN(C1668Vd1 c1668Vd1, InterfaceC7454uf0 interfaceC7454uf0) {
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
        C0114Bf0 c0114Bf04 = (C0114Bf0) AbstractC8069xu.D(3, interfaceC7454uf0.h());
        C7835wf0 c7835wf04 = c0114Bf04 != null ? c0114Bf04.b : null;
        if (c7835wf04 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.e = c7835wf04;
        AbstractC1512Td1 abstractC1512Td1B = c1668Vd1.b(c7835wf0);
        this.f = abstractC1512Td1B;
        AbstractC1512Td1 abstractC1512Td1B2 = c1668Vd1.b(c7835wf02);
        this.g = abstractC1512Td1B2;
        AbstractC1512Td1 abstractC1512Td1B3 = c1668Vd1.b(c7835wf03);
        this.h = abstractC1512Td1B3;
        AbstractC1512Td1 abstractC1512Td1B4 = c1668Vd1.b(c7835wf04);
        this.i = abstractC1512Td1B4;
        this.j = abstractC1512Td1B.b();
        this.k = abstractC1512Td1B2.b();
        this.l = abstractC1512Td1B3.b();
        this.m = abstractC1512Td1B4.b();
    }

    @Override // defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        return this.j.a(this.k).a(this.l);
    }

    @Override // defpackage.AbstractC7886ww0
    public final Object d(Object obj, C7 c7) {
        O90.f(obj, "value");
        InterfaceC7454uf0 interfaceC7454uf0 = this.b;
        InterfaceC7454uf0 interfaceC7454uf02 = this.c;
        InterfaceC7454uf0 interfaceC7454uf03 = this.d;
        InterfaceC7454uf0 interfaceC7454uf04 = this.e;
        return new C5299jN(obj, AbstractC8069xu.d0(AbstractC7520v02.a(obj, c7, AbstractC8259yu.f(new Pair(this.j, this.f), new Pair(this.k, this.g), new Pair(this.l, this.h), new Pair(this.m, this.i)), AbstractC8259yu.f(interfaceC7454uf0, interfaceC7454uf02, interfaceC7454uf03, interfaceC7454uf04))), AbstractC8259yu.f(interfaceC7454uf0, interfaceC7454uf02, interfaceC7454uf03, interfaceC7454uf04));
    }
}
