package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC11153tN0;

/* loaded from: classes2.dex */
public final class ModuleEvent {

    /* renamed from: a */
    private final int f29501a;

    /* renamed from: b */
    private final String f29502b;

    /* renamed from: c */
    private final String f29503c;

    /* renamed from: d */
    private final int f29504d;

    /* renamed from: e */
    private final List f29505e;

    /* renamed from: f */
    private final List f29506f;

    /* renamed from: g */
    private final List f29507g;

    public static class Builder {

        /* renamed from: a */
        private final int f29508a;

        /* renamed from: b */
        private String f29509b;

        /* renamed from: c */
        private String f29510c;

        /* renamed from: d */
        private int f29511d;

        /* renamed from: e */
        private HashMap f29512e;

        /* renamed from: f */
        private HashMap f29513f;

        /* renamed from: g */
        private HashMap f29514g;

        public /* synthetic */ Builder(int i, int i2) {
            this(i);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f29514g = new HashMap(map);
            }
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f29512e = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f29513f = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f29509b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i) {
            this.f29511d = i;
            return this;
        }

        public Builder withValue(String str) {
            this.f29510c = str;
            return this;
        }

        private Builder(int i) {
            this.f29511d = 1;
            this.f29508a = i;
        }
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(int i) {
        return new Builder(i, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f29507g);
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f29505e);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f29506f);
    }

    public String getName() {
        return this.f29502b;
    }

    public int getServiceDataReporterType() {
        return this.f29504d;
    }

    public int getType() {
        return this.f29501a;
    }

    public String getValue() {
        return this.f29503c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ModuleEvent{type=");
        sb.append(this.f29501a);
        sb.append(", name='");
        sb.append(this.f29502b);
        sb.append("', value='");
        sb.append(this.f29503c);
        sb.append("', serviceDataReporterType=");
        sb.append(this.f29504d);
        sb.append(", environment=");
        sb.append(this.f29505e);
        sb.append(", extras=");
        sb.append(this.f29506f);
        sb.append(", attributes=");
        return AbstractC11153tN0.m24883A(sb, this.f29507g, '}');
    }

    private ModuleEvent(Builder builder) {
        this.f29501a = builder.f29508a;
        this.f29502b = builder.f29509b;
        this.f29503c = builder.f29510c;
        this.f29504d = builder.f29511d;
        this.f29505e = CollectionUtils.getListFromMap(builder.f29512e);
        this.f29506f = CollectionUtils.getListFromMap(builder.f29513f);
        this.f29507g = CollectionUtils.getListFromMap(builder.f29514g);
    }
}
