package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: wk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7850wk0 extends AbstractC0207Ck0 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7850wk0(ExecutorService executorService, VH vh, AssetManager assetManager) {
        super(executorService, vh);
        O90.f(executorService, "executor");
        O90.f(vh, "pooledByteBufferFactory");
        O90.f(assetManager, "assetManager");
        this.d = assetManager;
    }

    @Override // defpackage.AbstractC0207Ck0
    public final EncodedImage d(C6589q70 c6589q70) throws Resources.NotFoundException, IOException {
        int length;
        int length2;
        switch (this.c) {
            case 0:
                O90.f(c6589q70, "imageRequest");
                Uri uri = c6589q70.b;
                String path = uri.getPath();
                O90.c(path);
                String strSubstring = path.substring(1);
                O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                AssetManager assetManager = (AssetManager) this.d;
                InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    String path2 = uri.getPath();
                    O90.c(path2);
                    String strSubstring2 = path2.substring(1);
                    O90.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    assetFileDescriptorOpenFd = assetManager.openFd(strSubstring2);
                    length = (int) assetFileDescriptorOpenFd.getLength();
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused3) {
                        }
                    }
                    length = -1;
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
                return c(inputStreamOpen, length);
            default:
                O90.f(c6589q70, "imageRequest");
                int iK = NV1.k(c6589q70);
                Resources resources = (Resources) this.d;
                InputStream inputStreamOpenRawResource = resources.openRawResource(iK);
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
                try {
                    assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(NV1.k(c6589q70));
                    length2 = (int) assetFileDescriptorOpenRawResourceFd.getLength();
                    try {
                        assetFileDescriptorOpenRawResourceFd.close();
                    } catch (IOException unused5) {
                    }
                } catch (Resources.NotFoundException unused6) {
                    if (assetFileDescriptorOpenRawResourceFd != null) {
                        try {
                            assetFileDescriptorOpenRawResourceFd.close();
                        } catch (IOException unused7) {
                        }
                    }
                    length2 = -1;
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenRawResourceFd != null) {
                        try {
                            assetFileDescriptorOpenRawResourceFd.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th2;
                }
                return c(inputStreamOpenRawResource, length2);
        }
    }

    @Override // defpackage.AbstractC0207Ck0
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalAssetFetchProducer";
            default:
                return "LocalResourceFetchProducer";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7850wk0(ExecutorService executorService, VH vh, Resources resources) {
        super(executorService, vh);
        O90.f(executorService, "executor");
        O90.f(vh, "pooledByteBufferFactory");
        O90.f(resources, "resources");
        this.d = resources;
    }
}
