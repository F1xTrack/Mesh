package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.location.Location;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p022ob.C3393kh;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.X3 */
/* loaded from: classes2.dex */
public class C3044X3 {

    /* renamed from: a */
    public final C3393kh.b f22748a;

    /* renamed from: b */
    public final a f22749b;

    /* renamed from: c */
    public final ResultReceiver f22750c;

    /* renamed from: com.yandex.metrica.impl.ob.X3$a */
    public static class a implements InterfaceC3185ch<a, a> {

        /* renamed from: a */
        public final String f22751a;

        /* renamed from: b */
        public final String f22752b;

        /* renamed from: c */
        public final String f22753c;

        /* renamed from: d */
        public final String f22754d;

        /* renamed from: e */
        public final Boolean f22755e;

        /* renamed from: f */
        public final Location f22756f;

        /* renamed from: g */
        public final Boolean f22757g;

        /* renamed from: h */
        public final Integer f22758h;

        /* renamed from: i */
        public final Integer f22759i;

        /* renamed from: j */
        public final Integer f22760j;

        /* renamed from: k */
        public final Boolean f22761k;

        /* renamed from: l */
        public final Boolean f22762l;

        /* renamed from: m */
        public final Map<String, String> f22763m;

        /* renamed from: n */
        public final Integer f22764n;

        /* renamed from: o */
        public final Boolean f22765o;

        /* renamed from: p */
        public final Boolean f22766p;

        /* renamed from: q */
        public final Boolean f22767q;

        public a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.f22751a = str;
            this.f22752b = str2;
            this.f22753c = str3;
            this.f22754d = str4;
            this.f22755e = bool;
            this.f22756f = location;
            this.f22757g = bool2;
            this.f22758h = num;
            this.f22759i = num2;
            this.f22760j = num3;
            this.f22761k = bool3;
            this.f22762l = bool4;
            this.f22763m = map;
            this.f22764n = num4;
            this.f22765o = bool5;
            this.f22766p = bool6;
            this.f22767q = bool7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: b */
        public boolean mo15414b(a aVar) {
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
            String str = this.f22751a;
            if (str == null ? aVar.f22751a != null : !str.equals(aVar.f22751a)) {
                return false;
            }
            String str2 = this.f22752b;
            if (str2 == null ? aVar.f22752b != null : !str2.equals(aVar.f22752b)) {
                return false;
            }
            String str3 = this.f22753c;
            if (str3 == null ? aVar.f22753c != null : !str3.equals(aVar.f22753c)) {
                return false;
            }
            String str4 = this.f22754d;
            if (str4 == null ? aVar.f22754d != null : !str4.equals(aVar.f22754d)) {
                return false;
            }
            Boolean bool = this.f22755e;
            if (bool == null ? aVar.f22755e != null : !bool.equals(aVar.f22755e)) {
                return false;
            }
            Location location = this.f22756f;
            if (location == null ? aVar.f22756f != null : !location.equals(aVar.f22756f)) {
                return false;
            }
            Boolean bool2 = this.f22757g;
            if (bool2 == null ? aVar.f22757g != null : !bool2.equals(aVar.f22757g)) {
                return false;
            }
            Integer num = this.f22758h;
            if (num == null ? aVar.f22758h != null : !num.equals(aVar.f22758h)) {
                return false;
            }
            Integer num2 = this.f22759i;
            if (num2 == null ? aVar.f22759i != null : !num2.equals(aVar.f22759i)) {
                return false;
            }
            Integer num3 = this.f22760j;
            if (num3 == null ? aVar.f22760j != null : !num3.equals(aVar.f22760j)) {
                return false;
            }
            Boolean bool3 = this.f22761k;
            if (bool3 == null ? aVar.f22761k != null : !bool3.equals(aVar.f22761k)) {
                return false;
            }
            Boolean bool4 = this.f22762l;
            if (bool4 == null ? aVar.f22762l != null : !bool4.equals(aVar.f22762l)) {
                return false;
            }
            Map<String, String> map = this.f22763m;
            if (map == null ? aVar.f22763m != null : !map.equals(aVar.f22763m)) {
                return false;
            }
            Integer num4 = this.f22764n;
            if (num4 == null ? aVar.f22764n != null : !num4.equals(aVar.f22764n)) {
                return false;
            }
            Boolean bool5 = this.f22765o;
            if (bool5 == null ? aVar.f22765o != null : !bool5.equals(aVar.f22765o)) {
                return false;
            }
            Boolean bool6 = this.f22766p;
            if (bool6 == null ? aVar.f22766p != null : !bool6.equals(aVar.f22766p)) {
                return false;
            }
            Boolean bool7 = this.f22767q;
            return bool7 != null ? bool7.equals(aVar.f22767q) : aVar.f22767q == null;
        }

