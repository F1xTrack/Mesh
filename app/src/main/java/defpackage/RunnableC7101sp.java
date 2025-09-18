package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;
import java.util.concurrent.CancellationException;

/* renamed from: sp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC7101sp implements Runnable {
    public final /* synthetic */ C0767Jp a;
    public final /* synthetic */ C5843mD0 b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public RunnableC7101sp(C0767Jp c0767Jp, C5843mD0 c5843mD0, double d, double d2) {
        this.a = c0767Jp;
        this.b = c5843mD0;
        this.c = d;
        this.d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PointF pointF;
        C0767Jp c0767Jp = this.a;
        if (c0767Jp.w()) {
            throw new CancellationException();
        }
        float f = Resources.getSystem().getDisplayMetrics().density;
        AbstractC1085Nr0 meteringPointFactory = this.b.getMeteringPointFactory();
        float f2 = ((float) this.c) * f;
        float f3 = ((float) this.d) * f;
        meteringPointFactory.getClass();
        C6034nD0 c6034nD0 = (C6034nD0) meteringPointFactory;
        float[] fArr = {f2, f3};
        synchronized (c6034nD0) {
            try {
                Matrix matrix = c6034nD0.d;
                if (matrix == null) {
                    pointF = C6034nD0.e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } finally {
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = meteringPointFactory.a;
        C1007Mr0 c1007Mr0 = new C1007Mr0();
        c1007Mr0.a = f4;
        c1007Mr0.b = f5;
        c1007Mr0.c = 0.15f;
        c1007Mr0.d = rational;
        c0767Jp.resumeWith(c1007Mr0);
    }
}
