package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: uy */
/* loaded from: classes.dex */
public final class C6982uy extends AbstractC1426Wf {

    /* renamed from: e */
    public final ContentResolver f44052e;

    /* renamed from: f */
    public Uri f44053f;

    /* renamed from: g */
    public AssetFileDescriptor f44054g;

    /* renamed from: h */
    public FileInputStream f44055h;

    /* renamed from: i */
    public long f44056i;

    /* renamed from: j */
    public boolean f44057j;

    public C6982uy(Context context) {
        super(false);
        this.f44052e = context.getContentResolver();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c3976eD.f26595a.normalizeScheme();
            this.f44053f = uriNormalizeScheme;
            m8827g();
            boolean zEquals = RemoteMessageConst.Notification.CONTENT.equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f44052e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f44054g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C6919ty(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f44055h = fileInputStream;
            long j = c3976eD.f26600f;
            if (length != -1 && j > length) {
                throw new C6919ty(2008, null);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new C6919ty(2008, null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f44056i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f44056i = jPosition;
                    if (jPosition < 0) {
                        throw new C6919ty(2008, null);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.f44056i = j2;
                if (j2 < 0) {
                    throw new C6919ty(2008, null);
                }
            }
            long j3 = c3976eD.f26601g;
            if (j3 != -1) {
                long j4 = this.f44056i;
                this.f44056i = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.f44057j = true;
            m8828h(c3976eD);
            return j3 != -1 ? j3 : this.f44056i;
        } catch (C6919ty e) {
            throw e;
        } catch (IOException e2) {
            throw new C6919ty(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        this.f44053f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f44055h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f44055h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f44054g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C6919ty(2000, e);
                    }
                } finally {
                    this.f44054g = null;
                    if (this.f44057j) {
                        this.f44057j = false;
                        m8826e();
                    }
                }
            } catch (Throwable th) {
                this.f44055h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f44054g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f44054g = null;
                        if (this.f44057j) {
                            this.f44057j = false;
                            m8826e();
                        }
                        throw th;
                    } finally {
                        this.f44054g = null;
                        if (this.f44057j) {
                            this.f44057j = false;
                            m8826e();
                        }
                    }
                } catch (IOException e2) {
                    throw new C6919ty(2000, e2);
                }
            }
        } catch (IOException e3) {
            throw new C6919ty(2000, e3);
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f44053f;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f44056i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C6919ty(2000, e);
            }
        }
        FileInputStream fileInputStream = this.f44055h;
        int i3 = AbstractC7485Dh1.f2166a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f44056i;
        if (j2 != -1) {
            this.f44056i = j2 - i4;
        }
        m8825a(i4);
        return i4;
    }
}
