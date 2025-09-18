package p000;

import android.os.Bundle;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.yandex.varioqub.config.model.ConfigValue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8834bI0 {

    /* renamed from: A */
    public final String f16932A;

    /* renamed from: B */
    public final String f16933B;

    /* renamed from: C */
    public final double f16934C;

    /* renamed from: D */
    public final double f16935D;

    /* renamed from: E */
    public final boolean f16936E;

    /* renamed from: F */
    public final double f16937F;

    /* renamed from: G */
    public final boolean f16938G;

    /* renamed from: H */
    public final boolean f16939H;

    /* renamed from: I */
    public final String f16940I;

    /* renamed from: J */
    public final String f16941J;

    /* renamed from: K */
    public final boolean f16942K;

    /* renamed from: L */
    public final boolean f16943L;

    /* renamed from: M */
    public final String f16944M;

    /* renamed from: a */
    public final String f16945a;

    /* renamed from: b */
    public final String f16946b;

    /* renamed from: c */
    public final double f16947c;

    /* renamed from: d */
    public final String f16948d;

    /* renamed from: e */
    public final String f16949e;

    /* renamed from: f */
    public final boolean f16950f;

    /* renamed from: g */
    public final boolean f16951g;

    /* renamed from: h */
    public final String f16952h;

    /* renamed from: i */
    public final String f16953i;

    /* renamed from: j */
    public final String f16954j;

    /* renamed from: k */
    public final String f16955k;

    /* renamed from: l */
    public final String f16956l;

    /* renamed from: m */
    public final String f16957m;

    /* renamed from: n */
    public final String f16958n;

    /* renamed from: o */
    public final String f16959o;

    /* renamed from: p */
    public final String f16960p;

    /* renamed from: q */
    public final String f16961q;

    /* renamed from: r */
    public final String f16962r;

    /* renamed from: s */
    public final String f16963s;

    /* renamed from: t */
    public final boolean f16964t;

    /* renamed from: u */
    public final String f16965u;

    /* renamed from: v */
    public final boolean f16966v;

    /* renamed from: w */
    public final boolean f16967w;

    /* renamed from: x */
    public final double f16968x;

    /* renamed from: y */
    public final String f16969y;

    /* renamed from: z */
    public final boolean f16970z;

    public C8834bI0(JSONObject jSONObject) {
        try {
            this.f16945a = jSONObject.has(NotificationConstants.f19487ID) ? jSONObject.getString(NotificationConstants.f19487ID) : null;
            this.f16946b = jSONObject.has("message") ? jSONObject.getString("message") : null;
            boolean zHas = jSONObject.has(NotificationConstants.FIRE_DATE);
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f16947c = zHas ? jSONObject.getDouble(NotificationConstants.FIRE_DATE) : 0.0d;
            this.f16948d = jSONObject.has("title") ? jSONObject.getString("title") : null;
            this.f16949e = jSONObject.has("ticker") ? jSONObject.getString("ticker") : null;
            this.f16950f = jSONObject.has(NotificationConstants.SHOW_WHEN) ? jSONObject.getBoolean(NotificationConstants.SHOW_WHEN) : true;
            this.f16951g = jSONObject.has("autoCancel") ? jSONObject.getBoolean("autoCancel") : true;
            this.f16952h = jSONObject.has(NotificationConstants.LARGE_ICON) ? jSONObject.getString(NotificationConstants.LARGE_ICON) : null;
            this.f16953i = jSONObject.has(NotificationConstants.LARGE_ICON_URL) ? jSONObject.getString(NotificationConstants.LARGE_ICON_URL) : null;
            this.f16954j = jSONObject.has(NotificationConstants.SMALL_ICON) ? jSONObject.getString(NotificationConstants.SMALL_ICON) : null;
            this.f16955k = jSONObject.has(NotificationConstants.BIG_TEXT) ? jSONObject.getString(NotificationConstants.BIG_TEXT) : null;
            this.f16956l = jSONObject.has(NotificationConstants.SUB_TEXT) ? jSONObject.getString(NotificationConstants.SUB_TEXT) : null;
            this.f16957m = jSONObject.has(NotificationConstants.BIG_PICTURE_URL) ? jSONObject.getString(NotificationConstants.BIG_PICTURE_URL) : null;
            this.f16958n = jSONObject.has(NotificationConstants.SHORTCUT_ID) ? jSONObject.getString(NotificationConstants.SHORTCUT_ID) : null;
            this.f16959o = jSONObject.has(NotificationConstants.NUMBER) ? jSONObject.getString(NotificationConstants.NUMBER) : null;
            this.f16960p = jSONObject.has("channelId") ? jSONObject.getString("channelId") : null;
            this.f16961q = jSONObject.has("sound") ? jSONObject.getString("sound") : null;
            this.f16962r = jSONObject.has("color") ? jSONObject.getString("color") : null;
            this.f16963s = jSONObject.has(NotificationConstants.GROUP) ? jSONObject.getString(NotificationConstants.GROUP) : null;
            this.f16964t = jSONObject.has(NotificationConstants.GROUP_SUMMARY) ? jSONObject.getBoolean(NotificationConstants.GROUP_SUMMARY) : false;
            this.f16965u = jSONObject.has(RemoteMessageAttributes.MESSAGE_ID) ? jSONObject.getString(RemoteMessageAttributes.MESSAGE_ID) : null;
            this.f16966v = jSONObject.has(NotificationConstants.PLAY_SOUND) ? jSONObject.getBoolean(NotificationConstants.PLAY_SOUND) : true;
            this.f16967w = jSONObject.has(NotificationConstants.VIBRATE) ? jSONObject.getBoolean(NotificationConstants.VIBRATE) : true;
            this.f16968x = jSONObject.has("vibration") ? jSONObject.getDouble("vibration") : 1000.0d;
            this.f16969y = jSONObject.has(NotificationConstants.ACTIONS) ? jSONObject.getString(NotificationConstants.ACTIONS) : null;
            this.f16970z = jSONObject.has(NotificationConstants.INVOKE_APP) ? jSONObject.getBoolean(NotificationConstants.INVOKE_APP) : true;
            this.f16932A = jSONObject.has("tag") ? jSONObject.getString("tag") : null;
            this.f16933B = jSONObject.has(NotificationConstants.REPEAT_TYPE) ? jSONObject.getString(NotificationConstants.REPEAT_TYPE) : null;
            this.f16934C = jSONObject.has(NotificationConstants.REPEAT_TIME) ? jSONObject.getDouble(NotificationConstants.REPEAT_TIME) : d;
            this.f16935D = jSONObject.has(RemoteMessageConst.Notification.WHEN) ? jSONObject.getDouble(RemoteMessageConst.Notification.WHEN) : -1.0d;
            this.f16936E = jSONObject.has("usesChronometer") ? jSONObject.getBoolean("usesChronometer") : false;
            this.f16937F = jSONObject.has("timeoutAfter") ? jSONObject.getDouble("timeoutAfter") : -1.0d;
            this.f16938G = jSONObject.has(NotificationConstants.ONLY_ALERT_ONCE) ? jSONObject.getBoolean(NotificationConstants.ONLY_ALERT_ONCE) : false;
            this.f16939H = jSONObject.has(NotificationConstants.ONGOING) ? jSONObject.getBoolean(NotificationConstants.ONGOING) : false;
            this.f16940I = jSONObject.has("reply_button_text") ? jSONObject.getString("reply_button_text") : null;
            this.f16941J = jSONObject.has("reply_placeholder_text") ? jSONObject.getString("reply_placeholder_text") : null;
            this.f16942K = jSONObject.has(NotificationConstants.ALLOW_WHILE_IDLE) ? jSONObject.getBoolean(NotificationConstants.ALLOW_WHILE_IDLE) : false;
            this.f16943L = jSONObject.has("ignoreInForeground") ? jSONObject.getBoolean("ignoreInForeground") : false;
            this.f16944M = jSONObject.has("userInfo") ? jSONObject.getString("userInfo") : null;
        } catch (JSONException e) {
            throw new IllegalStateException("Exception while initializing RNPushNotificationAttributes from JSON", e);
        }
    }

    /* renamed from: a */
    public final Bundle m10443a() {
        Bundle bundle = new Bundle();
        bundle.putString(NotificationConstants.f19487ID, this.f16945a);
        bundle.putString("message", this.f16946b);
        bundle.putDouble(NotificationConstants.FIRE_DATE, this.f16947c);
        bundle.putString("title", this.f16948d);
        bundle.putString("ticker", this.f16949e);
        bundle.putBoolean(NotificationConstants.SHOW_WHEN, this.f16950f);
        bundle.putBoolean("autoCancel", this.f16951g);
        bundle.putString(NotificationConstants.LARGE_ICON, this.f16952h);
        bundle.putString(NotificationConstants.LARGE_ICON_URL, this.f16953i);
        bundle.putString(NotificationConstants.SMALL_ICON, this.f16954j);
        bundle.putString(NotificationConstants.BIG_TEXT, this.f16955k);
        bundle.putString(NotificationConstants.SUB_TEXT, this.f16956l);
        bundle.putString(NotificationConstants.BIG_PICTURE_URL, this.f16957m);
        bundle.putString(NotificationConstants.SHORTCUT_ID, this.f16958n);
        bundle.putString(NotificationConstants.NUMBER, this.f16959o);
        bundle.putString("channelId", this.f16960p);
        bundle.putString("sound", this.f16961q);
        bundle.putString("color", this.f16962r);
        bundle.putString(NotificationConstants.GROUP, this.f16963s);
        bundle.putBoolean(NotificationConstants.GROUP_SUMMARY, this.f16964t);
        bundle.putString(RemoteMessageAttributes.MESSAGE_ID, this.f16965u);
        bundle.putBoolean(NotificationConstants.PLAY_SOUND, this.f16966v);
        bundle.putBoolean(NotificationConstants.VIBRATE, this.f16967w);
        bundle.putDouble("vibration", this.f16968x);
        bundle.putString(NotificationConstants.ACTIONS, this.f16969y);
        bundle.putBoolean(NotificationConstants.INVOKE_APP, this.f16970z);
        bundle.putString("tag", this.f16932A);
        bundle.putString(NotificationConstants.REPEAT_TYPE, this.f16933B);
        bundle.putDouble(NotificationConstants.REPEAT_TIME, this.f16934C);
        bundle.putDouble(RemoteMessageConst.Notification.WHEN, this.f16935D);
        bundle.putBoolean("usesChronometer", this.f16936E);
        bundle.putDouble("timeoutAfter", this.f16937F);
        bundle.putBoolean(NotificationConstants.ONLY_ALERT_ONCE, this.f16938G);
        bundle.putBoolean(NotificationConstants.ONGOING, this.f16939H);
        bundle.putString("reply_button_text", this.f16940I);
        bundle.putString("reply_placeholder_text", this.f16941J);
        bundle.putBoolean(NotificationConstants.ALLOW_WHILE_IDLE, this.f16942K);
        bundle.putBoolean("ignoreInForeground", this.f16943L);
        bundle.putString("userInfo", this.f16944M);
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RNPushNotificationAttributes{id='");
        sb.append(this.f16945a);
        sb.append("', message='");
        sb.append(this.f16946b);
        sb.append("', fireDate=");
        sb.append(this.f16947c);
        sb.append(", title='");
        sb.append(this.f16948d);
        sb.append("', ticker='");
        sb.append(this.f16949e);
        sb.append("', showWhen=");
        sb.append(this.f16950f);
        sb.append(", autoCancel=");
        sb.append(this.f16951g);
        sb.append(", largeIcon='");
        sb.append(this.f16952h);
        sb.append("', largeIconUrl='");
        sb.append(this.f16953i);
        sb.append("', smallIcon='");
        sb.append(this.f16954j);
        sb.append("', bigText='");
        sb.append(this.f16955k);
        sb.append("', subText='");
        sb.append(this.f16956l);
        sb.append("', bigPictureUrl='");
        sb.append(this.f16957m);
        sb.append("', shortcutId='");
        sb.append(this.f16958n);
        sb.append("', number='");
        sb.append(this.f16959o);
        sb.append("', channelId='");
        sb.append(this.f16960p);
        sb.append("', sound='");
        sb.append(this.f16961q);
        sb.append("', color='");
        sb.append(this.f16962r);
        sb.append("', group='");
        sb.append(this.f16963s);
        sb.append("', groupSummary='");
        sb.append(this.f16964t);
        sb.append("', messageId='");
        sb.append(this.f16965u);
        sb.append("', playSound=");
        sb.append(this.f16966v);
        sb.append(", vibrate=");
        sb.append(this.f16967w);
        sb.append(", vibration=");
        sb.append(this.f16968x);
        sb.append(", actions='");
        sb.append(this.f16969y);
        sb.append("', invokeApp=");
        sb.append(this.f16970z);
        sb.append(", tag='");
        sb.append(this.f16932A);
        sb.append("', repeatType='");
        sb.append(this.f16933B);
        sb.append("', repeatTime=");
        sb.append(this.f16934C);
        sb.append(", when=");
        sb.append(this.f16935D);
        sb.append(", usesChronometer=");
        sb.append(this.f16936E);
        sb.append(", timeoutAfter=");
        sb.append(this.f16937F);
        sb.append(", onlyAlertOnce=");
        sb.append(this.f16938G);
        sb.append(", ongoing=");
        sb.append(this.f16939H);
        sb.append(", reply_button_text=");
        sb.append(this.f16940I);
        sb.append(", reply_placeholder_text=");
        sb.append(this.f16941J);
        sb.append(", allowWhileIdle=");
        sb.append(this.f16942K);
        sb.append(", ignoreInForeground=");
        sb.append(this.f16943L);
        sb.append(", userInfo=");
        return F91.m2539v(sb, this.f16944M, '}');
    }
}
