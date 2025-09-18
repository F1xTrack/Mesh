package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: uy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7510uy extends AbstractC1750Wf {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public C7510uy(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c3538eD.a.normalizeScheme();
            this.f = uriNormalizeScheme;
            g();
            boolean zEquals = RemoteMessageConst.Notification.CONTENT.equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C7319ty(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            long j = c3538eD.f;
            if (length != -1 && j > length) {
                throw new C7319ty(2008, null);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new C7319ty(2008, null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.i = jPosition;
                    if (jPosition < 0) {
                        throw new C7319ty(2008, null);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.i = j2;
                if (j2 < 0) {
                    throw new C7319ty(2008, null);
                }
            }
            long j3 = c3538eD.g;
            if (j3 != -1) {
                long j4 = this.i;
                this.i = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.j = true;
            h(c3538eD);
            return j3 != -1 ? j3 : this.i;
        } catch (C7319ty e) {
            throw e;
        } catch (IOException e2) {
            throw new C7319ty(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C7319ty(2000, e);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        e();
                    }
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            e();
                        }
                        throw th;
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            e();
                        }
                    }
                } catch (IOException e2) {
                    throw new C7319ty(2000, e2);
                }
            }
        } catch (IOException e3) {
            throw new C7319ty(2000, e3);
        }
    }

    @Override // defpackage.ZC
    public final Uri o() {
        return this.f;
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C7319ty(2000, e);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = AbstractC0277Dh1.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - i4;
        }
        a(i4);
        return i4;
    }
}
