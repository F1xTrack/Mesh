package p000;

import android.content.Context;
import android.location.Location;
import com.facebook.react.bridge.Callback;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: iY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9767iY0 {
    /* renamed from: a */
    public static final void m19058a(C4140gp c4140gp) throws C6640po {
        O90.m5968f(c4140gp, "<this>");
        C0743Lo cameraSession$react_native_vision_camera_release = c4140gp.getCameraSession$react_native_vision_camera_release();
        O90.m5968f(cameraSession$react_native_vision_camera_release, "<this>");
        C9619hO0 c9619hO0 = cameraSession$react_native_vision_camera_release.f6873r;
        if (c9619hO0 == null) {
            throw new C6640po(27, false);
        }
        if (c9619hO0.f28401a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        C9491gO0 c9491gO0 = c9619hO0.f28402b;
        synchronized (c9491gO0.f27759h) {
            try {
                if (!C9491gO0.m18482o(c9619hO0, c9491gO0.f27768o) && !C9491gO0.m18482o(c9619hO0, c9491gO0.f27767n)) {
                    Objects.toString(c9619hO0.f28404d);
                    AbstractC7806Jm0.m4412f("Recorder");
                    return;
                }
                int iOrdinal = c9491gO0.f27764k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        c9491gO0.m18485B(EnumC9363fO0.f27167c);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            c9491gO0.m18485B(EnumC9363fO0.f27170f);
                            c9491gO0.f27751d.execute(new XN0(c9491gO0, c9491gO0.f27767n, 0));
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + c9491gO0.f27764k);
            } finally {
            }
        }
    }

    /* renamed from: b */
    public static final void m19059b(C4140gp c4140gp) throws C6640po {
        O90.m5968f(c4140gp, "<this>");
        C0743Lo cameraSession$react_native_vision_camera_release = c4140gp.getCameraSession$react_native_vision_camera_release();
        O90.m5968f(cameraSession$react_native_vision_camera_release, "<this>");
        C9619hO0 c9619hO0 = cameraSession$react_native_vision_camera_release.f6873r;
        if (c9619hO0 == null) {
            throw new C6640po(27, false);
        }
        if (c9619hO0.f28401a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        C9491gO0 c9491gO0 = c9619hO0.f28402b;
        synchronized (c9491gO0.f27759h) {
            try {
                if (!C9491gO0.m18482o(c9619hO0, c9491gO0.f27768o) && !C9491gO0.m18482o(c9619hO0, c9491gO0.f27767n)) {
                    Objects.toString(c9619hO0.f28404d);
                    AbstractC7806Jm0.m4412f("Recorder");
                    return;
                }
                int iOrdinal = c9491gO0.f27764k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        c9491gO0.m18485B(EnumC9363fO0.f27169e);
                        c9491gO0.f27751d.execute(new XN0(c9491gO0, c9491gO0.f27767n, 1));
                    } else if (iOrdinal == 2) {
                        c9491gO0.m18485B(EnumC9363fO0.f27166b);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + c9491gO0.f27764k);
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static final void m19060c(C4140gp c4140gp, C7978Mu0 c7978Mu0, Callback callback) throws C10233mB0, C6640po {
        Location location;
        boolean z;
        long j;
        int i;
        IOException iOException;
        C6693qe c6693qe;
        C9619hO0 c9619hO0;
        O90.m5968f(c4140gp, "<this>");
        O90.m5968f(callback, "onRecordCallback");
        if (c4140gp.getAudio() && AbstractC3982eJ.m17899a(c4140gp.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            throw new C6640po(24, false);
        }
        C6973up c6973up = new C6973up(0, callback);
        C6973up c6973up2 = new C6973up(1, callback);
        C0743Lo cameraSession$react_native_vision_camera_release = c4140gp.getCameraSession$react_native_vision_camera_release();
        boolean audio = c4140gp.getAudio();
        O90.m5968f(cameraSession$react_native_vision_camera_release, "<this>");
        if (cameraSession$react_native_vision_camera_release.f6860e == null) {
            throw new C6640po(2, false);
        }
        if (cameraSession$react_native_vision_camera_release.f6873r != null) {
            throw new C10233mB0("capture", "recording-in-progress", "There is already an active video recording in progress! Did you call startRecording() twice?", null);
        }
        C8215Ri1 c8215Ri1 = cameraSession$react_native_vision_camera_release.f6863h;
        if (c8215Ri1 == null) {
            throw new C10233mB0("capture", "video-not-enabled", "Video capture is disabled! Pass `video={true}` to enable video recordings.", null);
        }
        File file = ((C9565gz0) c7978Mu0.f7393b).f28140d;
        AbstractC9104dM1.m17549h(file, "File can't be null.");
        Location location2 = cameraSession$react_native_vision_camera_release.f6867l.f6362c;
        if (location2 != null) {
            location2.getLatitude();
            location2.getLongitude();
            AbstractC9104dM1.m17545d("Latitude must be in the range [-90, 90]", location2.getLatitude() >= -90.0d && location2.getLatitude() <= 90.0d);
            AbstractC9104dM1.m17545d("Longitude must be in the range [-180, 180]", location2.getLongitude() >= -180.0d && location2.getLongitude() <= 180.0d);
            location = location2;
        } else {
            location = null;
        }
        C0093BT c0093bt = new C0093BT(new C0544Id(0L, 0L, location, file));
        final C9491gO0 c9491gO0 = (C9491gO0) c8215Ri1.m7097L();
        S91 s91 = cameraSession$react_native_vision_camera_release.f6856a;
        O90.m5968f(s91, "context");
        Context contextM18245f = AbstractC9376fU1.m18245f(s91);
        O90.m5967e(contextM18245f, "getApplicationContext(context)");
        if (!audio) {
            z = false;
        } else {
            if (AbstractC3982eJ.m17899a(cameraSession$react_native_vision_camera_release.f6856a, "android.permission.RECORD_AUDIO") != 0) {
                throw new C6640po(24, false);
            }
            if (AbstractC9998kL1.m22191a(contextM18245f, "android.permission.RECORD_AUDIO") == -1) {
                throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
            }
            AbstractC9104dM1.m17550i(((C1613Zd) C9491gO0.m18480k(c9491gO0.f27722D)).f15047b.f43171e != 0, "The Recorder this recording is associated to doesn't support audio.");
            z = true;
        }
        cameraSession$react_native_vision_camera_release.f6874s = false;
        ExecutorService executorService = AbstractC0492Ho.f4510b;
        C1120Ro c1120Ro = new C1120Ro(cameraSession$react_native_vision_camera_release, c6973up2, c7978Mu0, c8215Ri1, c6973up);
        O90.m5968f(executorService, "listenerExecutor");
        synchronized (c9491gO0.f27759h) {
            try {
                j = c9491gO0.f27769p + 1;
                c9491gO0.f27769p = j;
                switch (c9491gO0.f27764k.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        EnumC9363fO0 enumC9363fO0 = c9491gO0.f27764k;
                        EnumC9363fO0 enumC9363fO02 = EnumC9363fO0.f27168d;
                        if (enumC9363fO0 == enumC9363fO02) {
                            AbstractC9104dM1.m17550i(c9491gO0.f27767n == null && c9491gO0.f27768o == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            C6693qe c6693qe2 = new C6693qe(c0093bt, executorService, c1120Ro, z, j);
                            c6693qe2.f41082f.set(false);
                            c6693qe2.m24034e(contextM18245f);
                            c9491gO0.f27768o = c6693qe2;
                            EnumC9363fO0 enumC9363fO03 = c9491gO0.f27764k;
                            if (enumC9363fO03 == enumC9363fO02) {
                                c9491gO0.m18485B(EnumC9363fO0.f27166b);
                                final int i2 = 0;
                                c9491gO0.f27751d.execute(new Runnable() { // from class: UN0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z2;
                                        C6693qe c6693qeM18502p;
                                        int i3;
                                        C6693qe c6693qe3;
                                        Throwable th;
                                        switch (i2) {
                                            case 0:
                                                C9491gO0 c9491gO02 = c9491gO0;
                                                synchronized (c9491gO02.f27759h) {
                                                    try {
                                                        int iOrdinal = c9491gO02.f27764k.ordinal();
                                                        boolean z3 = true;
                                                        z2 = false;
                                                        c6693qeM18502p = null;
                                                        if (iOrdinal != 1) {
                                                            if (iOrdinal != 2) {
                                                                i3 = 0;
                                                                c6693qe3 = null;
                                                            }
                                                            th = c6693qe3;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (c9491gO02.f27767n == null && !c9491gO02.f27744Z) {
                                                            if (c9491gO02.f27762i0 == 3) {
                                                                c6693qe3 = c9491gO02.f27768o;
                                                                c9491gO02.f27768o = null;
                                                                c9491gO02.m18509x();
                                                                i3 = 4;
                                                                z2 = z3;
                                                                th = C9491gO0.f27713n0;
                                                            } else if (c9491gO02.f27724F != null) {
                                                                i3 = 0;
                                                                z2 = z3;
                                                                th = null;
                                                                c6693qeM18502p = c9491gO02.m18502p(c9491gO02.f27764k);
                                                                c6693qe3 = null;
                                                            }
                                                        }
                                                        i3 = 0;
                                                        c6693qe3 = null;
                                                        z2 = z3;
                                                        th = c6693qe3;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (c6693qeM18502p != null) {
                                                    c9491gO02.m18489F(c6693qeM18502p, z2);
                                                    return;
                                                } else {
                                                    if (c6693qe3 != null) {
                                                        c9491gO02.m18498i(c6693qe3, i3, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                C9491gO0 c9491gO03 = c9491gO0;
                                                Z61 z61 = c9491gO03.f27778y;
                                                if (z61 == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                c9491gO03.m18496g(z61, c9491gO03.f27779z, false);
                                                return;
                                        }
                                    }
                                });
                            } else if (enumC9363fO03 == EnumC9363fO0.f27173i) {
                                c9491gO0.m18485B(EnumC9363fO0.f27166b);
                                final int i3 = 1;
                                c9491gO0.f27751d.execute(new Runnable() { // from class: UN0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z2;
                                        C6693qe c6693qeM18502p;
                                        int i32;
                                        C6693qe c6693qe3;
                                        Throwable th;
                                        switch (i3) {
                                            case 0:
                                                C9491gO0 c9491gO02 = c9491gO0;
                                                synchronized (c9491gO02.f27759h) {
                                                    try {
                                                        int iOrdinal = c9491gO02.f27764k.ordinal();
                                                        boolean z3 = true;
                                                        z2 = false;
                                                        c6693qeM18502p = null;
                                                        if (iOrdinal != 1) {
                                                            if (iOrdinal != 2) {
                                                                i32 = 0;
                                                                c6693qe3 = null;
                                                            }
                                                            th = c6693qe3;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (c9491gO02.f27767n == null && !c9491gO02.f27744Z) {
                                                            if (c9491gO02.f27762i0 == 3) {
                                                                c6693qe3 = c9491gO02.f27768o;
                                                                c9491gO02.f27768o = null;
                                                                c9491gO02.m18509x();
                                                                i32 = 4;
                                                                z2 = z3;
                                                                th = C9491gO0.f27713n0;
                                                            } else if (c9491gO02.f27724F != null) {
                                                                i32 = 0;
                                                                z2 = z3;
                                                                th = null;
                                                                c6693qeM18502p = c9491gO02.m18502p(c9491gO02.f27764k);
                                                                c6693qe3 = null;
                                                            }
                                                        }
                                                        i32 = 0;
                                                        c6693qe3 = null;
                                                        z2 = z3;
                                                        th = c6693qe3;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (c6693qeM18502p != null) {
                                                    c9491gO02.m18489F(c6693qeM18502p, z2);
                                                    return;
                                                } else {
                                                    if (c6693qe3 != null) {
                                                        c9491gO02.m18498i(c6693qe3, i32, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                C9491gO0 c9491gO03 = c9491gO0;
                                                Z61 z61 = c9491gO03.f27778y;
                                                if (z61 == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                c9491gO03.m18496g(z61, c9491gO03.f27779z, false);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                c9491gO0.m18485B(EnumC9363fO0.f27166b);
                            }
                            i = 0;
                            c6693qe = null;
                            iOException = null;
                            break;
                        } catch (IOException e) {
                            i = 5;
                            iOException = e;
                            c6693qe = null;
                            break;
                        }
                    case 1:
                    case 2:
                        c6693qe = c9491gO0.f27768o;
                        c6693qe.getClass();
                        i = 0;
                        iOException = null;
                        break;
                    case 4:
                    case 5:
                        c6693qe = c9491gO0.f27767n;
                        i = 0;
                        iOException = null;
                        break;
                    default:
                        i = 0;
                        c6693qe = null;
                        iOException = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6693qe != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i != 0) {
            Objects.toString(iOException);
            AbstractC7806Jm0.m4412f("Recorder");
            C6693qe c6693qe3 = new C6693qe(c0093bt, executorService, c1120Ro, z, j);
            c6693qe3.f41082f.set(false);
            c9491gO0.m18498i(c6693qe3, i, iOException);
            c9619hO0 = new C9619hO0(c9491gO0, j, c0093bt, true);
        } else {
            c9619hO0 = new C9619hO0(c9491gO0, j, c0093bt, false);
        }
        cameraSession$react_native_vision_camera_release.f6873r = c9619hO0;
    }
}
