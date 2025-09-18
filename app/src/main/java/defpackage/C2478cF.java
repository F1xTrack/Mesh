package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: cF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2478cF implements ZC {
    public final Context a;
    public final ArrayList b;
    public final ZC c;
    public C7226tT d;
    public Z8 e;
    public C7510uy f;
    public ZC g;
    public C0349Ef1 h;
    public VC i;
    public C6052nJ0 j;
    public ZC k;

    public C2478cF(Context context, ZC zc) {
        this.a = context.getApplicationContext();
        zc.getClass();
        this.c = zc;
        this.b = new ArrayList();
    }

    public static void e(ZC zc, InterfaceC4188hc1 interfaceC4188hc1) {
        if (zc != null) {
            zc.d(interfaceC4188hc1);
        }
    }

    public final void a(ZC zc) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            zc.d((InterfaceC4188hc1) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) {
        YN1.f(this.k == null);
        String scheme = c3538eD.a.getScheme();
        int i = AbstractC0277Dh1.a;
        Uri uri = c3538eD.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    C7226tT c7226tT = new C7226tT(false);
                    this.d = c7226tT;
                    a(c7226tT);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    Z8 z8 = new Z8(context);
                    this.e = z8;
                    a(z8);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                Z8 z82 = new Z8(context);
                this.e = z82;
                a(z82);
            }
            this.k = this.e;
        } else if (RemoteMessageConst.Notification.CONTENT.equals(scheme)) {
            if (this.f == null) {
                C7510uy c7510uy = new C7510uy(context);
                this.f = c7510uy;
                a(c7510uy);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            ZC zc = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        ZC zc2 = (ZC) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = zc2;
                        a(zc2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC6789rA1.h("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = zc;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    C0349Ef1 c0349Ef1 = new C0349Ef1();
                    this.h = c0349Ef1;
                    a(c0349Ef1);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    VC vc = new VC(false);
                    this.i = vc;
                    a(vc);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    C6052nJ0 c6052nJ0 = new C6052nJ0(context);
                    this.j = c6052nJ0;
                    a(c6052nJ0);
                }
                this.k = this.j;
            } else {
                this.k = zc;
            }
        }
        return this.k.c(c3538eD);
    }

    @Override // defpackage.ZC
    public final void close() {
        ZC zc = this.k;
        if (zc != null) {
            try {
                zc.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
        interfaceC4188hc1.getClass();
        this.c.d(interfaceC4188hc1);
        this.b.add(interfaceC4188hc1);
        e(this.d, interfaceC4188hc1);
        e(this.e, interfaceC4188hc1);
        e(this.f, interfaceC4188hc1);
        e(this.g, interfaceC4188hc1);
        e(this.h, interfaceC4188hc1);
        e(this.i, interfaceC4188hc1);
        e(this.j, interfaceC4188hc1);
    }

    @Override // defpackage.ZC
    public final Map l() {
        ZC zc = this.k;
        return zc == null ? Collections.emptyMap() : zc.l();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        ZC zc = this.k;
        if (zc == null) {
            return null;
        }
        return zc.o();
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) {
        ZC zc = this.k;
        zc.getClass();
        return zc.r(bArr, i, i2);
    }
}