        public int hashCode() {
            String str = this.f22751a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f22752b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f22753c;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f22754d;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f22755e;
            int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f22756f;
            int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f22757g;
            int iHashCode7 = (iHashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f22758h;
            int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f22759i;
            int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f22760j;
            int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.f22761k;
            int iHashCode11 = (iHashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f22762l;
            int iHashCode12 = (iHashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f22763m;
            int iHashCode13 = (iHashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f22764n;
            int iHashCode14 = (iHashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f22765o;
            int iHashCode15 = (iHashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f22766p;
            int iHashCode16 = (iHashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.f22767q;
            return iHashCode16 + (bool7 != null ? bool7.hashCode() : 0);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: a */
        public a mo15413a(a aVar) {
            String str = this.f22751a;
            String str2 = aVar.f22751a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f22752b;
            String str4 = aVar.f22752b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f22753c;
            String str6 = aVar.f22753c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f22754d;
            String str8 = aVar.f22754d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f22755e;
            Boolean bool2 = aVar.f22755e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f22756f;
            Location location2 = aVar.f22756f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f22757g;
            Boolean bool4 = aVar.f22757g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f22758h;
            Integer num2 = aVar.f22758h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.f22759i;
            Integer num4 = aVar.f22759i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.f22760j;
            Integer num6 = aVar.f22760j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.f22761k;
            Boolean bool6 = aVar.f22761k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.f22762l;
            Boolean bool8 = aVar.f22762l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.f22763m;
            Map<String, String> map2 = aVar.f22763m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.f22764n;
            Map<String, String> map3 = map;
            Integer num8 = aVar.f22764n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.f22765o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar.f22765o : bool9;
            Boolean bool11 = this.f22766p;
            Boolean bool12 = bool11 == null ? aVar.f22766p : bool11;
            Boolean bool13 = this.f22767q;
            return new a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar.f22767q : bool13);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            Boolean asBoolean;
            String asString = counterConfiguration.f20731a.getAsString("CFG_DEVICE_SIZE_TYPE");
            String asString2 = counterConfiguration.f20731a.getAsString("CFG_APP_VERSION");
            String asString3 = counterConfiguration.f20731a.getAsString("CFG_APP_VERSION_CODE");
            String strM13768a = counterConfiguration.m13768a();
            Boolean asBoolean2 = counterConfiguration.f20731a.getAsBoolean("CFG_LOCATION_TRACKING");
            ContentValues contentValues = counterConfiguration.f20731a;
            Location location = null;
            if (contentValues.containsKey("CFG_MANUAL_LOCATION")) {
                byte[] asByteArray = contentValues.getAsByteArray("CFG_MANUAL_LOCATION");
                int i = C3207dd.f23231q;
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
            Boolean asBoolean3 = counterConfiguration.f20731a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
            Integer asInteger = counterConfiguration.f20731a.getAsInteger("CFG_SESSION_TIMEOUT");
            Integer asInteger2 = counterConfiguration.f20731a.getAsInteger("CFG_MAX_REPORTS_COUNT");
            Integer asInteger3 = counterConfiguration.f20731a.getAsInteger("CFG_DISPATCH_PERIOD");
            Boolean asBoolean4 = counterConfiguration.f20731a.getAsBoolean("CFG_IS_LOG_ENABLED");
            Boolean asBoolean5 = counterConfiguration.f20731a.getAsBoolean("CFG_STATISTICS_SENDING");
            Integer asInteger4 = counterConfiguration.f20731a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
            Boolean asBoolean6 = counterConfiguration.f20731a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
            Boolean asBoolean7 = counterConfiguration.f20731a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
            synchronized (counterConfiguration) {
                asBoolean = counterConfiguration.f20731a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
            }
            this(asString, asString2, asString3, strM13768a, asBoolean2, location, asBoolean3, asInteger, asInteger2, asInteger3, asBoolean4, asBoolean5, map, asInteger4, asBoolean6, asBoolean7, asBoolean);
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    public C3044X3(C2944T3 c2944t3) {
        this(new C3393kh.b(c2944t3), new a(c2944t3.m15168b(), c2944t3.m15167a().m15254a()), c2944t3.m15167a().m15261c());
    }

    public C3044X3(C3393kh.b bVar, a aVar, ResultReceiver resultReceiver) {
        this.f22748a = bVar;
        this.f22749b = aVar;
        this.f22750c = resultReceiver;
    }
}
