package p000;

import expo.modules.kotlin.jni.ExpectedType;
import kotlin.Pair;

/* renamed from: kN */
/* loaded from: classes2.dex */
public final class C6296kN extends AbstractC11606ww0 {

    /* renamed from: b */
    public final InterfaceC11317uf0 f36458b;

    /* renamed from: c */
    public final InterfaceC11317uf0 f36459c;

    /* renamed from: d */
    public final InterfaceC11317uf0 f36460d;

    /* renamed from: e */
    public final InterfaceC11317uf0 f36461e;

    /* renamed from: f */
    public final AbstractC8309Td1 f36462f;

    /* renamed from: g */
    public final AbstractC8309Td1 f36463g;

    /* renamed from: h */
    public final AbstractC8309Td1 f36464h;

    /* renamed from: i */
    public final AbstractC8309Td1 f36465i;

    /* renamed from: j */
    public final ExpectedType f36466j;

    /* renamed from: k */
    public final ExpectedType f36467k;

    /* renamed from: l */
    public final ExpectedType f36468l;

    /* renamed from: m */
    public final ExpectedType f36469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6296kN(C8413Vd1 c8413Vd1, InterfaceC11317uf0 interfaceC11317uf0) {
        super(interfaceC11317uf0.mo8537e());
        O90.m5968f(interfaceC11317uf0, "eitherType");
        C7376Bf0 c7376Bf0 = (C7376Bf0) AbstractC7167xu.m25958D(0, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf0 = c7376Bf0 != null ? c7376Bf0.f969b : null;
        if (c11572wf0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f36458b = c11572wf0;
        C7376Bf0 c7376Bf02 = (C7376Bf0) AbstractC7167xu.m25958D(1, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf02 = c7376Bf02 != null ? c7376Bf02.f969b : null;
        if (c11572wf02 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f36459c = c11572wf02;
        C7376Bf0 c7376Bf03 = (C7376Bf0) AbstractC7167xu.m25958D(2, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf03 = c7376Bf03 != null ? c7376Bf03.f969b : null;
        if (c11572wf03 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f36460d = c11572wf03;
        C7376Bf0 c7376Bf04 = (C7376Bf0) AbstractC7167xu.m25958D(3, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf04 = c7376Bf04 != null ? c7376Bf04.f969b : null;
        if (c11572wf04 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f36461e = c11572wf04;
        AbstractC8309Td1 abstractC8309Td1M8524b = c8413Vd1.m8524b(c11572wf0);
        this.f36462f = abstractC8309Td1M8524b;
        AbstractC8309Td1 abstractC8309Td1M8524b2 = c8413Vd1.m8524b(c11572wf02);
        this.f36463g = abstractC8309Td1M8524b2;
        AbstractC8309Td1 abstractC8309Td1M8524b3 = c8413Vd1.m8524b(c11572wf03);
        this.f36464h = abstractC8309Td1M8524b3;
        AbstractC8309Td1 abstractC8309Td1M8524b4 = c8413Vd1.m8524b(c11572wf04);
        this.f36465i = abstractC8309Td1M8524b4;
        this.f36466j = abstractC8309Td1M8524b.mo3313b();
        this.f36467k = abstractC8309Td1M8524b2.mo3313b();
        this.f36468l = abstractC8309Td1M8524b3.mo3313b();
        this.f36469m = abstractC8309Td1M8524b4.mo3313b();
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        return this.f36466j.m18090a(this.f36467k).m18090a(this.f36468l);
    }

    @Override // p000.AbstractC11606ww0
    /* renamed from: d */
    public final Object mo4700d(Object obj, C0134C7 c0134c7) {
        O90.m5968f(obj, "value");
        InterfaceC11317uf0 interfaceC11317uf0 = this.f36458b;
        InterfaceC11317uf0 interfaceC11317uf02 = this.f36459c;
        InterfaceC11317uf0 interfaceC11317uf03 = this.f36460d;
        InterfaceC11317uf0 interfaceC11317uf04 = this.f36461e;
        return new C6233jN(obj, AbstractC7167xu.m25984d0(AbstractC11361v02.m25293a(obj, c0134c7, AbstractC7230yu.m26275f(new Pair(this.f36466j, this.f36462f), new Pair(this.f36467k, this.f36463g), new Pair(this.f36468l, this.f36464h), new Pair(this.f36469m, this.f36465i)), AbstractC7230yu.m26275f(interfaceC11317uf0, interfaceC11317uf02, interfaceC11317uf03, interfaceC11317uf04))), AbstractC7230yu.m26275f(interfaceC11317uf0, interfaceC11317uf02, interfaceC11317uf03, interfaceC11317uf04));
    }
}
