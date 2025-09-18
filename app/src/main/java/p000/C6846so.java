package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: so */
/* loaded from: classes2.dex */
public final class C6846so extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f42602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6846so(int i, int i2, int i3) {
        super(i, i2);
        this.f42602a = i3;
    }

    @Override // p000.AbstractC6550oP
    public boolean canCoalesce() {
        switch (this.f42602a) {
            case 12:
                return false;
            case 13:
                return false;
            case 27:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // p000.AbstractC6550oP
    public short getCoalescingKey() {
        switch (this.f42602a) {
            case 8:
                return (short) 0;
            case 9:
                return (short) 0;
            case 10:
                return (short) 0;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 25:
            default:
                return super.getCoalescingKey();
            case 16:
                return (short) 0;
            case 17:
                return (short) 0;
            case 18:
                return (short) 0;
            case 19:
                return (short) 0;
            case 20:
                return (short) 0;
            case 21:
                return (short) 0;
            case 22:
                return (short) 0;
            case 23:
                return (short) 0;
            case 24:
                return (short) 0;
            case 26:
                return (short) 0;
        }
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        switch (this.f42602a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                O90.m5967e(writableMapCreateMap, "createMap(...)");
                return writableMapCreateMap;
            case 1:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap2, "createMap(...)");
                return writableMapCreateMap2;
            case 2:
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap3, "createMap(...)");
                return writableMapCreateMap3;
            case 3:
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap4, "createMap(...)");
                return writableMapCreateMap4;
            case 4:
                WritableMap writableMapCreateMap5 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap5, "createMap(...)");
                return writableMapCreateMap5;
            case 5:
                WritableMap writableMapCreateMap6 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap6, "createMap(...)");
                return writableMapCreateMap6;
            case 6:
                return Arguments.createMap();
            case 7:
                return Arguments.createMap();
            case 8:
                return Arguments.createMap();
            case 9:
                return Arguments.createMap();
            case 10:
                return Arguments.createMap();
            case 11:
                return Arguments.createMap();
            case 12:
                WritableMap writableMapCreateMap7 = Arguments.createMap();
                writableMapCreateMap7.putInt("target", getViewTag());
                return writableMapCreateMap7;
            case 13:
                WritableMap writableMapCreateMap8 = Arguments.createMap();
                writableMapCreateMap8.putInt("target", getViewTag());
                return writableMapCreateMap8;
            case 14:
                return Arguments.createMap();
            case 15:
                WritableMap writableMapCreateMap9 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap9, "createMap(...)");
                return writableMapCreateMap9;
            case 16:
                return Arguments.createMap();
            case 17:
                return Arguments.createMap();
            case 18:
                WritableMap writableMapCreateMap10 = Arguments.createMap();
                writableMapCreateMap10.putInt("dismissCount", 1);
                return writableMapCreateMap10;
            case 19:
                return Arguments.createMap();
            case 20:
                return Arguments.createMap();
            case 21:
                return Arguments.createMap();
            case 22:
                return Arguments.createMap();
            case 23:
                return Arguments.createMap();
            case 24:
                return Arguments.createMap();
            case 25:
                return Arguments.createMap();
            case 26:
                return Arguments.createMap();
            default:
                WritableMap writableMapCreateMap11 = Arguments.createMap();
                O90.m5967e(writableMapCreateMap11, "createMap(...)");
                return writableMapCreateMap11;
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f42602a) {
            case 0:
                return "topCameraInitialized";
            case 1:
                return "topCameraPreviewStarted";
            case 2:
                return "topCameraPreviewStopped";
            case 3:
                return "topCameraStarted";
            case 4:
                return "topCameraStopped";
            case 5:
                return "topCameraViewReady";
            case 6:
                return "topDrawerClose";
            case 7:
                return "topDrawerOpen";
            case 8:
                return "topAttached";
            case 9:
                return "topHeaderBackButtonClicked";
            case 10:
                return "topDetached";
            case 11:
                return "topAnimationLoaded";
            case 12:
                return "topBlur";
            case 13:
                return "topFocus";
            case 14:
                return "topRefresh";
            case 15:
                return "topRequestClose";
            case 16:
                return "topAppear";
            case 17:
                return "topDisappear";
            case 18:
                return "topDismissed";
            case 19:
                return "topWillAppear";
            case 20:
                return "topWillDisappear";
            case 21:
                return "topSearchBlur";
            case 22:
                return "topClose";
            case 23:
                return "topSearchFocus";
            case 24:
                return "topOpen";
            case 25:
                return "topShow";
            case 26:
                return "topFinishTransitioning";
            default:
                return "topClick";
        }
    }
}
