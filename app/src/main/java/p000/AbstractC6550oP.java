package p000;

import android.os.SystemClock;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;

/* renamed from: oP */
/* loaded from: classes.dex */
public abstract class AbstractC6550oP {
    private static int sUniqueID;
    private InterfaceC6424mP mEventAnimationDriverMatchSpec;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    public AbstractC6550oP() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    public boolean canCoalesce() {
        return true;
    }

    public AbstractC6550oP coalesce(AbstractC6550oP abstractC6550oP) {
        return getTimestampMs() >= abstractC6550oP.getTimestampMs() ? this : abstractC6550oP;
    }

    @Deprecated
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (getSurfaceId() != -1) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }

    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public InterfaceC6424mP getEventAnimationDriverMatchSpec() {
        if (this.mEventAnimationDriverMatchSpec == null) {
            this.mEventAnimationDriverMatchSpec = new C9196e41(15, this);
        }
        return this.mEventAnimationDriverMatchSpec;
    }

    public int getEventCategory() {
        return 2;
    }

    public WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    public void init(int i, int i2) {
        init(i, i2, SystemClock.uptimeMillis());
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public AbstractC6550oP(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }

    @Deprecated
    public void init(int i) {
        init(-1, i);
    }

    public void init(int i, int i2, long j) {
        this.mSurfaceId = i;
        this.mViewTag = i2;
        this.mTimestampMs = j;
        this.mInitialized = true;
    }

    public AbstractC6550oP(int i, int i2) {
        int i3 = sUniqueID;
        sUniqueID = i3 + 1;
        this.mUniqueID = i3;
        init(i, i2);
    }

    public void onDispose() {
    }
}
