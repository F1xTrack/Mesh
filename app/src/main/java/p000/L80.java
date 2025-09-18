package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes2.dex */
public final class L80 extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f6512a = 1;

    /* renamed from: b */
    public final Object f6513b;

    /* renamed from: c */
    public final Object f6514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L80(int i, C1407WM c1407wm, C10003kO0 c10003kO0) {
        super(i);
        O90.m5968f(c1407wm, "mInsets");
        O90.m5968f(c10003kO0, "mFrame");
        this.f6513b = c1407wm;
        this.f6514c = c10003kO0;
    }

    @Override // p000.AbstractC6550oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.f6512a) {
            case 0:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", LR1.m5001a((C1407WM) this.f6513b));
                O90.m5968f((C10003kO0) this.f6514c, "rect");
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("x", AbstractC11406vL1.m25402a(r1.f36478a));
                writableMapCreateMap2.putDouble("y", AbstractC11406vL1.m25402a(r1.f36479b));
                writableMapCreateMap2.putDouble(Snapshot.WIDTH, AbstractC11406vL1.m25402a(r1.f36480c));
                writableMapCreateMap2.putDouble(Snapshot.HEIGHT, AbstractC11406vL1.m25402a(r1.f36481d));
                writableMapCreateMap.putMap("frame", writableMapCreateMap2);
                rCTEventEmitter.receiveEvent(getViewTag(), "topInsetsChange", writableMapCreateMap);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        switch (this.f6512a) {
            case 1:
                return (WritableMap) this.f6514c;
            case 2:
                WritableMap writableMapCreateMap = Arguments.createMap();
                InterfaceC6497nZ interfaceC6497nZ = (InterfaceC6497nZ) this.f6514c;
                if (interfaceC6497nZ == null) {
                    interfaceC6497nZ = C7427Ce1.f1548h;
                }
                interfaceC6497nZ.invoke(writableMapCreateMap);
                return writableMapCreateMap;
            default:
                return super.getEventData();
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f6512a) {
            case 0:
                return "topInsetsChange";
            case 1:
                return (String) this.f6513b;
            default:
                return "top".concat(AbstractC11374v51.m25335J("on", ((EnumC1158SP) this.f6513b).f10743a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L80(int i, int i2, String str, WritableMap writableMap) {
        super(i, i2);
        O90.m5968f(str, "eventName");
        this.f6513b = str;
        this.f6514c = writableMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L80(EnumC1158SP enumC1158SP, InterfaceC6497nZ interfaceC6497nZ, int i, int i2) {
        super(i, i2);
        this.f6513b = enumC1158SP;
        this.f6514c = interfaceC6497nZ;
    }
}
