package p000;

import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import kotlin.KotlinVersion;

/* renamed from: vb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11438vb1 extends AbstractC6550oP {

    /* renamed from: f */
    public static final C10107lC0 f44440f = new C10107lC0(3);

    /* renamed from: a */
    public MotionEvent f44441a;

    /* renamed from: b */
    public EnumC11565wb1 f44442b;

    /* renamed from: c */
    public short f44443c;

    /* renamed from: d */
    public float f44444d;

    /* renamed from: e */
    public float f44445e;

    /* renamed from: a */
    public static final C11438vb1 m25455a(int i, int i2, EnumC11565wb1 enumC11565wb1, MotionEvent motionEvent, long j, float f, float f2, L21 l21) {
        O90.m5968f(l21, "touchEventCoalescingKeyHelper");
        C11438vb1 c11438vb1 = (C11438vb1) f44440f.mo4581i();
        if (c11438vb1 == null) {
            c11438vb1 = new C11438vb1();
        }
        UN1.m7999c(motionEvent);
        super.init(i, i2, motionEvent.getEventTime());
        short s = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseIntArray sparseIntArray = (SparseIntArray) l21.f6473b;
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
                throw new RuntimeException(AbstractC11153tN0.m24909u(action, "Unhandled MotionEvent action: "));
            }
            int i4 = (int) j;
            int i5 = sparseIntArray.get(i4, -1);
            if (i5 == -1) {
                throw new RuntimeException("Tried to increment non-existent cookie");
            }
            sparseIntArray.put(i4, i5 + 1);
        }
        c11438vb1.f44441a = MotionEvent.obtain(motionEvent);
        c11438vb1.f44442b = enumC11565wb1;
        c11438vb1.f44443c = s;
        c11438vb1.f44444d = f;
        c11438vb1.f44445e = f2;
        return c11438vb1;
    }

    @Override // p000.AbstractC6550oP
    public final boolean canCoalesce() {
        EnumC11565wb1 enumC11565wb1 = this.f44442b;
        UN1.m7999c(enumC11565wb1);
        int i = AbstractC11310ub1.f43772a[enumC11565wb1.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f44442b);
    }

    @Override // p000.AbstractC6550oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        O90.m5968f(rCTEventEmitter, "rctEventEmitter");
        if (this.f44441a == null) {
            ReactSoftExceptionLogger.logSoftException("vb1", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            MY1.m5398e(rCTEventEmitter, this);
        }
    }

    @Override // p000.AbstractC6550oP
    public final void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        O90.m5968f(rCTModernEventEmitter, "rctEventEmitter");
        if (this.f44441a == null) {
            ReactSoftExceptionLogger.logSoftException("vb1", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return this.f44443c;
    }

    @Override // p000.AbstractC6550oP
    public final int getEventCategory() {
        EnumC11565wb1 enumC11565wb1 = this.f44442b;
        if (enumC11565wb1 == null) {
            return 2;
        }
        int iOrdinal = enumC11565wb1.ordinal();
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
        throw new C6838sg();
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        C4049fN c4049fN = EnumC11565wb1.f44986b;
        EnumC11565wb1 enumC11565wb1 = this.f44442b;
        UN1.m7999c(enumC11565wb1);
        c4049fN.getClass();
        return enumC11565wb1.f44992a;
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        MotionEvent motionEvent = this.f44441a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f44441a = null;
        try {
            f44440f.mo4580d(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("vb1", e);
        }
    }
}
