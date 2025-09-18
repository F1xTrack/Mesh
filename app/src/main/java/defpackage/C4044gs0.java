package defpackage;

import android.database.Cursor;
import android.os.Build;
import com.statstracker.data.MessageDatabase_Impl;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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
public final class C4044gs0 {
    public C5772lr0 a;

    public final void a() {
        C5390jr0 c5390jr0;
        C5772lr0 c5772lr0 = this.a;
        if (c5772lr0 == null) {
            O90.o("dao");
            throw null;
        }
        C6655qT0 c6655qT0A = C6655qT0.a(0, "SELECT * FROM message_table LIMIT 1");
        MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) c5772lr0.b;
        messageDatabase_Impl.b();
        Cursor cursorC = RY1.c(messageDatabase_Impl, c6655qT0A, false);
        try {
            int iC = MY1.c(cursorC, NotificationConstants.ID);
            int iC2 = MY1.c(cursorC, "message");
            if (cursorC.moveToFirst()) {
                c5390jr0 = new C5390jr0(cursorC.getLong(iC), cursorC.isNull(iC2) ? null : cursorC.getString(iC2));
            } else {
                c5390jr0 = null;
            }
            String str = c5390jr0 != null ? c5390jr0.b : null;
            if (str == null || str.length() == 0) {
                return;
            }
            new Thread(new RQ(str, 18, this)).start();
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public final void b(JSONObject jSONObject, String str) throws JSONException, UnsupportedEncodingException {
        O90.f(str, "ssoId");
        Pattern patternCompile = Pattern.compile("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}");
        O90.e(patternCompile, "compile(...)");
        if (patternCompile.matcher(str).matches() || str.equalsIgnoreCase("unknown")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("eventType", "mobile");
            jSONObject2.put("eventSrc", AbstractC5647lB1.i);
            jSONObject2.put("eventDst", "stats");
            jSONObject2.put("eventTime", new Date().getTime() / 1000);
            jSONObject2.put("sso_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("launch_counter", AbstractC5647lB1.j);
            jSONObject3.put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, AbstractC5647lB1.h);
            jSONObject3.put(CommonUrlParts.MODEL, Build.MODEL);
            jSONObject3.put("manufacturer", Build.MANUFACTURER);
            jSONObject3.put("board", Build.BOARD);
            jSONObject3.put("brand", Build.BRAND);
            jSONObject3.put(NotificationConstants.ID, Build.ID);
            jSONObject3.put("user", Build.USER);
            jSONObject3.put("version.sdk_int", Build.VERSION.SDK_INT);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject3.put(AbstractC8235ym.i(next, "_app"), jSONObject.get(next));
            }
            jSONObject2.put("eventObject", jSONObject3);
            String strEncode = URLEncoder.encode(jSONObject2.toString(), "UTF-8");
            O90.e(strEncode, "encode(...)");
            new Thread(new RQ(strEncode, 18, this)).start();
        }
    }
}
