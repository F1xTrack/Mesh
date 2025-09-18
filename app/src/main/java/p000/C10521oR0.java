package p000;

import android.net.Uri;
import java.util.ArrayList;

/* renamed from: oR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10521oR0 extends AbstractC10649pR0 {

    /* renamed from: f */
    public final C9481gJ0 f38998f;

    /* renamed from: g */
    public final C8342Tu0 f38999g;

    public C10521oR0(long j, C6686qX c6686qX, P70 p70, PX0 px0, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c6686qX, p70, px0, arrayList, arrayList2, arrayList3);
        Uri.parse(((C0735Lg) p70.get(0)).f6792a);
        long j2 = px0.f9109e;
        C9481gJ0 c9481gJ0 = j2 <= 0 ? null : new C9481gJ0(px0.f9108d, j2, null);
        this.f38998f = c9481gJ0;
        this.f38999g = c9481gJ0 == null ? new C8342Tu0(29, new C9481gJ0(0L, -1L, null)) : null;
    }

    @Override // p000.AbstractC10649pR0
    /* renamed from: b */
    public final String mo23138b() {
        return null;
    }

    @Override // p000.AbstractC10649pR0
    /* renamed from: c */
    public final InterfaceC7186yC mo23139c() {
        return this.f38999g;
    }

    @Override // p000.AbstractC10649pR0
    /* renamed from: d */
    public final C9481gJ0 mo23140d() {
        return this.f38998f;
    }
}
