package p000;

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

    /* renamed from: a */
    public final SessionConfiguration f239a;

    /* renamed from: b */
    public final List f240b;

    public AY0(int i, ArrayList arrayList, ExecutorC10151lY0 executorC10151lY0, C0239Dn c0239Dn) {
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, DY0.m1725a(arrayList), executorC10151lY0, c0239Dn);
        this.f239a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            C8506Wy0 c8506Wy0 = null;
            if (outputConfiguration != null) {
                int i2 = Build.VERSION.SDK_INT;
                C8610Yy0 c9181dz0 = i2 >= 33 ? new C9181dz0(outputConfiguration) : i2 >= 28 ? new C9053cz0(new C8920bz0(outputConfiguration)) : i2 >= 26 ? new C8792az0(new C8662Zy0(outputConfiguration)) : i2 >= 24 ? new C8610Yy0(new C8558Xy0(outputConfiguration)) : null;
                if (c9181dz0 != null) {
                    c8506Wy0 = new C8506Wy0(c9181dz0);
                }
            }
            arrayList2.add(c8506Wy0);
        }
        this.f240b = Collections.unmodifiableList(arrayList2);
    }

    @Override // p000.CY0
    /* renamed from: a */
    public final Object mo220a() {
        return this.f239a;
    }

    @Override // p000.CY0
    /* renamed from: b */
    public final C11887z80 mo221b() {
        return C11887z80.m26311a(this.f239a.getInputConfiguration());
    }

    @Override // p000.CY0
    /* renamed from: c */
    public final Executor mo222c() {
        return this.f239a.getExecutor();
    }

    @Override // p000.CY0
    /* renamed from: d */
    public final int mo223d() {
        return this.f239a.getSessionType();
    }

    @Override // p000.CY0
    /* renamed from: e */
    public final CameraCaptureSession.StateCallback mo224e() {
        return this.f239a.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AY0) {
            return Objects.equals(this.f239a, ((AY0) obj).f239a);
        }
        return false;
    }

    @Override // p000.CY0
    /* renamed from: f */
    public final List mo225f() {
        return this.f240b;
    }

    @Override // p000.CY0
    /* renamed from: g */
    public final void mo226g(CaptureRequest captureRequest) {
        this.f239a.setSessionParameters(captureRequest);
    }

    @Override // p000.CY0
    /* renamed from: h */
    public final void mo227h(C11887z80 c11887z80) {
        this.f239a.setInputConfiguration(c11887z80.f46643a.f45419a);
    }

    public final int hashCode() {
        return this.f239a.hashCode();
    }
}
