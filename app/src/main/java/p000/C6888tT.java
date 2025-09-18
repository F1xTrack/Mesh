package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: tT */
/* loaded from: classes.dex */
public final class C6888tT extends AbstractC1426Wf {

    /* renamed from: e */
    public RandomAccessFile f43083e;

    /* renamed from: f */
    public Uri f43084f;

    /* renamed from: g */
    public long f43085g;

    /* renamed from: h */
    public boolean f43086h;

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws IOException {
        Uri uri = c3976eD.f26595a;
        long j = c3976eD.f26600f;
        this.f43084f = uri;
        m8827g();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f43083e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c3976eD.f26601g;
                if (length == -1) {
                    length = this.f43083e.length() - j;
                }
                this.f43085g = length;
                if (length < 0) {
                    throw new C6554oT(null, null, 2008);
                }
                this.f43086h = true;
                m8828h(c3976eD);
                return this.f43085g;
            } catch (IOException e) {
                throw new C6554oT(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C6554oT((AbstractC7485Dh1.f2166a < 21 || !AbstractC6491nT.m23149b(e2.getCause())) ? 2005 : 2006, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM2541x = F91.m2541x("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM2541x.append(fragment);
            throw new C6554oT(sbM2541x.toString(), e2, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e3) {
            throw new C6554oT(2006, e3);
        } catch (RuntimeException e4) {
            throw new C6554oT(2000, e4);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        this.f43084f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f43083e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C6554oT(2000, e);
            }
        } finally {
            this.f43083e = null;
            if (this.f43086h) {
                this.f43086h = false;
                m8826e();
            }
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f43084f;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f43085g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f43083e;
            int i3 = AbstractC7485Dh1.f2166a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f43085g -= i4;
                m8825a(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new C6554oT(2000, e);
        }
    }
}
