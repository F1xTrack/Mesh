package ru.ok.tracer.heap.dumps;

import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumpConfiguration;", "Lru/ok/tracer/TracerConfiguration;", "builder", "Lru/ok/tracer/heap/dumps/HeapDumpConfiguration$Builder;", "(Lru/ok/tracer/heap/dumps/HeapDumpConfiguration$Builder;)V", "enabled", "", "getEnabled$tracer_heap_dumps_release", "()Z", "getFeature", "Lru/ok/tracer/TracerFeature;", "Builder", "Companion", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HeapDumpConfiguration implements TracerConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enabled;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumpConfiguration$Builder;", "", "()V", "enabled", "", "getEnabled$tracer_heap_dumps_release", "()Ljava/lang/Boolean;", "setEnabled$tracer_heap_dumps_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "build", "Lru/ok/tracer/heap/dumps/HeapDumpConfiguration;", "setEnabled", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private Boolean enabled;

        public final HeapDumpConfiguration build() {
            return new HeapDumpConfiguration(this, null);
        }

        /* renamed from: getEnabled$tracer_heap_dumps_release, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        public final Builder setEnabled(boolean enabled) {
            this.enabled = Boolean.valueOf(enabled);
            return this;
        }

        public final void setEnabled$tracer_heap_dumps_release(Boolean bool) {
            this.enabled = bool;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumpConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/heap/dumps/HeapDumpConfiguration$Builder;", "LTf1;", "block", "Lru/ok/tracer/heap/dumps/HeapDumpConfiguration;", LocalNotification.Visibility.PRIVATE, "(LnZ;)Lru/ok/tracer/heap/dumps/HeapDumpConfiguration;", "build", "get$tracer_heap_dumps_release", "()Lru/ok/tracer/heap/dumps/HeapDumpConfiguration;", "get", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HeapDumpConfiguration get$tracer_heap_dumps_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP());
            HeapDumpConfiguration heapDumpConfiguration = tracerConfiguration instanceof HeapDumpConfiguration ? (HeapDumpConfiguration) tracerConfiguration : null;
            return heapDumpConfiguration == null ? new Builder().build() : heapDumpConfiguration;
        }

        /* renamed from: private */
        public final HeapDumpConfiguration m101private(InterfaceC6099nZ interfaceC6099nZ) {
            O90.f(interfaceC6099nZ, "block");
            Builder builder = new Builder();
            interfaceC6099nZ.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeapDumpConfiguration(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* renamed from: getEnabled$tracer_heap_dumps_release, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP();
    }

    private HeapDumpConfiguration(Builder builder) {
        Boolean enabled = builder.getEnabled();
        this.enabled = enabled != null ? enabled.booleanValue() : true;
    }
}
