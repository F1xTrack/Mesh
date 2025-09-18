package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.u7 */
/* loaded from: classes2.dex */
public final class C4903u7 implements Converter {
    public final C4831r7 a;

    public C4903u7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final ContentValues fromModel(C4879t7 c4879t7) {
        ContentValues contentValues = new ContentValues();
        Long l = c4879t7.a;
        if (l != null) {
            contentValues.put(NotificationConstants.ID, Long.valueOf(l.longValue()));
        }
        Yj yj = c4879t7.b;
        if (yj != null) {
            contentValues.put("type", Integer.valueOf(yj.a));
        }
        String str = c4879t7.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C4831r7 c4831r7 = this.a;
        contentValues.put("session_description", MessageNano.toByteArray(c4831r7.a.fromModel(c4879t7.d)));
        return contentValues;
    }

    public C4903u7(C4831r7 c4831r7) {
        this.a = c4831r7;
    }

    public /* synthetic */ C4903u7(C4831r7 c4831r7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4831r7(null, 1, null) : c4831r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4879t7 toModel(ContentValues contentValues) {
        Yj yj;
        Long asLong = contentValues.getAsLong(NotificationConstants.ID);
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            yj = Yj.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                yj = Yj.BACKGROUND;
            }
        } else {
            yj = null;
        }
        return new C4879t7(asLong, yj, contentValues.getAsString("report_request_parameters"), this.a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
