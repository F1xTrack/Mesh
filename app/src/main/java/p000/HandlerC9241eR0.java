package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;

/* renamed from: eR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC9241eR0 extends Handler {

    /* renamed from: a */
    public AbstractC11739xz0 f26709a;

    /* renamed from: b */
    public RectF f26710b;

    /* renamed from: c */
    public Rect f26711c;

    /* renamed from: d */
    public Matrix f26712d;

    /* renamed from: e */
    public boolean f26713e;

    /* renamed from: a */
    public final void m17989a(int i, float f, float f2, RectF rectF, boolean z, int i2, boolean z2) {
        C9113dR0 c9113dR0 = new C9113dR0();
        c9113dR0.f26110d = i;
        c9113dR0.f26107a = f;
        c9113dR0.f26108b = f2;
        c9113dR0.f26109c = rectF;
        c9113dR0.f26111e = z;
        c9113dR0.f26112f = i2;
        c9113dR0.f26113g = z2;
        sendMessage(obtainMessage(1, c9113dR0));
    }

    /* renamed from: b */
    public final C7988Mz0 m17990b(C9113dR0 c9113dR0) {
        C11764yA0 c11764yA0 = this.f26709a.f45940g;
        int iM26050a = c11764yA0.m26050a(c9113dR0.f26110d);
        if (iM26050a >= 0) {
            synchronized (C11764yA0.f46108v) {
                try {
                    if (c11764yA0.f46114f.indexOfKey(iM26050a) < 0) {
                        try {
                            c11764yA0.f46110b.openPage(c11764yA0.f46109a, iM26050a);
                            c11764yA0.f46114f.put(iM26050a, true);
                        } catch (Exception e) {
                            c11764yA0.f46114f.put(iM26050a, false);
                            throw new C8040Nz0(e);
                        }
                    }
                } finally {
                }
            }
        }
        int iRound = Math.round(c9113dR0.f26107a);
        int iRound2 = Math.round(c9113dR0.f26108b);
        if (iRound != 0 && iRound2 != 0) {
            if (c11764yA0.f46114f.get(c11764yA0.m26050a(c9113dR0.f26110d), false)) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.RGB_565);
                    RectF rectF = c9113dR0.f26109c;
                    Matrix matrix = this.f26712d;
                    matrix.reset();
                    float f = iRound;
                    float f2 = iRound2;
                    matrix.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
                    matrix.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
                    RectF rectF2 = this.f26710b;
                    rectF2.set(0.0f, 0.0f, f, f2);
                    matrix.mapRect(rectF2);
                    rectF2.round(this.f26711c);
                    int i = c9113dR0.f26110d;
                    Rect rect = this.f26711c;
                    boolean z = c9113dR0.f26113g;
                    c11764yA0.f46110b.renderPageBitmap(c11764yA0.f46109a, bitmapCreateBitmap, c11764yA0.m26050a(i), rect.left, rect.top, rect.width(), rect.height(), z);
                    return new C7988Mz0(c9113dR0.f26110d, bitmapCreateBitmap, c9113dR0.f26109c, c9113dR0.f26111e, c9113dR0.f26112f);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC11739xz0 abstractC11739xz0 = this.f26709a;
        try {
            C7988Mz0 c7988Mz0M17990b = m17990b((C9113dR0) message.obj);
            if (c7988Mz0M17990b != null) {
                if (this.f26713e) {
                    abstractC11739xz0.post(new RunnableC1420WZ(this, c7988Mz0M17990b, false, 12));
                } else {
                    c7988Mz0M17990b.f7423b.recycle();
                }
            }
        } catch (C8040Nz0 e) {
            abstractC11739xz0.post(new RunnableC1483XZ(this, e, false, 16));
        }
    }
}
