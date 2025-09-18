package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: nk */
/* loaded from: classes.dex */
public final class C6508nk implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f38495a;

    /* renamed from: b */
    public final C3968e5 f38496b;

    public /* synthetic */ C6508nk(C3968e5 c3968e5, int i) {
        this.f38495a = i;
        this.f38496b = c3968e5;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f38495a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!((Boolean) c7830Jy0.m4482c(C3968e5.f26533d)).booleanValue()) {
                    if ((byteBuffer == null ? 7 : AbstractC8927c12.m10569g(new C8423Vi1(byteBuffer))) == 6) {
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) obj;
                C3968e5 c3968e5 = this.f38496b;
                if (!((Boolean) c7830Jy0.m4482c(C3968e5.f26533d)).booleanValue() && AbstractC8927c12.m10570h(inputStream, c3968e5.f26534a) == 6) {
                }
                break;
        }
        return false;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) throws IOException {
        switch (this.f38495a) {
            case 0:
                return this.f38496b.m17865a((ByteBuffer) obj, i, i2);
            default:
                C3968e5 c3968e5 = this.f38496b;
                byte[] bArrM18149b = AbstractC9313f02.m18149b((InputStream) obj);
                if (bArrM18149b == null) {
                    return null;
                }
                return c3968e5.m17865a(ByteBuffer.wrap(bArrM18149b), i, i2);
        }
    }
}
