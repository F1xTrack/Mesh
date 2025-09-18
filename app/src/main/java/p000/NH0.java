package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class NH0 extends R00 {

    /* renamed from: M */
    public final /* synthetic */ OH0 f7714M;

    public NH0(OH0 oh0) {
        this.f7714M = oh0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.R00
    /* renamed from: t */
    public final void mo5614t() {
        OH0 oh0 = this.f7714M;
        oh0.f8341e = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        ViewGroup viewGroup = oh0.f8340d;
        if (viewGroup instanceof InterfaceC11293uT0) {
            ((InterfaceC11293uT0) viewGroup).mo6038c(viewGroup, motionEventObtain);
        }
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    @Override // p000.R00
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo722u(android.view.MotionEvent r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "sourceEvent"
            p000.O90.m5968f(r5, r0)
            int r5 = r3.f9905f
            if (r5 != 0) goto L3c
            OH0 r5 = r3.f7714M
            boolean r0 = r5.f8341e
            if (r0 == 0) goto L36
            T00 r0 = r3.f9891A
            if (r0 == 0) goto L36
            java.util.ArrayList r0 = r0.f11095d
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L20
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L20
            goto L36
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            R00 r1 = (p000.R00) r1
            int r1 = r1.f9905f
            r2 = 4
            if (r1 != r2) goto L24
            goto L3c
        L36:
            r3.m6856d()
            r0 = 0
            r5.f8341e = r0
        L3c:
            int r4 = r4.getActionMasked()
            r5 = 1
            if (r4 != r5) goto L46
            r3.m6862k()
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.NH0.mo722u(android.view.MotionEvent, android.view.MotionEvent):void");
    }
}
