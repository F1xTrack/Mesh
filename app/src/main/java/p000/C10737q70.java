package p000;

import android.net.Uri;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.Arrays;

/* renamed from: q70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10737q70 {

    /* renamed from: a */
    public final EnumC10481o70 f40608a;

    /* renamed from: b */
    public final Uri f40609b;

    /* renamed from: c */
    public final int f40610c;

    /* renamed from: d */
    public File f40611d;

    /* renamed from: e */
    public final boolean f40612e;

    /* renamed from: f */
    public final boolean f40613f;

    /* renamed from: g */
    public final C11756y60 f40614g;

    /* renamed from: h */
    public final C9115dS0 f40615h;

    /* renamed from: i */
    public final CT0 f40616i;

    /* renamed from: j */
    public final C0739Lk f40617j;

    /* renamed from: k */
    public final EnumC11133tD0 f40618k;

    /* renamed from: l */
    public final EnumC10609p70 f40619l;

    /* renamed from: m */
    public final int f40620m;

    /* renamed from: n */
    public final boolean f40621n;

    /* renamed from: o */
    public final boolean f40622o;

    /* renamed from: p */
    public final InterfaceC10747qC0 f40623p;

    public C10737q70(C10865r70 c10865r70) {
        this.f40608a = c10865r70.f41344g;
        Uri uri = c10865r70.f41338a;
        this.f40609b = uri;
        int i = -1;
        if (uri != null) {
            if (AbstractC8885bh1.m10483d(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(AbstractC8885bh1.m10481b(uri))) {
                String strM9384a = AbstractC8592Yp0.m9384a(uri.getPath());
                i = strM9384a != null ? D51.m1556o(strM9384a, "video/", false) : false ? 2 : 3;
            } else if (RemoteMessageConst.Notification.CONTENT.equals(AbstractC8885bh1.m10481b(uri))) {
                i = 4;
            } else if ("asset".equals(AbstractC8885bh1.m10481b(uri))) {
                i = 5;
            } else if ("res".equals(AbstractC8885bh1.m10481b(uri))) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(uri.getScheme())) {
                i = 8;
            }
        }
        this.f40610c = i;
        this.f40612e = c10865r70.f41345h;
        this.f40613f = c10865r70.f41346i;
        this.f40614g = c10865r70.f41343f;
        this.f40615h = c10865r70.f41341d;
        CT0 ct0 = c10865r70.f41342e;
        this.f40616i = ct0 == null ? CT0.f1389b : ct0;
        this.f40617j = c10865r70.f41349l;
        this.f40618k = c10865r70.f41347j;
        this.f40619l = c10865r70.f41339b;
        boolean z = (c10865r70.f41340c & 48) == 0 && (AbstractC8885bh1.m10483d(c10865r70.f41338a) || C10865r70.m24159b(c10865r70.f41338a));
        this.f40621n = z;
        int i2 = c10865r70.f41340c;
        this.f40620m = !z ? i2 | 48 : i2;
        this.f40622o = (i2 & 15) == 0;
        this.f40623p = c10865r70.f41348k;
    }

    /* renamed from: a */
    public final boolean m23931a() {
        return Build.VERSION.SDK_INT >= 29 && this.f40613f;
    }

    /* renamed from: b */
    public final synchronized File m23932b() {
        try {
            if (this.f40611d == null) {
                this.f40609b.getPath().getClass();
                this.f40611d = new File(this.f40609b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40611d;
    }

    /* renamed from: c */
    public final boolean m23933c(int i) {
        return (i & this.f40620m) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10737q70)) {
            return false;
        }
        C10737q70 c10737q70 = (C10737q70) obj;
        c10737q70.getClass();
        if (this.f40621n == c10737q70.f40621n && this.f40622o == c10737q70.f40622o && EI1.m2118a(this.f40609b, c10737q70.f40609b) && EI1.m2118a(this.f40608a, c10737q70.f40608a)) {
            if (EI1.m2118a(null, null) && EI1.m2118a(this.f40611d, c10737q70.f40611d) && EI1.m2118a(this.f40617j, c10737q70.f40617j) && EI1.m2118a(this.f40614g, c10737q70.f40614g) && EI1.m2118a(this.f40615h, c10737q70.f40615h) && EI1.m2118a(this.f40618k, c10737q70.f40618k) && EI1.m2118a(this.f40619l, c10737q70.f40619l) && EI1.m2118a(Integer.valueOf(this.f40620m), Integer.valueOf(c10737q70.f40620m)) && EI1.m2118a(null, null) && EI1.m2118a(null, null) && EI1.m2118a(this.f40616i, c10737q70.f40616i) && this.f40613f == c10737q70.f40613f) {
                InterfaceC10747qC0 interfaceC10747qC0 = this.f40623p;
                InterfaceC4199hl interfaceC4199hlMo22219b = interfaceC10747qC0 != null ? interfaceC10747qC0.mo22219b() : null;
                InterfaceC10747qC0 interfaceC10747qC02 = c10737q70.f40623p;
                return EI1.m2118a(interfaceC4199hlMo22219b, interfaceC10747qC02 != null ? interfaceC10747qC02.mo22219b() : null);
            }
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC10747qC0 interfaceC10747qC0 = this.f40623p;
        InterfaceC4199hl interfaceC4199hlMo22219b = interfaceC10747qC0 != null ? interfaceC10747qC0.mo22219b() : null;
        return Arrays.hashCode(new Object[]{this.f40608a, null, this.f40609b, Boolean.FALSE, this.f40617j, this.f40618k, this.f40619l, Integer.valueOf(this.f40620m), Boolean.valueOf(this.f40621n), Boolean.valueOf(this.f40622o), this.f40614g, null, this.f40615h, this.f40616i, interfaceC4199hlMo22219b, null, 0, Boolean.valueOf(this.f40613f)});
    }

    public final String toString() {
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        c8539Xo1M2121d.m9143l(this.f40609b, "uri");
        c8539Xo1M2121d.m9143l(this.f40608a, "cacheChoice");
        c8539Xo1M2121d.m9143l(this.f40614g, "decodeOptions");
        c8539Xo1M2121d.m9143l(this.f40623p, "postprocessor");
        c8539Xo1M2121d.m9143l(this.f40618k, "priority");
        c8539Xo1M2121d.m9143l(this.f40615h, "resizeOptions");
        c8539Xo1M2121d.m9143l(this.f40616i, "rotationOptions");
        c8539Xo1M2121d.m9143l(this.f40617j, "bytesRange");
        c8539Xo1M2121d.m9143l(null, "resizingAllowedOverride");
        c8539Xo1M2121d.m9142k("progressiveRenderingEnabled", this.f40612e);
        c8539Xo1M2121d.m9142k("localThumbnailPreviewsEnabled", false);
        c8539Xo1M2121d.m9142k("loadThumbnailOnly", this.f40613f);
        c8539Xo1M2121d.m9143l(this.f40619l, "lowestPermittedRequestLevel");
        c8539Xo1M2121d.m9143l(String.valueOf(this.f40620m), "cachesDisabled");
        c8539Xo1M2121d.m9142k("isDiskCacheEnabled", this.f40621n);
        c8539Xo1M2121d.m9142k("isMemoryCacheEnabled", this.f40622o);
        c8539Xo1M2121d.m9143l(null, "decodePrefetches");
        c8539Xo1M2121d.m9143l(String.valueOf(0), "delayMs");
        return c8539Xo1M2121d.toString();
    }
}
