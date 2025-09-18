package p000;

import android.hardware.camera2.TotalCaptureResult;
import com.facebook.react.bridge.Promise;
import com.mrousavy.camera.react.CameraViewModule;

/* renamed from: Mm */
/* loaded from: classes.dex */
public final /* synthetic */ class C0804Mm implements InterfaceC6471n9, QA0, InterfaceC8216Rj0, InterfaceC0363Fl, InterfaceC9538gl1, InterfaceC1639a2 {

    /* renamed from: a */
    public final /* synthetic */ int f7328a;

    /* renamed from: b */
    public final /* synthetic */ int f7329b;

    /* renamed from: c */
    public final /* synthetic */ Object f7330c;

    public /* synthetic */ C0804Mm(int i, Object obj, int i2) {
        this.f7328a = i2;
        this.f7329b = i;
        this.f7330c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // p000.InterfaceC1639a2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2839a(android.view.View r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f7330c
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            r6.getClass()
            r0 = 1
            int r1 = r5.f7329b
            if (r1 == r0) goto L4a
            r2 = 2
            if (r1 != r2) goto L10
            goto L4a
        L10:
            java.lang.ref.WeakReference r2 = r6.f18248p
            if (r2 == 0) goto L46
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L1b
            goto L46
        L1b:
            java.lang.ref.WeakReference r2 = r6.f18248p
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            ja r3 = new ja
            r4 = 13
            r3.<init>(r6, r1, r4)
            android.view.ViewParent r6 = r2.getParent()
            if (r6 == 0) goto L42
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L42
            java.util.WeakHashMap r6 = p000.AbstractC10944rk1.f41842a
            boolean r6 = r2.isAttachedToWindow()
            if (r6 == 0) goto L42
            r2.post(r3)
            goto L49
        L42:
            r3.run()
            goto L49
        L46:
            r6.m11248s(r1)
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
            java.lang.String r0 = p000.AbstractC1374Vq.m8593l(r2, r0, r1)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0804Mm.mo2839a(android.view.View):boolean");
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        C1056Qm c1056Qm = (C1056Qm) this.f7330c;
        c1056Qm.getClass();
        if (C1622Zm.m9587j(totalCaptureResult, this.f7329b)) {
            c1056Qm.f9775g = C1056Qm.f9768k;
        }
        return c1056Qm.f9777i.mo4404a(totalCaptureResult);
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        C1753aw c1753aw = (C1753aw) this.f7330c;
        c1753aw.getClass();
        int i = this.f7329b;
        ((ExecutorC10151lY0) c1753aw.f16685e).execute(new RunnableC6694qf(c1753aw, c0300El, i, 9));
        return "setExposureCompensationIndex[" + i + "]";
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        switch (this.f7328a) {
            case 2:
                AbstractC7419Ca1 abstractC7419Ca1 = ((BB0) this.f7330c).f623a;
                gb0.mo2960s(this.f7329b);
                break;
            default:
                gb0.mo2945G((C10825qp0) this.f7330c, this.f7329b);
                break;
        }
    }

    @Override // p000.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return CameraViewModule.requestPermission$lambda$1(this.f7329b, (Promise) this.f7330c, i, strArr, iArr);
    }

    public /* synthetic */ C0804Mm(Object obj, int i, int i2) {
        this.f7328a = i2;
        this.f7330c = obj;
        this.f7329b = i;
    }
}
