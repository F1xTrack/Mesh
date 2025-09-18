package p000;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;
import java.util.concurrent.CancellationException;

/* renamed from: sp */
/* loaded from: classes2.dex */
public final class RunnableC6847sp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0619Jp f42618a;

    /* renamed from: b */
    public final /* synthetic */ C10237mD0 f42619b;

    /* renamed from: c */
    public final /* synthetic */ double f42620c;

    /* renamed from: d */
    public final /* synthetic */ double f42621d;

    public RunnableC6847sp(C0619Jp c0619Jp, C10237mD0 c10237mD0, double d, double d2) {
        this.f42618a = c0619Jp;
        this.f42619b = c10237mD0;
        this.f42620c = d;
        this.f42621d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PointF pointF;
        C0619Jp c0619Jp = this.f42618a;
        if (c0619Jp.m4443w()) {
            throw new CancellationException();
        }
        float f = Resources.getSystem().getDisplayMetrics().density;
        AbstractC8024Nr0 meteringPointFactory = this.f42619b.getMeteringPointFactory();
        float f2 = ((float) this.f42620c) * f;
        float f3 = ((float) this.f42621d) * f;
        meteringPointFactory.getClass();
        C10365nD0 c10365nD0 = (C10365nD0) meteringPointFactory;
        float[] fArr = {f2, f3};
        synchronized (c10365nD0) {
            try {
                Matrix matrix = c10365nD0.f38184d;
                if (matrix == null) {
                    pointF = C10365nD0.f38181e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } finally {
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = meteringPointFactory.f8094a;
        C7972Mr0 c7972Mr0 = new C7972Mr0();
        c7972Mr0.f7370a = f4;
        c7972Mr0.f7371b = f5;
        c7972Mr0.f7372c = 0.15f;
        c7972Mr0.f7373d = rational;
        c0619Jp.resumeWith(c7972Mr0);
    }
}
