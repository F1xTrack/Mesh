package defpackage;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class VB0 extends AbstractC6260oP {
    public static final C5649lC0 g = new C5649lC0(6);
    public MotionEvent a;
    public String b;
    public short c = -1;
    public List d;
    public UB0 e;
    public C3866fw1 f;

    public static VB0 d(String str, int i, UB0 ub0, MotionEvent motionEvent) {
        VB0 vb0 = (VB0) g.i();
        if (vb0 == null) {
            vb0 = new VB0();
        }
        UN1.c(motionEvent);
        vb0.c(str, i, ub0, motionEvent, (short) 0);
        return vb0;
    }

    public final List a() {
        int i;
        int actionIndex;
        actionIndex = this.a.getActionIndex();
        String str = this.b;
        str.getClass();
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerDown":
            case "topPointerOver":
            case "topPointerUp":
            case "topClick":
            case "topPointerOut":
                return Arrays.asList(b(actionIndex));
            case "topPointerMove":
            case "topPointerCancel":
                ArrayList arrayList = new ArrayList();
                for (i = 0; i < this.a.getPointerCount(); i++) {
                    arrayList.add(b(i));
                }
                return arrayList;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193 A[PHI: r7 r8 r10
  0x0193: PHI (r7v16 java.lang.Object) = (r7v12 java.lang.Object), (r7v13 java.lang.Object), (r7v14 java.lang.Object), (r7v17 java.lang.Object) binds: [B:58:0x01ba, B:54:0x01ac, B:50:0x019e, B:47:0x018e] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r8v14 java.lang.Object) = (r8v10 java.lang.Object), (r8v11 java.lang.Object), (r8v12 java.lang.Object), (r8v15 java.lang.Object) binds: [B:58:0x01ba, B:54:0x01ac, B:50:0x019e, B:47:0x018e] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r10v6 java.lang.Object) = (r10v2 java.lang.Object), (r10v3 java.lang.Object), (r10v4 java.lang.Object), (r10v7 java.lang.Object) binds: [B:58:0x01ba, B:54:0x01ac, B:50:0x019e, B:47:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.react.bridge.WritableMap b(int r21) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VB0.b(int):com.facebook.react.bridge.WritableMap");
    }

    public final void c(String str, int i, UB0 ub0, MotionEvent motionEvent, short s) {
        super.init(ub0.d, i, motionEvent.getEventTime());
        this.b = str;
        this.a = MotionEvent.obtain(motionEvent);
        this.c = s;
        this.e = ub0;
    }

    @Override // defpackage.AbstractC6260oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.a == null) {
            ReactSoftExceptionLogger.logSoftException("VB0", new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.d == null) {
            this.d = a();
        }
        List list = this.d;
        if (list == null) {
            return;
        }
        boolean z = list.size() > 1;
        for (WritableMap writableMapCopy : this.d) {
            if (z) {
                writableMapCopy = writableMapCopy.copy();
            }
            rCTEventEmitter.receiveEvent(getViewTag(), this.b, writableMapCopy);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    @Override // defpackage.AbstractC6260oP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchModern(com.facebook.react.uimanager.events.RCTModernEventEmitter r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VB0.dispatchModern(com.facebook.react.uimanager.events.RCTModernEventEmitter):void");
    }

    @Override // defpackage.AbstractC6260oP
    public final short getCoalescingKey() {
        return this.c;
    }

    @Override // defpackage.AbstractC6260oP
    public final InterfaceC5878mP getEventAnimationDriverMatchSpec() {
        if (this.f == null) {
            this.f = new C3866fw1(24, this);
        }
        return this.f;
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        return this.b;
    }

    @Override // defpackage.AbstractC6260oP
    public final void onDispose() {
        this.d = null;
        MotionEvent motionEvent = this.a;
        this.a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            g.d(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("VB0", e);
        }
    }
}
