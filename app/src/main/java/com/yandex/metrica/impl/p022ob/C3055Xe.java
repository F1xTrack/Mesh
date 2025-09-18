package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3028Wc;

/* renamed from: com.yandex.metrica.impl.ob.Xe */
/* loaded from: classes2.dex */
public class C3055Xe {

    /* renamed from: a */
    public final String f22786a;

    /* renamed from: b */
    public String f22787b;

    /* renamed from: c */
    public final Integer f22788c;

    /* renamed from: d */
    public final Integer f22789d;

    /* renamed from: e */
    public final Integer f22790e;

    /* renamed from: f */
    public final Long f22791f;

    /* renamed from: g */
    public final String f22792g;

    /* renamed from: h */
    public final String f22793h;

    /* renamed from: i */
    public final String f22794i;

    /* renamed from: j */
    public final EnumC3377k1 f22795j;

    /* renamed from: k */
    public final Integer f22796k;

    /* renamed from: l */
    public final String f22797l;

    /* renamed from: m */
    public final String f22798m;

    /* renamed from: n */
    public final Integer f22799n;

    /* renamed from: o */
    public final Integer f22800o;

    /* renamed from: p */
    public final String f22801p;

    /* renamed from: q */
    public final String f22802q;

    /* renamed from: r */
    public final EnumC3451mn f22803r;

    /* renamed from: s */
    public final EnumC2792N0 f22804s;

    /* renamed from: t */
    public final C2766M.b.a f22805t;

    /* renamed from: u */
    public final C3028Wc.a f22806u;

    /* renamed from: v */
    public final Integer f22807v;

    /* renamed from: w */
    public final Integer f22808w;

    /* renamed from: x */
    public final EnumC2667I0 f22809x;

    /* renamed from: y */
    public final Boolean f22810y;

    /* renamed from: z */
    public final Integer f22811z;

    public C3055Xe(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        this.f22795j = asInteger == null ? null : EnumC3377k1.m16248a(asInteger.intValue());
        this.f22796k = contentValues.getAsInteger("custom_type");
        this.f22786a = contentValues.getAsString("name");
        this.f22787b = contentValues.getAsString("value");
        this.f22791f = contentValues.getAsLong(CrashHianalyticsData.TIME);
        this.f22788c = contentValues.getAsInteger(NotificationConstants.NUMBER);
        this.f22789d = contentValues.getAsInteger("global_number");
        this.f22790e = contentValues.getAsInteger("number_of_type");
        this.f22793h = contentValues.getAsString("cell_info");
        this.f22792g = contentValues.getAsString("location_info");
        this.f22794i = contentValues.getAsString("wifi_network_info");
        this.f22797l = contentValues.getAsString("error_environment");
        this.f22798m = contentValues.getAsString("user_info");
        this.f22799n = contentValues.getAsInteger("truncated");
        this.f22800o = contentValues.getAsInteger("connection_type");
        this.f22801p = contentValues.getAsString("cellular_connection_type");
        this.f22802q = contentValues.getAsString("profile_id");
        this.f22803r = EnumC3451mn.m16435a(contentValues.getAsInteger("encrypting_mode"));
        this.f22804s = EnumC2792N0.m14635a(contentValues.getAsInteger("first_occurrence_status"));
        this.f22805t = C2766M.b.a.m14567a(contentValues.getAsInteger("battery_charge_type"));
        this.f22806u = C3028Wc.a.m15387a(contentValues.getAsString("collection_mode"));
        this.f22807v = contentValues.getAsInteger("has_omitted_data");
        this.f22808w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.f22809x = asInteger2 != null ? EnumC2667I0.m14273a(asInteger2.intValue()) : null;
        this.f22810y = contentValues.getAsBoolean("attribution_id_changed");
        this.f22811z = contentValues.getAsInteger("open_id");
    }
}
