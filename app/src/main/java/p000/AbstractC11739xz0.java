package p000;

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
public abstract class AbstractC11739xz0 extends RelativeLayout {

    /* renamed from: A */
    public boolean f45921A;

    /* renamed from: B */
    public boolean f45922B;

    /* renamed from: C */
    public PdfiumCore f45923C;

    /* renamed from: D */
    public boolean f45924D;

    /* renamed from: E */
    public boolean f45925E;

    /* renamed from: F */
    public PaintFlagsDrawFilter f45926F;

    /* renamed from: G */
    public int f45927G;

    /* renamed from: H */
    public boolean f45928H;

    /* renamed from: I */
    public boolean f45929I;

    /* renamed from: J */
    public ArrayList f45930J;

    /* renamed from: K */
    public boolean f45931K;

    /* renamed from: L */
    public C11612wz0 f45932L;

    /* renamed from: M */
    public int f45933M;

    /* renamed from: a */
    public float f45934a;

    /* renamed from: b */
    public float f45935b;

    /* renamed from: c */
    public float f45936c;

    /* renamed from: d */
    public C8071Oo1 f45937d;

    /* renamed from: e */
    public C6404m5 f45938e;

    /* renamed from: f */
    public GestureDetectorOnGestureListenerC4110gL f45939f;

    /* renamed from: g */
    public C11764yA0 f45940g;

    /* renamed from: h */
    public int f45941h;

    /* renamed from: i */
    public float f45942i;

    /* renamed from: j */
    public float f45943j;

    /* renamed from: k */
    public float f45944k;

    /* renamed from: l */
    public boolean f45945l;

    /* renamed from: m */
    public AsyncTaskC1834cE f45946m;

    /* renamed from: n */
    public HandlerThread f45947n;

    /* renamed from: o */
    public HandlerC9241eR0 f45948o;

    /* renamed from: p */
    public C8456Vz0 f45949p;

    /* renamed from: q */
    public C0471HT f45950q;

    /* renamed from: r */
    public Paint f45951r;

    /* renamed from: s */
    public EnumC0599JV f45952s;

    /* renamed from: t */
    public boolean f45953t;

    /* renamed from: u */
    public int f45954u;

    /* renamed from: v */
    public boolean f45955v;

    /* renamed from: w */
    public boolean f45956w;

    /* renamed from: x */
    public boolean f45957x;

    /* renamed from: y */
    public boolean f45958y;

    /* renamed from: z */
    public boolean f45959z;

    public void setAutoSpacing(boolean z) {
        this.f45928H = z;
    }

    public void setDefaultPage(int i) {
        this.f45954u = i;
    }

    public void setFitEachPage(boolean z) {
        this.f45953t = z;
    }

    public void setPageFitPolicy(EnumC0599JV enumC0599JV) {
        this.f45952s = enumC0599JV;
    }

    public void setSpacing(int i) {
        this.f45927G = (int) TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }

    public void setSwipeVertical(boolean z) {
        this.f45957x = z;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 == null) {
            return true;
        }
        if (this.f45957x) {
            if (i < 0 && this.f45942i < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (c11764yA0.m26052c() * this.f45944k) + this.f45942i > ((float) getWidth());
            }
            return false;
        }
        if (i < 0 && this.f45942i < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (c11764yA0.f46125q * this.f45944k) + this.f45942i > ((float) getWidth());
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 == null) {
            return true;
        }
        if (!this.f45957x) {
            if (i < 0 && this.f45943j < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (c11764yA0.m26051b() * this.f45944k) + this.f45943j > ((float) getHeight());
            }
            return false;
        }
        if (i < 0 && this.f45943j < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (c11764yA0.f46125q * this.f45944k) + this.f45943j > ((float) getHeight());
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        C6404m5 c6404m5 = this.f45938e;
        boolean zComputeScrollOffset = ((OverScroller) c6404m5.f37470e).computeScrollOffset();
        C11891zA0 c11891zA0 = (C11891zA0) c6404m5.f37468c;
        if (zComputeScrollOffset) {
            c11891zA0.m26023p(r1.getCurrX(), r1.getCurrY());
            c11891zA0.m26021n();
        } else if (c6404m5.f37466a) {
            c6404m5.f37466a = false;
            c11891zA0.m26022o();
            c6404m5.m22661e();
            c11891zA0.m26024q();
        }
    }

    public int getCurrentPage() {
        return this.f45941h;
    }

    public float getCurrentXOffset() {
        return this.f45942i;
    }

