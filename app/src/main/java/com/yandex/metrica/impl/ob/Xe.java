package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Wc;

/* loaded from: classes2.dex */
public class Xe {
    public final String a;
    public String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final EnumC2865k1 j;
    public final Integer k;
    public final String l;
    public final String m;
    public final Integer n;
    public final Integer o;
    public final String p;
    public final String q;
    public final EnumC2937mn r;
    public final N0 s;
    public final M.b.a t;
    public final Wc.a u;
    public final Integer v;
    public final Integer w;
    public final I0 x;
    public final Boolean y;
    public final Integer z;

    public Xe(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        this.j = asInteger == null ? null : EnumC2865k1.a(asInteger.intValue());
        this.k = contentValues.getAsInteger("custom_type");
        this.a = contentValues.getAsString("name");
        this.b = contentValues.getAsString("value");
        this.f = contentValues.getAsLong(CrashHianalyticsData.TIME);
        this.c = contentValues.getAsInteger(NotificationConstants.NUMBER);
        this.d = contentValues.getAsInteger("global_number");
        this.e = contentValues.getAsInteger("number_of_type");
        this.h = contentValues.getAsString("cell_info");
        this.g = contentValues.getAsString("location_info");
        this.i = contentValues.getAsString("wifi_network_info");
        this.l = contentValues.getAsString("error_environment");
        this.m = contentValues.getAsString("user_info");
        this.n = contentValues.getAsInteger("truncated");
        this.o = contentValues.getAsInteger("connection_type");
        this.p = contentValues.getAsString("cellular_connection_type");
        this.q = contentValues.getAsString("profile_id");
        this.r = EnumC2937mn.a(contentValues.getAsInteger("encrypting_mode"));
        this.s = N0.a(contentValues.getAsInteger("first_occurrence_status"));
        this.t = M.b.a.a(contentValues.getAsInteger("battery_charge_type"));
        this.u = Wc.a.a(contentValues.getAsString("collection_mode"));
        this.v = contentValues.getAsInteger("has_omitted_data");
        this.w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.x = asInteger2 != null ? I0.a(asInteger2.intValue()) : null;
        this.y = contentValues.getAsBoolean("attribution_id_changed");
        this.z = contentValues.getAsInteger("open_id");
    }
}
