package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.SizeF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: cE */
/* loaded from: classes.dex */
public final class AsyncTaskC1834cE extends AsyncTask {

    /* renamed from: a */
    public boolean f17373a;

    /* renamed from: b */
    public WeakReference f17374b;

    /* renamed from: c */
    public PdfiumCore f17375c;

    /* renamed from: d */
    public String f17376d;

    /* renamed from: e */
    public InterfaceC1279UK f17377e;

    /* renamed from: f */
    public int[] f17378f;

    /* renamed from: g */
    public C11764yA0 f17379g;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            AbstractC11739xz0 abstractC11739xz0 = (AbstractC11739xz0) this.f17374b.get();
            if (abstractC11739xz0 != null) {
                this.f17379g = new C11764yA0(this.f17375c, this.f17377e.mo6000e(abstractC11739xz0.getContext(), this.f17375c, this.f17376d), abstractC11739xz0.getPageFitPolicy(), new Size(abstractC11739xz0.getWidth(), abstractC11739xz0.getHeight()), this.f17378f, abstractC11739xz0.f45955v, abstractC11739xz0.f45957x, abstractC11739xz0.getSpacingPx(), abstractC11739xz0.f45928H, abstractC11739xz0.f45953t, abstractC11739xz0.f45956w);
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
        this.f17373a = true;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        AbstractC11739xz0 abstractC11739xz0 = (AbstractC11739xz0) this.f17374b.get();
        if (abstractC11739xz0 != null) {
            if (th != null) {
                abstractC11739xz0.f45933M = 4;
                C11891zA0 c11891zA0 = (C11891zA0) abstractC11739xz0.f45950q.f4310b;
                abstractC11739xz0.m26025r();
                abstractC11739xz0.invalidate();
                if (c11891zA0 != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    if (th.getMessage().contains("Password required or incorrect password")) {
                        writableMapCreateMap.putString("message", "error|Password required or incorrect password.");
                    } else {
                        writableMapCreateMap.putString("message", "error|" + th.getMessage());
                    }
                    InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c11891zA0.getContext(), c11891zA0.getId());
                    C4004ef c4004ef = new C4004ef(OZ1.m6094e(c11891zA0), c11891zA0.getId(), writableMapCreateMap, 7);
                    if (interfaceC6947uPM6091b != null) {
                        interfaceC6947uPM6091b.mo11046g(c4004ef);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f17373a) {
                return;
            }
            C11764yA0 c11764yA0 = this.f17379g;
            abstractC11739xz0.f45933M = 2;
            abstractC11739xz0.f45940g = c11764yA0;
            if (abstractC11739xz0.f45947n == null) {
                abstractC11739xz0.f45947n = new HandlerThread("PDF renderer");
            }
            if (!abstractC11739xz0.f45947n.isAlive()) {
                abstractC11739xz0.f45947n.start();
            }
            HandlerC9241eR0 handlerC9241eR0 = new HandlerC9241eR0(abstractC11739xz0.f45947n.getLooper());
            handlerC9241eR0.f26710b = new RectF();
            handlerC9241eR0.f26711c = new Rect();
            handlerC9241eR0.f26712d = new Matrix();
            handlerC9241eR0.f26709a = abstractC11739xz0;
            abstractC11739xz0.f45948o = handlerC9241eR0;
            handlerC9241eR0.f26713e = true;
            abstractC11739xz0.f45939f.f27684g = true;
            C0471HT c0471ht = abstractC11739xz0.f45950q;
            int i = c11764yA0.f46111c;
            C11891zA0 c11891zA02 = (C11891zA0) c0471ht.f4309a;
            if (c11891zA02 != null) {
                C11764yA0 c11764yA02 = c11891zA02.f45940g;
                SizeF sizeF = c11764yA02 == null ? new SizeF(0.0f, 0.0f) : c11764yA02.m26056g(0);
                float width = sizeF.getWidth();
                float height = sizeF.getHeight();
                c11891zA02.f45944k = c11891zA02.f46697P;
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("message", "loadComplete|" + i + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + width + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + height + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + new C9189e20(C3927dQ.f26057c, Collections.emptyMap(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList()).m17823d(c11891zA02.getTableOfContents()));
                InterfaceC6947uP interfaceC6947uPM6091b2 = OZ1.m6091b((S91) c11891zA02.getContext(), c11891zA02.getId());
                C4004ef c4004ef2 = new C4004ef(OZ1.m6094e(c11891zA02), c11891zA02.getId(), writableMapCreateMap2, 7);
                if (interfaceC6947uPM6091b2 != null) {
                    interfaceC6947uPM6091b2.mo11046g(c4004ef2);
                }
            }
            abstractC11739xz0.m26019l(abstractC11739xz0.f45954u);
        }
    }
}
