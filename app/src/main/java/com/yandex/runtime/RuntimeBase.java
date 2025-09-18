package com.yandex.runtime;

import java.util.Map;

/* loaded from: classes2.dex */
public class RuntimeBase {
    public static native String getVersion();

    public static native void setPreinitializationOptions(Map<String, String> map);
}