    public float getCurrentYOffset() {
        return this.f45943j;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument;
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 == null || (pdfDocument = c11764yA0.f46109a) == null) {
            return null;
        }
        return c11764yA0.f46110b.getDocumentMeta(pdfDocument);
    }

    public float getMaxZoom() {
        return this.f45936c;
    }

    public float getMidZoom() {
        return this.f45935b;
    }

    public float getMinZoom() {
        return this.f45934a;
    }

    public int getPageCount() {
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 == null) {
            return 0;
        }
        return c11764yA0.f46111c;
    }

    public EnumC0599JV getPageFitPolicy() {
        return this.f45952s;
    }

    public float getPositionOffset() {
        float f;
        float f2;
        int width;
        if (this.f45957x) {
            f = -this.f45943j;
            f2 = this.f45940g.f46125q * this.f45944k;
            width = getHeight();
        } else {
            f = -this.f45942i;
            f2 = this.f45940g.f46125q * this.f45944k;
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
        return this.f45927G;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 == null) {
            return Collections.emptyList();
        }
        PdfDocument pdfDocument = c11764yA0.f46109a;
        return pdfDocument == null ? new ArrayList() : c11764yA0.f46110b.getTableOfContents(pdfDocument);
    }

    public float getZoom() {
        return this.f45944k;
    }

    /* renamed from: i */
    public final void m26016i(Canvas canvas, C7988Mz0 c7988Mz0) {
        float fM26055f;
        float fM26051b;
        RectF rectF = c7988Mz0.f7424c;
        Bitmap bitmap = c7988Mz0.f7423b;
        if (bitmap.isRecycled()) {
            return;
        }
        C11764yA0 c11764yA0 = this.f45940g;
        int i = c7988Mz0.f7422a;
        SizeF sizeFM26056g = c11764yA0.m26056g(i);
        if (this.f45957x) {
            fM26051b = this.f45940g.m26055f(this.f45944k, i);
            fM26055f = ((this.f45940g.m26052c() - sizeFM26056g.getWidth()) * this.f45944k) / 2.0f;
        } else {
            fM26055f = this.f45940g.m26055f(this.f45944k, i);
            fM26051b = ((this.f45940g.m26051b() - sizeFM26056g.getHeight()) * this.f45944k) / 2.0f;
        }
        canvas.translate(fM26055f, fM26051b);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float width = sizeFM26056g.getWidth() * rectF.left * this.f45944k;
        float height = sizeFM26056g.getHeight() * rectF.top * this.f45944k;
        RectF rectF2 = new RectF((int) width, (int) height, (int) (width + (sizeFM26056g.getWidth() * rectF.width() * this.f45944k)), (int) (height + (sizeFM26056g.getHeight() * rectF.height() * this.f45944k)));
        float f = this.f45942i + fM26055f;
        float f2 = this.f45943j + fM26051b;
        if (rectF2.left + f >= getWidth() || f + rectF2.right <= 0.0f || rectF2.top + f2 >= getHeight() || f2 + rectF2.bottom <= 0.0f) {
            canvas.translate(-fM26055f, -fM26051b);
        } else {
            canvas.drawBitmap(bitmap, rect, rectF2, this.f45951r);
            canvas.translate(-fM26055f, -fM26051b);
        }
    }

    /* renamed from: j */
    public final int m26017j(float f, float f2) {
        boolean z = this.f45957x;
        if (z) {
            f = f2;
        }
        float height = z ? getHeight() : getWidth();
        if (f > -1.0f) {
            return 0;
        }
        C11764yA0 c11764yA0 = this.f45940g;
        float f3 = this.f45944k;
        return f < ((-(c11764yA0.f46125q * f3)) + height) + 1.0f ? c11764yA0.f46111c - 1 : c11764yA0.m26053d(-(f - (height / 2.0f)), f3);
    }

    /* renamed from: k */
    public final int m26018k(int i) {
        if (this.f45922B && i >= 0) {
            float f = this.f45957x ? this.f45943j : this.f45942i;
            float f2 = -this.f45940g.m26055f(this.f45944k, i);
            int height = this.f45957x ? getHeight() : getWidth();
            float fM26054e = this.f45940g.m26054e(this.f45944k, i);
            float f3 = height;
            if (f3 >= fM26054e) {
                return 2;
            }
            if (f >= f2) {
                return 1;
            }
            if (f2 - fM26054e > f - f3) {
                return 3;
            }
        }
        return 4;
    }

    /* renamed from: l */
    public final void m26019l(int i) {
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 == null) {
            return;
        }
        if (i <= 0) {
            i = 0;
        } else {
            int[] iArr = c11764yA0.f46129u;
            if (iArr == null) {
                int i2 = c11764yA0.f46111c;
                if (i >= i2) {
                    i = i2 - 1;
                }
            } else if (i >= iArr.length) {
                i = iArr.length - 1;
            }
        }
        float f = i == 0 ? 0.0f : -c11764yA0.m26055f(this.f45944k, i);
        if (this.f45957x) {
            m26023p(this.f45942i, f);
        } else {
            m26023p(f, this.f45943j);
        }
        m26026s(i);
    }

    /* renamed from: m */
    public final void m26020m(InterfaceC1279UK interfaceC1279UK, String str, int[] iArr) {
        if (!this.f45945l) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        this.f45945l = false;
        AsyncTaskC1834cE asyncTaskC1834cE = new AsyncTaskC1834cE();
        asyncTaskC1834cE.f17377e = interfaceC1279UK;
        asyncTaskC1834cE.f17378f = iArr;
        asyncTaskC1834cE.f17373a = false;
        asyncTaskC1834cE.f17374b = new WeakReference(this);
        asyncTaskC1834cE.f17376d = str;
        asyncTaskC1834cE.f17375c = this.f45923C;
        this.f45946m = asyncTaskC1834cE;
        asyncTaskC1834cE.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: n */
    public final void m26021n() {
        float f;
        int width;
        if (this.f45940g.f46111c == 0) {
            return;
        }
        if (this.f45957x) {
            f = this.f45943j;
            width = getHeight();
        } else {
            f = this.f45942i;
            width = getWidth();
        }
        int iM26053d = this.f45940g.m26053d(-(f - (width / 2.0f)), this.f45944k);
        if (iM26053d < 0 || iM26053d > this.f45940g.f46111c - 1 || iM26053d == getCurrentPage()) {
            m26022o();
        } else {
            m26026s(iM26053d);
        }
    }

    /* renamed from: o */
    public final void m26022o() {
        HandlerC9241eR0 handlerC9241eR0;
        if (this.f45940g == null || (handlerC9241eR0 = this.f45948o) == null) {
            return;
        }
        handlerC9241eR0.removeMessages(1);
        C8071Oo1 c8071Oo1 = this.f45937d;
        synchronized (c8071Oo1.f8630d) {
            ((PriorityQueue) c8071Oo1.f8627a).addAll((PriorityQueue) c8071Oo1.f8628b);
            ((PriorityQueue) c8071Oo1.f8628b).clear();
        }
        this.f45949p.m8646b();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m26025r();
        HandlerThread handlerThread = this.f45947n;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f45947n = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        float fM26055f;
        float fM26055f2;
        if (isInEditMode()) {
            return;
        }
        if (this.f45925E) {
            canvas.setDrawFilter(this.f45926F);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.f45921A ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f45945l && this.f45933M == 3) {
            float f = this.f45942i;
            float f2 = this.f45943j;
            canvas.translate(f, f2);
            C8071Oo1 c8071Oo1 = this.f45937d;
            synchronized (((ArrayList) c8071Oo1.f8629c)) {
                arrayList = (ArrayList) c8071Oo1.f8629c;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m26016i(canvas, (C7988Mz0) it.next());
            }
            Iterator it2 = this.f45937d.m6156w().iterator();
            while (it2.hasNext()) {
                m26016i(canvas, (C7988Mz0) it2.next());
                this.f45950q.getClass();
            }
            Iterator it3 = this.f45930J.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).getClass();
                this.f45950q.getClass();
            }
            this.f45930J.clear();
            int i = this.f45941h;
            C11891zA0 c11891zA0 = (C11891zA0) this.f45950q.f4313e;
            if (c11891zA0 != null) {
                if (this.f45957x) {
                    fM26055f2 = this.f45940g.m26055f(this.f45944k, i);
                    fM26055f = 0.0f;
                } else {
                    fM26055f = this.f45940g.m26055f(this.f45944k, i);
                    fM26055f2 = 0.0f;
                }
                canvas.translate(fM26055f, fM26055f2);
                SizeF sizeFM26056g = this.f45940g.m26056g(i);
                float width = sizeFM26056g.getWidth() * this.f45944k;
                float height = sizeFM26056g.getHeight() * this.f45944k;
                if (c11891zA0.f46712s1 == 0.0f) {
                    c11891zA0.f46712s1 = width;
                }
                float f3 = c11891zA0.f46713t1;
                if (f3 > 0.0f) {
                    float f4 = c11891zA0.f46714u1;
                    if (f4 > 0.0f && (width != f3 || height != f4)) {
                        TT1.f11393b = c11891zA0.f46698Q;
                        TT1.f11392a = c11891zA0.f46699R;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("message", "scaleChanged|" + (width / c11891zA0.f46712s1));
                        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c11891zA0.getContext(), c11891zA0.getId());
                        C4004ef c4004ef = new C4004ef(OZ1.m6094e(c11891zA0), c11891zA0.getId(), writableMapCreateMap, 7);
                        if (interfaceC6947uPM6091b != null) {
                            interfaceC6947uPM6091b.mo11046g(c4004ef);
                        }
                    }
                }
                c11891zA0.f46713t1 = width;
                c11891zA0.f46714u1 = height;
                canvas.translate(-fM26055f, -fM26055f2);
            }
            canvas.translate(-f, -f2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float fM26052c;
        float fM26051b;
        this.f45931K = true;
        C11612wz0 c11612wz0 = this.f45932L;
        if (c11612wz0 != null) {
            c11612wz0.m25729a();
        }
        if (isInEditMode() || this.f45933M != 3) {
            return;
        }
        float f = (i3 * 0.5f) + (-this.f45942i);
        float f2 = (i4 * 0.5f) + (-this.f45943j);
        if (this.f45957x) {
            fM26052c = f / this.f45940g.m26052c();
            fM26051b = this.f45940g.f46125q * this.f45944k;
        } else {
            C11764yA0 c11764yA0 = this.f45940g;
            fM26052c = f / (c11764yA0.f46125q * this.f45944k);
            fM26051b = c11764yA0.m26051b();
        }
        float f3 = f2 / fM26051b;
        this.f45938e.m22665i();
        this.f45940g.m26059j(new Size(i, i2));
        if (this.f45957x) {
            this.f45942i = (i * 0.5f) + (this.f45940g.m26052c() * (-fM26052c));
            this.f45943j = (i2 * 0.5f) + (this.f45940g.f46125q * this.f45944k * (-f3));
        } else {
            C11764yA0 c11764yA02 = this.f45940g;
            this.f45942i = (i * 0.5f) + (c11764yA02.f46125q * this.f45944k * (-fM26052c));
            this.f45943j = (i2 * 0.5f) + (c11764yA02.m26051b() * (-f3));
        }
        m26023p(this.f45942i, this.f45943j);
        m26021n();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b8  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26023p(float r6, float r7) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11739xz0.m26023p(float, float):void");
    }

    /* renamed from: q */
    public final void m26024q() {
        C11764yA0 c11764yA0;
        int iM26017j;
        int iM26018k;
        if (!this.f45922B || (c11764yA0 = this.f45940g) == null || c11764yA0.f46111c == 0 || (iM26018k = m26018k((iM26017j = m26017j(this.f45942i, this.f45943j)))) == 4) {
            return;
        }
        float fM26027t = m26027t(iM26017j, iM26018k);
        boolean z = this.f45957x;
        C6404m5 c6404m5 = this.f45938e;
        if (z) {
            c6404m5.m22663g(this.f45943j, -fM26027t);
        } else {
            c6404m5.m22662f(this.f45942i, -fM26027t);
        }
    }

    /* renamed from: r */
    public final void m26025r() {
        PdfDocument pdfDocument;
        this.f45932L = null;
        this.f45938e.m22665i();
        this.f45939f.f27684g = false;
        HandlerC9241eR0 handlerC9241eR0 = this.f45948o;
        if (handlerC9241eR0 != null) {
            handlerC9241eR0.f26713e = false;
            handlerC9241eR0.removeMessages(1);
        }
        AsyncTaskC1834cE asyncTaskC1834cE = this.f45946m;
        if (asyncTaskC1834cE != null) {
            asyncTaskC1834cE.cancel(true);
        }
        C8071Oo1 c8071Oo1 = this.f45937d;
        synchronized (c8071Oo1.f8630d) {
            try {
                Iterator it = ((PriorityQueue) c8071Oo1.f8627a).iterator();
                while (it.hasNext()) {
                    ((C7988Mz0) it.next()).f7423b.recycle();
                }
                ((PriorityQueue) c8071Oo1.f8627a).clear();
                Iterator it2 = ((PriorityQueue) c8071Oo1.f8628b).iterator();
                while (it2.hasNext()) {
                    ((C7988Mz0) it2.next()).f7423b.recycle();
                }
                ((PriorityQueue) c8071Oo1.f8628b).clear();
            } finally {
            }
        }
        synchronized (((ArrayList) c8071Oo1.f8629c)) {
            try {
                Iterator it3 = ((ArrayList) c8071Oo1.f8629c).iterator();
                while (it3.hasNext()) {
                    ((C7988Mz0) it3.next()).f7423b.recycle();
                }
                ((ArrayList) c8071Oo1.f8629c).clear();
            } finally {
            }
        }
        C11764yA0 c11764yA0 = this.f45940g;
        if (c11764yA0 != null) {
            PdfiumCore pdfiumCore = c11764yA0.f46110b;
            if (pdfiumCore != null && (pdfDocument = c11764yA0.f46109a) != null) {
                pdfiumCore.closeDocument(pdfDocument);
            }
            c11764yA0.f46109a = null;
            c11764yA0.f46129u = null;
            this.f45940g = null;
        }
        this.f45948o = null;
        this.f45943j = 0.0f;
        this.f45942i = 0.0f;
        this.f45944k = 1.0f;
        this.f45945l = true;
        this.f45950q = new C0471HT();
        this.f45933M = 1;
    }

    /* renamed from: s */
    public final void m26026s(int i) {
        if (this.f45945l) {
            return;
        }
        C11764yA0 c11764yA0 = this.f45940g;
        if (i <= 0) {
            c11764yA0.getClass();
            i = 0;
        } else {
            int[] iArr = c11764yA0.f46129u;
            if (iArr == null) {
                int i2 = c11764yA0.f46111c;
                if (i >= i2) {
                    i = i2 - 1;
                }
            } else if (i >= iArr.length) {
                i = iArr.length - 1;
            }
        }
        this.f45941h = i;
        m26022o();
        C0471HT c0471ht = this.f45950q;
        int i3 = this.f45941h;
        int i4 = this.f45940g.f46111c;
        C11891zA0 c11891zA0 = (C11891zA0) c0471ht.f4311c;
        if (c11891zA0 != null) {
            int i5 = i3 + 1;
            c11891zA0.f46695N = i5;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("message", AbstractC7222ym.m26229f(i5, "pageChanged|", i4, HiAnalyticsConstant.REPORT_VAL_SEPARATOR));
            InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c11891zA0.getContext(), c11891zA0.getId());
            C4004ef c4004ef = new C4004ef(OZ1.m6094e(c11891zA0), c11891zA0.getId(), writableMapCreateMap, 7);
            if (interfaceC6947uPM6091b != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1096RQ(interfaceC6947uPM6091b, 22, c4004ef), 10L);
            }
        }
    }

    public void setDualPageMode(boolean z) {
        this.f45955v = z;
    }

    public void setLandscapeOrientation(boolean z) {
        this.f45956w = z;
    }

    public void setMaxZoom(float f) {
        this.f45936c = f;
    }

    public void setMidZoom(float f) {
        this.f45935b = f;
    }

    public void setMinZoom(float f) {
        this.f45934a = f;
    }

    public void setNightMode(boolean z) {
        this.f45921A = z;
        Paint paint = this.f45951r;
        if (z) {
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        } else {
            paint.setColorFilter(null);
        }
    }

    public void setPageFling(boolean z) {
        this.f45929I = z;
    }

    public void setPageSnap(boolean z) {
        this.f45922B = z;
    }

    public void setPositionOffset(float f) {
        if (this.f45957x) {
            m26023p(this.f45942i, ((-(this.f45940g.f46125q * this.f45944k)) + getHeight()) * f);
        } else {
            m26023p(((-(this.f45940g.f46125q * this.f45944k)) + getWidth()) * f, this.f45943j);
        }
        m26021n();
    }

    public void setSwipeEnabled(boolean z) {
        this.f45958y = z;
    }

    /* renamed from: t */
    public final float m26027t(int i, int i2) {
        float fM26055f = this.f45940g.m26055f(this.f45944k, i);
        float height = this.f45957x ? getHeight() : getWidth();
        float fM26054e = this.f45940g.m26054e(this.f45944k, i);
        return i2 == 2 ? (fM26055f - (height / 2.0f)) + (fM26054e / 2.0f) : i2 == 3 ? (fM26055f - height) + fM26054e : fM26055f;
    }

    /* renamed from: u */
    public final void m26028u(float f, PointF pointF) {
        float f2 = f / this.f45944k;
        this.f45944k = f;
        float f3 = this.f45942i * f2;
        float f4 = this.f45943j * f2;
        float f5 = pointF.x;
        float f6 = (f5 - (f5 * f2)) + f3;
        float f7 = pointF.y;
        m26023p(f6, (f7 - (f2 * f7)) + f4);
    }

    public void setScrollHandle(NW0 nw0) {
    }
}
