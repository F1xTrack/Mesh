package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class KQ0 {
    /* renamed from: a */
    public static void m4634a(MQ0 mq0, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(MQ0.m5362a(mq0), intent, map);
    }

    /* renamed from: b */
    public static Set<String> m4635b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    /* renamed from: c */
    public static Map<String, Uri> m4636c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    /* renamed from: d */
    public static RemoteInput.Builder m4637d(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
