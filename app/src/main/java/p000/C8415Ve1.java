package p000;

/* renamed from: Ve1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8415Ve1 extends AbstractC9973k90 {

    /* renamed from: b */
    public final /* synthetic */ int f12682b = 0;

    public C8415Ve1(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // p000.AbstractC0249Dx
    /* renamed from: a */
    public final AbstractC7742Ig0 mo412a(InterfaceC7402Bs0 interfaceC7402Bs0) {
        switch (this.f12682b) {
            case 0:
                O90.m5968f(interfaceC7402Bs0, "module");
                InterfaceC6976us interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0, AbstractC10604p41.f39791R);
                X01 x01Mo1492m = interfaceC6976usM17465b != null ? interfaceC6976usM17465b.mo1492m() : null;
                return x01Mo1492m == null ? C6298kP.m22197c(EnumC6235jP.f35141z, "UByte") : x01Mo1492m;
            case 1:
                O90.m5968f(interfaceC7402Bs0, "module");
                InterfaceC6976us interfaceC6976usM17465b2 = AbstractC9060d12.m17465b(interfaceC7402Bs0, AbstractC10604p41.f39793T);
                X01 x01Mo1492m2 = interfaceC6976usM17465b2 != null ? interfaceC6976usM17465b2.mo1492m() : null;
                return x01Mo1492m2 == null ? C6298kP.m22197c(EnumC6235jP.f35141z, "UInt") : x01Mo1492m2;
            case 2:
                O90.m5968f(interfaceC7402Bs0, "module");
                InterfaceC6976us interfaceC6976usM17465b3 = AbstractC9060d12.m17465b(interfaceC7402Bs0, AbstractC10604p41.f39794U);
                X01 x01Mo1492m3 = interfaceC6976usM17465b3 != null ? interfaceC6976usM17465b3.mo1492m() : null;
                return x01Mo1492m3 == null ? C6298kP.m22197c(EnumC6235jP.f35141z, "ULong") : x01Mo1492m3;
            default:
                O90.m5968f(interfaceC7402Bs0, "module");
                InterfaceC6976us interfaceC6976usM17465b4 = AbstractC9060d12.m17465b(interfaceC7402Bs0, AbstractC10604p41.f39792S);
                X01 x01Mo1492m4 = interfaceC6976usM17465b4 != null ? interfaceC6976usM17465b4.mo1492m() : null;
                return x01Mo1492m4 == null ? C6298kP.m22197c(EnumC6235jP.f35141z, "UShort") : x01Mo1492m4;
        }
    }

    @Override // p000.AbstractC0249Dx
    public final String toString() {
        switch (this.f12682b) {
            case 0:
                return ((Number) this.f2329a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f2329a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f2329a).longValue() + ".toULong()";
            default:
                return ((Number) this.f2329a).intValue() + ".toUShort()";
        }
    }

    public C8415Ve1(short s) {
        super(Short.valueOf(s));
    }

    public C8415Ve1(int i) {
        super(Integer.valueOf(i));
    }

    public C8415Ve1(long j) {
        super(Long.valueOf(j));
    }
}
