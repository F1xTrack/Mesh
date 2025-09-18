package p000;

import java.util.ArrayList;
import java.util.UUID;

/* renamed from: wt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11600wt0 {

    /* renamed from: a */
    public final C0551Ik f45155a;

    /* renamed from: b */
    public C8540Xp0 f45156b;

    /* renamed from: c */
    public final ArrayList f45157c;

    public C11600wt0() {
        String string = UUID.randomUUID().toString();
        O90.m5967e(string, "randomUUID().toString()");
        C0551Ik c0551Ik = C0551Ik.f5116d;
        this.f45155a = C1210TE.m7631D(string);
        this.f45156b = C11854yt0.f46525e;
        this.f45157c = new ArrayList();
    }

    /* renamed from: a */
    public final void m25723a(K20 k20, AbstractC11161tR0 abstractC11161tR0) {
        if (k20.m4524b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (k20.m4524b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        this.f45157c.add(new C11727xt0(k20, abstractC11161tR0));
    }
}
