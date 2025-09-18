package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: nB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10361nB0 implements InterfaceC1586ZC {

    /* renamed from: a */
    public static final C10361nB0 f38166a = new C10361nB0();

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public final Map mo3793l() {
        return Collections.emptyMap();
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return null;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
    }
}
