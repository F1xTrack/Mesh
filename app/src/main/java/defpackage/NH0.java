package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class NH0 extends R00 {
    public final /* synthetic */ OH0 M;

    public NH0(OH0 oh0) {
        this.M = oh0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.R00
    public final void t() {
        OH0 oh0 = this.M;
        oh0.e = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        ViewGroup viewGroup = oh0.d;
        if (viewGroup instanceof InterfaceC7418uT0) {
            ((InterfaceC7418uT0) viewGroup).c(viewGroup, motionEventObtain);
        }
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    @Override // defpackage.R00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.MotionEvent r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "sourceEvent"
            defpackage.O90.f(r5, r0)
            int r5 = r3.f
            if (r5 != 0) goto L3c
            OH0 r5 = r3.M
            boolean r0 = r5.e
            if (r0 == 0) goto L36
            T00 r0 = r3.A
            if (r0 == 0) goto L36
            java.util.ArrayList r0 = r0.d
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
            R00 r1 = (defpackage.R00) r1
            int r1 = r1.f
            r2 = 4
            if (r1 != r2) goto L24
            goto L3c
        L36:
            r3.d()
            r0 = 0
            r5.e = r0
        L3c:
            int r4 = r4.getActionMasked()
            r5 = 1
            if (r4 != r5) goto L46
            r3.k()
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NH0.u(android.view.MotionEvent, android.view.MotionEvent):void");
    }
}
