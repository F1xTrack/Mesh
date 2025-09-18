package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* renamed from: oR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6267oR0 extends AbstractC6458pR0 {
    public final C3939gJ0 f;
    public final C1562Tu0 g;

    public C6267oR0(long j, C6666qX c6666qX, P70 p70, PX0 px0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c6666qX, p70, px0, arrayList, arrayList2, arrayList3);
        Uri.parse(((C0896Lg) p70.get(0)).a);
        long j2 = px0.e;
        C3939gJ0 c3939gJ0 = j2 <= 0 ? null : new C3939gJ0(px0.d, j2, null);
        this.f = c3939gJ0;
        this.g = c3939gJ0 == null ? new C1562Tu0(29, new C3939gJ0(0L, -1L, null)) : null;
    }

    @Override // defpackage.AbstractC6458pR0
    public final String b() {
        return null;
    }

    @Override // defpackage.AbstractC6458pR0
    public final InterfaceC8127yC c() {
        return this.g;
    }

    @Override // defpackage.AbstractC6458pR0
    public final C3939gJ0 d() {
        return this.f;
    }
}
