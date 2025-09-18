package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;

/* loaded from: classes2.dex */
public final class s extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i) {
        super(0);
        this.e = i;
        this.f = tVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Matrix matrix = new Matrix();
                u uVar = this.f.a;
                matrix.preScale(uVar.c, uVar.d);
                return matrix;
            default:
                return new Canvas((Bitmap) this.f.h.getValue());
        }
    }
}
