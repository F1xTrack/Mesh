package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: wR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7793wR0 implements RR0 {
    public final ArrayList a;
    public final C1016Mu0 b;
    public final int c;
    public final int d;

    public C7793wR0(int i, int i2, ArrayList arrayList, HashMap map) {
        this.a = arrayList;
        this.c = i;
        this.d = i2;
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        for (CaptureRequest.Key key : map.keySet()) {
            c0468Ft0B.e(new C0572Hc("camera2.captureRequest.option." + key.getName(), Object.class, key), map.get(key));
        }
        C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B);
        C1016Mu0 c1016Mu0 = new C1016Mu0(28);
        c1016Mu0.b = c0873Ky0A;
        this.b = c1016Mu0;
    }

    @Override // defpackage.RR0
    public final InterfaceC7122sw getParameters() {
        return this.b;
    }

    @Override // defpackage.RR0
    public final List getTargetOutputConfigIds() {
        return this.a;
    }

    @Override // defpackage.RR0
    public final int getTemplateId() {
        return this.c;
    }
}
