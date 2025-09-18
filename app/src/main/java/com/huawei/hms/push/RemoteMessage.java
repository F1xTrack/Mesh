package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.DateUtil;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.api.push.PushException;
import com.huawei.hms.support.log.HMSLog;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* renamed from: c */
    private static final String[] f19372c;

    /* renamed from: d */
    private static final int[] f19373d;

    /* renamed from: e */
    private static final long[] f19374e;

    /* renamed from: f */
    private static final HashMap<String, Object> f19375f;

    /* renamed from: g */
    private static final HashMap<String, Object> f19376g;

    /* renamed from: h */
    private static final HashMap<String, Object> f19377h;

    /* renamed from: i */
    private static final HashMap<String, Object> f19378i;

    /* renamed from: j */
    private static final HashMap<String, Object> f19379j;

    /* renamed from: a */
    private Bundle f19380a;

    /* renamed from: b */
    private Notification f19381b;

    public static class Builder {

        /* renamed from: a */
        private final Bundle f19382a;

        /* renamed from: b */
        private final Map<String, String> f19383b;

        public Builder(String str) {
            Bundle bundle = new Bundle();
            this.f19382a = bundle;
            this.f19383b = new HashMap();
            bundle.putString("to", str);
        }

        public Builder addData(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("add data failed, key is null.");
            }
            this.f19383b.put(str, str2);
            return this;
        }

        public RemoteMessage build() throws JSONException {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : this.f19383b.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                try {
                    String string = jSONObject.toString();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("collapseKey", this.f19382a.getString("collapseKey"));
                    jSONObject2.put("ttl", this.f19382a.getInt("ttl"));
                    jSONObject2.put("sendMode", this.f19382a.getInt("sendMode"));
                    jSONObject2.put("receiptMode", this.f19382a.getInt("receiptMode"));
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject.length() != 0) {
                        jSONObject3.put("data", string);
                    }
                    jSONObject3.put("msgId", this.f19382a.getString("msgId"));
                    jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject3);
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, jSONObject2.toString().getBytes(C2227m.f19425a));
                    bundle.putString("to", this.f19382a.getString("to"));
                    bundle.putString(RemoteMessageConst.MSGTYPE, this.f19382a.getString(RemoteMessageConst.MSGTYPE));
                    return new RemoteMessage(bundle);
                } catch (JSONException unused) {
                    HMSLog.m12623w("RemoteMessage", "JSONException: parse message body failed.");
                    throw new PushException(PushException.EXCEPTION_SEND_FAILED);
                }
            } catch (JSONException unused2) {
                HMSLog.m12623w("RemoteMessage", "JSONException: parse data to json failed.");
                throw new PushException(PushException.EXCEPTION_SEND_FAILED);
            }
        }

        public Builder clearData() {
            this.f19383b.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f19382a.putString("collapseKey", str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.f19383b.clear();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f19383b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder setMessageId(String str) {
            this.f19382a.putString("msgId", str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.f19382a.putString(RemoteMessageConst.MSGTYPE, str);
            return this;
        }

        public Builder setReceiptMode(int i) {
            if (i != 1 && i != 0) {
                throw new IllegalArgumentException("receipt mode can only be 0 or 1.");
            }
            this.f19382a.putInt("receiptMode", i);
            return this;
        }

        public Builder setSendMode(int i) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("send mode can only be 0 or 1.");
            }
            this.f19382a.putInt("sendMode", i);
            return this;
        }

        public Builder setTtl(int i) {
            if (i < 1 || i > 1296000) {
                throw new IllegalArgumentException("ttl must be greater than or equal to 1 and less than or equal to 1296000");
            }
            this.f19382a.putInt("ttl", i);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification implements Serializable {

        /* renamed from: A */
        private final long[] f19384A;

        /* renamed from: B */
        private final String f19385B;

        /* renamed from: a */
        private final String f19386a;

        /* renamed from: b */
        private final String f19387b;

        /* renamed from: c */
        private final String[] f19388c;

        /* renamed from: d */
        private final String f19389d;

        /* renamed from: e */
        private final String f19390e;

        /* renamed from: f */
        private final String[] f19391f;

        /* renamed from: g */
        private final String f19392g;

        /* renamed from: h */
        private final String f19393h;

        /* renamed from: i */
        private final String f19394i;

        /* renamed from: j */
        private final String f19395j;

        /* renamed from: k */
        private final String f19396k;

        /* renamed from: l */
        private final String f19397l;

        /* renamed from: m */
        private final String f19398m;

        /* renamed from: n */
        private final Uri f19399n;

        /* renamed from: o */
        private final int f19400o;

        /* renamed from: p */
        private final String f19401p;

        /* renamed from: q */
        private final int f19402q;

        /* renamed from: r */
        private final int f19403r;

        /* renamed from: s */
        private final int f19404s;

        /* renamed from: t */
        private final int[] f19405t;

        /* renamed from: u */
        private final String f19406u;

        /* renamed from: v */
        private final int f19407v;

        /* renamed from: w */
        private final String f19408w;

        /* renamed from: x */
        private final int f19409x;

        /* renamed from: y */
        private final String f19410y;

        /* renamed from: z */
        private final String f19411z;

        public /* synthetic */ Notification(Bundle bundle, C2214a c2214a) {
            this(bundle);
        }

        /* renamed from: a */
        private Integer m12421a(String str) {
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    HMSLog.m12623w("RemoteMessage", "NumberFormatException: get " + str + " failed.");
                }
            }
            return null;
        }

        public Integer getBadgeNumber() {
            return m12421a(this.f19408w);
        }

        public String getBody() {
            return this.f19389d;
        }

        public String[] getBodyLocalizationArgs() {
            String[] strArr = this.f19391f;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getBodyLocalizationKey() {
            return this.f19390e;
        }

        public String getChannelId() {
            return this.f19398m;
        }

        public String getClickAction() {
            return this.f19396k;
        }

        public String getColor() {
            return this.f19395j;
        }

        public String getIcon() {
            return this.f19392g;
        }

        public Uri getImageUrl() {
            String str = this.f19401p;
            if (str == null) {
                return null;
            }
            return Uri.parse(str);
        }

        public Integer getImportance() {
            return m12421a(this.f19410y);
        }

        public String getIntentUri() {
            return this.f19397l;
        }

        public int[] getLightSettings() {
            int[] iArr = this.f19405t;
            return iArr == null ? new int[0] : (int[]) iArr.clone();
        }

        public Uri getLink() {
            return this.f19399n;
        }

        public int getNotifyId() {
            return this.f19400o;
        }

        public String getSound() {
            return this.f19393h;
        }

        public String getTag() {
            return this.f19394i;
        }

        public String getTicker() {
            return this.f19411z;
        }

        public String getTitle() {
            return this.f19386a;
        }

        public String[] getTitleLocalizationArgs() {
            String[] strArr = this.f19388c;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getTitleLocalizationKey() {
            return this.f19387b;
        }

        public long[] getVibrateConfig() {
            long[] jArr = this.f19384A;
            return jArr == null ? new long[0] : (long[]) jArr.clone();
        }

        public Integer getVisibility() {
            return m12421a(this.f19385B);
        }

        public Long getWhen() {
            if (!TextUtils.isEmpty(this.f19406u)) {
                try {
                    return Long.valueOf(DateUtil.parseUtcToMillisecond(this.f19406u));
                } catch (StringIndexOutOfBoundsException unused) {
                    HMSLog.m12623w("RemoteMessage", "StringIndexOutOfBoundsException: parse when failed.");
                } catch (ParseException unused2) {
                    HMSLog.m12623w("RemoteMessage", "ParseException: parse when failed.");
                }
            }
            return null;
        }

        public boolean isAutoCancel() {
            return this.f19409x == 1;
        }

        public boolean isDefaultLight() {
            return this.f19402q == 1;
        }

        public boolean isDefaultSound() {
            return this.f19403r == 1;
        }

        public boolean isDefaultVibrate() {
            return this.f19404s == 1;
        }

        public boolean isLocalOnly() {
            return this.f19407v == 1;
        }

        private Notification(Bundle bundle) {
            this.f19386a = bundle.getString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.f19389d = bundle.getString(RemoteMessageConst.Notification.CONTENT);
            this.f19387b = bundle.getString(RemoteMessageConst.Notification.TITLE_LOC_KEY);
            this.f19390e = bundle.getString(RemoteMessageConst.Notification.BODY_LOC_KEY);
            this.f19388c = bundle.getStringArray(RemoteMessageConst.Notification.TITLE_LOC_ARGS);
            this.f19391f = bundle.getStringArray(RemoteMessageConst.Notification.BODY_LOC_ARGS);
            this.f19392g = bundle.getString("icon");
            this.f19395j = bundle.getString("color");
            this.f19393h = bundle.getString("sound");
            this.f19394i = bundle.getString("tag");
            this.f19398m = bundle.getString("channelId");
            this.f19396k = bundle.getString(RemoteMessageConst.Notification.CLICK_ACTION);
            this.f19397l = bundle.getString("intentUri");
            this.f19400o = bundle.getInt(RemoteMessageConst.Notification.NOTIFY_ID);
            String string = bundle.getString("url");
            this.f19399n = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
            this.f19401p = bundle.getString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.f19402q = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS);
            this.f19403r = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_SOUND);
            this.f19404s = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS);
            this.f19405t = bundle.getIntArray(RemoteMessageConst.Notification.LIGHT_SETTINGS);
            this.f19406u = bundle.getString(RemoteMessageConst.Notification.WHEN);
            this.f19407v = bundle.getInt(RemoteMessageConst.Notification.LOCAL_ONLY);
            this.f19408w = bundle.getString(RemoteMessageConst.Notification.BADGE_SET_NUM, null);
            this.f19409x = bundle.getInt("autoCancel");
            this.f19410y = bundle.getString("priority", null);
            this.f19411z = bundle.getString("ticker");
            this.f19384A = bundle.getLongArray(RemoteMessageConst.Notification.VIBRATE_TIMINGS);
            this.f19385B = bundle.getString("visibility", null);
        }
    }

    /* renamed from: com.huawei.hms.push.RemoteMessage$a */
    public class C2214a implements Parcelable.Creator<RemoteMessage> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage createFromParcel(Parcel parcel) {
            return new RemoteMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage[] newArray(int i) {
            return new RemoteMessage[i];
        }
    }

    static {
        String[] strArr = new String[0];
        f19372c = strArr;
        int[] iArr = new int[0];
        f19373d = iArr;
        long[] jArr = new long[0];
        f19374e = jArr;
        HashMap<String, Object> map = new HashMap<>(8);
        f19375f = map;
        map.put("from", "");
        map.put("collapseKey", "");
        map.put(RemoteMessageConst.SEND_TIME, "");
        map.put("ttl", Integer.valueOf(RemoteMessageConst.DEFAULT_TTL));
        map.put("urgency", 2);
        map.put(RemoteMessageConst.ORI_URGENCY, 2);
        map.put("sendMode", 0);
        map.put("receiptMode", 0);
        HashMap<String, Object> map2 = new HashMap<>(8);
        f19376g = map2;
        map2.put(RemoteMessageConst.Notification.TITLE_LOC_KEY, "");
        map2.put(RemoteMessageConst.Notification.BODY_LOC_KEY, "");
        map2.put(RemoteMessageConst.Notification.NOTIFY_ICON, "");
        map2.put(RemoteMessageConst.Notification.TITLE_LOC_ARGS, strArr);
        map2.put(RemoteMessageConst.Notification.BODY_LOC_ARGS, strArr);
        map2.put("ticker", "");
        map2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, "");
        map2.put(RemoteMessageConst.Notification.CONTENT, "");
        HashMap<String, Object> map3 = new HashMap<>(8);
        f19377h = map3;
        map3.put("icon", "");
        map3.put("color", "");
        map3.put("sound", "");
        map3.put(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS, 1);
        map3.put(RemoteMessageConst.Notification.LIGHT_SETTINGS, iArr);
        map3.put(RemoteMessageConst.Notification.DEFAULT_SOUND, 1);
        map3.put(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS, 1);
        map3.put(RemoteMessageConst.Notification.VIBRATE_TIMINGS, jArr);
        HashMap<String, Object> map4 = new HashMap<>(8);
        f19378i = map4;
        map4.put("tag", "");
        map4.put(RemoteMessageConst.Notification.WHEN, "");
        map4.put(RemoteMessageConst.Notification.LOCAL_ONLY, 1);
        map4.put(RemoteMessageConst.Notification.BADGE_SET_NUM, "");
        map4.put("priority", "");
        map4.put("autoCancel", 1);
        map4.put("visibility", "");
        map4.put("channelId", "");
        HashMap<String, Object> map5 = new HashMap<>(3);
        f19379j = map5;
        map5.put(RemoteMessageConst.Notification.CLICK_ACTION, "");
        map5.put("intentUri", "");
        map5.put("url", "");
        CREATOR = new C2214a();
    }

    public RemoteMessage(Bundle bundle) {
        this.f19380a = m12414a(bundle);
    }

    /* renamed from: a */
    private Bundle m12414a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        JSONObject jSONObjectM12417b = m12417b(bundle);
        JSONObject jSONObjectM12416a = m12416a(jSONObjectM12417b);
        String string = JsonUtil.getString(jSONObjectM12416a, "data", null);
        bundle2.putString("analyticInfo", JsonUtil.getString(jSONObjectM12416a, "analyticInfo", null));
        bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, bundle.getString(RemoteMessageConst.DEVICE_TOKEN));
        JSONObject jSONObjectM12420d = m12420d(jSONObjectM12416a);
        JSONObject jSONObjectM12418b = m12418b(jSONObjectM12420d);
        JSONObject jSONObjectM12419c = m12419c(jSONObjectM12420d);
        if (bundle.getInt(RemoteMessageConst.INPUT_TYPE) == 1 && AbstractC2218d.m12431a(jSONObjectM12416a, jSONObjectM12420d, string)) {
            bundle2.putString("data", AbstractC2215a.m12424a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
            return bundle2;
        }
        String string2 = bundle.getString("to");
        String string3 = bundle.getString(RemoteMessageConst.MSGTYPE);
        String string4 = JsonUtil.getString(jSONObjectM12416a, "msgId", null);
        bundle2.putString("to", string2);
        bundle2.putString("data", string);
        bundle2.putString("msgId", string4);
        bundle2.putString(RemoteMessageConst.MSGTYPE, string3);
        JsonUtil.transferJsonObjectToBundle(jSONObjectM12417b, bundle2, f19375f);
        bundle2.putBundle("notification", m12415a(jSONObjectM12417b, jSONObjectM12416a, jSONObjectM12420d, jSONObjectM12418b, jSONObjectM12419c));
        return bundle2;
    }

    /* renamed from: b */
    private static JSONObject m12417b(Bundle bundle) {
        try {
            return new JSONObject(AbstractC2215a.m12424a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
        } catch (JSONException unused) {
            HMSLog.m12623w("RemoteMessage", "JSONException:parse message body failed.");
            return null;
        }
    }

    /* renamed from: c */
    private static JSONObject m12419c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PARAM);
        }
        return null;
    }

    /* renamed from: d */
    private static JSONObject m12420d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String getAnalyticInfo() {
        return this.f19380a.getString("analyticInfo");
    }

    public Map<String, String> getAnalyticInfoMap() {
        HashMap map = new HashMap();
        String string = this.f19380a.getString("analyticInfo");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.m12623w("RemoteMessage", "JSONException: get analyticInfo from map failed.");
            }
        }
        return map;
    }

    public String getCollapseKey() {
        return this.f19380a.getString("collapseKey");
    }

    public String getData() {
        return this.f19380a.getString("data");
    }

    public Map<String, String> getDataOfMap() {
        HashMap map = new HashMap();
        String string = this.f19380a.getString("data");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.m12623w("RemoteMessage", "JSONException: get data from map failed");
            }
        }
        return map;
    }

    public String getFrom() {
        return this.f19380a.getString("from");
    }

    public String getMessageId() {
        return this.f19380a.getString("msgId");
    }

    public String getMessageType() {
        return this.f19380a.getString(RemoteMessageConst.MSGTYPE);
    }

    public Notification getNotification() {
        Bundle bundle = this.f19380a.getBundle("notification");
        C2214a c2214a = null;
        if (this.f19381b == null && bundle != null) {
            this.f19381b = new Notification(bundle, c2214a);
        }
        if (this.f19381b == null) {
            this.f19381b = new Notification(new Bundle(), c2214a);
        }
        return this.f19381b;
    }

    public int getOriginalUrgency() {
        int i = this.f19380a.getInt(RemoteMessageConst.ORI_URGENCY);
        if (i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    public int getReceiptMode() {
        return this.f19380a.getInt("receiptMode");
    }

    public int getSendMode() {
        return this.f19380a.getInt("sendMode");
    }

    public long getSentTime() {
        try {
            String string = this.f19380a.getString(RemoteMessageConst.SEND_TIME);
            if (TextUtils.isEmpty(string)) {
                return 0L;
            }
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            HMSLog.m12623w("RemoteMessage", "NumberFormatException: get sendTime error.");
            return 0L;
        }
    }

    public String getTo() {
        return this.f19380a.getString("to");
    }

    public String getToken() {
        return this.f19380a.getString(RemoteMessageConst.DEVICE_TOKEN);
    }

    public int getTtl() {
        return this.f19380a.getInt("ttl");
    }

    public int getUrgency() {
        int i = this.f19380a.getInt("urgency");
        if (i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f19380a);
        parcel.writeSerializable(this.f19381b);
    }

    public RemoteMessage(Parcel parcel) {
        this.f19380a = parcel.readBundle();
        this.f19381b = (Notification) parcel.readSerializable();
    }

    /* renamed from: b */
    private static JSONObject m12418b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
        }
        return null;
    }

    /* renamed from: a */
    private Bundle m12415a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Bundle bundle = new Bundle();
        JsonUtil.transferJsonObjectToBundle(jSONObject3, bundle, f19376g);
        JsonUtil.transferJsonObjectToBundle(jSONObject4, bundle, f19377h);
        JsonUtil.transferJsonObjectToBundle(jSONObject, bundle, f19378i);
        JsonUtil.transferJsonObjectToBundle(jSONObject5, bundle, f19379j);
        bundle.putInt(RemoteMessageConst.Notification.NOTIFY_ID, JsonUtil.getInt(jSONObject2, RemoteMessageConst.Notification.NOTIFY_ID, 0));
        return bundle;
    }

    /* renamed from: a */
    private static JSONObject m12416a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }
}
