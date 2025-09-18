package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2566E;

/* renamed from: com.yandex.metrica.impl.ob.Wc */
/* loaded from: classes2.dex */
public class C3028Wc {

    /* renamed from: a */
    public final C2978Uc f22683a;

    /* renamed from: b */
    public final C3337id f22684b;

    /* renamed from: com.yandex.metrica.impl.ob.Wc$a */
    public enum a {
        UNKNOWN("unknown"),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");


        /* renamed from: a */
        private final String f22690a;

        a(String str) {
            this.f22690a = str;
        }

        /* renamed from: a */
        public String m15388a() {
            return this.f22690a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f22690a;
        }

        /* renamed from: a */
        public static a m15387a(String str) {
            a aVar = UNKNOWN;
            a[] aVarArrValues = values();
            for (int i = 0; i < 4; i++) {
                a aVar2 = aVarArrValues[i];
                if (aVar2.f22690a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        /* renamed from: a */
        public static a m15386a(C2566E.a aVar) {
            a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2 ? aVar2 : VISIBLE;
            }
            return BACKGROUND;
        }
    }

    public C3028Wc(C2978Uc c2978Uc, C3337id c3337id) {
        this.f22683a = c2978Uc;
        this.f22684b = c3337id;
    }

    public String toString() {
        return "LocationCollectionConfig{arguments=" + this.f22683a + ", preconditions=" + this.f22684b + '}';
    }
}
