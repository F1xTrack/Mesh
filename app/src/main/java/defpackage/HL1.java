package defpackage;

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
    public static HL1 d;
    public static final Duration e = Duration.ofMinutes(30);
    public final C3386dP1 a;
    public final TelemetryLoggingClient b;
    public final AtomicLong c = new AtomicLong(-1);

    public HL1(Context context, C3386dP1 c3386dP1) {
        this.b = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.a = c3386dP1;
    }

    public static HL1 a(C3386dP1 c3386dP1) {
        if (d == null) {
            d = new HL1(c3386dP1.a, c3386dP1);
        }
        return d;
    }

    public final synchronized void b(int i, int i2, long j, long j2) {
        long jElapsedRealtime = this.a.n.elapsedRealtime();
        if (this.c.get() != -1 && jElapsedRealtime - this.c.get() <= e.toMillis()) {
            return;
        }
        Task taskLog = this.b.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2))));
        C0617Hr c0617Hr = new C0617Hr(7);
        c0617Hr.c = this;
        c0617Hr.b = jElapsedRealtime;
        taskLog.c(c0617Hr);
    }
}
