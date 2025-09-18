package p000;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class VB0 extends AbstractC6550oP {

    /* renamed from: g */
    public static final C10107lC0 f12397g = new C10107lC0(6);

    /* renamed from: a */
    public MotionEvent f12398a;

    /* renamed from: b */
    public String f12399b;

    /* renamed from: c */
    public short f12400c = -1;

    /* renamed from: d */
    public List f12401d;

    /* renamed from: e */
    public UB0 f12402e;

    /* renamed from: f */
    public C9432fw1 f12403f;

    /* renamed from: d */
    public static VB0 m8325d(String str, int i, UB0 ub0, MotionEvent motionEvent) {
        VB0 vb0 = (VB0) f12397g.mo4581i();
        if (vb0 == null) {
            vb0 = new VB0();
        }
        UN1.m7999c(motionEvent);
        vb0.m8328c(str, i, ub0, motionEvent, (short) 0);
        return vb0;
    }

    /* renamed from: a */
    public final List m8326a() {
        int i;
        int actionIndex;
        actionIndex = this.f12398a.getActionIndex();
        String str = this.f12399b;
        str.getClass();
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerDown":
            case "topPointerOver":
            case "topPointerUp":
            case "topClick":
            case "topPointerOut":
                return Arrays.asList(m8327b(actionIndex));
            case "topPointerMove":
            case "topPointerCancel":
                ArrayList arrayList = new ArrayList();
                for (i = 0; i < this.f12398a.getPointerCount(); i++) {
                    arrayList.add(m8327b(i));
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.react.bridge.WritableMap m8327b(int r21) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.VB0.m8327b(int):com.facebook.react.bridge.WritableMap");
    }

    /* renamed from: c */
    public final void m8328c(String str, int i, UB0 ub0, MotionEvent motionEvent, short s) {
        super.init(ub0.f11676d, i, motionEvent.getEventTime());
        this.f12399b = str;
        this.f12398a = MotionEvent.obtain(motionEvent);
        this.f12400c = s;
        this.f12402e = ub0;
    }

    @Override // p000.AbstractC6550oP
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.f12398a == null) {
            ReactSoftExceptionLogger.logSoftException("VB0", new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f12401d == null) {
            this.f12401d = m8326a();
        }
        List list = this.f12401d;
        if (list == null) {
            return;
        }
        boolean z = list.size() > 1;
        for (WritableMap writableMapCopy : this.f12401d) {
            if (z) {
                writableMapCopy = writableMapCopy.copy();
            }
            rCTEventEmitter.receiveEvent(getViewTag(), this.f12399b, writableMapCopy);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    @Override // p000.AbstractC6550oP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchModern(com.facebook.react.uimanager.events.RCTModernEventEmitter r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.VB0.dispatchModern(com.facebook.react.uimanager.events.RCTModernEventEmitter):void");
    }

    @Override // p000.AbstractC6550oP
    public final short getCoalescingKey() {
        return this.f12400c;
    }

    @Override // p000.AbstractC6550oP
    public final InterfaceC6424mP getEventAnimationDriverMatchSpec() {
        if (this.f12403f == null) {
            this.f12403f = new C9432fw1(24, this);
        }
        return this.f12403f;
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        return this.f12399b;
    }

    @Override // p000.AbstractC6550oP
    public final void onDispose() {
        this.f12401d = null;
        MotionEvent motionEvent = this.f12398a;
        this.f12398a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f12397g.mo4580d(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("VB0", e);
        }
    }
}
