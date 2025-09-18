package io.invertase.firebase.messaging;

import android.content.Intent;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONObject;
import p000.EO1;
import p000.HL0;
import p000.M20;
import p000.OQ0;
import p000.Q20;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends Q20 {
    @Override // p000.Q20
    public final M20 getTaskConfig(Intent intent) throws NumberFormatException {
        if (intent.getExtras() == null) {
            return null;
        }
        WritableMap writableMapM2210f = EO1.m2210f((OQ0) intent.getParcelableExtra("message"));
        JSONObject jSONObject = HL0.f4233b.f4234a;
        return new M20("ReactNativeFirebaseMessagingHeadlessTask", writableMapM2210f, jSONObject != null ? jSONObject.optLong("messaging_android_headless_task_timeout", 60000L) : 60000L);
    }
}
