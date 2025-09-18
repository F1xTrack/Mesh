package p000;

import kotlin.Pair;

/* renamed from: TO */
/* loaded from: classes2.dex */
public final class C1220TO extends AbstractC0249Dx {

    /* renamed from: b */
    public final C0055As f11335b;

    /* renamed from: c */
    public final C8340Tt0 f11336c;

    public C1220TO(C0055As c0055As, C8340Tt0 c8340Tt0) {
        super(new Pair(c0055As, c8340Tt0));
        this.f11335b = c0055As;
        this.f11336c = c8340Tt0;
    }

    @Override // p000.AbstractC0249Dx
    /* renamed from: a */
    public final AbstractC7742Ig0 mo412a(InterfaceC7402Bs0 interfaceC7402Bs0) {
        O90.m5968f(interfaceC7402Bs0, "module");
        C0055As c0055As = this.f11335b;
        InterfaceC6976us interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0, c0055As);
        X01 x01Mo1492m = null;
        if (interfaceC6976usM17465b != null) {
            int i = AbstractC6814sI.f42360a;
            if (!AbstractC6814sI.m24702n(interfaceC6976usM17465b, EnumC0118Bs.f1062c)) {
                interfaceC6976usM17465b = null;
            }
            if (interfaceC6976usM17465b != null) {
                x01Mo1492m = interfaceC6976usM17465b.mo1492m();
            }
        }
        if (x01Mo1492m != null) {
            return x01Mo1492m;
        }
        EnumC6235jP enumC6235jP = EnumC6235jP.f35112A;
        String string = c0055As.toString();
        O90.m5967e(string, "toString(...)");
        String str = this.f11336c.f11577a;
        O90.m5967e(str, "toString(...)");
        return C6298kP.m22197c(enumC6235jP, string, str);
    }

    @Override // p000.AbstractC0249Dx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11335b.m365i());
        sb.append('.');
        sb.append(this.f11336c);
        return sb.toString();
    }
}
