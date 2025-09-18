package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: pk */
/* loaded from: classes.dex */
public final class C6636pk implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f40356a;

    /* renamed from: b */
    public final C1802bi f40357b;

    public C6636pk(int i) {
        this.f40356a = i;
        switch (i) {
            case 1:
                this.f40357b = new C1802bi();
                break;
            default:
                this.f40357b = new C1802bi();
                break;
        }
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f40356a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f40356a) {
            case 0:
                return this.f40357b.m10484c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c7830Jy0);
            default:
                return this.f40357b.m10484c(ImageDecoder.createSource(AbstractC7031vk.m25479b((InputStream) obj)), i, i2, c7830Jy0);
        }
    }
}
