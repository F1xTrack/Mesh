package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: tT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7226tT extends AbstractC1750Wf {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws IOException {
        Uri uri = c3538eD.a;
        long j = c3538eD.f;
        this.f = uri;
        g();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c3538eD.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new C6272oT(null, null, 2008);
                }
                this.h = true;
                h(c3538eD);
                return this.g;
            } catch (IOException e) {
                throw new C6272oT(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C6272oT((AbstractC0277Dh1.a < 21 || !AbstractC6081nT.b(e2.getCause())) ? 2005 : 2006, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbX = F91.x("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbX.append(fragment);
            throw new C6272oT(sbX.toString(), e2, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e3) {
            throw new C6272oT(2006, e3);
        } catch (RuntimeException e4) {
            throw new C6272oT(2000, e4);
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C6272oT(2000, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
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
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = AbstractC0277Dh1.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.g -= i4;
                a(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new C6272oT(2000, e);
        }
    }
}
