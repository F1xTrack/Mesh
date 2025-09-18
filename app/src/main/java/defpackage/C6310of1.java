package defpackage;

import com.facebook.react.bridge.Callback;

/* renamed from: of1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6310of1 implements InterfaceC7455uf1 {
    public final int a;
    public final float b;
    public final float c;
    public final Callback d;
    public final /* synthetic */ C8216yf1 e;

    public C6310of1(C8216yf1 c8216yf1, int i, float f, float f2, Callback callback) {
        this.e = c8216yf1;
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = callback;
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        int i = this.a;
        Callback callback = this.d;
        C8216yf1 c8216yf1 = this.e;
        try {
            C8260yu0 c8260yu0 = c8216yf1.b;
            int[] iArr = c8216yf1.a;
            c8260yu0.measure(i, iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            C8260yu0 c8260yu02 = c8216yf1.b;
            int iFindTargetTagForTouch = c8260yu02.findTargetTagForTouch(i, this.b, this.c);
            try {
                c8260yu02.measure(iFindTargetTagForTouch, iArr);
                callback.invoke(Integer.valueOf(iFindTargetTagForTouch), Float.valueOf(AbstractC7586vL1.a(iArr[0] - f)), Float.valueOf(AbstractC7586vL1.a(iArr[1] - f2)), Float.valueOf(AbstractC7586vL1.a(iArr[2])), Float.valueOf(AbstractC7586vL1.a(iArr[3])));
            } catch (C2262b60 unused) {
                callback.invoke(new Object[0]);
            }
        } catch (C2262b60 unused2) {
            callback.invoke(new Object[0]);
        }
    }
}
