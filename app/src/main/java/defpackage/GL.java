package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes.dex */
public final class GL extends AbstractC6260oP {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GL(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.a = i4;
        this.b = i3;
    }

    @Override // defpackage.AbstractC6260oP
    public boolean canCoalesce() {
        switch (this.a) {
            case 2:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.a) {
            case 2:
                O90.f(rCTEventEmitter, "rctEventEmitter");
                int viewTag = getViewTag();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("position", this.b);
                rCTEventEmitter.receiveEvent(viewTag, "topPageSelected", writableMapCreateMap);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public short getCoalescingKey() {
        switch (this.a) {
            case 1:
                return (short) this.b;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                O90.e(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putInt("drawerState", this.b);
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("headerHeight", this.b);
                return writableMapCreateMap2;
            default:
                return super.getEventData();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topDrawerStateChanged";
            case 1:
                return "topHeaderHeightChange";
            default:
                return "topPageSelected";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GL(int i, int i2) {
        super(i);
        this.a = 2;
        this.b = i2;
    }
}
