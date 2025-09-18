package p000;

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
public final class C11582wk0 extends AbstractC7438Ck0 {

    /* renamed from: c */
    public final /* synthetic */ int f45051c = 0;

    /* renamed from: d */
    public final Object f45052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11582wk0(ExecutorService executorService, C1339VH c1339vh, AssetManager assetManager) {
        super(executorService, c1339vh);
        O90.m5968f(executorService, "executor");
        O90.m5968f(c1339vh, "pooledByteBufferFactory");
        O90.m5968f(assetManager, "assetManager");
        this.f45052d = assetManager;
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: d */
    public final EncodedImage mo1306d(C10737q70 c10737q70) throws Resources.NotFoundException, IOException {
        int length;
        int length2;
        switch (this.f45051c) {
            case 0:
                O90.m5968f(c10737q70, "imageRequest");
                Uri uri = c10737q70.f40609b;
                String path = uri.getPath();
                O90.m5965c(path);
                String strSubstring = path.substring(1);
                O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
                AssetManager assetManager = (AssetManager) this.f45052d;
                InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    String path2 = uri.getPath();
                    O90.m5965c(path2);
                    String strSubstring2 = path2.substring(1);
                    O90.m5967e(strSubstring2, "this as java.lang.String).substring(startIndex)");
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
                return m1305c(inputStreamOpen, length);
            default:
                O90.m5968f(c10737q70, "imageRequest");
                int iM5731k = NV1.m5731k(c10737q70);
                Resources resources = (Resources) this.f45052d;
                InputStream inputStreamOpenRawResource = resources.openRawResource(iM5731k);
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
                try {
                    assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(NV1.m5731k(c10737q70));
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
                return m1305c(inputStreamOpenRawResource, length2);
        }
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: e */
    public final String mo1307e() {
        switch (this.f45051c) {
            case 0:
                return "LocalAssetFetchProducer";
            default:
                return "LocalResourceFetchProducer";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11582wk0(ExecutorService executorService, C1339VH c1339vh, Resources resources) {
        super(executorService, c1339vh);
        O90.m5968f(executorService, "executor");
        O90.m5968f(c1339vh, "pooledByteBufferFactory");
        O90.m5968f(resources, "resources");
        this.f45052d = resources;
    }
}
