package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes2.dex */
public final class L80 extends AbstractC6260oP {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L80(int i, WM wm, C5494kO0 c5494kO0) {
        super(i);
        O90.f(wm, "mInsets");
        O90.f(c5494kO0, "mFrame");
        this.b = wm;
        this.c = c5494kO0;
    }

    @Override // defpackage.AbstractC6260oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.a) {
            case 0:
                O90.f(rCTEventEmitter, "rctEventEmitter");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", LR1.a((WM) this.b));
                O90.f((C5494kO0) this.c, "rect");
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("x", AbstractC7586vL1.a(r1.a));
                writableMapCreateMap2.putDouble("y", AbstractC7586vL1.a(r1.b));
                writableMapCreateMap2.putDouble(Snapshot.WIDTH, AbstractC7586vL1.a(r1.c));
                writableMapCreateMap2.putDouble(Snapshot.HEIGHT, AbstractC7586vL1.a(r1.d));
                writableMapCreateMap.putMap("frame", writableMapCreateMap2);
                rCTEventEmitter.receiveEvent(getViewTag(), "topInsetsChange", writableMapCreateMap);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public WritableMap getEventData() {
        switch (this.a) {
            case 1:
                return (WritableMap) this.c;
            case 2:
                WritableMap writableMapCreateMap = Arguments.createMap();
                InterfaceC6099nZ interfaceC6099nZ = (InterfaceC6099nZ) this.c;
                if (interfaceC6099nZ == null) {
                    interfaceC6099nZ = C0190Ce1.h;
                }
                interfaceC6099nZ.invoke(writableMapCreateMap);
                return writableMapCreateMap;
            default:
                return super.getEventData();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topInsetsChange";
            case 1:
                return (String) this.b;
            default:
                return "top".concat(AbstractC7538v51.J("on", ((SP) this.b).a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L80(int i, int i2, String str, WritableMap writableMap) {
        super(i, i2);
        O90.f(str, "eventName");
        this.b = str;
        this.c = writableMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L80(SP sp, InterfaceC6099nZ interfaceC6099nZ, int i, int i2) {
        super(i, i2);
        this.b = sp;
        this.c = interfaceC6099nZ;
    }
}
