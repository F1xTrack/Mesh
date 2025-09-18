package defpackage;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class RH0 extends AbstractC6260oP {
    public static final C5649lC0 d = new C5649lC0(7);
    public S00 a;
    public int b;
    public int c;

    public static final void a(RH0 rh0, R00 r00, int i, int i2, S00 s00) {
        View view = r00.e;
        O90.c(view);
        super.init(OZ1.e(view), view.getId());
        rh0.a = s00;
        rh0.b = i;
        rh0.c = i2;
    }

    @Override // defpackage.AbstractC6260oP
    public final boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        S00 s00 = this.a;
        O90.c(s00);
        int i = this.b;
        int i2 = this.c;
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.c(writableMapCreateMap);
        s00.a(writableMapCreateMap);
        writableMapCreateMap.putInt("state", i);
        writableMapCreateMap.putInt("oldState", i2);
        return writableMapCreateMap;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        d.d(this);
    }
}
