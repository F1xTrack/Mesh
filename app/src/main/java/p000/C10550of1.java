package p000;

import com.facebook.react.bridge.Callback;

/* renamed from: of1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10550of1 implements InterfaceC11318uf1 {

    /* renamed from: a */
    public final int f39153a;

    /* renamed from: b */
    public final float f39154b;

    /* renamed from: c */
    public final float f39155c;

    /* renamed from: d */
    public final Callback f39156d;

    /* renamed from: e */
    public final /* synthetic */ C11827yf1 f39157e;

    public C10550of1(C11827yf1 c11827yf1, int i, float f, float f2, Callback callback) {
        this.f39157e = c11827yf1;
        this.f39153a = i;
        this.f39154b = f;
        this.f39155c = f2;
        this.f39156d = callback;
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        int i = this.f39153a;
        Callback callback = this.f39156d;
        C11827yf1 c11827yf1 = this.f39157e;
        try {
            C11856yu0 c11856yu0 = c11827yf1.f46385b;
            int[] iArr = c11827yf1.f46384a;
            c11856yu0.measure(i, iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            C11856yu0 c11856yu02 = c11827yf1.f46385b;
            int iFindTargetTagForTouch = c11856yu02.findTargetTagForTouch(i, this.f39154b, this.f39155c);
            try {
                c11856yu02.measure(iFindTargetTagForTouch, iArr);
                callback.invoke(Integer.valueOf(iFindTargetTagForTouch), Float.valueOf(AbstractC11406vL1.m25402a(iArr[0] - f)), Float.valueOf(AbstractC11406vL1.m25402a(iArr[1] - f2)), Float.valueOf(AbstractC11406vL1.m25402a(iArr[2])), Float.valueOf(AbstractC11406vL1.m25402a(iArr[3])));
            } catch (C8810b60 unused) {
                callback.invoke(new Object[0]);
            }
        } catch (C8810b60 unused2) {
            callback.invoke(new Object[0]);
        }
    }
}
