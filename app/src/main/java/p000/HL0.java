package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HL0 {

    /* renamed from: b */
    public static final HL0 f4233b;

    /* renamed from: a */
    public JSONObject f4234a;

    static {
        HL0 hl0 = new HL0();
        try {
            hl0.f4234a = new JSONObject("{\"crashlytics_auto_collection_enabled\":true,\"crashlytics_debug_enabled\":true,\"crashlytics_ndk_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":true}");
        } catch (JSONException unused) {
        }
        f4233b = hl0;
    }
}
