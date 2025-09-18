package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.IOException;
import ru.p031ok.tracer.crash.report.CrashStorage;
import ru.p031ok.tracer.crash.report.CrashUploader;
import ru.p031ok.tracer.crash.report.LogStorage;
import ru.p031ok.tracer.crash.report.SessionStateUploader;
import ru.p031ok.tracer.crash.report.TracerCrashReport;
import ru.p031ok.tracer.session.SessionStateStorage;
import ru.p031ok.tracer.session.TagsStorage;

/* renamed from: k60 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9967k60 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36308a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f36309b;

    /* renamed from: c */
    public final /* synthetic */ Object f36310c;

    /* renamed from: d */
    public final /* synthetic */ Object f36311d;

    /* renamed from: e */
    public final /* synthetic */ Object f36312e;

    /* renamed from: f */
    public final /* synthetic */ Object f36313f;

    /* renamed from: g */
    public final /* synthetic */ Object f36314g;

    /* renamed from: h */
    public final /* synthetic */ Object f36315h;

    public /* synthetic */ RunnableC9967k60(AbstractC10095l60 abstractC10095l60, InterfaceC9457g70 interfaceC9457g70, Matrix matrix, InterfaceC9457g70 interfaceC9457g702, Rect rect, C0267EE c0267ee, C0300El c0300El) {
        this.f36309b = abstractC10095l60;
        this.f36310c = interfaceC9457g70;
        this.f36312e = matrix;
        this.f36311d = interfaceC9457g702;
        this.f36313f = rect;
        this.f36314g = c0267ee;
        this.f36315h = c0300El;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f36308a) {
            case 0:
                AbstractC10095l60 abstractC10095l60 = (AbstractC10095l60) this.f36309b;
                InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) this.f36310c;
                Matrix matrix = (Matrix) this.f36312e;
                InterfaceC9457g70 interfaceC9457g702 = (InterfaceC9457g70) this.f36311d;
                Rect rect = (Rect) this.f36313f;
                C0267EE c0267ee = (C0267EE) this.f36314g;
                C0300El c0300El = (C0300El) this.f36315h;
                if (!abstractC10095l60.f36910s) {
                    c0300El.m2377d(new C11355uy0("ImageAnalysis is detached"));
                    break;
                } else {
                    C11814yZ0 c11814yZ0 = new C11814yZ0(interfaceC9457g702, null, new C0921Od(interfaceC9457g70.mo18403P().mo4564b(), interfaceC9457g70.mo18403P().getTimestamp(), abstractC10095l60.f36896e ? 0 : abstractC10095l60.f36893b, matrix));
                    if (!rect.isEmpty()) {
                        c11814yZ0.m26169c(rect);
                    }
                    c0267ee.mo2076i0(c11814yZ0);
                    c0300El.m2375b(null);
                    break;
                }
            default:
                TracerCrashReport.init$lambda$0((Context) this.f36309b, (SessionStateStorage) this.f36310c, (TagsStorage) this.f36311d, (LogStorage) this.f36312e, (CrashStorage) this.f36313f, (SessionStateUploader) this.f36314g, (CrashUploader) this.f36315h);
                break;
        }
    }

    public /* synthetic */ RunnableC9967k60(Context context, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage, SessionStateUploader sessionStateUploader, CrashUploader crashUploader) {
        this.f36309b = context;
        this.f36310c = sessionStateStorage;
        this.f36311d = tagsStorage;
        this.f36312e = logStorage;
        this.f36313f = crashStorage;
        this.f36314g = sessionStateUploader;
        this.f36315h = crashUploader;
    }
}
