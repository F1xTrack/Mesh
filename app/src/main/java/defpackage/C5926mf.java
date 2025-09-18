package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5926mf implements InterfaceC6079nS0 {
    public final /* synthetic */ int a = 0;
    public final ArrayList b;
    public final C8426zm0 c;
    public final InterfaceC6079nS0 d;

    public C5926mf(ArrayList arrayList, C5544kf c5544kf, C8426zm0 c8426zm0) {
        this.b = arrayList;
        this.d = c5544kf;
        IL1.d(c8426zm0, "Argument must not be null");
        this.c = c8426zm0;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return ImageHeaderParser$ImageType.AVIF.equals(AbstractC3316d22.b(this.b, (InputStream) obj, this.c));
            default:
                return !((Boolean) c0795Jy0.c(AbstractC6186o10.b)).booleanValue() && AbstractC3316d22.b(this.b, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
        }
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) throws IOException {
        byte[] byteArray;
        byte[] bArr;
        switch (this.a) {
            case 0:
                return ((C5544kf) this.d).c(AbstractC7659vk.b((InputStream) obj));
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
                        return ((C7086sk) this.d).b(ByteBuffer.wrap(byteArray), i, i2, c0795Jy0);
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
        }
    }

    public C5926mf(ArrayList arrayList, C7086sk c7086sk, C8426zm0 c8426zm0) {
        this.b = arrayList;
        this.d = c7086sk;
        this.c = c8426zm0;
    }
}
