package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: o51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6202o51 implements InterfaceC6079nS0 {
    public static final C8272yy0 c = C8272yy0.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation");
    public final C7849wk a;
    public final C8426zm0 b;

    public C6202o51(C7849wk c7849wk, C8426zm0 c8426zm0) {
        this.a = c7849wk;
        this.b = c8426zm0;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        return !((Boolean) c0795Jy0.c(c)).booleanValue() && AbstractC2436c12.h((InputStream) obj, this.b) == 6;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) throws IOException {
        byte[] bArrB = AbstractC3689f02.b((InputStream) obj);
        if (bArrB == null) {
            return null;
        }
        return this.a.b(ByteBuffer.wrap(bArrB), i, i2, c0795Jy0);
    }
}
