package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class Z8 extends AbstractC1750Wf {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public Z8(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws IOException {
        try {
            Uri uri = c3538eD.a;
            long j = c3538eD.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g();
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new Y8(2008, null);
            }
            long j2 = c3538eD.g;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            h(c3538eD);
            return this.h;
        } catch (Y8 e) {
            throw e;
        } catch (IOException e2) {
            throw new Y8(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new Y8(2000, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                e();
            }
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
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new Y8(2000, e);
            }
        }
        InputStream inputStream = this.g;
        int i3 = AbstractC0277Dh1.a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - i4;
        }
        a(i4);
        return i4;
    }
}
