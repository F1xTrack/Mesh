package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.E;

/* loaded from: classes2.dex */
public class Wc {
    public final Uc a;
    public final C2828id b;

    public enum a {
        UNKNOWN("unknown"),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }

        public static a a(String str) {
            a aVar = UNKNOWN;
            a[] aVarArrValues = values();
            for (int i = 0; i < 4; i++) {
                a aVar2 = aVarArrValues[i];
                if (aVar2.a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        public static a a(E.a aVar) {
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

    public Wc(Uc uc, C2828id c2828id) {
        this.a = uc;
        this.b = c2828id;
    }

    public String toString() {
        return "LocationCollectionConfig{arguments=" + this.a + ", preconditions=" + this.b + '}';
    }
}
