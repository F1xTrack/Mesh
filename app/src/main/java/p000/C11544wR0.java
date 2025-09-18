package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: wR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11544wR0 implements RR0 {

    /* renamed from: a */
    public final ArrayList f44866a;

    /* renamed from: b */
    public final C7978Mu0 f44867b;

    /* renamed from: c */
    public final int f44868c;

    /* renamed from: d */
    public final int f44869d;

    public C11544wR0(int i, int i2, ArrayList arrayList, HashMap map) {
        this.f44866a = arrayList;
        this.f44868c = i;
        this.f44869d = i2;
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        for (CaptureRequest.Key key : map.keySet()) {
            c7612Ft0M2812b.m2815e(new C0480Hc("camera2.captureRequest.option." + key.getName(), Object.class, key), map.get(key));
        }
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b);
        C7978Mu0 c7978Mu0 = new C7978Mu0(28);
        c7978Mu0.f7393b = c7882Ky0M4786a;
        this.f44867b = c7978Mu0;
    }

    @Override // p000.RR0
    public final InterfaceC6854sw getParameters() {
        return this.f44867b;
    }

    @Override // p000.RR0
    public final List getTargetOutputConfigIds() {
        return this.f44866a;
    }

    @Override // p000.RR0
    public final int getTemplateId() {
        return this.f44868c;
    }
}
