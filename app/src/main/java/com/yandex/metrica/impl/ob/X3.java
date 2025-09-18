package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.location.Location;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.C2881kh;
import java.util.Map;

/* loaded from: classes2.dex */
public class X3 {
    public final C2881kh.b a;
    public final a b;
    public final ResultReceiver c;

    public static class a implements InterfaceC2682ch<a, a> {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;
        public final Location f;
        public final Boolean g;
        public final Integer h;
        public final Integer i;
        public final Integer j;
        public final Boolean k;
        public final Boolean l;
        public final Map<String, String> m;
        public final Integer n;
        public final Boolean o;
        public final Boolean p;
        public final Boolean q;

        public a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
            this.f = location;
            this.g = bool2;
            this.h = num;
            this.i = num2;
            this.j = num3;
            this.k = bool3;
            this.l = bool4;
            this.m = map;
            this.n = num4;
            this.o = bool5;
            this.p = bool6;
            this.q = bool7;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public boolean b(a aVar) {
            return equals(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.a;
            if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? aVar.b != null : !str2.equals(aVar.b)) {
                return false;
            }
            String str3 = this.c;
            if (str3 == null ? aVar.c != null : !str3.equals(aVar.c)) {
                return false;
            }
            String str4 = this.d;
            if (str4 == null ? aVar.d != null : !str4.equals(aVar.d)) {
                return false;
            }
            Boolean bool = this.e;
            if (bool == null ? aVar.e != null : !bool.equals(aVar.e)) {
                return false;
            }
            Location location = this.f;
            if (location == null ? aVar.f != null : !location.equals(aVar.f)) {
                return false;
            }
            Boolean bool2 = this.g;
            if (bool2 == null ? aVar.g != null : !bool2.equals(aVar.g)) {
                return false;
            }
            Integer num = this.h;
            if (num == null ? aVar.h != null : !num.equals(aVar.h)) {
                return false;
            }
            Integer num2 = this.i;
            if (num2 == null ? aVar.i != null : !num2.equals(aVar.i)) {
                return false;
            }
            Integer num3 = this.j;
            if (num3 == null ? aVar.j != null : !num3.equals(aVar.j)) {
                return false;
            }
            Boolean bool3 = this.k;
            if (bool3 == null ? aVar.k != null : !bool3.equals(aVar.k)) {
                return false;
            }
            Boolean bool4 = this.l;
            if (bool4 == null ? aVar.l != null : !bool4.equals(aVar.l)) {
                return false;
            }
            Map<String, String> map = this.m;
            if (map == null ? aVar.m != null : !map.equals(aVar.m)) {
                return false;
            }
            Integer num4 = this.n;
            if (num4 == null ? aVar.n != null : !num4.equals(aVar.n)) {
                return false;
            }
            Boolean bool5 = this.o;
            if (bool5 == null ? aVar.o != null : !bool5.equals(aVar.o)) {
                return false;
            }
            Boolean bool6 = this.p;
            if (bool6 == null ? aVar.p != null : !bool6.equals(aVar.p)) {
                return false;
            }
            Boolean bool7 = this.q;
            return bool7 != null ? bool7.equals(aVar.q) : aVar.q == null;
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.e;
            int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f;
            int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.g;
            int iHashCode7 = (iHashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.h;
            int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.i;
            int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.j;
            int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.k;
            int iHashCode11 = (iHashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.l;
            int iHashCode12 = (iHashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.m;
            int iHashCode13 = (iHashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.n;
            int iHashCode14 = (iHashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.o;
            int iHashCode15 = (iHashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.p;
            int iHashCode16 = (iHashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.q;
            return iHashCode16 + (bool7 != null ? bool7.hashCode() : 0);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public a a(a aVar) {
            String str = this.a;
            String str2 = aVar.a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.b;
            String str4 = aVar.b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.c;
            String str6 = aVar.c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.d;
            String str8 = aVar.d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.e;
            Boolean bool2 = aVar.e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f;
            Location location2 = aVar.f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.g;
            Boolean bool4 = aVar.g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.h;
            Integer num2 = aVar.h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.i;
            Integer num4 = aVar.i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.j;
            Integer num6 = aVar.j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.k;
            Boolean bool6 = aVar.k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.l;
            Boolean bool8 = aVar.l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.m;
            Map<String, String> map2 = aVar.m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.n;
            Map<String, String> map3 = map;
            Integer num8 = aVar.n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar.o : bool9;
            Boolean bool11 = this.p;
            Boolean bool12 = bool11 == null ? aVar.p : bool11;
            Boolean bool13 = this.q;
            return new a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar.q : bool13);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            Boolean asBoolean;
            String asString = counterConfiguration.a.getAsString("CFG_DEVICE_SIZE_TYPE");
            String asString2 = counterConfiguration.a.getAsString("CFG_APP_VERSION");
            String asString3 = counterConfiguration.a.getAsString("CFG_APP_VERSION_CODE");
            String strA = counterConfiguration.a();
            Boolean asBoolean2 = counterConfiguration.a.getAsBoolean("CFG_LOCATION_TRACKING");
            ContentValues contentValues = counterConfiguration.a;
            Location location = null;
            if (contentValues.containsKey("CFG_MANUAL_LOCATION")) {
                byte[] asByteArray = contentValues.getAsByteArray("CFG_MANUAL_LOCATION");
                int i = C2703dd.q;
                if (asByteArray != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(asByteArray, 0, asByteArray.length);
                        parcelObtain.setDataPosition(0);
                        Location location2 = (Location) parcelObtain.readValue(Location.class.getClassLoader());
                        parcelObtain.recycle();
                        location = location2;
                    } catch (Throwable unused) {
                        parcelObtain.recycle();
                    }
                }
            }
            Boolean asBoolean3 = counterConfiguration.a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
            Integer asInteger = counterConfiguration.a.getAsInteger("CFG_SESSION_TIMEOUT");
            Integer asInteger2 = counterConfiguration.a.getAsInteger("CFG_MAX_REPORTS_COUNT");
            Integer asInteger3 = counterConfiguration.a.getAsInteger("CFG_DISPATCH_PERIOD");
            Boolean asBoolean4 = counterConfiguration.a.getAsBoolean("CFG_IS_LOG_ENABLED");
            Boolean asBoolean5 = counterConfiguration.a.getAsBoolean("CFG_STATISTICS_SENDING");
            Integer asInteger4 = counterConfiguration.a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
            Boolean asBoolean6 = counterConfiguration.a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
            Boolean asBoolean7 = counterConfiguration.a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
            synchronized (counterConfiguration) {
                asBoolean = counterConfiguration.a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
            }
            this(asString, asString2, asString3, strA, asBoolean2, location, asBoolean3, asInteger, asInteger2, asInteger3, asBoolean4, asBoolean5, map, asInteger4, asBoolean6, asBoolean7, asBoolean);
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    public X3(T3 t3) {
        this(new C2881kh.b(t3), new a(t3.b(), t3.a().a()), t3.a().c());
    }

    public X3(C2881kh.b bVar, a aVar, ResultReceiver resultReceiver) {
        this.a = bVar;
        this.b = aVar;
        this.c = resultReceiver;
    }
}
