package p000;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public final class RH0 extends AbstractC6550oP {

    /* renamed from: d */
    public static final C10107lC0 f10107d = new C10107lC0(7);

    /* renamed from: a */
    public S00 f10108a;

    /* renamed from: b */
    public int f10109b;

    /* renamed from: c */
    public int f10110c;

    /* renamed from: a */
    public static final void m6930a(RH0 rh0, R00 r00, int i, int i2, S00 s00) {
        View view = r00.f9904e;
        O90.m5965c(view);
        super.init(OZ1.m6094e(view), view.getId());
        rh0.f10108a = s00;
        rh0.f10109b = i;
        rh0.f10110c = i2;
    }

    @Override // p000.AbstractC6550oP
    public final boolean canCoalesce() {
        return false;
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        S00 s00 = this.f10108a;
        O90.m5965c(s00);
        int i = this.f10109b;
        int i2 = this.f10110c;
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.m5965c(writableMapCreateMap);
        s00.mo315a(writableMapCreateMap);
        writableMapCreateMap.putInt("state", i);
        writableMapCreateMap.putInt("oldState", i2);
        return writableMapCreateMap;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        this.f10108a = null;
        this.f10109b = 0;
        this.f10110c = 0;
        f10107d.mo4580d(this);
    }
}
