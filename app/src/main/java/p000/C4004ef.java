package p000;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: ef */
/* loaded from: classes2.dex */
public final class C4004ef extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f26795a;

    /* renamed from: b */
    public final WritableMap f26796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4004ef(int i, int i2, WritableMap writableMap, int i3) {
        super(i, i2);
        this.f26795a = i3;
        this.f26796b = writableMap;
    }

    @Override // p000.AbstractC6550oP
    public boolean canCoalesce() {
        switch (this.f26795a) {
            case 8:
                return false;
            case 9:
                return false;
            case 10:
                return false;
            case 11:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 14:
                return false;
            case 15:
                return false;
            case 16:
                return false;
            case 17:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // p000.AbstractC6550oP
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.f26795a) {
            case 8:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topCustomMenuSelection", this.f26796b);
                break;
            case 9:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topHttpError", this.f26796b);
                break;
            case 10:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topLoadingError", this.f26796b);
                break;
            case 11:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topLoadingFinish", this.f26796b);
                break;
            case 12:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topLoadingProgress", this.f26796b);
                break;
            case 13:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topLoadingStart", this.f26796b);
                break;
            case 14:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topMessage", this.f26796b);
                break;
            case 15:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topOpenWindow", this.f26796b);
                break;
            case 16:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topRenderProcessGone", this.f26796b);
                break;
            case 17:
                O90.m5968f(rCTEventEmitter, "rctEventEmitter");
                rCTEventEmitter.receiveEvent(getViewTag(), "topShouldStartLoadWithRequest", this.f26796b);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // p000.AbstractC6550oP
    public short getCoalescingKey() {
        switch (this.f26795a) {
            case 8:
                return (short) 0;
            case 9:
                return (short) 0;
            case 10:
                return (short) 0;
            case 11:
                return (short) 0;
            case 12:
                return (short) 0;
            case 13:
                return (short) 0;
            case 14:
                return (short) 0;
            case 15:
                return (short) 0;
            case 16:
                return (short) 0;
            case 17:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // p000.AbstractC6550oP
    public WritableMap getEventData() {
        switch (this.f26795a) {
            case 0:
                return this.f26796b;
            case 1:
                return this.f26796b;
            case 2:
                return this.f26796b;
            case 3:
                return this.f26796b;
            case 4:
                return this.f26796b;
            case 5:
                return this.f26796b;
            case 6:
                return this.f26796b;
            case 7:
                return this.f26796b;
            default:
                return super.getEventData();
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f26795a) {
            case 0:
                return "topCameraAverageFpsChanged";
            case 1:
                return "topCameraCodeScanned";
            case 2:
                return "topCameraError";
            case 3:
                return "topCameraOutputOrientationChanged";
            case 4:
                return "topCameraPreviewOrientationChanged";
            case 5:
                return "topCameraShutter";
            case 6:
                return "topAccessibilityAction";
            case 7:
                return "topChange";
            case 8:
                return "topCustomMenuSelection";
            case 9:
                return "topHttpError";
            case 10:
                return "topLoadingError";
            case 11:
                return "topLoadingFinish";
            case 12:
                return "topLoadingProgress";
            case 13:
                return "topLoadingStart";
            case 14:
                return "topMessage";
            case 15:
                return "topOpenWindow";
            case 16:
                return "topRenderProcessGone";
            default:
                return "topShouldStartLoadWithRequest";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4004ef(int i, WritableMap writableMap, int i2, boolean z) {
        super(i);
        this.f26795a = i2;
        this.f26796b = writableMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004ef(int i, WritableMap writableMap, int i2) {
        super(i);
        this.f26795a = i2;
        switch (i2) {
            case 17:
                super(i);
                this.f26796b = writableMap;
                writableMap.putString("navigationType", "other");
                writableMap.putBoolean("isTopFrame", true);
                break;
            default:
                O90.m5968f(writableMap, "mEventData");
                this.f26796b = writableMap;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004ef(int i, int i2, WritableMap writableMap) {
        super(i, i2);
        this.f26795a = 6;
        this.f26796b = writableMap;
    }
}
