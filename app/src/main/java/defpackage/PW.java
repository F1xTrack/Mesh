package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes2.dex */
public final class PW extends AbstractC6260oP {
    public final /* synthetic */ int a;
    public String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PW(int i, int i2, int i3) {
        super(i, i2);
        this.a = i3;
    }

    @Override // defpackage.AbstractC6260oP
    public boolean canCoalesce() {
        switch (this.a) {
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.a) {
            case 1:
                O90.f(rCTEventEmitter, "rctEventEmitter");
                int viewTag = getViewTag();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("pageScrollState", this.b);
                rCTEventEmitter.receiveEvent(viewTag, "topPageScrollStateChanged", writableMapCreateMap);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public short getCoalescingKey() {
        switch (this.a) {
            case 0:
                return (short) 0;
            case 5:
                return (short) 0;
            case 6:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("text", this.b);
                return writableMapCreateMap;
            case 1:
            default:
                return super.getEventData();
            case 2:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("target", getViewTag());
                writableMapCreateMap2.putString("text", this.b);
                return writableMapCreateMap2;
            case 3:
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putString("key", this.b);
                return writableMapCreateMap3;
            case 4:
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                writableMapCreateMap4.putInt("target", getViewTag());
                writableMapCreateMap4.putString("text", this.b);
                return writableMapCreateMap4;
            case 5:
                WritableMap writableMapCreateMap5 = Arguments.createMap();
                writableMapCreateMap5.putString("text", this.b);
                return writableMapCreateMap5;
            case 6:
                WritableMap writableMapCreateMap6 = Arguments.createMap();
                writableMapCreateMap6.putString("text", this.b);
                return writableMapCreateMap6;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topFocusedInputTextChanged";
            case 1:
                return "topPageScrollStateChanged";
            case 2:
                return "topEndEditing";
            case 3:
                return "topKeyPress";
            case 4:
                return "topSubmitEditing";
            case 5:
                return "topChangeText";
            default:
                return "topSearchButtonPress";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PW(int i, int i2, int i3, String str) {
        super(i, i2);
        this.a = i3;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PW(int i, int i2, String str) {
        super(i, i2);
        this.a = 0;
        O90.f(str, "text");
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PW(int i, String str) {
        super(i);
        this.a = 1;
        this.b = str;
    }
}
