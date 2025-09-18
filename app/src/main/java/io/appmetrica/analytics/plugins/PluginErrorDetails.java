package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PluginErrorDetails {

    /* renamed from: a */
    private final String f33150a;

    /* renamed from: b */
    private final String f33151b;

    /* renamed from: c */
    private final ArrayList f33152c;

    /* renamed from: d */
    private final String f33153d;

    /* renamed from: e */
    private final String f33154e;

    /* renamed from: f */
    private final Map f33155f;

    public static class Builder {

        /* renamed from: a */
        private String f33156a;

        /* renamed from: b */
        private String f33157b;

        /* renamed from: c */
        private List f33158c;

        /* renamed from: d */
        private String f33159d;

        /* renamed from: e */
        private String f33160e;

        /* renamed from: f */
        private Map f33161f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f33156a, this.f33157b, (List) WrapUtils.getOrDefault(this.f33158c, new ArrayList()), this.f33159d, this.f33160e, (Map) WrapUtils.getOrDefault(this.f33161f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f33156a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f33157b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f33159d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f33161f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f33158c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f33160e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f33150a;
    }

    public String getMessage() {
        return this.f33151b;
    }

    public String getPlatform() {
        return this.f33153d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f33155f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f33152c;
    }

    public String getVirtualMachineVersion() {
        return this.f33154e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f33150a = str;
        this.f33151b = str2;
        this.f33152c = new ArrayList(list);
        this.f33153d = str3;
        this.f33154e = str4;
        this.f33155f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
