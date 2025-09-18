package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;

/* renamed from: eR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC3581eR0 extends Handler {
    public AbstractC8085xz0 a;
    public RectF b;
    public Rect c;
    public Matrix d;
    public boolean e;

    public final void a(int i, float f, float f2, RectF rectF, boolean z, int i2, boolean z2) {
        C3391dR0 c3391dR0 = new C3391dR0();
        c3391dR0.d = i;
        c3391dR0.a = f;
        c3391dR0.b = f2;
        c3391dR0.c = rectF;
        c3391dR0.e = z;
        c3391dR0.f = i2;
        c3391dR0.g = z2;
        sendMessage(obtainMessage(1, c3391dR0));
    }

    public final C1031Mz0 b(C3391dR0 c3391dR0) {
        C8122yA0 c8122yA0 = this.a.g;
        int iA = c8122yA0.a(c3391dR0.d);
        if (iA >= 0) {
            synchronized (C8122yA0.v) {
                try {
                    if (c8122yA0.f.indexOfKey(iA) < 0) {
                        try {
                            c8122yA0.b.openPage(c8122yA0.a, iA);
                            c8122yA0.f.put(iA, true);
                        } catch (Exception e) {
                            c8122yA0.f.put(iA, false);
                            throw new C1109Nz0(e);
                        }
                    }
                } finally {
                }
            }
        }
        int iRound = Math.round(c3391dR0.a);
        int iRound2 = Math.round(c3391dR0.b);
        if (iRound != 0 && iRound2 != 0) {
            if (c8122yA0.f.get(c8122yA0.a(c3391dR0.d), false)) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.RGB_565);
                    RectF rectF = c3391dR0.c;
                    Matrix matrix = this.d;
                    matrix.reset();
                    float f = iRound;
                    float f2 = iRound2;
                    matrix.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
                    matrix.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
                    RectF rectF2 = this.b;
                    rectF2.set(0.0f, 0.0f, f, f2);
                    matrix.mapRect(rectF2);
                    rectF2.round(this.c);
                    int i = c3391dR0.d;
                    Rect rect = this.c;
                    boolean z = c3391dR0.g;
                    c8122yA0.b.renderPageBitmap(c8122yA0.a, bitmapCreateBitmap, c8122yA0.a(i), rect.left, rect.top, rect.width(), rect.height(), z);
                    return new C1031Mz0(c3391dR0.d, bitmapCreateBitmap, c3391dR0.c, c3391dR0.e, c3391dR0.f);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC8085xz0 abstractC8085xz0 = this.a;
        try {
            C1031Mz0 c1031Mz0B = b((C3391dR0) message.obj);
            if (c1031Mz0B != null) {
                if (this.e) {
                    abstractC8085xz0.post(new WZ(this, c1031Mz0B, false, 12));
                } else {
                    c1031Mz0B.b.recycle();
                }
            }
        } catch (C1109Nz0 e) {
            abstractC8085xz0.post(new XZ(this, e, false, 16));
        }
    }
}
