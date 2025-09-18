package defpackage;

import android.os.Build;
import java.util.HashSet;

/* renamed from: Mm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0993Mm1 {
    /* JADX INFO: Fake field, exist only in values array */
    VISUAL_STATE_CALLBACK(0, 23, "VISUAL_STATE_CALLBACK"),
    /* JADX INFO: Fake field, exist only in values array */
    OFF_SCREEN_PRERASTER(1, 23, "OFF_SCREEN_PRERASTER"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ENABLE(2, 26, "SAFE_BROWSING_ENABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED_ACTION_MODE_MENU_ITEMS(3, 24, "DISABLED_ACTION_MODE_MENU_ITEMS"),
    /* JADX INFO: Fake field, exist only in values array */
    START_SAFE_BROWSING(4, 27, "START_SAFE_BROWSING"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED(5, 27, "SAFE_BROWSING_WHITELIST"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED(6, 27, "SAFE_BROWSING_ALLOWLIST"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED(7, 27, "SAFE_BROWSING_WHITELIST"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED(8, 27, "SAFE_BROWSING_ALLOWLIST"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_PRIVACY_POLICY_URL(9, 27, "SAFE_BROWSING_PRIVACY_POLICY_URL"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_BASIC_USAGE(10, 24, "SERVICE_WORKER_BASIC_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_CACHE_MODE(11, 24, "SERVICE_WORKER_CACHE_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_CONTENT_ACCESS(12, 24, "SERVICE_WORKER_CONTENT_ACCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_FILE_ACCESS(13, 24, "SERVICE_WORKER_FILE_ACCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_BLOCK_NETWORK_LOADS(14, 24, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST(15, 24, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    RECEIVE_WEB_RESOURCE_ERROR(16, 23, "RECEIVE_WEB_RESOURCE_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    RECEIVE_HTTP_ERROR(17, 23, "RECEIVE_HTTP_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    SHOULD_OVERRIDE_WITH_REDIRECTS(18, 24, "SHOULD_OVERRIDE_WITH_REDIRECTS"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_HIT(19, 27, "SAFE_BROWSING_HIT"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_RESOURCE_REQUEST_IS_REDIRECT(20, 24, "WEB_RESOURCE_REQUEST_IS_REDIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_RESOURCE_ERROR_GET_DESCRIPTION(21, 23, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_RESOURCE_ERROR_GET_CODE(22, 23, "WEB_RESOURCE_ERROR_GET_CODE"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY(23, 27, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_RESPONSE_PROCEED(24, 27, "SAFE_BROWSING_RESPONSE_PROCEED"),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL(25, 27, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_PORT_POST_MESSAGE(26, 23, "WEB_MESSAGE_PORT_POST_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_PORT_CLOSE(27, 23, "WEB_MESSAGE_PORT_CLOSE"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK(28, 23, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_WEB_MESSAGE_CHANNEL(29, 23, "CREATE_WEB_MESSAGE_CHANNEL"),
    /* JADX INFO: Fake field, exist only in values array */
    POST_WEB_MESSAGE(30, 23, "POST_WEB_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_CALLBACK_ON_MESSAGE(31, 23, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_WEB_VIEW_CLIENT(32, 26, "GET_WEB_VIEW_CLIENT"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_WEB_CHROME_CLIENT(33, 26, "GET_WEB_CHROME_CLIENT"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_WEB_VIEW_RENDERER(34, 29, "GET_WEB_VIEW_RENDERER"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_RENDERER_TERMINATE(35, 29, "WEB_VIEW_RENDERER_TERMINATE"),
    /* JADX INFO: Fake field, exist only in values array */
    TRACING_CONTROLLER_BASIC_USAGE(36, 28, "TRACING_CONTROLLER_BASIC_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE(37, 29, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY_OVERRIDE(38, -1, "PROXY_OVERRIDE:3"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPRESS_ERROR_PAGE(39, -1, "SUPPRESS_ERROR_PAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_PROCESS(40, -1, "MULTI_PROCESS_QUERY"),
    FORCE_DARK(41, -1, "FORCE_DARK"),
    FORCE_DARK_STRATEGY(42, -1, "FORCE_DARK_BEHAVIOR"),
    WEB_MESSAGE_LISTENER(43, -1, "WEB_MESSAGE_LISTENER"),
    /* JADX INFO: Fake field, exist only in values array */
    DOCUMENT_START_SCRIPT(44, -1, "DOCUMENT_START_SCRIPT:1");

    public final String a;
    public final String b;
    public final int c;

    EnumC0993Mm1(int i, int i2, String str) {
        this.a = str;
        this.b = str;
        this.c = i2;
    }

    public final boolean a() {
        HashSet hashSet = AbstractC0916Lm1.a;
        String str = this.b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
