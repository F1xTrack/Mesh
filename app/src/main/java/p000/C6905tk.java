package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C1875a;
import java.nio.ByteBuffer;

/* renamed from: tk */
/* loaded from: classes.dex */
public final class C6905tk implements InterfaceC1145SC {

    /* renamed from: a */
    public final /* synthetic */ int f43232a;

    @Override // p000.InterfaceC1145SC
    /* renamed from: a */
    public final Class mo2927a() {
        switch (this.f43232a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC1145SC
    /* renamed from: b */
    public final InterfaceC1208TC mo2928b(Object obj) {
        switch (this.f43232a) {
            case 0:
                return new C8342Tu0(4, (ByteBuffer) obj);
            case 1:
                return new G10(11, obj);
            default:
                return new C1875a((ParcelFileDescriptor) obj);
        }
    }
}
