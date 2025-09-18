package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* renamed from: tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7277tk implements SC {
    public final /* synthetic */ int a;

    @Override // defpackage.SC
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.SC
    public final TC b(Object obj) {
        switch (this.a) {
            case 0:
                return new C1562Tu0(4, (ByteBuffer) obj);
            case 1:
                return new G10(11, obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }
}
