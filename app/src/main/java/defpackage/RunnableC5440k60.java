package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.IOException;
import ru.ok.tracer.crash.report.CrashStorage;
import ru.ok.tracer.crash.report.CrashUploader;
import ru.ok.tracer.crash.report.LogStorage;
import ru.ok.tracer.crash.report.SessionStateUploader;
import ru.ok.tracer.crash.report.TracerCrashReport;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;

/* renamed from: k60 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5440k60 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC5440k60(AbstractC5631l60 abstractC5631l60, InterfaceC3903g70 interfaceC3903g70, Matrix matrix, InterfaceC3903g70 interfaceC3903g702, Rect rect, EE ee, C0365El c0365El) {
        this.b = abstractC5631l60;
        this.c = interfaceC3903g70;
        this.e = matrix;
        this.d = interfaceC3903g702;
        this.f = rect;
        this.g = ee;
        this.h = c0365El;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                AbstractC5631l60 abstractC5631l60 = (AbstractC5631l60) this.b;
                InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) this.c;
                Matrix matrix = (Matrix) this.e;
                InterfaceC3903g70 interfaceC3903g702 = (InterfaceC3903g70) this.d;
                Rect rect = (Rect) this.f;
                EE ee = (EE) this.g;
                C0365El c0365El = (C0365El) this.h;
                if (!abstractC5631l60.s) {
                    c0365El.d(new C7511uy0("ImageAnalysis is detached"));
                    break;
                } else {
                    C8197yZ0 c8197yZ0 = new C8197yZ0(interfaceC3903g702, null, new C1120Od(interfaceC3903g70.P().b(), interfaceC3903g70.P().getTimestamp(), abstractC5631l60.e ? 0 : abstractC5631l60.b, matrix));
                    if (!rect.isEmpty()) {
                        c8197yZ0.c(rect);
                    }
                    ee.i0(c8197yZ0);
                    c0365El.b(null);
                    break;
                }
            default:
                TracerCrashReport.init$lambda$0((Context) this.b, (SessionStateStorage) this.c, (TagsStorage) this.d, (LogStorage) this.e, (CrashStorage) this.f, (SessionStateUploader) this.g, (CrashUploader) this.h);
                break;
        }
    }

    public /* synthetic */ RunnableC5440k60(Context context, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage, SessionStateUploader sessionStateUploader, CrashUploader crashUploader) {
        this.b = context;
        this.c = sessionStateStorage;
        this.d = tagsStorage;
        this.e = logStorage;
        this.f = crashStorage;
        this.g = sessionStateUploader;
        this.h = crashUploader;
    }
}
