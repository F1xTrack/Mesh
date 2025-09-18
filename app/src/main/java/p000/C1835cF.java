package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: cF */
/* loaded from: classes.dex */
public final class C1835cF implements InterfaceC1586ZC {

    /* renamed from: a */
    public final Context f17384a;

    /* renamed from: b */
    public final ArrayList f17385b;

    /* renamed from: c */
    public final InterfaceC1586ZC f17386c;

    /* renamed from: d */
    public C6888tT f17387d;

    /* renamed from: e */
    public C1582Z8 f17388e;

    /* renamed from: f */
    public C6982uy f17389f;

    /* renamed from: g */
    public InterfaceC1586ZC f17390g;

    /* renamed from: h */
    public C7533Ef1 f17391h;

    /* renamed from: i */
    public C1334VC f17392i;

    /* renamed from: j */
    public C10377nJ0 f17393j;

    /* renamed from: k */
    public InterfaceC1586ZC f17394k;

    public C1835cF(Context context, InterfaceC1586ZC interfaceC1586ZC) {
        this.f17384a = context.getApplicationContext();
        interfaceC1586ZC.getClass();
        this.f17386c = interfaceC1586ZC;
        this.f17385b = new ArrayList();
    }

    /* renamed from: e */
    public static void m10627e(InterfaceC1586ZC interfaceC1586ZC, InterfaceC9648hc1 interfaceC9648hc1) {
        if (interfaceC1586ZC != null) {
            interfaceC1586ZC.mo5255d(interfaceC9648hc1);
        }
    }

    /* renamed from: a */
    public final void m10628a(InterfaceC1586ZC interfaceC1586ZC) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f17385b;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC1586ZC.mo5255d((InterfaceC9648hc1) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) {
        YN1.m9281f(this.f17394k == null);
        String scheme = c3976eD.f26595a.getScheme();
        int i = AbstractC7485Dh1.f2166a;
        Uri uri = c3976eD.f26595a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f17384a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f17387d == null) {
                    C6888tT c6888tT = new C6888tT(false);
                    this.f17387d = c6888tT;
                    m10628a(c6888tT);
                }
                this.f17394k = this.f17387d;
            } else {
                if (this.f17388e == null) {
                    C1582Z8 c1582z8 = new C1582Z8(context);
                    this.f17388e = c1582z8;
                    m10628a(c1582z8);
                }
                this.f17394k = this.f17388e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f17388e == null) {
                C1582Z8 c1582z82 = new C1582Z8(context);
                this.f17388e = c1582z82;
                m10628a(c1582z82);
            }
            this.f17394k = this.f17388e;
        } else if (RemoteMessageConst.Notification.CONTENT.equals(scheme)) {
            if (this.f17389f == null) {
                C6982uy c6982uy = new C6982uy(context);
                this.f17389f = c6982uy;
                m10628a(c6982uy);
            }
            this.f17394k = this.f17389f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC1586ZC interfaceC1586ZC = this.f17386c;
            if (zEquals) {
                if (this.f17390g == null) {
                    try {
                        InterfaceC1586ZC interfaceC1586ZC2 = (InterfaceC1586ZC) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f17390g = interfaceC1586ZC2;
                        m10628a(interfaceC1586ZC2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC10872rA1.m24175h("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f17390g == null) {
                        this.f17390g = interfaceC1586ZC;
                    }
                }
                this.f17394k = this.f17390g;
            } else if ("udp".equals(scheme)) {
                if (this.f17391h == null) {
                    C7533Ef1 c7533Ef1 = new C7533Ef1();
                    this.f17391h = c7533Ef1;
                    m10628a(c7533Ef1);
                }
                this.f17394k = this.f17391h;
            } else if ("data".equals(scheme)) {
                if (this.f17392i == null) {
                    C1334VC c1334vc = new C1334VC(false);
                    this.f17392i = c1334vc;
                    m10628a(c1334vc);
                }
                this.f17394k = this.f17392i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f17393j == null) {
                    C10377nJ0 c10377nJ0 = new C10377nJ0(context);
                    this.f17393j = c10377nJ0;
                    m10628a(c10377nJ0);
                }
                this.f17394k = this.f17393j;
            } else {
                this.f17394k = interfaceC1586ZC;
            }
        }
        return this.f17394k.mo2365c(c3976eD);
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        InterfaceC1586ZC interfaceC1586ZC = this.f17394k;
        if (interfaceC1586ZC != null) {
            try {
                interfaceC1586ZC.close();
            } finally {
                this.f17394k = null;
            }
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        this.f17386c.mo5255d(interfaceC9648hc1);
        this.f17385b.add(interfaceC9648hc1);
        m10627e(this.f17387d, interfaceC9648hc1);
        m10627e(this.f17388e, interfaceC9648hc1);
        m10627e(this.f17389f, interfaceC9648hc1);
        m10627e(this.f17390g, interfaceC9648hc1);
        m10627e(this.f17391h, interfaceC9648hc1);
        m10627e(this.f17392i, interfaceC9648hc1);
        m10627e(this.f17393j, interfaceC9648hc1);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        InterfaceC1586ZC interfaceC1586ZC = this.f17394k;
        return interfaceC1586ZC == null ? Collections.emptyMap() : interfaceC1586ZC.mo3793l();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        InterfaceC1586ZC interfaceC1586ZC = this.f17394k;
        if (interfaceC1586ZC == null) {
            return null;
        }
        return interfaceC1586ZC.mo2366o();
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) {
        InterfaceC1586ZC interfaceC1586ZC = this.f17394k;
        interfaceC1586ZC.getClass();
        return interfaceC1586ZC.mo2367r(bArr, i, i2);
    }
}
