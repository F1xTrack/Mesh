package defpackage;

/* renamed from: Ve1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1671Ve1 extends AbstractC5449k90 {
    public final /* synthetic */ int b = 0;

    public C1671Ve1(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.AbstractC0323Dx
    public final AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0) {
        switch (this.b) {
            case 0:
                O90.f(interfaceC0153Bs0, "module");
                InterfaceC7492us interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0, AbstractC6390p41.R);
                X01 x01M = interfaceC7492usB != null ? interfaceC7492usB.m() : null;
                return x01M == null ? C5496kP.c(EnumC5305jP.z, "UByte") : x01M;
            case 1:
                O90.f(interfaceC0153Bs0, "module");
                InterfaceC7492us interfaceC7492usB2 = AbstractC3312d12.b(interfaceC0153Bs0, AbstractC6390p41.T);
                X01 x01M2 = interfaceC7492usB2 != null ? interfaceC7492usB2.m() : null;
                return x01M2 == null ? C5496kP.c(EnumC5305jP.z, "UInt") : x01M2;
            case 2:
                O90.f(interfaceC0153Bs0, "module");
                InterfaceC7492us interfaceC7492usB3 = AbstractC3312d12.b(interfaceC0153Bs0, AbstractC6390p41.U);
                X01 x01M3 = interfaceC7492usB3 != null ? interfaceC7492usB3.m() : null;
                return x01M3 == null ? C5496kP.c(EnumC5305jP.z, "ULong") : x01M3;
            default:
                O90.f(interfaceC0153Bs0, "module");
                InterfaceC7492us interfaceC7492usB4 = AbstractC3312d12.b(interfaceC0153Bs0, AbstractC6390p41.S);
                X01 x01M4 = interfaceC7492usB4 != null ? interfaceC7492usB4.m() : null;
                return x01M4 == null ? C5496kP.c(EnumC5305jP.z, "UShort") : x01M4;
        }
    }

    @Override // defpackage.AbstractC0323Dx
    public final String toString() {
        switch (this.b) {
            case 0:
                return ((Number) this.a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.a).longValue() + ".toULong()";
            default:
                return ((Number) this.a).intValue() + ".toUShort()";
        }
    }

    public C1671Ve1(short s) {
        super(Short.valueOf(s));
    }

    public C1671Ve1(int i) {
        super(Integer.valueOf(i));
    }

    public C1671Ve1(long j) {
        super(Long.valueOf(j));
    }
}
