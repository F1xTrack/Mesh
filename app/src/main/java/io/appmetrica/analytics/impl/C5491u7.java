package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.u7 */
/* loaded from: classes2.dex */
public final class C5491u7 implements Converter {

    /* renamed from: a */
    public final C5416r7 f32677a;

    public C5491u7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final ContentValues fromModel(C5466t7 c5466t7) {
        ContentValues contentValues = new ContentValues();
        Long l = c5466t7.f32621a;
        if (l != null) {
            contentValues.put(NotificationConstants.f19487ID, Long.valueOf(l.longValue()));
        }
        EnumC4955Yj enumC4955Yj = c5466t7.f32622b;
        if (enumC4955Yj != null) {
            contentValues.put("type", Integer.valueOf(enumC4955Yj.f31130a));
        }
        String str = c5466t7.f32623c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C5416r7 c5416r7 = this.f32677a;
        contentValues.put("session_description", MessageNano.toByteArray(c5416r7.f32501a.fromModel(c5466t7.f32624d)));
        return contentValues;
    }

    public C5491u7(C5416r7 c5416r7) {
        this.f32677a = c5416r7;
    }

    public /* synthetic */ C5491u7(C5416r7 c5416r7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C5416r7(null, 1, null) : c5416r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C5466t7 toModel(ContentValues contentValues) {
        EnumC4955Yj enumC4955Yj;
        Long asLong = contentValues.getAsLong(NotificationConstants.f19487ID);
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            enumC4955Yj = EnumC4955Yj.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                enumC4955Yj = EnumC4955Yj.BACKGROUND;
            }
        } else {
            enumC4955Yj = null;
        }
        return new C5466t7(asLong, enumC4955Yj, contentValues.getAsString("report_request_parameters"), this.f32677a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
