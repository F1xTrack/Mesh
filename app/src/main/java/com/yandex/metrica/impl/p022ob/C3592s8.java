package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import com.yandex.metrica.EnumC2458c;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.s8 */
/* loaded from: classes2.dex */
public class C3592s8 {

    /* renamed from: a */
    private final EnumC2458c f24655a;

    /* renamed from: b */
    private final C2544D2 f24656b;

    /* renamed from: com.yandex.metrica.impl.ob.s8$a */
    public static class a {

        /* renamed from: a */
        public final List<ContentValues> f24657a;

        /* renamed from: b */
        public final int f24658b;

        public a(List<ContentValues> list, int i) {
            this.f24657a = list;
            this.f24658b = i;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s8$b */
    public enum b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");


        /* renamed from: a */
        private final String f24662a;

        b(String str) {
            this.f24662a = str;
        }
    }

    public C3592s8(EnumC2458c enumC2458c) {
        this(enumC2458c, C2842P0.m14728i().m14747r());
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0041  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p022ob.C3592s8.a m16720a(android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, com.yandex.metrica.impl.p022ob.C3592s8.b r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3592s8.m16720a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, com.yandex.metrica.impl.ob.s8$b, java.lang.String, boolean):com.yandex.metrica.impl.ob.s8$a");
    }

    public C3592s8(EnumC2458c enumC2458c, C2544D2 c2544d2) {
        this.f24655a = enumC2458c;
        this.f24656b = c2544d2;
    }
}
