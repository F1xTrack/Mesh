package com.p019vk.push.core.remote.config.omicron;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Data {

    /* renamed from: a */
    public final Integer f20492a;

    /* renamed from: b */
    public final String f20493b;

    /* renamed from: c */
    public final HashMap f20494c;

    /* renamed from: d */
    public final Map f20495d;

    public static final class Builder {

        /* renamed from: a */
        public Integer f20496a;

        /* renamed from: b */
        public String f20497b;

        /* renamed from: c */
        public final HashMap f20498c = new HashMap();

        /* renamed from: d */
        public Map f20499d;

        public Data build() {
            return new Data(this);
        }

        public Builder condition(String str) {
            this.f20497b = str;
            return this;
        }

        public Builder pair(String str, Object obj) {
            if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
                this.f20498c.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("Value of type " + obj.getClass() + " not supported");
        }

        public Builder segments(Map<String, String> map) {
            this.f20499d = map;
            return this;
        }

        public Builder version(Integer num) {
            this.f20496a = num;
            return this;
        }
    }

    public Data(Builder builder) {
        this.f20492a = builder.f20496a;
        this.f20493b = builder.f20497b;
        this.f20494c = builder.f20498c;
        this.f20495d = builder.f20499d;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<String, Object> getAll() {
        return Collections.unmodifiableMap(this.f20494c);
    }

    @Deprecated
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public Boolean getBooleanOrNull(String str) {
        Object obj = this.f20494c.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public String getCondition() {
        return this.f20493b;
    }

    @Deprecated
    public double getDouble(String str) {
        return getDouble(str, ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    public Double getDoubleOrNull(String str) {
        Object obj = this.f20494c.get(str);
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        return null;
    }

    @Deprecated
    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public Float getFloatOrNull(String str) {
        Object obj = this.f20494c.get(str);
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        return null;
    }

    @Deprecated
    public int getInt(String str) {
        return getInt(str, 0);
    }

    public Integer getIntOrNull(String str) {
        Object obj = this.f20494c.get(str);
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        return null;
    }

    @Deprecated
    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public Long getLongOrNull(String str) {
        Object obj = this.f20494c.get(str);
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        return null;
    }

    public Map<String, String> getSegments() {
        Map map = this.f20495d;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public Integer getVersion() {
        return this.f20492a;
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.f20494c.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public double getDouble(String str, double d) {
        Object obj = this.f20494c.get(str);
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    public float getFloat(String str, float f) {
        Object obj = this.f20494c.get(str);
        return obj instanceof Number ? ((Number) obj).floatValue() : f;
    }

    public int getInt(String str, int i) {
        Object obj = this.f20494c.get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public long getLong(String str, long j) {
        Object obj = this.f20494c.get(str);
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    public String getString(String str, String str2) {
        Object obj = this.f20494c.get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
