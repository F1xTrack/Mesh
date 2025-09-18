package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;

/* renamed from: Mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0991Mm implements InterfaceC6021n9, QA0, InterfaceC1373Rj0, InterfaceC0443Fl, InterfaceC4024gl1, InterfaceC2056a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0991Mm(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // defpackage.InterfaceC2056a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.View r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.c
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            r6.getClass()
            r0 = 1
            int r1 = r5.b
            if (r1 == r0) goto L4a
            r2 = 2
            if (r1 != r2) goto L10
            goto L4a
        L10:
            java.lang.ref.WeakReference r2 = r6.p
            if (r2 == 0) goto L46
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L1b
            goto L46
        L1b:
            java.lang.ref.WeakReference r2 = r6.p
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            ja r3 = new ja
            r4 = 13
            r3.<init>(r6, r1, r4)
            android.view.ViewParent r6 = r2.getParent()
            if (r6 == 0) goto L42
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L42
            java.util.WeakHashMap r6 = defpackage.AbstractC6897rk1.a
            boolean r6 = r2.isAttachedToWindow()
            if (r6 == 0) goto L42
            r2.post(r3)
            goto L49
        L42:
            r3.run()
            goto L49
        L46:
            r6.s(r1)
        L49:
            return r0
        L4a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r1 != r0) goto L58
            java.lang.String r0 = "DRAGGING"
            goto L5a
        L58:
            java.lang.String r0 = "SETTLING"
        L5a:
            java.lang.String r1 = " should not be set externally."
            java.lang.String r0 = defpackage.AbstractC1705Vq.l(r2, r0, r1)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0991Mm.a(android.view.View):boolean");
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        C1303Qm c1303Qm = (C1303Qm) this.c;
        c1303Qm.getClass();
        if (C2005Zm.j(totalCaptureResult, this.b)) {
            c1303Qm.g = C1303Qm.k;
        }
        return c1303Qm.i.a(totalCaptureResult);
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        C2226aw c2226aw = (C2226aw) this.c;
        c2226aw.getClass();
        int i = this.b;
        ((ExecutorC5715lY0) c2226aw.e).execute(new RunnableC6690qf(c2226aw, c0365El, i, 9));
        return "setExposureCompensationIndex[" + i + "]";
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        switch (this.a) {
            case 2:
                AbstractC0178Ca1 abstractC0178Ca1 = ((BB0) this.c).a;
                gb0.s(this.b);
                break;
            default:
                gb0.G((C6721qp0) this.c, this.b);
                break;
        }
    }

    @Override // defpackage.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return CameraViewModule.requestPermission$lambda$1(this.b, (Promise) this.c, i, strArr, iArr);
    }

    public /* synthetic */ C0991Mm(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
