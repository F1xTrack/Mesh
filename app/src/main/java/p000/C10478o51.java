package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: o51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10478o51 implements InterfaceC10395nS0 {

    /* renamed from: c */
    public static final C11864yy0 f38796c = C11864yy0.m26288a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation");

    /* renamed from: a */
    public final C7094wk f38797a;

    /* renamed from: b */
    public final C11967zm0 f38798b;

    public C10478o51(C7094wk c7094wk, C11967zm0 c11967zm0) {
        this.f38797a = c7094wk;
        this.f38798b = c11967zm0;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        return !((Boolean) c7830Jy0.m4482c(f38796c)).booleanValue() && AbstractC8927c12.m10570h((InputStream) obj, this.f38798b) == 6;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) throws IOException {
        byte[] bArrM18149b = AbstractC9313f02.m18149b((InputStream) obj);
        if (bArrM18149b == null) {
            return null;
        }
        return this.f38797a.mo9108b(ByteBuffer.wrap(bArrM18149b), i, i2, c7830Jy0);
    }
}
