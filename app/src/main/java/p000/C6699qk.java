package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qk */
/* loaded from: classes.dex */
public final class C6699qk implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f41121a;

    /* renamed from: b */
    public final C8431Vm1 f41122b;

    public /* synthetic */ C6699qk(C8431Vm1 c8431Vm1, int i) {
        this.f41121a = i;
        this.f41122b = c8431Vm1;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f41121a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (((Boolean) c7830Jy0.m4482c(C8431Vm1.f12724e)).booleanValue() || ((Boolean) c7830Jy0.m4482c(C8431Vm1.f12725f)).booleanValue()) {
                    return false;
                }
                return AbstractC8927c12.m10571i(byteBuffer == null ? 7 : AbstractC8927c12.m10569g(new C8423Vi1(byteBuffer)));
            default:
                InputStream inputStream = (InputStream) obj;
                C8431Vm1 c8431Vm1 = this.f41122b;
                if (((Boolean) c7830Jy0.m4482c(C8431Vm1.f12724e)).booleanValue() || ((Boolean) c7830Jy0.m4482c(C8431Vm1.f12725f)).booleanValue()) {
                    return false;
                }
                return AbstractC8927c12.m10571i(AbstractC8927c12.m10570h(inputStream, c8431Vm1.f12730c));
        }
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        C8431Vm1 c8431Vm1 = this.f41122b;
        switch (this.f41121a) {
            case 0:
                AtomicReference atomicReference = AbstractC7031vk.f44510a;
                return c8431Vm1.m8548a(new C6968uk((ByteBuffer) obj), i, i2, c7830Jy0);
            default:
                return c8431Vm1.m8548a((InputStream) obj, i, i2, c7830Jy0);
        }
    }
}
