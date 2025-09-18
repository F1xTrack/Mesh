package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: a9 */
/* loaded from: classes.dex */
public final class C1646a9 extends AbstractC3972e9 {

    /* renamed from: e */
    public final /* synthetic */ int f15331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1646a9(ContentResolver contentResolver, Uri uri, int i) {
        super(1, uri, contentResolver);
        this.f15331e = i;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        switch (this.f15331e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.AbstractC3972e9
    /* renamed from: g */
    public final void mo9674g(Object obj) throws IOException {
        switch (this.f15331e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // p000.AbstractC3972e9
    /* renamed from: h */
    public final Object mo9675h(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f15331e) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException(AbstractC11153tN0.m24911w("FileDescriptor is null for: ", uri));
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(AbstractC11153tN0.m24911w("FileDescriptor is null for: ", uri));
        }
    }
}
