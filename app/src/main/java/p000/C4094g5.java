package p000;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: g5 */
/* loaded from: classes.dex */
public final class C4094g5 implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f27552a;

    /* renamed from: b */
    public final CC0 f27553b;

    public /* synthetic */ C4094g5(CC0 cc0, int i) {
        this.f27552a = i;
        this.f27553b = cc0;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f27552a) {
            case 0:
                if (AbstractC9063d22.m17479c((ArrayList) this.f27553b.f1250b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                }
                break;
            default:
                CC0 cc0 = this.f27553b;
                if (AbstractC9063d22.m17478b((ArrayList) cc0.f1250b, (InputStream) obj, (C11967zm0) cc0.f1251c) == ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                }
                break;
        }
        return false;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        switch (this.f27552a) {
            case 0:
                return CC0.m1006K0(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c7830Jy0);
            default:
                return CC0.m1006K0(ImageDecoder.createSource(AbstractC7031vk.m25479b((InputStream) obj)), i, i2, c7830Jy0);
        }
    }
}
