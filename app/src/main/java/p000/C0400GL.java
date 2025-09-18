package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: GL */
/* loaded from: classes.dex */
public final class C0400GL extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f3696a;

    /* renamed from: b */
    public final int f3697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0400GL(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.f3696a = i4;
        this.f3697b = i3;
    }

    @Override // p000.AbstractC6550oP
    public boolean canCoalesce() {
        switch (this.f3696a) {
            case 2:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // p000.AbstractC6550oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.f3696a) {
            case 2:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                int viewTag = getViewTag();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("position", this.f3697b);
                rCTEventEmitter.receiveEvent(viewTag, "topPageSelected", writableMapCreateMap);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // p000.AbstractC6550oP
    public short getCoalescingKey() {
        switch (this.f3696a) {
            case 1:
                return (short) this.f3697b;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        switch (this.f3696a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                O90.m5967e(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putInt("drawerState", this.f3697b);
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("headerHeight", this.f3697b);
                return writableMapCreateMap2;
            default:
                return super.getEventData();
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f3696a) {
            case 0:
                return "topDrawerStateChanged";
            case 1:
                return "topHeaderHeightChange";
            default:
                return "topPageSelected";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400GL(int i, int i2) {
        super(i);
        this.f3696a = 2;
        this.f3697b = i2;
    }
}
