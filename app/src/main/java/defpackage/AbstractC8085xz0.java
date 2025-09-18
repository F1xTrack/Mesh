package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SizeF;
import android.util.TypedValue;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: xz0 */
/* loaded from: classes.dex */
public abstract class AbstractC8085xz0 extends RelativeLayout {
    public boolean A;
    public boolean B;
    public PdfiumCore C;
    public boolean D;
    public boolean E;
    public PaintFlagsDrawFilter F;
    public int G;
    public boolean H;
    public boolean I;
    public ArrayList J;
    public boolean K;
    public C7895wz0 L;
    public int M;
    public float a;
    public float b;
    public float c;
    public C1155Oo1 d;
    public C5818m5 e;
    public GestureDetectorOnGestureListenerC3944gL f;
    public C8122yA0 g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public AsyncTaskC2475cE m;
    public HandlerThread n;
    public HandlerC3581eR0 o;
    public C1733Vz0 p;
    public HT q;
    public Paint r;
    public JV s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void setAutoSpacing(boolean z) {
        this.H = z;
    }

    public void setDefaultPage(int i) {
        this.u = i;
    }

    public void setFitEachPage(boolean z) {
        this.t = z;
    }

    public void setPageFitPolicy(JV jv) {
        this.s = jv;
    }

    public void setSpacing(int i) {
        this.G = (int) TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }

    public void setSwipeVertical(boolean z) {
        this.x = z;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 == null) {
            return true;
        }
        if (this.x) {
            if (i < 0 && this.i < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (c8122yA0.c() * this.k) + this.i > ((float) getWidth());
            }
            return false;
        }
        if (i < 0 && this.i < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (c8122yA0.q * this.k) + this.i > ((float) getWidth());
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 == null) {
            return true;
        }
        if (!this.x) {
            if (i < 0 && this.j < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (c8122yA0.b() * this.k) + this.j > ((float) getHeight());
            }
            return false;
        }
        if (i < 0 && this.j < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (c8122yA0.q * this.k) + this.j > ((float) getHeight());
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        C5818m5 c5818m5 = this.e;
        boolean zComputeScrollOffset = ((OverScroller) c5818m5.e).computeScrollOffset();
        C8312zA0 c8312zA0 = (C8312zA0) c5818m5.c;
        if (zComputeScrollOffset) {
            c8312zA0.p(r1.getCurrX(), r1.getCurrY());
            c8312zA0.n();
        } else if (c5818m5.a) {
            c5818m5.a = false;
            c8312zA0.o();
            c5818m5.e();
            c8312zA0.q();
        }
    }

    public int getCurrentPage() {
        return this.h;
    }

    public float getCurrentXOffset() {
        return this.i;
    }

