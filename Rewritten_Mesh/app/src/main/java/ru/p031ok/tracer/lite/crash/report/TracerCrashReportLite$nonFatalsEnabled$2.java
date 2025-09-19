package ru.p031ok.tracer.lite.crash.report;

import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m22267d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerCrashReportLite$nonFatalsEnabled$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ TracerCrashReportLite this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerCrashReportLite$nonFatalsEnabled$2(TracerCrashReportLite tracerCrashReportLite) {
        super(0);
        this.this$0 = tracerCrashReportLite;
    }

    @Override // p000.InterfaceC6434mZ
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.configuration.getObfuscatedNonFatalsEnabled() || !ObfuscationUtils.isObfuscated() || ObfuscationUtils.hasTracer());
    }
}
