package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.g7 */
/* loaded from: classes2.dex */
public final class C5141g7 implements Converter {

    /* renamed from: a */
    public final C5066d7 f31749a;

    public C5141g7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final ContentValues fromModel(C5116f7 c5116f7) {
        ContentValues contentValues = new ContentValues();
        Long l = c5116f7.f31659a;
        if (l != null) {
            contentValues.put("session_id", Long.valueOf(l.longValue()));
        }
        EnumC4955Yj enumC4955Yj = c5116f7.f31660b;
        if (enumC4955Yj != null) {
            contentValues.put("session_type", Integer.valueOf(enumC4955Yj.f31130a));
        }
        Long l2 = c5116f7.f31661c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        EnumC4898Wa enumC4898Wa = c5116f7.f31662d;
        if (enumC4898Wa != null) {
            contentValues.put("type", Integer.valueOf(enumC4898Wa.f30974a));
        }
        Long l3 = c5116f7.f31663e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c5116f7.f31664f;
        if (l4 != null) {
            contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(l4.longValue()));
        }
        C5066d7 c5066d7 = this.f31749a;
        contentValues.put("event_description", MessageNano.toByteArray(c5066d7.f31470a.fromModel(c5116f7.f31665g)));
        return contentValues;
    }

    public C5141g7(C5066d7 c5066d7) {
        this.f31749a = c5066d7;
    }

    public /* synthetic */ C5141g7(C5066d7 c5066d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C5066d7(null, 1, null) : c5066d7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C5116f7 toModel(ContentValues contentValues) {
        EnumC4955Yj enumC4955Yj;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            enumC4955Yj = EnumC4955Yj.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                enumC4955Yj = EnumC4955Yj.BACKGROUND;
            }
        } else {
            enumC4955Yj = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C5116f7(asLong, enumC4955Yj, asLong2, asInteger2 != null ? EnumC4898Wa.m19946a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong(CrashHianalyticsData.TIME), this.f31749a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
