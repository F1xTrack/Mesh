package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class M41 implements InterfaceC1586ZC {

    /* renamed from: a */
    public final InterfaceC1586ZC f6985a;

    /* renamed from: b */
    public long f6986b;

    /* renamed from: c */
    public Uri f6987c;

    public M41(InterfaceC1586ZC interfaceC1586ZC) {
        interfaceC1586ZC.getClass();
        this.f6985a = interfaceC1586ZC;
        this.f6987c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) {
        this.f6987c = c3976eD.f26595a;
        Collections.emptyMap();
        InterfaceC1586ZC interfaceC1586ZC = this.f6985a;
        long jMo2365c = interfaceC1586ZC.mo2365c(c3976eD);
        Uri uriMo2366o = interfaceC1586ZC.mo2366o();
        uriMo2366o.getClass();
        this.f6987c = uriMo2366o;
        interfaceC1586ZC.mo3793l();
        return jMo2365c;
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        this.f6985a.close();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        this.f6985a.mo5255d(interfaceC9648hc1);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        return this.f6985a.mo3793l();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f6985a.mo2366o();
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) {
        int iMo2367r = this.f6985a.mo2367r(bArr, i, i2);
        if (iMo2367r != -1) {
            this.f6986b += iMo2367r;
        }
        return iMo2367r;
    }
}
