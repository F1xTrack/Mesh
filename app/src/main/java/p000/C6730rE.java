package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: rE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6730rE implements InterfaceC8216Rj0, InterfaceC6587oy, InterfaceC0750Lv, InterfaceC1029QL, InterfaceC6560oZ, ReactJsExceptionHandler, InterfaceC1319Uy, InterfaceC0453HB, InterfaceC11832yi0 {

    /* renamed from: a */
    public final /* synthetic */ int f41389a;

    public /* synthetic */ C6730rE(int i) {
        this.f41389a = i;
    }

    /* renamed from: c */
    public static InterfaceC7331Ai1 m24241c(int i) {
        C1299Ue c1299Ue = C1299Ue.f11945f;
        return (C4018et.m18063c(c1299Ue) || AbstractC0783MR.m5367g(c1299Ue)) ? false : AbstractC0783MR.m5365c().mo4324f() ? new C6988v3(i) : new C1175Sg(i);
    }

    @Override // p000.InterfaceC11832yi0
    /* renamed from: a */
    public String mo6077a(Context context) {
        switch (this.f41389a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return (applicationInfo2 == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo2.minSdkVersion);
        }
    }

    @Override // p000.InterfaceC6560oZ, p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        return new C7251zE((M71) obj);
    }

    @Override // p000.InterfaceC6587oy
    /* renamed from: b */
    public void mo4000b(Object obj) {
        ((C0903OL) obj).m6015a();
    }

    /* renamed from: d */
    public Constructor m24242d() {
        switch (this.f41389a) {
            case 12:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC1412WR.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC1412WR.class).getConstructor(null);
        }
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f41389a) {
            case 14:
                Set setM6460z = c8128Pr0.m6460z(C1235Td.class);
                G10 g10 = G10.f3528c;
                if (g10 == null) {
                    synchronized (G10.class) {
                        try {
                            g10 = G10.f3528c;
                            if (g10 == null) {
                                g10 = new G10(0);
                                G10.f3528c = g10;
                            }
                        } finally {
                        }
                    }
                }
                return new C3980eH(setM6460z, g10);
            case 15:
            default:
                C10809qh0 c10809qh0 = ExecutorsRegistrar.f18445a;
                return EnumC7585Ff1.f3379a;
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f18445a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f18447c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.f18446b.get();
        }
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        switch (this.f41389a) {
            case 0:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 1:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 2:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 3:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 4:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 5:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 6:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 7:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 8:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 9:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 10:
                ((InterfaceC1577Z3) obj).getClass();
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                ((GB0) obj).mo2965y();
                break;
            case 21:
                ((GB0) obj).mo2964x(new C0531IQ(2, new C6838sg("Player release timed out."), 1003));
                break;
        }
    }

    @Override // p000.InterfaceC1029QL
    public void release() {
    }

    @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
    public void reportJsException(ReactJsExceptionHandler.ParsedError parsedError) {
        O90.m5968f(parsedError, "<anonymous parameter 0>");
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        switch (this.f41389a) {
            case 25:
                return 403;
            default:
                return -1;
        }
    }

    public /* synthetic */ C6730rE(int i, long j, C1514Y3 c1514y3) {
        this.f41389a = 0;
    }

    public /* synthetic */ C6730rE(C1514Y3 c1514y3, int i) {
        this.f41389a = i;
    }

    public /* synthetic */ C6730rE(C1514Y3 c1514y3, C9535gk0 c9535gk0, C11081sp0 c11081sp0, int i) {
        this.f41389a = i;
    }

    public /* synthetic */ C6730rE(C1514Y3 c1514y3, Object obj, int i) {
        this.f41389a = i;
    }
}
