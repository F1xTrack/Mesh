package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: nA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10359nA0 implements InterfaceC10175lk0 {

    /* renamed from: a */
    public final long f38158a;

    /* renamed from: b */
    public final C3976eD f38159b;

    /* renamed from: c */
    public final int f38160c;

    /* renamed from: d */
    public final M41 f38161d;

    /* renamed from: e */
    public final InterfaceC10231mA0 f38162e;

    /* renamed from: f */
    public volatile Object f38163f;

    public C10359nA0(InterfaceC1586ZC interfaceC1586ZC, Uri uri, int i, InterfaceC10231mA0 interfaceC10231mA0) {
        Map mapEmptyMap = Collections.emptyMap();
        YN1.m9284i(uri, "The uri must be set.");
        C3976eD c3976eD = new C3976eD(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.f38161d = new M41(interfaceC1586ZC);
        this.f38159b = c3976eD;
        this.f38160c = i;
        this.f38162e = interfaceC10231mA0;
        this.f38158a = C9535gk0.f27975b.getAndIncrement();
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() throws IOException {
        this.f38161d.f6986b = 0L;
        C1771bD c1771bD = new C1771bD(this.f38161d, this.f38159b);
        try {
            c1771bD.m10434m();
            Uri uriMo2366o = this.f38161d.f6985a.mo2366o();
            uriMo2366o.getClass();
            this.f38163f = this.f38162e.mo5748i(uriMo2366o, c1771bD);
        } finally {
            AbstractC7485Dh1.m1823h(c1771bD);
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
    }
}
