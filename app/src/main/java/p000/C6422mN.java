package p000;

import expo.modules.kotlin.jni.ExpectedType;
import java.util.List;
import kotlin.Pair;

/* renamed from: mN */
/* loaded from: classes2.dex */
public final class C6422mN extends AbstractC11606ww0 {

    /* renamed from: b */
    public final InterfaceC11317uf0 f37649b;

    /* renamed from: c */
    public final InterfaceC11317uf0 f37650c;

    /* renamed from: d */
    public final InterfaceC11317uf0 f37651d;

    /* renamed from: e */
    public final AbstractC8309Td1 f37652e;

    /* renamed from: f */
    public final AbstractC8309Td1 f37653f;

    /* renamed from: g */
    public final AbstractC8309Td1 f37654g;

    /* renamed from: h */
    public final ExpectedType f37655h;

    /* renamed from: i */
    public final ExpectedType f37656i;

    /* renamed from: j */
    public final ExpectedType f37657j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6422mN(C8413Vd1 c8413Vd1, InterfaceC11317uf0 interfaceC11317uf0) {
        super(interfaceC11317uf0.mo8537e());
        O90.m5968f(interfaceC11317uf0, "eitherType");
        C7376Bf0 c7376Bf0 = (C7376Bf0) AbstractC7167xu.m25958D(0, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf0 = c7376Bf0 != null ? c7376Bf0.f969b : null;
        if (c11572wf0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f37649b = c11572wf0;
        C7376Bf0 c7376Bf02 = (C7376Bf0) AbstractC7167xu.m25958D(1, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf02 = c7376Bf02 != null ? c7376Bf02.f969b : null;
        if (c11572wf02 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f37650c = c11572wf02;
        C7376Bf0 c7376Bf03 = (C7376Bf0) AbstractC7167xu.m25958D(2, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf03 = c7376Bf03 != null ? c7376Bf03.f969b : null;
        if (c11572wf03 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f37651d = c11572wf03;
        AbstractC8309Td1 abstractC8309Td1M8524b = c8413Vd1.m8524b(c11572wf0);
        this.f37652e = abstractC8309Td1M8524b;
        AbstractC8309Td1 abstractC8309Td1M8524b2 = c8413Vd1.m8524b(c11572wf02);
        this.f37653f = abstractC8309Td1M8524b2;
        AbstractC8309Td1 abstractC8309Td1M8524b3 = c8413Vd1.m8524b(c11572wf03);
        this.f37654g = abstractC8309Td1M8524b3;
        this.f37655h = abstractC8309Td1M8524b.mo3313b();
        this.f37656i = abstractC8309Td1M8524b2.mo3313b();
        this.f37657j = abstractC8309Td1M8524b3.mo3313b();
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        return this.f37655h.m18090a(this.f37656i).m18090a(this.f37657j);
    }

    @Override // p000.AbstractC11606ww0
    /* renamed from: d */
    public final Object mo4700d(Object obj, C0134C7 c0134c7) {
        O90.m5968f(obj, "value");
        List listM26275f = AbstractC7230yu.m26275f(this.f37649b, this.f37650c, this.f37651d);
        return new C6359lN(obj, AbstractC7167xu.m25984d0(AbstractC11361v02.m25293a(obj, c0134c7, AbstractC7230yu.m26275f(new Pair(this.f37655h, this.f37652e), new Pair(this.f37656i, this.f37653f), new Pair(this.f37657j, this.f37654g)), listM26275f)), listM26275f);
    }
}
