package ru.p031ok.tracer.disk.usage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0576J8;
import p000.C0779MN;
import p000.InterfaceC6497nZ;
import p000.O90;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.TracerConfiguration;
import ru.p031ok.tracer.TracerFeature;

@Metadata(m22266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, m22267d2 = {"Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "Lru/ok/tracer/TracerConfiguration;", "builder", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration$Builder;", "(Lru/ok/tracer/disk/usage/DiskUsageConfiguration$Builder;)V", "enabled", "", "getEnabled", "()Z", "excludedPaths", "", "", "getExcludedPaths", "()Ljava/util/List;", "interestingSizeBytes", "", "getInterestingSizeBytes", "()J", "probability", "getProbability", "getFeature", "Lru/ok/tracer/TracerFeature;", "Builder", "Companion", "tracer-disk-usage_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DiskUsageConfiguration implements TracerConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enabled;
    private final List<String> excludedPaths;
    private final long interestingSizeBytes;
    private final long probability;

    @Metadata(m22266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u001f\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0 \"\u00020\f¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0012J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006%"}, m22267d2 = {"Lru/ok/tracer/disk/usage/DiskUsageConfiguration$Builder;", "", "()V", "enabled", "", "getEnabled$tracer_disk_usage_release", "()Ljava/lang/Boolean;", "setEnabled$tracer_disk_usage_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "excludedPaths", "", "", "getExcludedPaths$tracer_disk_usage_release", "()Ljava/util/List;", "setExcludedPaths$tracer_disk_usage_release", "(Ljava/util/List;)V", "interestingSizeBytes", "", "getInterestingSizeBytes$tracer_disk_usage_release", "()Ljava/lang/Long;", "setInterestingSizeBytes$tracer_disk_usage_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "probability", "getProbability$tracer_disk_usage_release", "setProbability$tracer_disk_usage_release", "build", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "setEnabled", "setExcludePath", "paths", "", "([Ljava/lang/String;)Lru/ok/tracer/disk/usage/DiskUsageConfiguration$Builder;", "setInterestingSize", "sizeBytes", "setProbability", "tracer-disk-usage_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {
        private Boolean enabled;
        private List<String> excludedPaths;
        private Long interestingSizeBytes;
        private Long probability;

        public final DiskUsageConfiguration build() {
            return new DiskUsageConfiguration(this, null);
        }

        /* renamed from: getEnabled$tracer_disk_usage_release, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        public final List<String> getExcludedPaths$tracer_disk_usage_release() {
            return this.excludedPaths;
        }

        /* renamed from: getInterestingSizeBytes$tracer_disk_usage_release, reason: from getter */
        public final Long getInterestingSizeBytes() {
            return this.interestingSizeBytes;
        }

        /* renamed from: getProbability$tracer_disk_usage_release, reason: from getter */
        public final Long getProbability() {
            return this.probability;
        }

        public final Builder setEnabled(boolean enabled) {
            this.enabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setEnabled$tracer_disk_usage_release(Boolean bool) {
            this.enabled = bool;
        }

        public final Builder setExcludePath(String... paths) {
            O90.m5968f(paths, "paths");
            this.excludedPaths = AbstractC0576J8.m4176c(paths);
            return this;
        }

        public final void setExcludedPaths$tracer_disk_usage_release(List<String> list) {
            this.excludedPaths = list;
        }

        public final Builder setInterestingSize(long sizeBytes) {
            this.interestingSizeBytes = Long.valueOf(sizeBytes);
            return this;
        }

        public final void setInterestingSizeBytes$tracer_disk_usage_release(Long l) {
            this.interestingSizeBytes = l;
        }

        public final Builder setProbability(long probability) {
            this.probability = Long.valueOf(probability);
            return this;
        }

        public final void setProbability$tracer_disk_usage_release(Long l) {
            this.probability = l;
        }
    }

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m22267d2 = {"Lru/ok/tracer/disk/usage/DiskUsageConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration$Builder;", "LTf1;", "block", "Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", LocalNotification.Visibility.PRIVATE, "(LnZ;)Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "build", "get$tracer_disk_usage_release", "()Lru/ok/tracer/disk/usage/DiskUsageConfiguration;", "get", "tracer-disk-usage_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DiskUsageConfiguration get$tracer_disk_usage_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_DISK_USAGEKt.getFEATURE_DISK_USAGE());
            DiskUsageConfiguration diskUsageConfiguration = tracerConfiguration instanceof DiskUsageConfiguration ? (DiskUsageConfiguration) tracerConfiguration : null;
            return diskUsageConfiguration == null ? new Builder().build() : diskUsageConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final DiskUsageConfiguration m26694private(InterfaceC6497nZ block) {
            O90.m5968f(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DiskUsageConfiguration(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getExcludedPaths() {
        return this.excludedPaths;
    }

    @Override // ru.p031ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_DISK_USAGEKt.getFEATURE_DISK_USAGE();
    }

    public final long getInterestingSizeBytes() {
        return this.interestingSizeBytes;
    }

    public final long getProbability() {
        return this.probability;
    }

    private DiskUsageConfiguration(Builder builder) {
        Boolean enabled = builder.getEnabled();
        this.enabled = enabled != null ? enabled.booleanValue() : true;
        Long probability = builder.getProbability();
        this.probability = probability != null ? probability.longValue() : 0L;
        Long interestingSizeBytes = builder.getInterestingSizeBytes();
        this.interestingSizeBytes = interestingSizeBytes != null ? interestingSizeBytes.longValue() : 10737418240L;
        List<String> excludedPaths$tracer_disk_usage_release = builder.getExcludedPaths$tracer_disk_usage_release();
        this.excludedPaths = excludedPaths$tracer_disk_usage_release == null ? C0779MN.f7117a : excludedPaths$tracer_disk_usage_release;
    }
}
