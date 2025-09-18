package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.SizeF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: cE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC2475cE extends AsyncTask {
    public boolean a;
    public WeakReference b;
    public PdfiumCore c;
    public String d;
    public UK e;
    public int[] f;
    public C8122yA0 g;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            AbstractC8085xz0 abstractC8085xz0 = (AbstractC8085xz0) this.b.get();
            if (abstractC8085xz0 != null) {
                this.g = new C8122yA0(this.c, this.e.e(abstractC8085xz0.getContext(), this.c, this.d), abstractC8085xz0.getPageFitPolicy(), new Size(abstractC8085xz0.getWidth(), abstractC8085xz0.getHeight()), this.f, abstractC8085xz0.v, abstractC8085xz0.x, abstractC8085xz0.getSpacingPx(), abstractC8085xz0.H, abstractC8085xz0.t, abstractC8085xz0.w);
                th = null;
            } else {
                th = new NullPointerException("pdfView == null");
            }
        } catch (Throwable th) {
            th = th;
        }
        return th;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.a = true;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        AbstractC8085xz0 abstractC8085xz0 = (AbstractC8085xz0) this.b.get();
        if (abstractC8085xz0 != null) {
            if (th != null) {
                abstractC8085xz0.M = 4;
                C8312zA0 c8312zA0 = (C8312zA0) abstractC8085xz0.q.b;
                abstractC8085xz0.r();
                abstractC8085xz0.invalidate();
                if (c8312zA0 != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    if (th.getMessage().contains("Password required or incorrect password")) {
                        writableMapCreateMap.putString("message", "error|Password required or incorrect password.");
                    } else {
                        writableMapCreateMap.putString("message", "error|" + th.getMessage());
                    }
                    InterfaceC7405uP interfaceC7405uPB = OZ1.b((S91) c8312zA0.getContext(), c8312zA0.getId());
                    C3622ef c3622ef = new C3622ef(OZ1.e(c8312zA0), c8312zA0.getId(), writableMapCreateMap, 7);
                    if (interfaceC7405uPB != null) {
                        interfaceC7405uPB.g(c3622ef);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.a) {
                return;
            }
            C8122yA0 c8122yA0 = this.g;
            abstractC8085xz0.M = 2;
            abstractC8085xz0.g = c8122yA0;
            if (abstractC8085xz0.n == null) {
                abstractC8085xz0.n = new HandlerThread("PDF renderer");
            }
            if (!abstractC8085xz0.n.isAlive()) {
                abstractC8085xz0.n.start();
            }
            HandlerC3581eR0 handlerC3581eR0 = new HandlerC3581eR0(abstractC8085xz0.n.getLooper());
            handlerC3581eR0.b = new RectF();
            handlerC3581eR0.c = new Rect();
            handlerC3581eR0.d = new Matrix();
            handlerC3581eR0.a = abstractC8085xz0;
            abstractC8085xz0.o = handlerC3581eR0;
            handlerC3581eR0.e = true;
            abstractC8085xz0.f.g = true;
            HT ht = abstractC8085xz0.q;
            int i = c8122yA0.c;
            C8312zA0 c8312zA02 = (C8312zA0) ht.a;
            if (c8312zA02 != null) {
                C8122yA0 c8122yA02 = c8312zA02.g;
                SizeF sizeF = c8122yA02 == null ? new SizeF(0.0f, 0.0f) : c8122yA02.g(0);
                float width = sizeF.getWidth();
                float height = sizeF.getHeight();
                c8312zA02.k = c8312zA02.P;
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("message", "loadComplete|" + i + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + width + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + height + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + new C3504e20(C3387dQ.c, Collections.emptyMap(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList()).d(c8312zA02.getTableOfContents()));
                InterfaceC7405uP interfaceC7405uPB2 = OZ1.b((S91) c8312zA02.getContext(), c8312zA02.getId());
                C3622ef c3622ef2 = new C3622ef(OZ1.e(c8312zA02), c8312zA02.getId(), writableMapCreateMap2, 7);
                if (interfaceC7405uPB2 != null) {
                    interfaceC7405uPB2.g(c3622ef2);
                }
            }
            abstractC8085xz0.l(abstractC8085xz0.u);
        }
    }
}
