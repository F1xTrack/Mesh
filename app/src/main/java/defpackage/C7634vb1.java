package defpackage;

import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import kotlin.KotlinVersion;

/* renamed from: vb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7634vb1 extends AbstractC6260oP {
    public static final C5649lC0 f = new C5649lC0(3);
    public MotionEvent a;
    public EnumC7824wb1 b;
    public short c;
    public float d;
    public float e;

    public static final C7634vb1 a(int i, int i2, EnumC7824wb1 enumC7824wb1, MotionEvent motionEvent, long j, float f2, float f3, L21 l21) {
        O90.f(l21, "touchEventCoalescingKeyHelper");
        C7634vb1 c7634vb1 = (C7634vb1) f.i();
        if (c7634vb1 == null) {
            c7634vb1 = new C7634vb1();
        }
        UN1.c(motionEvent);
        super.init(i, i2, motionEvent.getEventTime());
        short s = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseIntArray sparseIntArray = (SparseIntArray) l21.b;
        if (action == 0) {
            sparseIntArray.put((int) j, 0);
        } else if (action == 1) {
            sparseIntArray.delete((int) j);
        } else if (action == 2) {
            int i3 = sparseIntArray.get((int) j, -1);
            if (i3 == -1) {
                throw new RuntimeException("Tried to get non-existent cookie");
            }
            s = (short) (i3 & 65535);
        } else if (action == 3) {
            sparseIntArray.delete((int) j);
        } else {
            if (action != 5 && action != 6) {
                throw new RuntimeException(AbstractC7209tN0.u(action, "Unhandled MotionEvent action: "));
            }
            int i4 = (int) j;
            int i5 = sparseIntArray.get(i4, -1);
            if (i5 == -1) {
                throw new RuntimeException("Tried to increment non-existent cookie");
            }
            sparseIntArray.put(i4, i5 + 1);
        }
        c7634vb1.a = MotionEvent.obtain(motionEvent);
        c7634vb1.b = enumC7824wb1;
        c7634vb1.c = s;
        c7634vb1.d = f2;
        c7634vb1.e = f3;
        return c7634vb1;
    }

    @Override // defpackage.AbstractC6260oP
    public final boolean canCoalesce() {
        EnumC7824wb1 enumC7824wb1 = this.b;
        UN1.c(enumC7824wb1);
        int i = AbstractC7443ub1.a[enumC7824wb1.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.b);
    }

    @Override // defpackage.AbstractC6260oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        O90.f(rCTEventEmitter, "rctEventEmitter");
        if (this.a == null) {
            ReactSoftExceptionLogger.logSoftException("vb1", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            MY1.e(rCTEventEmitter, this);
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        O90.f(rCTModernEventEmitter, "rctEventEmitter");
        if (this.a == null) {
            ReactSoftExceptionLogger.logSoftException("vb1", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return this.c;
    }

    @Override // defpackage.AbstractC6260oP
    public final int getEventCategory() {
        EnumC7824wb1 enumC7824wb1 = this.b;
        if (enumC7824wb1 == null) {
            return 2;
        }
        int iOrdinal = enumC7824wb1.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        if (iOrdinal == 3) {
            return 1;
        }
        throw new C7074sg();
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        C3759fN c3759fN = EnumC7824wb1.b;
        EnumC7824wb1 enumC7824wb1 = this.b;
        UN1.c(enumC7824wb1);
        c3759fN.getClass();
        return enumC7824wb1.a;
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.a = null;
        try {
            f.d(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("vb1", e);
        }
    }
}
