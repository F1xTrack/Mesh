package p000;

import java.util.List;

/* renamed from: dW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9123dW0 extends AbstractC7341An1 {

    /* renamed from: a */
    public final /* synthetic */ C9251eW0 f26128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9123dW0(C9251eW0 c9251eW0) {
        super(0);
        this.f26128a = c9251eW0;
    }

    @Override // p000.AbstractC7341An1
    public final void onEnd(C7705Hn1 c7705Hn1) {
        this.f26128a.f26731c = false;
    }

    @Override // p000.AbstractC7341An1
    public final C8433Vn1 onProgress(C8433Vn1 c8433Vn1, List list) {
        O90.m5968f(c8433Vn1, "insets");
        O90.m5968f(list, "runningAnimations");
        C8277Sn1 c8277Sn1 = c8433Vn1.f12756a;
        int i = c8277Sn1.mo5837f(8).f5355d - c8277Sn1.mo5837f(2).f5355d;
        C9251eW0 c9251eW0 = this.f26128a;
        c9251eW0.f26733e = i;
        c9251eW0.m18001n(c9251eW0.f26730b, c9251eW0.getReactHeight(), C9251eW0.m18000m(c9251eW0, c9251eW0.f26732d), c9251eW0.f26733e);
        return c8433Vn1;
    }

    @Override // p000.AbstractC7341An1
    public final C11970zn1 onStart(C7705Hn1 c7705Hn1, C11970zn1 c11970zn1) {
        this.f26128a.f26731c = true;
        return c11970zn1;
    }
}
