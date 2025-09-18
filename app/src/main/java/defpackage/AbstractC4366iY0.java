package defpackage;

import android.content.Context;
import android.location.Location;
import com.facebook.react.bridge.Callback;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: iY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4366iY0 {
    public static final void a(C4034gp c4034gp) throws C6526po {
        O90.f(c4034gp, "<this>");
        C0920Lo cameraSession$react_native_vision_camera_release = c4034gp.getCameraSession$react_native_vision_camera_release();
        O90.f(cameraSession$react_native_vision_camera_release, "<this>");
        C4145hO0 c4145hO0 = cameraSession$react_native_vision_camera_release.r;
        if (c4145hO0 == null) {
            throw new C6526po(27, false);
        }
        if (c4145hO0.a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        C3954gO0 c3954gO0 = c4145hO0.b;
        synchronized (c3954gO0.h) {
            try {
                if (!C3954gO0.o(c4145hO0, c3954gO0.o) && !C3954gO0.o(c4145hO0, c3954gO0.n)) {
                    Objects.toString(c4145hO0.d);
                    AbstractC0759Jm0.f("Recorder");
                    return;
                }
                int iOrdinal = c3954gO0.k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        c3954gO0.B(EnumC3763fO0.c);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            c3954gO0.B(EnumC3763fO0.f);
                            c3954gO0.d.execute(new XN0(c3954gO0, c3954gO0.n, 0));
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + c3954gO0.k);
            } finally {
            }
        }
    }

    public static final void b(C4034gp c4034gp) throws C6526po {
        O90.f(c4034gp, "<this>");
        C0920Lo cameraSession$react_native_vision_camera_release = c4034gp.getCameraSession$react_native_vision_camera_release();
        O90.f(cameraSession$react_native_vision_camera_release, "<this>");
        C4145hO0 c4145hO0 = cameraSession$react_native_vision_camera_release.r;
        if (c4145hO0 == null) {
            throw new C6526po(27, false);
        }
        if (c4145hO0.a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        C3954gO0 c3954gO0 = c4145hO0.b;
        synchronized (c3954gO0.h) {
            try {
                if (!C3954gO0.o(c4145hO0, c3954gO0.o) && !C3954gO0.o(c4145hO0, c3954gO0.n)) {
                    Objects.toString(c4145hO0.d);
                    AbstractC0759Jm0.f("Recorder");
                    return;
                }
                int iOrdinal = c3954gO0.k.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        c3954gO0.B(EnumC3763fO0.e);
                        c3954gO0.d.execute(new XN0(c3954gO0, c3954gO0.n, 1));
                    } else if (iOrdinal == 2) {
                        c3954gO0.B(EnumC3763fO0.b);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + c3954gO0.k);
            } finally {
            }
        }
    }

    public static final void c(C4034gp c4034gp, C1016Mu0 c1016Mu0, Callback callback) throws C5837mB0, C6526po {
        Location location;
        boolean z;
        long j;
        int i;
        IOException iOException;
        C6687qe c6687qe;
        C4145hO0 c4145hO0;
        O90.f(c4034gp, "<this>");
        O90.f(callback, "onRecordCallback");
        if (c4034gp.getAudio() && AbstractC3556eJ.a(c4034gp.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            throw new C6526po(24, false);
        }
        C7483up c7483up = new C7483up(0, callback);
        C7483up c7483up2 = new C7483up(1, callback);
        C0920Lo cameraSession$react_native_vision_camera_release = c4034gp.getCameraSession$react_native_vision_camera_release();
        boolean audio = c4034gp.getAudio();
        O90.f(cameraSession$react_native_vision_camera_release, "<this>");
        if (cameraSession$react_native_vision_camera_release.e == null) {
            throw new C6526po(2, false);
        }
        if (cameraSession$react_native_vision_camera_release.r != null) {
            throw new C5837mB0("capture", "recording-in-progress", "There is already an active video recording in progress! Did you call startRecording() twice?", null);
        }
        C1371Ri1 c1371Ri1 = cameraSession$react_native_vision_camera_release.h;
        if (c1371Ri1 == null) {
            throw new C5837mB0("capture", "video-not-enabled", "Video capture is disabled! Pass `video={true}` to enable video recordings.", null);
        }
        File file = ((C4065gz0) c1016Mu0.b).d;
        AbstractC3377dM1.h(file, "File can't be null.");
        Location location2 = cameraSession$react_native_vision_camera_release.l.c;
        if (location2 != null) {
            location2.getLatitude();
            location2.getLongitude();
            AbstractC3377dM1.d("Latitude must be in the range [-90, 90]", location2.getLatitude() >= -90.0d && location2.getLatitude() <= 90.0d);
            AbstractC3377dM1.d("Longitude must be in the range [-180, 180]", location2.getLongitude() >= -180.0d && location2.getLongitude() <= 180.0d);
            location = location2;
        } else {
            location = null;
        }
        BT bt = new BT(new C0653Id(0L, 0L, location, file));
        final C3954gO0 c3954gO0 = (C3954gO0) c1371Ri1.L();
        S91 s91 = cameraSession$react_native_vision_camera_release.a;
        O90.f(s91, "context");
        Context contextF = AbstractC3782fU1.f(s91);
        O90.e(contextF, "getApplicationContext(context)");
        if (!audio) {
            z = false;
        } else {
            if (AbstractC3556eJ.a(cameraSession$react_native_vision_camera_release.a, "android.permission.RECORD_AUDIO") != 0) {
                throw new C6526po(24, false);
            }
            if (AbstractC5486kL1.a(contextF, "android.permission.RECORD_AUDIO") == -1) {
                throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
            }
            AbstractC3377dM1.i(((C1978Zd) C3954gO0.k(c3954gO0.D)).b.e != 0, "The Recorder this recording is associated to doesn't support audio.");
            z = true;
        }
        cameraSession$react_native_vision_camera_release.s = false;
        ExecutorService executorService = AbstractC0608Ho.b;
        C1387Ro c1387Ro = new C1387Ro(cameraSession$react_native_vision_camera_release, c7483up2, c1016Mu0, c1371Ri1, c7483up);
        O90.f(executorService, "listenerExecutor");
        synchronized (c3954gO0.h) {
            try {
                j = c3954gO0.p + 1;
                c3954gO0.p = j;
                switch (c3954gO0.k.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        EnumC3763fO0 enumC3763fO0 = c3954gO0.k;
                        EnumC3763fO0 enumC3763fO02 = EnumC3763fO0.d;
                        if (enumC3763fO0 == enumC3763fO02) {
                            AbstractC3377dM1.i(c3954gO0.n == null && c3954gO0.o == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            C6687qe c6687qe2 = new C6687qe(bt, executorService, c1387Ro, z, j);
                            c6687qe2.f.set(false);
                            c6687qe2.e(contextF);
                            c3954gO0.o = c6687qe2;
                            EnumC3763fO0 enumC3763fO03 = c3954gO0.k;
                            if (enumC3763fO03 == enumC3763fO02) {
                                c3954gO0.B(EnumC3763fO0.b);
                                final int i2 = 0;
                                c3954gO0.d.execute(new Runnable() { // from class: UN0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z2;
                                        C6687qe c6687qeP;
                                        int i3;
                                        C6687qe c6687qe3;
                                        Throwable th;
                                        switch (i2) {
                                            case 0:
                                                C3954gO0 c3954gO02 = c3954gO0;
                                                synchronized (c3954gO02.h) {
                                                    try {
                                                        int iOrdinal = c3954gO02.k.ordinal();
                                                        boolean z3 = true;
                                                        z2 = false;
                                                        c6687qeP = null;
                                                        if (iOrdinal != 1) {
                                                            if (iOrdinal != 2) {
                                                                i3 = 0;
                                                                c6687qe3 = null;
                                                            }
                                                            th = c6687qe3;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (c3954gO02.n == null && !c3954gO02.Z) {
                                                            if (c3954gO02.i0 == 3) {
                                                                c6687qe3 = c3954gO02.o;
                                                                c3954gO02.o = null;
                                                                c3954gO02.x();
                                                                i3 = 4;
                                                                z2 = z3;
                                                                th = C3954gO0.n0;
                                                            } else if (c3954gO02.F != null) {
                                                                i3 = 0;
                                                                z2 = z3;
                                                                th = null;
                                                                c6687qeP = c3954gO02.p(c3954gO02.k);
                                                                c6687qe3 = null;
                                                            }
                                                        }
                                                        i3 = 0;
                                                        c6687qe3 = null;
                                                        z2 = z3;
                                                        th = c6687qe3;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (c6687qeP != null) {
                                                    c3954gO02.F(c6687qeP, z2);
                                                    return;
                                                } else {
                                                    if (c6687qe3 != null) {
                                                        c3954gO02.i(c6687qe3, i3, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                C3954gO0 c3954gO03 = c3954gO0;
                                                Z61 z61 = c3954gO03.y;
                                                if (z61 == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                c3954gO03.g(z61, c3954gO03.z, false);
                                                return;
                                        }
                                    }
                                });
                            } else if (enumC3763fO03 == EnumC3763fO0.i) {
                                c3954gO0.B(EnumC3763fO0.b);
                                final int i3 = 1;
                                c3954gO0.d.execute(new Runnable() { // from class: UN0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z2;
                                        C6687qe c6687qeP;
                                        int i32;
                                        C6687qe c6687qe3;
                                        Throwable th;
                                        switch (i3) {
                                            case 0:
                                                C3954gO0 c3954gO02 = c3954gO0;
                                                synchronized (c3954gO02.h) {
                                                    try {
                                                        int iOrdinal = c3954gO02.k.ordinal();
                                                        boolean z3 = true;
                                                        z2 = false;
                                                        c6687qeP = null;
                                                        if (iOrdinal != 1) {
                                                            if (iOrdinal != 2) {
                                                                i32 = 0;
                                                                c6687qe3 = null;
                                                            }
                                                            th = c6687qe3;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (c3954gO02.n == null && !c3954gO02.Z) {
                                                            if (c3954gO02.i0 == 3) {
                                                                c6687qe3 = c3954gO02.o;
                                                                c3954gO02.o = null;
                                                                c3954gO02.x();
                                                                i32 = 4;
                                                                z2 = z3;
                                                                th = C3954gO0.n0;
                                                            } else if (c3954gO02.F != null) {
                                                                i32 = 0;
                                                                z2 = z3;
                                                                th = null;
                                                                c6687qeP = c3954gO02.p(c3954gO02.k);
                                                                c6687qe3 = null;
                                                            }
                                                        }
                                                        i32 = 0;
                                                        c6687qe3 = null;
                                                        z2 = z3;
                                                        th = c6687qe3;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (c6687qeP != null) {
                                                    c3954gO02.F(c6687qeP, z2);
                                                    return;
                                                } else {
                                                    if (c6687qe3 != null) {
                                                        c3954gO02.i(c6687qe3, i32, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                C3954gO0 c3954gO03 = c3954gO0;
                                                Z61 z61 = c3954gO03.y;
                                                if (z61 == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                c3954gO03.g(z61, c3954gO03.z, false);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                c3954gO0.B(EnumC3763fO0.b);
                            }
                            i = 0;
                            c6687qe = null;
                            iOException = null;
                            break;
                        } catch (IOException e) {
                            i = 5;
                            iOException = e;
                            c6687qe = null;
                            break;
                        }
                    case 1:
                    case 2:
                        c6687qe = c3954gO0.o;
                        c6687qe.getClass();
                        i = 0;
                        iOException = null;
                        break;
                    case 4:
                    case 5:
                        c6687qe = c3954gO0.n;
                        i = 0;
                        iOException = null;
                        break;
                    default:
                        i = 0;
                        c6687qe = null;
                        iOException = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6687qe != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i != 0) {
            Objects.toString(iOException);
            AbstractC0759Jm0.f("Recorder");
            C6687qe c6687qe3 = new C6687qe(bt, executorService, c1387Ro, z, j);
            c6687qe3.f.set(false);
            c3954gO0.i(c6687qe3, i, iOException);
            c4145hO0 = new C4145hO0(c3954gO0, j, bt, true);
        } else {
            c4145hO0 = new C4145hO0(c3954gO0, j, bt, false);
        }
        cameraSession$react_native_vision_camera_release.r = c4145hO0;
    }
}
