package defpackage;

import android.view.View;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class SH0 extends AbstractC6260oP {
    public static final C5649lC0 c = new C5649lC0(7);
    public WritableMap a;
    public short b;

    public static final void a(SH0 sh0, R00 r00) {
        View view = r00.e;
        O90.c(view);
        super.init(OZ1.e(view), view.getId());
        sh0.a = PN1.a(r00);
        sh0.b = r00.s;
    }

    @Override // defpackage.AbstractC6260oP
    public final boolean canCoalesce() {
        return true;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return this.b;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        return this.a;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        this.a = null;
        c.d(this);
    }
}
