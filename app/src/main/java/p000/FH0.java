package p000;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class FH0 extends AbstractC6550oP {

    /* renamed from: d */
    public static final C10107lC0 f3141d = new C10107lC0(7);

    /* renamed from: a */
    public S00 f3142a;

    /* renamed from: b */
    public short f3143b;

    /* renamed from: c */
    public boolean f3144c;

    /* renamed from: a */
    public static final void m2577a(FH0 fh0, R00 r00, S00 s00, boolean z) {
        View view = r00.f9904e;
        O90.m5965c(view);
        super.init(OZ1.m6094e(view), view.getId());
        fh0.f3142a = s00;
        fh0.f3144c = z;
        fh0.f3143b = r00.f9918s;
    }

    @Override // p000.AbstractC6550oP
    public final boolean canCoalesce() {
        return true;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return this.f3143b;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        S00 s00 = this.f3142a;
        O90.m5965c(s00);
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.m5965c(writableMapCreateMap);
        s00.mo315a(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return this.f3144c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        this.f3142a = null;
        f3141d.mo4580d(this);
    }
}
