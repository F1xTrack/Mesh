package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.C1740v;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.google.android.material.textfield.TextInputLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ru.mes.dnevnik.R;
import ru.p031ok.tracer.crash.report.CrashDescription;
import ru.p031ok.tracer.crash.report.CrashLoggerInternal;

/* renamed from: eA */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3973eA implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26576a;

    /* renamed from: b */
    public final /* synthetic */ Object f26577b;

    /* renamed from: c */
    public final /* synthetic */ Object f26578c;

    public /* synthetic */ RunnableC3973eA(AbstractC0161CY abstractC0161CY, View view, Rect rect) {
        this.f26576a = 8;
        this.f26577b = view;
        this.f26578c = rect;
    }

    /* renamed from: a */
    private final void m17873a() {
        InterfaceC3987eO interfaceC3987eO;
        Executor executor;
        C6677qO c6677qO = (C6677qO) this.f26577b;
        MediaFormat mediaFormat = (MediaFormat) this.f26578c;
        if (c6677qO.f40852j) {
            AbstractC7806Jm0.m4412f(c6677qO.f40854l.f42391a);
            return;
        }
        switch (AbstractC7222ym.m26247x(c6677qO.f40854l.f42390D)) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                synchronized (c6677qO.f40854l.f42392b) {
                    C6820sO c6820sO = c6677qO.f40854l;
                    interfaceC3987eO = c6820sO.f42408r;
                    executor = c6820sO.f42409s;
                }
                try {
                    executor.execute(new RunnableC3973eA(interfaceC3987eO, 26, mediaFormat));
                    return;
                } catch (RejectedExecutionException unused) {
                    AbstractC7806Jm0.m4412f(c6677qO.f40854l.f42391a);
                    return;
                }
            default:
                throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6677qO.f40854l.f42390D)));
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ExecutorC10151lY0 executorC10151lY0;
        boolean zEquals = false;
        switch (this.f26576a) {
            case 0:
                CrashLoggerInternal.reportNonFatal$lambda$1((CrashLoggerInternal) this.f26577b, (CrashDescription) this.f26578c);
                return;
            case 1:
                ((C6409mA) this.f26577b).m22694c((String) this.f26578c, Boolean.FALSE);
                return;
            case 2:
                C6663qA c6663qA = (C6663qA) this.f26577b;
                String str = (String) this.f26578c;
                C10030kb1 c10030kb1 = (C10030kb1) c6663qA.f40645h.f37530d;
                c10030kb1.getClass();
                String strM25473b = C11447vg0.m25473b(1024, str);
                synchronized (((AtomicMarkableReference) c10030kb1.f36567g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) c10030kb1.f36567g).getReference();
                        if (strM25473b != null) {
                            zEquals = strM25473b.equals(str2);
                        } else if (str2 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) c10030kb1.f36567g).set(strM25473b, true);
                        ((ExecutorC1584ZA) ((C10910rT1) c10030kb1.f36562b).f41679c).m9502a(new N61(7, c10030kb1));
                        return;
                    } finally {
                    }
                }
            case 3:
                ThreadFactoryC1522YB threadFactoryC1522YB = (ThreadFactoryC1522YB) this.f26577b;
                Process.setThreadPriority(threadFactoryC1522YB.f14195c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC1522YB.f14196d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f26578c).run();
                return;
            case 4:
                C9187e11 c9187e11 = (C9187e11) this.f26577b;
                TextInputLayout textInputLayout = c9187e11.f26491a;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) this.f26578c).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), c9187e11.f26493c.format(new Date(AbstractC10554oh1.m23525f().getTimeInMillis())).replace(' ', (char) 160)));
                c9187e11.f26500j.getError();
                c9187e11.f26501k.getClass();
                c9187e11.f26499i.m21929a();
                return;
            case 5:
                C0037Aa c0037Aa = (C0037Aa) this.f26578c;
                CC0 cc0 = ((C7862Ko0) ((G10) this.f26577b).f3531b).f6299R1;
                Handler handler = (Handler) cc0.f1250b;
                if (handler != null) {
                    handler.post(new RunnableC6958ua(cc0, c0037Aa, 1));
                    return;
                }
                return;
            case 6:
                C6414mF c6414mF = (C6414mF) this.f26577b;
                C6477nF c6477nF = c6414mF.f37588d;
                if (c6477nF.f38206o == 0 || c6414mF.f37587c) {
                    return;
                }
                Looper looper = c6477nF.f38210s;
                looper.getClass();
                c6414mF.f37586b = c6477nF.m23106b(looper, c6414mF.f37585a, (C6686qX) this.f26578c, false);
                c6477nF.f38204m.add(c6414mF);
                return;
            case 7:
                C0268EF c0268ef = (C0268EF) this.f26577b;
                c0268ef.f2573i = false;
                c0268ef.m2103d((Uri) this.f26578c);
                return;
            case 8:
                AbstractC0161CY.m1207g((View) this.f26577b, (Rect) this.f26578c);
                return;
            case 9:
                C0143CG c0143cg = (C0143CG) this.f26577b;
                O90.m5968f(c0143cg, "$transitionInfo");
                C1740v c1740v = (C1740v) this.f26578c;
                O90.m5968f(c1740v, "$operation");
                c0143cg.m10020a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    c1740v.toString();
                    return;
                }
                return;
            case 10:
                ((C0584JG) this.f26577b).f5440k.add((C6961ud) this.f26578c);
                return;
            case 11:
                C0584JG c0584jg = (C0584JG) this.f26577b;
                C20 c20 = c0584jg.f5432c;
                T61 t61 = (T61) this.f26578c;
                Surface surfaceM7549c = t61.m7549c(c20, new C1372Vo(c0584jg, 1, t61));
                c0584jg.f5430a.m23912h(surfaceM7549c);
                c0584jg.f5437h.put(t61, surfaceM7549c);
                return;
            case 12:
                final C0584JG c0584jg2 = (C0584JG) this.f26577b;
                c0584jg2.f5438i++;
                C10715py0 c10715py0 = c0584jg2.f5430a;
                AbstractC9055d00.m17455d((AtomicBoolean) c10715py0.f40464d, true);
                AbstractC9055d00.m17454c((Thread) c10715py0.f40466f);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(c10715py0.f40463c);
                final Z61 z61 = (Z61) this.f26578c;
                Size size = z61.f14738b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                C0424Gj c0424Gj = new C0424Gj(c0584jg2, 24, z61);
                C20 c202 = c0584jg2.f5432c;
                z61.m9492c(c202, c0424Gj);
                z61.m9491b(surface, c202, new InterfaceC6650py() { // from class: GG
                    @Override // p000.InterfaceC6650py
                    /* renamed from: b */
                    public final void mo3020b(Object obj) {
                        C0584JG c0584jg3 = c0584jg2;
                        Z61 z612 = z61;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        c0584jg3.getClass();
                        synchronized (z612.f14737a) {
                            z612.f14750n = null;
                            z612.f14751o = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        c0584jg3.f5438i--;
                        c0584jg3.m4266a();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(c0584jg2, c0584jg2.f5433d);
                return;
            case 13:
                Callable callable = (Callable) this.f26577b;
                ScheduledFutureC0459HH scheduledFutureC0459HH = (ScheduledFutureC0459HH) ((C9432fw1) this.f26578c).f27505b;
                try {
                    scheduledFutureC0459HH.m10413j(callable.call());
                    return;
                } catch (Exception e) {
                    scheduledFutureC0459HH.mo10414k(e);
                    return;
                }
            case 14:
                DevLoadingModule.showMessage$lambda$0((DevLoadingModule) this.f26577b, (String) this.f26578c);
                return;
            case 15:
                C4108gJ c4108gJ = (C4108gJ) this.f26577b;
                Context context2 = (Context) this.f26578c;
                if (c4108gJ.f27666a != null || context2 == null) {
                    return;
                }
                c4108gJ.f27666a = context2.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 16:
                final C6421mM c6421mM = (C6421mM) this.f26577b;
                c6421mM.f37643e++;
                Z61 z612 = (Z61) this.f26578c;
                C6295kM c6295kM = c6421mM.f37639a;
                AbstractC9055d00.m17455d((AtomicBoolean) c6295kM.f40464d, true);
                AbstractC9055d00.m17454c((Thread) c6295kM.f40466f);
                boolean z = z612.f14742f;
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z ? c6295kM.f36439o : c6295kM.f36440p);
                Size size2 = z612.f14738b;
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                z612.m9491b(surface2, c6421mM.f37641c, new InterfaceC6650py() { // from class: lM
                    @Override // p000.InterfaceC6650py
                    /* renamed from: b */
                    public final void mo3020b(Object obj) {
                        C6421mM c6421mM2 = c6421mM;
                        c6421mM2.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        c6421mM2.f37643e--;
                        c6421mM2.m22808a();
                    }
                });
                if (z) {
                    c6421mM.f37647i = surfaceTexture2;
                    return;
                } else {
                    c6421mM.f37648j = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(c6421mM, c6421mM.f37642d);
                    return;
                }
            case 17:
                C6421mM c6421mM2 = (C6421mM) this.f26577b;
                C20 c203 = c6421mM2.f37641c;
                T61 t612 = (T61) this.f26578c;
                Surface surfaceM7549c2 = t612.m7549c(c203, new C1372Vo(c6421mM2, 2, t612));
                c6421mM2.f37639a.m23912h(surfaceM7549c2);
                c6421mM2.f37646h.put(t612, surfaceM7549c2);
                return;
            case 18:
                C6677qO c6677qO = (C6677qO) this.f26578c;
                Objects.requireNonNull(c6677qO);
                ((ExecutorC10151lY0) this.f26577b).execute(new RunnableC0204DE(13, c6677qO));
                return;
            case 19:
                ((C6820sO) this.f26577b).f42402l.remove((C0300El) this.f26578c);
                return;
            case 20:
                ((C6820sO) this.f26577b).f42403m.remove((C11506w80) this.f26578c);
                return;
            case 21:
                ((InterfaceC9049cx0) ((Map.Entry) this.f26577b).getKey()).mo2107a((EnumC6967uj) this.f26578c);
                return;
            case 22:
                LinkedHashMap linkedHashMap = ((C6549oO) this.f26577b).f38980a;
                InterfaceC9049cx0 interfaceC9049cx0 = (InterfaceC9049cx0) this.f26578c;
                interfaceC9049cx0.getClass();
                linkedHashMap.remove(interfaceC9049cx0);
                return;
            case 23:
                ((InterfaceC9049cx0) this.f26577b).mo2107a((EnumC6967uj) this.f26578c);
                return;
            case 24:
                C6820sO c6820sO = ((C6677qO) this.f26577b).f40854l;
                switch (AbstractC7222ym.m26247x(c6820sO.f42390D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f26578c;
                        c6820sO.m24718b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6820sO.f42390D)));
                }
            case 25:
                m17873a();
                return;
            case 26:
                ((InterfaceC3987eO) this.f26577b).mo389f(new C0267EE(3, (MediaFormat) this.f26578c));
                return;
            case 27:
                ((InterfaceC3987eO) this.f26577b).mo395l((C1408WN) this.f26578c);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C4224i9 c4224i9 = (C4224i9) this.f26577b;
                Surface surface3 = (Surface) this.f26578c;
                C10715py0 c10715py02 = (C10715py0) c4224i9.f28837b;
                int iM26247x = AbstractC7222ym.m26247x(c10715py02.f40463c);
                C0300El c0300El = (C0300El) c4224i9.f28838c;
                if (iM26247x != 0) {
                    if (iM26247x == 1) {
                        Z61 z613 = (Z61) c4224i9.f28839d;
                        if (z613.m9490a()) {
                            Objects.toString(z613, "EMPTY");
                            AbstractC7806Jm0.m4412f("VideoEncoderSession");
                            c0300El.m2375b(null);
                            c10715py02.m23906a();
                            return;
                        }
                        c10715py02.f40462b = surface3;
                        Objects.toString(surface3);
                        AbstractC7806Jm0.m4412f("VideoEncoderSession");
                        z613.m9491b(surface3, (ExecutorC10151lY0) c10715py02.f40465e, new WN0(4, c10715py02));
                        c10715py02.f40463c = 4;
                        c0300El.m2375b((C6820sO) c10715py02.f40467g);
                        return;
                    }
                    if (iM26247x != 2) {
                        if (iM26247x == 3) {
                            if (((VN0) c10715py02.f40470j) != null && (executorC10151lY0 = (ExecutorC10151lY0) c10715py02.f40469i) != null) {
                                executorC10151lY0.execute(new O91(c10715py02, 6, surface3));
                            }
                            Objects.toString(surface3);
                            AbstractC7806Jm0.m4412f("VideoEncoderSession");
                            return;
                        }
                        if (iM26247x != 4) {
                            throw new IllegalStateException("State " + F91.m2516F(c10715py02.f40463c) + " is not handled");
                        }
                    }
                }
                AbstractC7806Jm0.m4412f("VideoEncoderSession");
                c0300El.m2375b(null);
                return;
            default:
                ((InterfaceC0089BP) ((Map.Entry) this.f26577b).getKey()).mo712a((C6487nP) this.f26578c);
                return;
        }
    }

    public /* synthetic */ RunnableC3973eA(Object obj, int i, Object obj2) {
        this.f26576a = i;
        this.f26577b = obj;
        this.f26578c = obj2;
    }
}
