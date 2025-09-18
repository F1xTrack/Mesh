package defpackage;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3896g5 implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final CC0 b;

    public /* synthetic */ C3896g5(CC0 cc0, int i) {
        this.a = i;
        this.b = cc0;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                if (AbstractC3316d22.c((ArrayList) this.b.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                }
                break;
            default:
                CC0 cc0 = this.b;
                if (AbstractC3316d22.b((ArrayList) cc0.b, (InputStream) obj, (C8426zm0) cc0.c) == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return CC0.K0(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c0795Jy0);
            default:
                return CC0.K0(ImageDecoder.createSource(AbstractC7659vk.b((InputStream) obj)), i, i2, c0795Jy0);
        }
    }
}
