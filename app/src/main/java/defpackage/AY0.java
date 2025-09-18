package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AY0 implements CY0 {
    public final SessionConfiguration a;
    public final List b;

    public AY0(int i, ArrayList arrayList, ExecutorC5715lY0 executorC5715lY0, C0293Dn c0293Dn) {
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, DY0.a(arrayList), executorC5715lY0, c0293Dn);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            C1808Wy0 c1808Wy0 = null;
            if (outputConfiguration != null) {
                int i2 = Build.VERSION.SDK_INT;
                C1964Yy0 c3492dz0 = i2 >= 33 ? new C3492dz0(outputConfiguration) : i2 >= 28 ? new C3302cz0(new C2426bz0(outputConfiguration)) : i2 >= 26 ? new C2236az0(new C2042Zy0(outputConfiguration)) : i2 >= 24 ? new C1964Yy0(new C1886Xy0(outputConfiguration)) : null;
                if (c3492dz0 != null) {
                    c1808Wy0 = new C1808Wy0(c3492dz0);
                }
            }
            arrayList2.add(c1808Wy0);
        }
        this.b = Collections.unmodifiableList(arrayList2);
    }

    @Override // defpackage.CY0
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.CY0
    public final C8306z80 b() {
        return C8306z80.a(this.a.getInputConfiguration());
    }

    @Override // defpackage.CY0
    public final Executor c() {
        return this.a.getExecutor();
    }

    @Override // defpackage.CY0
    public final int d() {
        return this.a.getSessionType();
    }

    @Override // defpackage.CY0
    public final CameraCaptureSession.StateCallback e() {
        return this.a.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AY0) {
            return Objects.equals(this.a, ((AY0) obj).a);
        }
        return false;
    }

    @Override // defpackage.CY0
    public final List f() {
        return this.b;
    }

    @Override // defpackage.CY0
    public final void g(CaptureRequest captureRequest) {
        this.a.setSessionParameters(captureRequest);
    }

    @Override // defpackage.CY0
    public final void h(C8306z80 c8306z80) {
        this.a.setInputConfiguration(c8306z80.a.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
