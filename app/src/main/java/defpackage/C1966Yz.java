package defpackage;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: Yz */
/* loaded from: classes2.dex */
public final class C1966Yz extends EX {
    public final C1888Xz b;
    public final NT c;
    public long d;

    public C1966Yz(InterfaceC0749Jj interfaceC0749Jj, C1888Xz c1888Xz, NT nt) {
        super(interfaceC0749Jj);
        this.b = c1888Xz;
        this.c = nt;
    }

    @Override // defpackage.EX, defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "source");
        super.c0(c6129nj, j);
        long j2 = this.d + j;
        this.d = j2;
        long jA = this.b.a();
        NT nt = this.c;
        nt.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > nt.b + 100 || j2 == jA) {
            nt.b = jCurrentTimeMillis;
            bundle2.putDouble("totalBytesSent", j2);
            bundle2.putDouble("totalBytesExpectedToSend", jA);
            bundle.putString(CommonUrlParts.UUID, (String) nt.c);
            bundle.putBundle("data", bundle2);
            ((WT) nt.d).c(bundle, "expo-file-system.uploadProgress");
        }
    }
}
