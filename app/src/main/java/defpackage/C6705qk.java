package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6705qk implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final C1695Vm1 b;

    public /* synthetic */ C6705qk(C1695Vm1 c1695Vm1, int i) {
        this.a = i;
        this.b = c1695Vm1;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (((Boolean) c0795Jy0.c(C1695Vm1.e)).booleanValue() || ((Boolean) c0795Jy0.c(C1695Vm1.f)).booleanValue()) {
                    return false;
                }
                return AbstractC2436c12.i(byteBuffer == null ? 7 : AbstractC2436c12.g(new C1683Vi1(byteBuffer)));
            default:
                InputStream inputStream = (InputStream) obj;
                C1695Vm1 c1695Vm1 = this.b;
                if (((Boolean) c0795Jy0.c(C1695Vm1.e)).booleanValue() || ((Boolean) c0795Jy0.c(C1695Vm1.f)).booleanValue()) {
                    return false;
                }
                return AbstractC2436c12.i(AbstractC2436c12.h(inputStream, c1695Vm1.c));
        }
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        C1695Vm1 c1695Vm1 = this.b;
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = AbstractC7659vk.a;
                return c1695Vm1.a(new C7468uk((ByteBuffer) obj), i, i2, c0795Jy0);
            default:
                return c1695Vm1.a((InputStream) obj, i, i2, c0795Jy0);
        }
    }
}
