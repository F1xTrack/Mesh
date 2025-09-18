package defpackage;

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
public final /* synthetic */ class C6799rE implements InterfaceC1373Rj0, InterfaceC6365oy, InterfaceC0940Lv, QL, InterfaceC6290oZ, ReactJsExceptionHandler, InterfaceC1651Uy, HB, InterfaceC8224yi0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C6799rE(int i) {
        this.a = i;
    }

    public static InterfaceC0046Ai1 c(int i) {
        C1591Ue c1591Ue = C1591Ue.f;
        return (C3664et.c(c1591Ue) || MR.g(c1591Ue)) ? false : MR.c().f() ? new C7529v3(i) : new C1441Sg(i);
    }

    @Override // defpackage.InterfaceC8224yi0
    public String a(Context context) {
        switch (this.a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return (applicationInfo2 == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo2.minSdkVersion);
        }
    }

    @Override // defpackage.InterfaceC6290oZ, defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        return new C8323zE((M71) obj);
    }

    @Override // defpackage.InterfaceC6365oy
    public void b(Object obj) {
        ((OL) obj).a();
    }

    public Constructor d() {
        switch (this.a) {
            case 12:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(WR.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(WR.class).getConstructor(null);
        }
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 14:
                Set setZ = c1241Pr0.z(C1510Td.class);
                G10 g10 = G10.c;
                if (g10 == null) {
                    synchronized (G10.class) {
                        try {
                            g10 = G10.c;
                            if (g10 == null) {
                                g10 = new G10(0);
                                G10.c = g10;
                            }
                        } finally {
                        }
                    }
                }
                return new C3550eH(setZ, g10);
            case 15:
            default:
                C6697qh0 c6697qh0 = ExecutorsRegistrar.a;
                return EnumC0427Ff1.a;
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
        }
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Z3) obj).getClass();
                break;
            case 1:
                ((Z3) obj).getClass();
                break;
            case 2:
                ((Z3) obj).getClass();
                break;
            case 3:
                ((Z3) obj).getClass();
                break;
            case 4:
                ((Z3) obj).getClass();
                break;
            case 5:
                ((Z3) obj).getClass();
                break;
            case 6:
                ((Z3) obj).getClass();
                break;
            case 7:
                ((Z3) obj).getClass();
                break;
            case 8:
                ((Z3) obj).getClass();
                break;
            case 9:
                ((Z3) obj).getClass();
                break;
            case 10:
                ((Z3) obj).getClass();
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
                ((GB0) obj).y();
                break;
            case 21:
                ((GB0) obj).x(new IQ(2, new C7074sg("Player release timed out."), 1003));
                break;
        }
    }

    @Override // defpackage.QL
    public void release() {
    }

    @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
    public void reportJsException(ReactJsExceptionHandler.ParsedError parsedError) {
        O90.f(parsedError, "<anonymous parameter 0>");
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        switch (this.a) {
            case 25:
                return 403;
            default:
                return -1;
        }
    }

    public /* synthetic */ C6799rE(int i, long j, Y3 y3) {
        this.a = 0;
    }

    public /* synthetic */ C6799rE(Y3 y3, int i) {
        this.a = i;
    }

    public /* synthetic */ C6799rE(Y3 y3, C4020gk0 c4020gk0, C7102sp0 c7102sp0, int i) {
        this.a = i;
    }

    public /* synthetic */ C6799rE(Y3 y3, Object obj, int i) {
        this.a = i;
    }
}
