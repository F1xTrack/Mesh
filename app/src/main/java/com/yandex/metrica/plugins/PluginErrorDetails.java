package com.yandex.metrica.plugins;

import com.yandex.metrica.impl.p022ob.C2968U2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PluginErrorDetails {

    /* renamed from: a */
    public final String f25482a;

    /* renamed from: b */
    public final String f25483b;

    /* renamed from: c */
    public final ArrayList f25484c;

    /* renamed from: d */
    public final String f25485d;

    /* renamed from: e */
    public final String f25486e;

    /* renamed from: f */
    public final Map f25487f;

    public static class Builder {

        /* renamed from: a */
        public String f25488a;

        /* renamed from: b */
        public String f25489b;

        /* renamed from: c */
        public List f25490c;

        /* renamed from: d */
        public String f25491d;

        /* renamed from: e */
        public String f25492e;

        /* renamed from: f */
        public Map f25493f;

        public PluginErrorDetails build() {
            String str = this.f25488a;
            String str2 = this.f25489b;
            List list = this.f25490c;
            List arrayList = new ArrayList();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f25491d;
            String str4 = this.f25492e;
            Map map = this.f25493f;
            Map map2 = new HashMap();
            if (map != null) {
                map2 = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, map2);
        }

        public Builder withExceptionClass(String str) {
            this.f25488a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f25489b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f25491d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f25493f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f25490c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f25492e = str;
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

    public PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f25482a = str;
        this.f25483b = str2;
        this.f25484c = new ArrayList(list);
        this.f25485d = str3;
        this.f25486e = str4;
        this.f25487f = C2968U2.m15237a(C2968U2.m15235a(map));
    }

    public String getExceptionClass() {
        return this.f25482a;
    }

    public String getMessage() {
        return this.f25483b;
    }

    public String getPlatform() {
        return this.f25485d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f25487f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f25484c;
    }

    public String getVirtualMachineVersion() {
        return this.f25486e;
    }
}
