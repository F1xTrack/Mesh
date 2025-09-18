package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: nA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6025nA0 implements InterfaceC5751lk0 {
    public final long a;
    public final C3538eD b;
    public final int c;
    public final M41 d;
    public final InterfaceC5834mA0 e;
    public volatile Object f;

    public C6025nA0(ZC zc, Uri uri, int i, InterfaceC5834mA0 interfaceC5834mA0) {
        Map mapEmptyMap = Collections.emptyMap();
        YN1.i(uri, "The uri must be set.");
        C3538eD c3538eD = new C3538eD(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        this.d = new M41(zc);
        this.b = c3538eD;
        this.c = i;
        this.e = interfaceC5834mA0;
        this.a = C4020gk0.b.getAndIncrement();
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void e() throws IOException {
        this.d.b = 0L;
        C2282bD c2282bD = new C2282bD(this.d, this.b);
        try {
            c2282bD.m();
            Uri uriO = this.d.a.o();
            uriO.getClass();
            this.f = this.e.i(uriO, c2282bD);
        } finally {
            AbstractC0277Dh1.h(c2282bD);
        }
    }

    @Override // defpackage.InterfaceC5751lk0
    public final void s() {
    }
}
