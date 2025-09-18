package defpackage;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class FH0 extends AbstractC6260oP {
    public static final C5649lC0 d = new C5649lC0(7);
    public S00 a;
    public short b;
    public boolean c;

    public static final void a(FH0 fh0, R00 r00, S00 s00, boolean z) {
        View view = r00.e;
        O90.c(view);
        super.init(OZ1.e(view), view.getId());
        fh0.a = s00;
        fh0.c = z;
        fh0.b = r00.s;
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
        S00 s00 = this.a;
        O90.c(s00);
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.c(writableMapCreateMap);
        s00.a(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return this.c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        this.a = null;
        d.d(this);
    }
}