    public float getCurrentYOffset() {
        return this.j;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument;
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 == null || (pdfDocument = c8122yA0.a) == null) {
            return null;
        }
        return c8122yA0.b.getDocumentMeta(pdfDocument);
    }

    public float getMaxZoom() {
        return this.c;
    }

    public float getMidZoom() {
        return this.b;
    }

    public float getMinZoom() {
        return this.a;
    }

    public int getPageCount() {
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 == null) {
            return 0;
        }
        return c8122yA0.c;
    }

    public JV getPageFitPolicy() {
        return this.s;
    }

    public float getPositionOffset() {
        float f;
        float f2;
        int width;
        if (this.x) {
            f = -this.j;
            f2 = this.g.q * this.k;
            width = getHeight();
        } else {
            f = -this.i;
            f2 = this.g.q * this.k;
            width = getWidth();
        }
        float f3 = f / (f2 - width);
        float f4 = 0.0f;
        if (f3 > 0.0f) {
            f4 = 1.0f;
            if (f3 < 1.0f) {
                return f3;
            }
        }
        return f4;
    }

    public NW0 getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.G;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 == null) {
            return Collections.emptyList();
        }
        PdfDocument pdfDocument = c8122yA0.a;
        return pdfDocument == null ? new ArrayList() : c8122yA0.b.getTableOfContents(pdfDocument);
    }

    public float getZoom() {
        return this.k;
    }

    public final void i(Canvas canvas, C1031Mz0 c1031Mz0) {
        float f;
        float fB;
        RectF rectF = c1031Mz0.c;
        Bitmap bitmap = c1031Mz0.b;
        if (bitmap.isRecycled()) {
            return;
        }
        C8122yA0 c8122yA0 = this.g;
        int i = c1031Mz0.a;
        SizeF sizeFG = c8122yA0.g(i);
        if (this.x) {
            fB = this.g.f(this.k, i);
            f = ((this.g.c() - sizeFG.getWidth()) * this.k) / 2.0f;
        } else {
            f = this.g.f(this.k, i);
            fB = ((this.g.b() - sizeFG.getHeight()) * this.k) / 2.0f;
        }
        canvas.translate(f, fB);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float width = sizeFG.getWidth() * rectF.left * this.k;
        float height = sizeFG.getHeight() * rectF.top * this.k;
        RectF rectF2 = new RectF((int) width, (int) height, (int) (width + (sizeFG.getWidth() * rectF.width() * this.k)), (int) (height + (sizeFG.getHeight() * rectF.height() * this.k)));
        float f2 = this.i + f;
        float f3 = this.j + fB;
        if (rectF2.left + f2 >= getWidth() || f2 + rectF2.right <= 0.0f || rectF2.top + f3 >= getHeight() || f3 + rectF2.bottom <= 0.0f) {
            canvas.translate(-f, -fB);
        } else {
            canvas.drawBitmap(bitmap, rect, rectF2, this.r);
            canvas.translate(-f, -fB);
        }
    }

    public final int j(float f, float f2) {
        boolean z = this.x;
        if (z) {
            f = f2;
        }
        float height = z ? getHeight() : getWidth();
        if (f > -1.0f) {
            return 0;
        }
        C8122yA0 c8122yA0 = this.g;
        float f3 = this.k;
        return f < ((-(c8122yA0.q * f3)) + height) + 1.0f ? c8122yA0.c - 1 : c8122yA0.d(-(f - (height / 2.0f)), f3);
    }

    public final int k(int i) {
        if (this.B && i >= 0) {
            float f = this.x ? this.j : this.i;
            float f2 = -this.g.f(this.k, i);
            int height = this.x ? getHeight() : getWidth();
            float fE = this.g.e(this.k, i);
            float f3 = height;
            if (f3 >= fE) {
                return 2;
            }
            if (f >= f2) {
                return 1;
            }
            if (f2 - fE > f - f3) {
                return 3;
            }
        }
        return 4;
    }

    public final void l(int i) {
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 == null) {
            return;
        }
        if (i <= 0) {
            i = 0;
        } else {
            int[] iArr = c8122yA0.u;
            if (iArr == null) {
                int i2 = c8122yA0.c;
                if (i >= i2) {
                    i = i2 - 1;
                }
            } else if (i >= iArr.length) {
                i = iArr.length - 1;
            }
        }
        float f = i == 0 ? 0.0f : -c8122yA0.f(this.k, i);
        if (this.x) {
            p(this.i, f);
        } else {
            p(f, this.j);
        }
        s(i);
    }

    public final void m(UK uk, String str, int[] iArr) {
        if (!this.l) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        this.l = false;
        AsyncTaskC2475cE asyncTaskC2475cE = new AsyncTaskC2475cE();
        asyncTaskC2475cE.e = uk;
        asyncTaskC2475cE.f = iArr;
        asyncTaskC2475cE.a = false;
        asyncTaskC2475cE.b = new WeakReference(this);
        asyncTaskC2475cE.d = str;
        asyncTaskC2475cE.c = this.C;
        this.m = asyncTaskC2475cE;
        asyncTaskC2475cE.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void n() {
        float f;
        int width;
        if (this.g.c == 0) {
            return;
        }
        if (this.x) {
            f = this.j;
            width = getHeight();
        } else {
            f = this.i;
            width = getWidth();
        }
        int iD = this.g.d(-(f - (width / 2.0f)), this.k);
        if (iD < 0 || iD > this.g.c - 1 || iD == getCurrentPage()) {
            o();
        } else {
            s(iD);
        }
    }

    public final void o() {
        HandlerC3581eR0 handlerC3581eR0;
        if (this.g == null || (handlerC3581eR0 = this.o) == null) {
            return;
        }
        handlerC3581eR0.removeMessages(1);
        C1155Oo1 c1155Oo1 = this.d;
        synchronized (c1155Oo1.d) {
            ((PriorityQueue) c1155Oo1.a).addAll((PriorityQueue) c1155Oo1.b);
            ((PriorityQueue) c1155Oo1.b).clear();
        }
        this.p.b();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r();
        HandlerThread handlerThread = this.n;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.n = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        if (isInEditMode()) {
            return;
        }
        if (this.E) {
            canvas.setDrawFilter(this.F);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.A ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.l && this.M == 3) {
            float f3 = this.i;
            float f4 = this.j;
            canvas.translate(f3, f4);
            C1155Oo1 c1155Oo1 = this.d;
            synchronized (((ArrayList) c1155Oo1.c)) {
                arrayList = (ArrayList) c1155Oo1.c;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i(canvas, (C1031Mz0) it.next());
            }
            Iterator it2 = this.d.w().iterator();
            while (it2.hasNext()) {
                i(canvas, (C1031Mz0) it2.next());
                this.q.getClass();
            }
            Iterator it3 = this.J.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).getClass();
                this.q.getClass();
            }
            this.J.clear();
            int i = this.h;
            C8312zA0 c8312zA0 = (C8312zA0) this.q.e;
            if (c8312zA0 != null) {
                if (this.x) {
                    f2 = this.g.f(this.k, i);
                    f = 0.0f;
                } else {
                    f = this.g.f(this.k, i);
                    f2 = 0.0f;
                }
                canvas.translate(f, f2);
                SizeF sizeFG = this.g.g(i);
                float width = sizeFG.getWidth() * this.k;
                float height = sizeFG.getHeight() * this.k;
                if (c8312zA0.s1 == 0.0f) {
                    c8312zA0.s1 = width;
                }
                float f5 = c8312zA0.t1;
                if (f5 > 0.0f) {
                    float f6 = c8312zA0.u1;
                    if (f6 > 0.0f && (width != f5 || height != f6)) {
                        TT1.b = c8312zA0.Q;
                        TT1.a = c8312zA0.R;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("message", "scaleChanged|" + (width / c8312zA0.s1));
                        InterfaceC7405uP interfaceC7405uPB = OZ1.b((S91) c8312zA0.getContext(), c8312zA0.getId());
                        C3622ef c3622ef = new C3622ef(OZ1.e(c8312zA0), c8312zA0.getId(), writableMapCreateMap, 7);
                        if (interfaceC7405uPB != null) {
                            interfaceC7405uPB.g(c3622ef);
                        }
                    }
                }
                c8312zA0.t1 = width;
                c8312zA0.u1 = height;
                canvas.translate(-f, -f2);
            }
            canvas.translate(-f3, -f4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float fC;
        float fB;
        this.K = true;
        C7895wz0 c7895wz0 = this.L;
        if (c7895wz0 != null) {
            c7895wz0.a();
        }
        if (isInEditMode() || this.M != 3) {
            return;
        }
        float f = (i3 * 0.5f) + (-this.i);
        float f2 = (i4 * 0.5f) + (-this.j);
        if (this.x) {
            fC = f / this.g.c();
            fB = this.g.q * this.k;
        } else {
            C8122yA0 c8122yA0 = this.g;
            fC = f / (c8122yA0.q * this.k);
            fB = c8122yA0.b();
        }
        float f3 = f2 / fB;
        this.e.i();
        this.g.j(new Size(i, i2));
        if (this.x) {
            this.i = (i * 0.5f) + (this.g.c() * (-fC));
            this.j = (i2 * 0.5f) + (this.g.q * this.k * (-f3));
        } else {
            C8122yA0 c8122yA02 = this.g;
            this.i = (i * 0.5f) + (c8122yA02.q * this.k * (-fC));
            this.j = (i2 * 0.5f) + (c8122yA02.b() * (-f3));
        }
        p(this.i, this.j);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(float r6, float r7) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8085xz0.p(float, float):void");
    }

    public final void q() {
        C8122yA0 c8122yA0;
        int iJ;
        int iK;
        if (!this.B || (c8122yA0 = this.g) == null || c8122yA0.c == 0 || (iK = k((iJ = j(this.i, this.j)))) == 4) {
            return;
        }
        float fT = t(iJ, iK);
        boolean z = this.x;
        C5818m5 c5818m5 = this.e;
        if (z) {
            c5818m5.g(this.j, -fT);
        } else {
            c5818m5.f(this.i, -fT);
        }
    }

    public final void r() {
        PdfDocument pdfDocument;
        this.L = null;
        this.e.i();
        this.f.g = false;
        HandlerC3581eR0 handlerC3581eR0 = this.o;
        if (handlerC3581eR0 != null) {
            handlerC3581eR0.e = false;
            handlerC3581eR0.removeMessages(1);
        }
        AsyncTaskC2475cE asyncTaskC2475cE = this.m;
        if (asyncTaskC2475cE != null) {
            asyncTaskC2475cE.cancel(true);
        }
        C1155Oo1 c1155Oo1 = this.d;
        synchronized (c1155Oo1.d) {
            try {
                Iterator it = ((PriorityQueue) c1155Oo1.a).iterator();
                while (it.hasNext()) {
                    ((C1031Mz0) it.next()).b.recycle();
                }
                ((PriorityQueue) c1155Oo1.a).clear();
                Iterator it2 = ((PriorityQueue) c1155Oo1.b).iterator();
                while (it2.hasNext()) {
                    ((C1031Mz0) it2.next()).b.recycle();
                }
                ((PriorityQueue) c1155Oo1.b).clear();
            } finally {
            }
        }
        synchronized (((ArrayList) c1155Oo1.c)) {
            try {
                Iterator it3 = ((ArrayList) c1155Oo1.c).iterator();
                while (it3.hasNext()) {
                    ((C1031Mz0) it3.next()).b.recycle();
                }
                ((ArrayList) c1155Oo1.c).clear();
            } finally {
            }
        }
        C8122yA0 c8122yA0 = this.g;
        if (c8122yA0 != null) {
            PdfiumCore pdfiumCore = c8122yA0.b;
            if (pdfiumCore != null && (pdfDocument = c8122yA0.a) != null) {
                pdfiumCore.closeDocument(pdfDocument);
            }
            c8122yA0.a = null;
            c8122yA0.u = null;
            this.g = null;
        }
        this.o = null;
        this.j = 0.0f;
        this.i = 0.0f;
        this.k = 1.0f;
        this.l = true;
        this.q = new HT();
        this.M = 1;
    }

    public final void s(int i) {
        if (this.l) {
            return;
        }
        C8122yA0 c8122yA0 = this.g;
        if (i <= 0) {
            c8122yA0.getClass();
            i = 0;
        } else {
            int[] iArr = c8122yA0.u;
            if (iArr == null) {
                int i2 = c8122yA0.c;
                if (i >= i2) {
                    i = i2 - 1;
                }
            } else if (i >= iArr.length) {
                i = iArr.length - 1;
            }
        }
        this.h = i;
        o();
        HT ht = this.q;
        int i3 = this.h;
        int i4 = this.g.c;
        C8312zA0 c8312zA0 = (C8312zA0) ht.c;
        if (c8312zA0 != null) {
            int i5 = i3 + 1;
            c8312zA0.N = i5;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("message", AbstractC8235ym.f(i5, "pageChanged|", i4, HiAnalyticsConstant.REPORT_VAL_SEPARATOR));
            InterfaceC7405uP interfaceC7405uPB = OZ1.b((S91) c8312zA0.getContext(), c8312zA0.getId());
            C3622ef c3622ef = new C3622ef(OZ1.e(c8312zA0), c8312zA0.getId(), writableMapCreateMap, 7);
            if (interfaceC7405uPB != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new RQ(interfaceC7405uPB, 22, c3622ef), 10L);
            }
        }
    }

    public void setDualPageMode(boolean z) {
        this.v = z;
    }

    public void setLandscapeOrientation(boolean z) {
        this.w = z;
    }

    public void setMaxZoom(float f) {
        this.c = f;
    }

    public void setMidZoom(float f) {
        this.b = f;
    }

    public void setMinZoom(float f) {
        this.a = f;
    }

    public void setNightMode(boolean z) {
        this.A = z;
        Paint paint = this.r;
        if (z) {
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        } else {
            paint.setColorFilter(null);
        }
    }

    public void setPageFling(boolean z) {
        this.I = z;
    }

    public void setPageSnap(boolean z) {
        this.B = z;
    }

    public void setPositionOffset(float f) {
        if (this.x) {
            p(this.i, ((-(this.g.q * this.k)) + getHeight()) * f);
        } else {
            p(((-(this.g.q * this.k)) + getWidth()) * f, this.j);
        }
        n();
    }

    public void setSwipeEnabled(boolean z) {
        this.y = z;
    }

    public final float t(int i, int i2) {
        float f = this.g.f(this.k, i);
        float height = this.x ? getHeight() : getWidth();
        float fE = this.g.e(this.k, i);
        return i2 == 2 ? (f - (height / 2.0f)) + (fE / 2.0f) : i2 == 3 ? (f - height) + fE : f;
    }

    public final void u(float f, PointF pointF) {
        float f2 = f / this.k;
        this.k = f;
        float f3 = this.i * f2;
        float f4 = this.j * f2;
        float f5 = pointF.x;
        float f6 = (f5 - (f5 * f2)) + f3;
        float f7 = pointF.y;
        p(f6, (f7 - (f2 * f7)) + f4);
    }

    public void setScrollHandle(NW0 nw0) {
    }
}
