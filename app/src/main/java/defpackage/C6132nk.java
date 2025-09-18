package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6132nk implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final C3514e5 b;

    public /* synthetic */ C6132nk(C3514e5 c3514e5, int i) {
        this.a = i;
        this.b = c3514e5;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!((Boolean) c0795Jy0.c(C3514e5.d)).booleanValue()) {
                    if ((byteBuffer == null ? 7 : AbstractC2436c12.g(new C1683Vi1(byteBuffer))) == 6) {
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) obj;
                C3514e5 c3514e5 = this.b;
                if (!((Boolean) c0795Jy0.c(C3514e5.d)).booleanValue() && AbstractC2436c12.h(inputStream, c3514e5.a) == 6) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) throws IOException {
        switch (this.a) {
            case 0:
                return this.b.a((ByteBuffer) obj, i, i2);
            default:
                C3514e5 c3514e5 = this.b;
                byte[] bArrB = AbstractC3689f02.b((InputStream) obj);
                if (bArrB == null) {
                    return null;
                }
                return c3514e5.a(ByteBuffer.wrap(bArrB), i, i2);
        }
    }
}
