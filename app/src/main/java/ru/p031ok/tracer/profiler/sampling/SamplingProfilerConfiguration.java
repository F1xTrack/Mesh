package ru.p031ok.tracer.profiler.sampling;

import com.huawei.hms.p015rn.push.constants.LocalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.InterfaceC6497nZ;
import p000.O90;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.TracerConfiguration;
import ru.p031ok.tracer.TracerFeature;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0013"}, m22267d2 = {"Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration;", "Lru/ok/tracer/TracerConfiguration;", "builder", "Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration$Builder;", "(Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration$Builder;)V", "bufferSizeMb", "", "getBufferSizeMb", "()I", "enabled", "", "getEnabled", "()Z", "samplingIntervalUs", "getSamplingIntervalUs", "getFeature", "Lru/ok/tracer/TracerFeature;", "Builder", "Companion", "tracer-profiler-sampling_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SamplingProfilerConfiguration implements TracerConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int bufferSizeMb;
    private final boolean enabled;
    private final int samplingIntervalUs;

    @Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0019"}, m22267d2 = {"Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration$Builder;", "", "()V", "bufferSizeMb", "", "getBufferSizeMb$tracer_profiler_sampling_release", "()Ljava/lang/Integer;", "setBufferSizeMb$tracer_profiler_sampling_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "enabled", "", "getEnabled$tracer_profiler_sampling_release", "()Ljava/lang/Boolean;", "setEnabled$tracer_profiler_sampling_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "samplingIntervalUs", "getSamplingIntervalUs$tracer_profiler_sampling_release", "setSamplingIntervalUs$tracer_profiler_sampling_release", "build", "Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration;", "setBufferSizeMb", "setEnabled", "setSamplingIntervalUs", "tracer-profiler-sampling_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {
        private Integer bufferSizeMb;
        private Boolean enabled;
        private Integer samplingIntervalUs;

        public final SamplingProfilerConfiguration build() {
            return new SamplingProfilerConfiguration(this, null);
        }

        /* renamed from: getBufferSizeMb$tracer_profiler_sampling_release, reason: from getter */
        public final Integer getBufferSizeMb() {
            return this.bufferSizeMb;
        }

        /* renamed from: getEnabled$tracer_profiler_sampling_release, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: getSamplingIntervalUs$tracer_profiler_sampling_release, reason: from getter */
        public final Integer getSamplingIntervalUs() {
            return this.samplingIntervalUs;
        }

        public final Builder setBufferSizeMb(int bufferSizeMb) {
            this.bufferSizeMb = Integer.valueOf(bufferSizeMb);
            return this;
        }

        public final void setBufferSizeMb$tracer_profiler_sampling_release(Integer num) {
            this.bufferSizeMb = num;
        }

        public final Builder setEnabled(boolean enabled) {
            this.enabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setEnabled$tracer_profiler_sampling_release(Boolean bool) {
            this.enabled = bool;
        }

        public final Builder setSamplingIntervalUs(int samplingIntervalUs) {
            this.samplingIntervalUs = Integer.valueOf(samplingIntervalUs);
            return this;
        }

        public final void setSamplingIntervalUs$tracer_profiler_sampling_release(Integer num) {
            this.samplingIntervalUs = num;
        }
    }

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m22267d2 = {"Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration$Builder;", "LTf1;", "block", "Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration;", LocalNotification.Visibility.PRIVATE, "(LnZ;)Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration;", "build", "get$tracer_profiler_sampling_release", "()Lru/ok/tracer/profiler/sampling/SamplingProfilerConfiguration;", "get", "tracer-profiler-sampling_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SamplingProfilerConfiguration get$tracer_profiler_sampling_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE());
            SamplingProfilerConfiguration samplingProfilerConfiguration = tracerConfiguration instanceof SamplingProfilerConfiguration ? (SamplingProfilerConfiguration) tracerConfiguration : null;
            return samplingProfilerConfiguration == null ? new Builder().build() : samplingProfilerConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final SamplingProfilerConfiguration m26696private(InterfaceC6497nZ block) {
            O90.m5968f(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SamplingProfilerConfiguration(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final int getBufferSizeMb() {
        return this.bufferSizeMb;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // ru.p031ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE();
    }

    public final int getSamplingIntervalUs() {
        return this.samplingIntervalUs;
    }

    private SamplingProfilerConfiguration(Builder builder) {
        Boolean enabled = builder.getEnabled();
        this.enabled = enabled != null ? enabled.booleanValue() : true;
        Integer bufferSizeMb = builder.getBufferSizeMb();
        this.bufferSizeMb = bufferSizeMb != null ? bufferSizeMb.intValue() : 0;
        Integer samplingIntervalUs = builder.getSamplingIntervalUs();
        this.samplingIntervalUs = samplingIntervalUs != null ? samplingIntervalUs.intValue() : 5000;
    }
}
