package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6514pk implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final C2375bi b;

    public C6514pk(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new C2375bi();
                break;
            default:
                this.b = new C2375bi();
                break;
        }
    }

    @Override // defpackage.InterfaceC6079nS0
    public final /* bridge */ /* synthetic */ boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return this.b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c0795Jy0);
            default:
                return this.b.c(ImageDecoder.createSource(AbstractC7659vk.b((InputStream) obj)), i, i2, c0795Jy0);
        }
    }
}
