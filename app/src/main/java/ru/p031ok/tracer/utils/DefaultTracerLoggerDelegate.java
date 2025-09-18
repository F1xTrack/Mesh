package ru.p031ok.tracer.utils;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;
import ru.p031ok.tracer.base.stacktrace.ThrowableUtils;
import ru.p031ok.tracer.utils.TracerLoggerDelegate;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m22267d2 = {"Lru/ok/tracer/utils/DefaultTracerLoggerDelegate;", "Lru/ok/tracer/utils/TracerLoggerDelegate;", "", "minLogPriority", "<init>", "(I)V", "priority", "", "msg", "", "tr", "LTf1;", "println", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "I", "getMinLogPriority", "()I", "Companion", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DefaultTracerLoggerDelegate implements TracerLoggerDelegate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ru.ok.tracer";
    private final /* synthetic */ Companion $$delegate_0;
    private final int minLogPriority;

    @Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lru/ok/tracer/utils/DefaultTracerLoggerDelegate$Companion;", "Lru/ok/tracer/utils/TracerLoggerDelegate;", "<init>", "()V", "", "priority", "", "msg", "", "tr", "LTf1;", "println", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "TAG", "Ljava/lang/String;", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion implements TracerLoggerDelegate {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ru.p031ok.tracer.utils.TracerLoggerDelegate
        public int getMinLogPriority() {
            return TracerLoggerDelegate.DefaultImpls.getMinLogPriority(this);
        }

        @Override // ru.p031ok.tracer.utils.TracerLoggerDelegate
        public void println(int priority, String msg, Throwable tr) throws IOException {
            if (msg == null) {
                if (tr == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                ThrowableUtils.appendStackTraceTo(tr, sb);
                O90.m5967e(sb.toString(), "StringBuilder().apply(builderAction).toString()");
                return;
            }
            if (tr == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(msg);
            sb2.append('\n');
            ThrowableUtils.appendStackTraceTo(tr, sb2);
            O90.m5967e(sb2.toString(), "StringBuilder().apply(builderAction).toString()");
        }

        private Companion() {
        }
    }

    public DefaultTracerLoggerDelegate() {
        this(0, 1, null);
    }

    @Override // ru.p031ok.tracer.utils.TracerLoggerDelegate
    public int getMinLogPriority() {
        return this.minLogPriority;
    }

    @Override // ru.p031ok.tracer.utils.TracerLoggerDelegate
    public void println(int priority, String msg, Throwable tr) throws IOException {
        this.$$delegate_0.println(priority, msg, tr);
    }

    public DefaultTracerLoggerDelegate(int i) {
        this.minLogPriority = i;
        this.$$delegate_0 = INSTANCE;
    }

    public /* synthetic */ DefaultTracerLoggerDelegate(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
