package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: wT */
/* loaded from: classes.dex */
public final class C7077wT extends AbstractC3972e9 {

    /* renamed from: e */
    public final /* synthetic */ int f44891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7077wT(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f44891e = i;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        switch (this.f44891e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.AbstractC3972e9
    /* renamed from: g */
    public final void mo9674g(Object obj) throws IOException {
        switch (this.f44891e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // p000.AbstractC3972e9
    /* renamed from: i */
    public final Object mo17872i(AssetManager assetManager, String str) {
        switch (this.f44891e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
