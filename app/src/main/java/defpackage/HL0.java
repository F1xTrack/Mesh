package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HL0 {
    public static final HL0 b;
    public JSONObject a;

    static {
        HL0 hl0 = new HL0();
        try {
            hl0.a = new JSONObject("{\"crashlytics_auto_collection_enabled\":true,\"crashlytics_debug_enabled\":true,\"crashlytics_ndk_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":true}");
        } catch (JSONException unused) {
        }
        b = hl0;
    }
}
