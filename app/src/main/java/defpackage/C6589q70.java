package defpackage;

import android.net.Uri;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.Arrays;

/* renamed from: q70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6589q70 {
    public final EnumC6207o70 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final C8110y60 g;
    public final C3394dS0 h;
    public final CT0 i;
    public final C0908Lk j;
    public final EnumC7179tD0 k;
    public final EnumC6398p70 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final InterfaceC6604qC0 p;

    public C6589q70(C6779r70 c6779r70) {
        this.a = c6779r70.g;
        Uri uri = c6779r70.a;
        this.b = uri;
        int i = -1;
        if (uri != null) {
            if (AbstractC2374bh1.d(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(AbstractC2374bh1.b(uri))) {
                String strA = AbstractC1937Yp0.a(uri.getPath());
                i = strA != null ? D51.o(strA, "video/", false) : false ? 2 : 3;
            } else if (RemoteMessageConst.Notification.CONTENT.equals(AbstractC2374bh1.b(uri))) {
                i = 4;
            } else if ("asset".equals(AbstractC2374bh1.b(uri))) {
                i = 5;
            } else if ("res".equals(AbstractC2374bh1.b(uri))) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(uri.getScheme())) {
                i = 8;
            }
        }
        this.c = i;
        this.e = c6779r70.h;
        this.f = c6779r70.i;
        this.g = c6779r70.f;
        this.h = c6779r70.d;
        CT0 ct0 = c6779r70.e;
        this.i = ct0 == null ? CT0.b : ct0;
        this.j = c6779r70.l;
        this.k = c6779r70.j;
        this.l = c6779r70.b;
        boolean z = (c6779r70.c & 48) == 0 && (AbstractC2374bh1.d(c6779r70.a) || C6779r70.b(c6779r70.a));
        this.n = z;
        int i2 = c6779r70.c;
        this.m = !z ? i2 | 48 : i2;
        this.o = (i2 & 15) == 0;
        this.p = c6779r70.k;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 29 && this.f;
    }

    public final synchronized File b() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final boolean c(int i) {
        return (i & this.m) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6589q70)) {
            return false;
        }
        C6589q70 c6589q70 = (C6589q70) obj;
        c6589q70.getClass();
        if (this.n == c6589q70.n && this.o == c6589q70.o && EI1.a(this.b, c6589q70.b) && EI1.a(this.a, c6589q70.a)) {
            if (EI1.a(null, null) && EI1.a(this.d, c6589q70.d) && EI1.a(this.j, c6589q70.j) && EI1.a(this.g, c6589q70.g) && EI1.a(this.h, c6589q70.h) && EI1.a(this.k, c6589q70.k) && EI1.a(this.l, c6589q70.l) && EI1.a(Integer.valueOf(this.m), Integer.valueOf(c6589q70.m)) && EI1.a(null, null) && EI1.a(null, null) && EI1.a(this.i, c6589q70.i) && this.f == c6589q70.f) {
                InterfaceC6604qC0 interfaceC6604qC0 = this.p;
                InterfaceC4213hl interfaceC4213hlB = interfaceC6604qC0 != null ? interfaceC6604qC0.b() : null;
                InterfaceC6604qC0 interfaceC6604qC02 = c6589q70.p;
                return EI1.a(interfaceC4213hlB, interfaceC6604qC02 != null ? interfaceC6604qC02.b() : null);
            }
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC6604qC0 interfaceC6604qC0 = this.p;
        InterfaceC4213hl interfaceC4213hlB = interfaceC6604qC0 != null ? interfaceC6604qC0.b() : null;
        return Arrays.hashCode(new Object[]{this.a, null, this.b, Boolean.FALSE, this.j, this.k, this.l, Integer.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o), this.g, null, this.h, this.i, interfaceC4213hlB, null, 0, Boolean.valueOf(this.f)});
    }

    public final String toString() {
        C1857Xo1 c1857Xo1D = EI1.d(this);
        c1857Xo1D.l(this.b, "uri");
        c1857Xo1D.l(this.a, "cacheChoice");
        c1857Xo1D.l(this.g, "decodeOptions");
        c1857Xo1D.l(this.p, "postprocessor");
        c1857Xo1D.l(this.k, "priority");
        c1857Xo1D.l(this.h, "resizeOptions");
        c1857Xo1D.l(this.i, "rotationOptions");
        c1857Xo1D.l(this.j, "bytesRange");
        c1857Xo1D.l(null, "resizingAllowedOverride");
        c1857Xo1D.k("progressiveRenderingEnabled", this.e);
        c1857Xo1D.k("localThumbnailPreviewsEnabled", false);
        c1857Xo1D.k("loadThumbnailOnly", this.f);
        c1857Xo1D.l(this.l, "lowestPermittedRequestLevel");
        c1857Xo1D.l(String.valueOf(this.m), "cachesDisabled");
        c1857Xo1D.k("isDiskCacheEnabled", this.n);
        c1857Xo1D.k("isMemoryCacheEnabled", this.o);
        c1857Xo1D.l(null, "decodePrefetches");
        c1857Xo1D.l(String.valueOf(0), "delayMs");
        return c1857Xo1D.toString();
    }
}
