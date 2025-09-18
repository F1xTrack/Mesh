package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.s8 */
/* loaded from: classes2.dex */
public class C3071s8 {
    private final com.yandex.metrica.c a;
    private final D2 b;

    /* renamed from: com.yandex.metrica.impl.ob.s8$a */
    public static class a {
        public final List<ContentValues> a;
        public final int b;

        public a(List<ContentValues> list, int i) {
            this.a = list;
            this.b = i;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s8$b */
    public enum b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");

        private final String a;

        b(String str) {
            this.a = str;
        }
    }

    public C3071s8(com.yandex.metrica.c cVar) {
        this(cVar, P0.i().r());
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.ob.C3071s8.a a(android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, com.yandex.metrica.impl.ob.C3071s8.b r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C3071s8.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, com.yandex.metrica.impl.ob.s8$b, java.lang.String, boolean):com.yandex.metrica.impl.ob.s8$a");
    }

    public C3071s8(com.yandex.metrica.c cVar, D2 d2) {
        this.a = cVar;
        this.b = d2;
    }
}
