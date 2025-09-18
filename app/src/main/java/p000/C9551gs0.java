package p000;

import android.database.Cursor;
import android.os.Build;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.statstracker.data.MessageDatabase_Impl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9551gs0 {

    /* renamed from: a */
    public C10189lr0 f28070a;

    /* renamed from: a */
    public final void m18669a() {
        C9933jr0 c9933jr0;
        C10189lr0 c10189lr0 = this.f28070a;
        if (c10189lr0 == null) {
            O90.m5977o("dao");
            throw null;
        }
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(0, "SELECT * FROM message_table LIMIT 1");
        MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) c10189lr0.f37323b;
        messageDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(messageDatabase_Impl, c10781qT0M24005a, false);
        try {
            int iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            int iM5396c2 = MY1.m5396c(cursorM7035c, "message");
            if (cursorM7035c.moveToFirst()) {
                c9933jr0 = new C9933jr0(cursorM7035c.getLong(iM5396c), cursorM7035c.isNull(iM5396c2) ? null : cursorM7035c.getString(iM5396c2));
            } else {
                c9933jr0 = null;
            }
            String str = c9933jr0 != null ? c9933jr0.f35428b : null;
            if (str == null || str.length() == 0) {
                return;
            }
            new Thread(new RunnableC1096RQ(str, 18, this)).start();
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: b */
    public final void m18670b(JSONObject jSONObject, String str) throws JSONException, UnsupportedEncodingException {
        O90.m5968f(str, "ssoId");
        Pattern patternCompile = Pattern.compile("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}");
        O90.m5967e(patternCompile, "compile(...)");
        if (patternCompile.matcher(str).matches() || str.equalsIgnoreCase("unknown")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("eventType", "mobile");
            jSONObject2.put("eventSrc", AbstractC10106lB1.f36953i);
            jSONObject2.put("eventDst", "stats");
            jSONObject2.put("eventTime", new Date().getTime() / 1000);
            jSONObject2.put("sso_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("launch_counter", AbstractC10106lB1.f36954j);
            jSONObject3.put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, AbstractC10106lB1.f36952h);
            jSONObject3.put(CommonUrlParts.MODEL, Build.MODEL);
            jSONObject3.put("manufacturer", Build.MANUFACTURER);
            jSONObject3.put("board", Build.BOARD);
            jSONObject3.put("brand", Build.BRAND);
            jSONObject3.put(NotificationConstants.f19487ID, Build.ID);
            jSONObject3.put("user", Build.USER);
            jSONObject3.put("version.sdk_int", Build.VERSION.SDK_INT);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject3.put(AbstractC7222ym.m26232i(next, "_app"), jSONObject.get(next));
            }
            jSONObject2.put("eventObject", jSONObject3);
            String strEncode = URLEncoder.encode(jSONObject2.toString(), "UTF-8");
            O90.m5967e(strEncode, "encode(...)");
            new Thread(new RunnableC1096RQ(strEncode, 18, this)).start();
        }
    }
}
