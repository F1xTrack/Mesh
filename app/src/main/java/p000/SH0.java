package p000;

import android.view.View;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class SH0 extends AbstractC6550oP {

    /* renamed from: c */
    public static final C10107lC0 f10671c = new C10107lC0(7);

    /* renamed from: a */
    public WritableMap f10672a;

    /* renamed from: b */
    public short f10673b;

    /* renamed from: a */
    public static final void m7209a(SH0 sh0, R00 r00) {
        View view = r00.f9904e;
        O90.m5965c(view);
        super.init(OZ1.m6094e(view), view.getId());
        sh0.f10672a = PN1.m6355a(r00);
        sh0.f10673b = r00.f9918s;
    }

    @Override // p000.AbstractC6550oP
    public final boolean canCoalesce() {
        return true;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return this.f10673b;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        return this.f10672a;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        this.f10672a = null;
        f10671c.mo4580d(this);
    }
}
