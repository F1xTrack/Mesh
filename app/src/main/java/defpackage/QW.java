package defpackage;

import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;

/* loaded from: classes2.dex */
public final class QW {
    public final synchronized Object get(String str) {
        String strSubstring;
        O90.f(str, "payload");
        if (!D51.o(str, "__expo_dynamic_extension__#", false)) {
            throw new C7143t2(26);
        }
        strSubstring = str.substring(27);
        O90.e(strSubstring, "substring(...)");
        return FollyDynamicExtensionConverter.b.remove(Integer.valueOf(Integer.parseInt(strSubstring)));
    }

    public final synchronized String put(Object obj) {
        int i;
        O90.f(obj, "any");
        i = FollyDynamicExtensionConverter.c;
        FollyDynamicExtensionConverter.c = i + 1;
        FollyDynamicExtensionConverter.b.put(Integer.valueOf(i), obj);
        return "__expo_dynamic_extension__#" + i;
    }
}
