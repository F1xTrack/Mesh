package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Z8 */
/* loaded from: classes.dex */
public final class C1582Z8 extends AbstractC1426Wf {

    /* renamed from: e */
    public final AssetManager f14754e;

    /* renamed from: f */
    public Uri f14755f;

    /* renamed from: g */
    public InputStream f14756g;

    /* renamed from: h */
    public long f14757h;

    /* renamed from: i */
    public boolean f14758i;

    public C1582Z8(Context context) {
        super(false);
        this.f14754e = context.getAssets();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws IOException {
        try {
            Uri uri = c3976eD.f26595a;
            long j = c3976eD.f26600f;
            this.f14755f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m8827g();
            InputStream inputStreamOpen = this.f14754e.open(path, 1);
            this.f14756g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C1519Y8(2008, null);
            }
            long j2 = c3976eD.f26601g;
            if (j2 != -1) {
                this.f14757h = j2;
            } else {
                long jAvailable = this.f14756g.available();
                this.f14757h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f14757h = -1L;
                }
            }
            this.f14758i = true;
            m8828h(c3976eD);
            return this.f14757h;
        } catch (C1519Y8 e) {
            throw e;
        } catch (IOException e2) {
            throw new C1519Y8(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        this.f14755f = null;
        try {
            try {
                InputStream inputStream = this.f14756g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C1519Y8(2000, e);
            }
        } finally {
            this.f14756g = null;
            if (this.f14758i) {
                this.f14758i = false;
                m8826e();
            }
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f14755f;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14757h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C1519Y8(2000, e);
            }
        }
        InputStream inputStream = this.f14756g;
        int i3 = AbstractC7485Dh1.f2166a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f14757h;
        if (j2 != -1) {
            this.f14757h = j2 - i4;
        }
        m8825a(i4);
        return i4;
    }
}
