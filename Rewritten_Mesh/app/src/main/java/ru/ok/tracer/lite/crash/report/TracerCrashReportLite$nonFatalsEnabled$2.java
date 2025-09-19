package ru.ok.tracer.lite.crash.report;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerCrashReportLite$nonFatalsEnabled$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    final /* synthetic */ TracerCrashReportLite this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerCrashReportLite$nonFatalsEnabled$2(TracerCrashReportLite tracerCrashReportLite) {
        super(0);
        this.this$0 = tracerCrashReportLite;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.configuration.getObfuscatedNonFatalsEnabled() || !ObfuscationUtils.isObfuscated() || ObfuscationUtils.hasTracer());
    }
}
