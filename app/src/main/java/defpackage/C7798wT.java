package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: wT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7798wT extends AbstractC3526e9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7798wT(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.e = i;
    }

    @Override // defpackage.KC
    public final Class a() {
        switch (this.e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.AbstractC3526e9
    public final void g(Object obj) throws IOException {
        switch (this.e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // defpackage.AbstractC3526e9
    public final Object i(AssetManager assetManager, String str) {
        switch (this.e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
