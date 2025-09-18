package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.g7 */
/* loaded from: classes2.dex */
public final class C4569g7 implements Converter {
    public final C4496d7 a;

    public C4569g7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final ContentValues fromModel(C4545f7 c4545f7) {
        ContentValues contentValues = new ContentValues();
        Long l = c4545f7.a;
        if (l != null) {
            contentValues.put("session_id", Long.valueOf(l.longValue()));
        }
        Yj yj = c4545f7.b;
        if (yj != null) {
            contentValues.put("session_type", Integer.valueOf(yj.a));
        }
        Long l2 = c4545f7.c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        Wa wa = c4545f7.d;
        if (wa != null) {
            contentValues.put("type", Integer.valueOf(wa.a));
        }
        Long l3 = c4545f7.e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c4545f7.f;
        if (l4 != null) {
            contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(l4.longValue()));
        }
        C4496d7 c4496d7 = this.a;
        contentValues.put("event_description", MessageNano.toByteArray(c4496d7.a.fromModel(c4545f7.g)));
        return contentValues;
    }

    public C4569g7(C4496d7 c4496d7) {
        this.a = c4496d7;
    }

    public /* synthetic */ C4569g7(C4496d7 c4496d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4496d7(null, 1, null) : c4496d7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4545f7 toModel(ContentValues contentValues) {
        Yj yj;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            yj = Yj.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                yj = Yj.BACKGROUND;
            }
        } else {
            yj = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C4545f7(asLong, yj, asLong2, asInteger2 != null ? Wa.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong(CrashHianalyticsData.TIME), this.a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
