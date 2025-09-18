package defpackage;

import java.util.ArrayList;
import java.util.UUID;

/* renamed from: wt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7877wt0 {
    public final C0674Ik a;
    public C1859Xp0 b;
    public final ArrayList c;

    public C7877wt0() {
        String string = UUID.randomUUID().toString();
        O90.e(string, "randomUUID().toString()");
        C0674Ik c0674Ik = C0674Ik.d;
        this.a = TE.D(string);
        this.b = C8257yt0.e;
        this.c = new ArrayList();
    }

    public final void a(K20 k20, AbstractC7221tR0 abstractC7221tR0) {
        if (k20.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (k20.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        this.c.add(new C8067xt0(k20, abstractC7221tR0));
    }
}
