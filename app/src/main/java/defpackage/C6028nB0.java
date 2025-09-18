package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: nB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6028nB0 implements ZC {
    public static final C6028nB0 a = new C6028nB0();

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.ZC
    public final Map l() {
        return Collections.emptyMap();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        return null;
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ZC
    public final void close() {
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
    }
}
