package p000;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.Task;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class HL1 {

    /* renamed from: d */
    public static HL1 f4235d;

    /* renamed from: e */
    public static final Duration f4236e = Duration.ofMinutes(30);

    /* renamed from: a */
    public final C9110dP1 f4237a;

    /* renamed from: b */
    public final TelemetryLoggingClient f4238b;

    /* renamed from: c */
    public final AtomicLong f4239c = new AtomicLong(-1);

    public HL1(Context context, C9110dP1 c9110dP1) {
        this.f4238b = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.f4237a = c9110dP1;
    }

    /* renamed from: a */
    public static HL1 m3357a(C9110dP1 c9110dP1) {
        if (f4235d == null) {
            f4235d = new HL1(c9110dP1.f26031a, c9110dP1);
        }
        return f4235d;
    }

    /* renamed from: b */
    public final synchronized void m3358b(int i, int i2, long j, long j2) {
        long jElapsedRealtime = this.f4237a.f26044n.elapsedRealtime();
        if (this.f4239c.get() != -1 && jElapsedRealtime - this.f4239c.get() <= f4236e.toMillis()) {
            return;
        }
        Task taskLog = this.f4238b.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2))));
        C0495Hr c0495Hr = new C0495Hr(7);
        c0495Hr.f4554c = this;
        c0495Hr.f4553b = jElapsedRealtime;
        taskLog.mo11136c(c0495Hr);
    }
}
