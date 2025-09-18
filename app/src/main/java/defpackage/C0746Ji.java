package defpackage;

/* renamed from: Ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0746Ji extends AbstractC0323Dx {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ C0746Ji(Object obj) {
        super(obj);
    }

    @Override // defpackage.AbstractC0323Dx
    public final AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0) {
        switch (this.b) {
            case 0:
                O90.f(interfaceC0153Bs0, "module");
                AbstractC8408zg0 abstractC8408zg0H = interfaceC0153Bs0.h();
                abstractC8408zg0H.getClass();
                return abstractC8408zg0H.s(EnumC6988sD0.f);
            case 1:
                O90.f(interfaceC0153Bs0, "module");
                AbstractC8408zg0 abstractC8408zg0H2 = interfaceC0153Bs0.h();
                abstractC8408zg0H2.getClass();
                return abstractC8408zg0H2.s(EnumC6988sD0.m);
            default:
                O90.f(interfaceC0153Bs0, "module");
                AbstractC8408zg0 abstractC8408zg0H3 = interfaceC0153Bs0.h();
                abstractC8408zg0H3.getClass();
                return abstractC8408zg0H3.s(EnumC6988sD0.k);
        }
    }

    @Override // defpackage.AbstractC0323Dx
    public String toString() {
        switch (this.b) {
            case 1:
                return ((Number) this.a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public C0746Ji(double d) {
        super(Double.valueOf(d));
    }

    public C0746Ji(float f) {
        super(Float.valueOf(f));
    }
}
