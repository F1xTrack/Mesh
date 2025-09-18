package p000;

import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;

/* renamed from: QW */
/* loaded from: classes2.dex */
public final class C1040QW {
    public final synchronized Object get(String str) {
        String strSubstring;
        O90.m5968f(str, "payload");
        if (!D51.m1556o(str, "__expo_dynamic_extension__#", false)) {
            throw new C6861t2(26);
        }
        strSubstring = str.substring(27);
        O90.m5967e(strSubstring, "substring(...)");
        return FollyDynamicExtensionConverter.f26966b.remove(Integer.valueOf(Integer.parseInt(strSubstring)));
    }

    public final synchronized String put(Object obj) {
        int i;
        O90.m5968f(obj, "any");
        i = FollyDynamicExtensionConverter.f26967c;
        FollyDynamicExtensionConverter.f26967c = i + 1;
        FollyDynamicExtensionConverter.f26966b.put(Integer.valueOf(i), obj);
        return "__expo_dynamic_extension__#" + i;
    }
}
