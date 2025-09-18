package p000;

import expo.modules.kotlin.jni.ExpectedType;
import java.util.List;
import kotlin.Pair;

/* renamed from: nN */
/* loaded from: classes2.dex */
public final class C6485nN extends AbstractC11606ww0 {

    /* renamed from: b */
    public final InterfaceC11317uf0 f38292b;

    /* renamed from: c */
    public final InterfaceC11317uf0 f38293c;

    /* renamed from: d */
    public final AbstractC8309Td1 f38294d;

    /* renamed from: e */
    public final AbstractC8309Td1 f38295e;

    /* renamed from: f */
    public final ExpectedType f38296f;

    /* renamed from: g */
    public final ExpectedType f38297g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6485nN(C8413Vd1 c8413Vd1, InterfaceC11317uf0 interfaceC11317uf0) {
        super(interfaceC11317uf0.mo8537e());
        O90.m5968f(interfaceC11317uf0, "eitherType");
        C7376Bf0 c7376Bf0 = (C7376Bf0) AbstractC7167xu.m25958D(0, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf0 = c7376Bf0 != null ? c7376Bf0.f969b : null;
        if (c11572wf0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f38292b = c11572wf0;
        C7376Bf0 c7376Bf02 = (C7376Bf0) AbstractC7167xu.m25958D(1, interfaceC11317uf0.mo8538h());
        C11572wf0 c11572wf02 = c7376Bf02 != null ? c7376Bf02.f969b : null;
        if (c11572wf02 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f38293c = c11572wf02;
        AbstractC8309Td1 abstractC8309Td1M8524b = c8413Vd1.m8524b(c11572wf0);
        this.f38294d = abstractC8309Td1M8524b;
        AbstractC8309Td1 abstractC8309Td1M8524b2 = c8413Vd1.m8524b(c11572wf02);
        this.f38295e = abstractC8309Td1M8524b2;
        this.f38296f = abstractC8309Td1M8524b.mo3313b();
        this.f38297g = abstractC8309Td1M8524b2.mo3313b();
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        return this.f38296f.m18090a(this.f38297g);
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: c */
    public final boolean mo3314c() {
        return false;
    }

    @Override // p000.AbstractC11606ww0
    /* renamed from: d */
    public final Object mo4700d(Object obj, C0134C7 c0134c7) {
        O90.m5968f(obj, "value");
        List listM26275f = AbstractC7230yu.m26275f(this.f38292b, this.f38293c);
        return new C4238iN(obj, AbstractC7167xu.m25984d0(AbstractC11361v02.m25293a(obj, c0134c7, AbstractC7230yu.m26275f(new Pair(this.f38296f, this.f38294d), new Pair(this.f38297g, this.f38295e)), listM26275f)), listM26275f);
    }
}
