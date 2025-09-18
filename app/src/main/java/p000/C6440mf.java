package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: mf */
/* loaded from: classes.dex */
public final class C6440mf implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f37816a = 0;

    /* renamed from: b */
    public final ArrayList f37817b;

    /* renamed from: c */
    public final C11967zm0 f37818c;

    /* renamed from: d */
    public final InterfaceC10395nS0 f37819d;

    public C6440mf(ArrayList arrayList, C6314kf c6314kf, C11967zm0 c11967zm0) {
        this.f37817b = arrayList;
        this.f37819d = c6314kf;
        IL1.m3830d(c11967zm0, "Argument must not be null");
        this.f37818c = c11967zm0;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f37816a) {
            case 0:
                return ImageHeaderParser$ImageType.AVIF.equals(AbstractC9063d22.m17478b(this.f37817b, (InputStream) obj, this.f37818c));
            default:
                return !((Boolean) c7830Jy0.m4482c(AbstractC10466o10.f38688b)).booleanValue() && AbstractC9063d22.m17478b(this.f37817b, (InputStream) obj, this.f37818c) == ImageHeaderParser$ImageType.GIF;
        }
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) throws IOException {
        byte[] byteArray;
        byte[] bArr;
        switch (this.f37816a) {
            case 0:
                return ((C6314kf) this.f37819d).m22237c(AbstractC7031vk.m25479b((InputStream) obj));
            default:
                InputStream inputStream = (InputStream) obj;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
                try {
                    bArr = new byte[16384];
                } catch (IOException unused) {
                    byteArray = null;
                }
                while (true) {
                    int i3 = inputStream.read(bArr);
                    if (i3 == -1) {
                        byteArrayOutputStream.flush();
                        byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray == null) {
                            return null;
                        }
                        return ((C6842sk) this.f37819d).mo9108b(ByteBuffer.wrap(byteArray), i, i2, c7830Jy0);
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
        }
    }

    public C6440mf(ArrayList arrayList, C6842sk c6842sk, C11967zm0 c11967zm0) {
        this.f37817b = arrayList;
        this.f37819d = c6842sk;
        this.f37818c = c11967zm0;
    }
}
