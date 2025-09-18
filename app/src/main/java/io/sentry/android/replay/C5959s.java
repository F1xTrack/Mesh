package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.sentry.android.replay.s */
/* loaded from: classes2.dex */
public final class C5959s extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f34015e;

    /* renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC5960t f34016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5959s(ViewTreeObserverOnDrawListenerC5960t viewTreeObserverOnDrawListenerC5960t, int i) {
        super(0);
        this.f34015e = i;
        this.f34016f = viewTreeObserverOnDrawListenerC5960t;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f34015e) {
            case 0:
                Matrix matrix = new Matrix();
                C5961u c5961u = this.f34016f.f34017a;
                matrix.preScale(c5961u.f34033c, c5961u.f34034d);
                return matrix;
            default:
                return new Canvas((Bitmap) this.f34016f.f34024h.getValue());
        }
    }
}
