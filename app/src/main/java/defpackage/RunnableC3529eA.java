package defpackage;

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
import androidx.fragment.app.v;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.google.android.material.textfield.TextInputLayout;
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
import ru.ok.tracer.crash.report.CrashDescription;
import ru.ok.tracer.crash.report.CrashLoggerInternal;

/* renamed from: eA */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3529eA implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC3529eA(CY cy, View view, Rect rect) {
        this.a = 8;
        this.b = view;
        this.c = rect;
    }

    private final void a() {
        InterfaceC3571eO interfaceC3571eO;
        Executor executor;
        C6639qO c6639qO = (C6639qO) this.b;
        MediaFormat mediaFormat = (MediaFormat) this.c;
        if (c6639qO.j) {
            AbstractC0759Jm0.f(c6639qO.l.a);
            return;
        }
        switch (AbstractC8235ym.x(c6639qO.l.D)) {
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
                synchronized (c6639qO.l.b) {
                    C7020sO c7020sO = c6639qO.l;
                    interfaceC3571eO = c7020sO.r;
                    executor = c7020sO.s;
                }
                try {
                    executor.execute(new RunnableC3529eA(interfaceC3571eO, 26, mediaFormat));
                    return;
                } catch (RejectedExecutionException unused) {
                    AbstractC0759Jm0.f(c6639qO.l.a);
                    return;
                }
            default:
                throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c6639qO.l.D)));
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ExecutorC5715lY0 executorC5715lY0;
        boolean zEquals = false;
        switch (this.a) {
            case 0:
                CrashLoggerInternal.reportNonFatal$lambda$1((CrashLoggerInternal) this.b, (CrashDescription) this.c);
                return;
            case 1:
                ((C5833mA) this.b).c((String) this.c, Boolean.FALSE);
                return;
            case 2:
                C6597qA c6597qA = (C6597qA) this.b;
                String str = (String) this.c;
                C5534kb1 c5534kb1 = (C5534kb1) c6597qA.h.d;
                c5534kb1.getClass();
                String strB = C7648vg0.b(1024, str);
                synchronized (((AtomicMarkableReference) c5534kb1.g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) c5534kb1.g).getReference();
                        if (strB != null) {
                            zEquals = strB.equals(str2);
                        } else if (str2 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) c5534kb1.g).set(strB, true);
                        ((ZA) ((C6846rT1) c5534kb1.b).c).a(new N61(7, c5534kb1));
                        return;
                    } finally {
                    }
                }
            case 3:
                YB yb = (YB) this.b;
                Process.setThreadPriority(yb.c);
                StrictMode.ThreadPolicy threadPolicy = yb.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 4:
                C3501e11 c3501e11 = (C3501e11) this.b;
                TextInputLayout textInputLayout = c3501e11.a;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) this.c).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), c3501e11.c.format(new Date(AbstractC6316oh1.f().getTimeInMillis())).replace(' ', (char) 160)));
                c3501e11.j.getError();
                c3501e11.k.getClass();
                c3501e11.i.a();
                return;
            case 5:
                C0020Aa c0020Aa = (C0020Aa) this.c;
                CC0 cc0 = ((C0843Ko0) ((G10) this.b).b).R1;
                Handler handler = (Handler) cc0.b;
                if (handler != null) {
                    handler.post(new RunnableC7438ua(cc0, c0020Aa, 1));
                    return;
                }
                return;
            case 6:
                C5848mF c5848mF = (C5848mF) this.b;
                C6039nF c6039nF = c5848mF.d;
                if (c6039nF.o == 0 || c5848mF.c) {
                    return;
                }
                Looper looper = c6039nF.s;
                looper.getClass();
                c5848mF.b = c6039nF.b(looper, c5848mF.a, (C6666qX) this.c, false);
                c6039nF.m.add(c5848mF);
                return;
            case 7:
                EF ef = (EF) this.b;
                ef.i = false;
                ef.d((Uri) this.c);
                return;
            case 8:
                CY.g((View) this.b, (Rect) this.c);
                return;
            case 9:
                CG cg = (CG) this.b;
                O90.f(cg, "$transitionInfo");
                v vVar = (v) this.c;
                O90.f(vVar, "$operation");
                cg.a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    vVar.toString();
                    return;
                }
                return;
            case 10:
                ((JG) this.b).k.add((C7447ud) this.c);
                return;
            case 11:
                JG jg = (JG) this.b;
                C20 c20 = jg.c;
                T61 t61 = (T61) this.c;
                Surface surfaceC = t61.c(c20, new C1699Vo(jg, 1, t61));
                jg.a.h(surfaceC);
                jg.h.put(t61, surfaceC);
                return;
            case 12:
                final JG jg2 = (JG) this.b;
                jg2.i++;
                C6557py0 c6557py0 = jg2.a;
                AbstractC3306d00.d((AtomicBoolean) c6557py0.d, true);
                AbstractC3306d00.c((Thread) c6557py0.f);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(c6557py0.c);
                final Z61 z61 = (Z61) this.c;
                Size size = z61.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                C0515Gj c0515Gj = new C0515Gj(jg2, 24, z61);
                C20 c202 = jg2.c;
                z61.c(c202, c0515Gj);
                z61.b(surface, c202, new InterfaceC6556py() { // from class: GG
                    @Override // defpackage.InterfaceC6556py
                    public final void b(Object obj) {
                        JG jg3 = jg2;
                        Z61 z612 = z61;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        jg3.getClass();
                        synchronized (z612.a) {
                            z612.n = null;
                            z612.o = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        jg3.i--;
                        jg3.a();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(jg2, jg2.d);
                return;
            case 13:
                Callable callable = (Callable) this.b;
                HH hh = (HH) ((C3866fw1) this.c).b;
                try {
                    hh.j(callable.call());
                    return;
                } catch (Exception e) {
                    hh.k(e);
                    return;
                }
            case 14:
                DevLoadingModule.showMessage$lambda$0((DevLoadingModule) this.b, (String) this.c);
                return;
            case 15:
                C3938gJ c3938gJ = (C3938gJ) this.b;
                Context context2 = (Context) this.c;
                if (c3938gJ.a != null || context2 == null) {
                    return;
                }
                c3938gJ.a = context2.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 16:
                final C5869mM c5869mM = (C5869mM) this.b;
                c5869mM.e++;
                Z61 z612 = (Z61) this.c;
                C5487kM c5487kM = c5869mM.a;
                AbstractC3306d00.d((AtomicBoolean) c5487kM.d, true);
                AbstractC3306d00.c((Thread) c5487kM.f);
                boolean z = z612.f;
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z ? c5487kM.o : c5487kM.p);
                Size size2 = z612.b;
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                z612.b(surface2, c5869mM.c, new InterfaceC6556py() { // from class: lM
                    @Override // defpackage.InterfaceC6556py
                    public final void b(Object obj) {
                        C5869mM c5869mM2 = c5869mM;
                        c5869mM2.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        c5869mM2.e--;
                        c5869mM2.a();
                    }
                });
                if (z) {
                    c5869mM.i = surfaceTexture2;
                    return;
                } else {
                    c5869mM.j = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(c5869mM, c5869mM.d);
                    return;
                }
            case 17:
                C5869mM c5869mM2 = (C5869mM) this.b;
                C20 c203 = c5869mM2.c;
                T61 t612 = (T61) this.c;
                Surface surfaceC2 = t612.c(c203, new C1699Vo(c5869mM2, 2, t612));
                c5869mM2.a.h(surfaceC2);
                c5869mM2.h.put(t612, surfaceC2);
                return;
            case 18:
                C6639qO c6639qO = (C6639qO) this.c;
                Objects.requireNonNull(c6639qO);
                ((ExecutorC5715lY0) this.b).execute(new DE(13, c6639qO));
                return;
            case 19:
                ((C7020sO) this.b).l.remove((C0365El) this.c);
                return;
            case 20:
                ((C7020sO) this.b).m.remove((C7736w80) this.c);
                return;
            case 21:
                ((InterfaceC3296cx0) ((Map.Entry) this.b).getKey()).a((EnumC7465uj) this.c);
                return;
            case 22:
                LinkedHashMap linkedHashMap = ((C6257oO) this.b).a;
                InterfaceC3296cx0 interfaceC3296cx0 = (InterfaceC3296cx0) this.c;
                interfaceC3296cx0.getClass();
                linkedHashMap.remove(interfaceC3296cx0);
                return;
            case 23:
                ((InterfaceC3296cx0) this.b).a((EnumC7465uj) this.c);
                return;
            case 24:
                C7020sO c7020sO = ((C6639qO) this.b).l;
                switch (AbstractC8235ym.x(c7020sO.D)) {
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
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.c;
                        c7020sO.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c7020sO.D)));
                }
            case 25:
                a();
                return;
            case 26:
                ((InterfaceC3571eO) this.b).f(new EE(3, (MediaFormat) this.c));
                return;
            case 27:
                ((InterfaceC3571eO) this.b).l((WN) this.c);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C4290i9 c4290i9 = (C4290i9) this.b;
                Surface surface3 = (Surface) this.c;
                C6557py0 c6557py02 = (C6557py0) c4290i9.b;
                int iX = AbstractC8235ym.x(c6557py02.c);
                C0365El c0365El = (C0365El) c4290i9.c;
                if (iX != 0) {
                    if (iX == 1) {
                        Z61 z613 = (Z61) c4290i9.d;
                        if (z613.a()) {
                            Objects.toString(z613, "EMPTY");
                            AbstractC0759Jm0.f("VideoEncoderSession");
                            c0365El.b(null);
                            c6557py02.a();
                            return;
                        }
                        c6557py02.b = surface3;
                        Objects.toString(surface3);
                        AbstractC0759Jm0.f("VideoEncoderSession");
                        z613.b(surface3, (ExecutorC5715lY0) c6557py02.e, new WN0(4, c6557py02));
                        c6557py02.c = 4;
                        c0365El.b((C7020sO) c6557py02.g);
                        return;
                    }
                    if (iX != 2) {
                        if (iX == 3) {
                            if (((VN0) c6557py02.j) != null && (executorC5715lY0 = (ExecutorC5715lY0) c6557py02.i) != null) {
                                executorC5715lY0.execute(new O91(c6557py02, 6, surface3));
                            }
                            Objects.toString(surface3);
                            AbstractC0759Jm0.f("VideoEncoderSession");
                            return;
                        }
                        if (iX != 4) {
                            throw new IllegalStateException("State " + F91.F(c6557py02.c) + " is not handled");
                        }
                    }
                }
                AbstractC0759Jm0.f("VideoEncoderSession");
                c0365El.b(null);
                return;
            default:
                ((BP) ((Map.Entry) this.b).getKey()).a((C6069nP) this.c);
                return;
        }
    }

    public /* synthetic */ RunnableC3529eA(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
