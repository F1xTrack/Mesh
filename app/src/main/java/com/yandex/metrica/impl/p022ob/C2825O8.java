package com.yandex.metrica.impl.p022ob;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p022ob.C2575E8;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import java.util.List;
import java.util.Locale;
import p000.AbstractC0852NX;

/* renamed from: com.yandex.metrica.impl.ob.O8 */
/* loaded from: classes2.dex */
public final class C2825O8 {

    /* renamed from: a */
    public static final int f21845a = YandexMetrica.getLibraryApiLevel();

    /* renamed from: b */
    private static final C3670v8 f21846b;

    /* renamed from: c */
    private static final C3722x8 f21847c;

    /* renamed from: d */
    private static final C3644u8 f21848d;

    /* renamed from: com.yandex.metrica.impl.ob.O8$a */
    public interface a {

        /* renamed from: a */
        public static final List<String> f21849a = C2968U2.m15236a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$a */
        public interface InterfaceC7302a {

            /* renamed from: a */
            public static final String f21850a;

            /* renamed from: b */
            public static final String f21851b;

            static {
                Locale locale = Locale.US;
                f21850a = "CREATE TABLE IF NOT EXISTS lbs_dat (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)";
                f21851b = "DROP TABLE IF EXISTS lbs_dat";
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$b */
        public interface b {

            /* renamed from: a */
            public static final String f21852a;

            /* renamed from: b */
            public static final String f21853b;

            static {
                Locale locale = Locale.US;
                f21852a = "CREATE TABLE IF NOT EXISTS l_dat (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)";
                f21853b = "DROP TABLE IF EXISTS l_dat";
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$b */
    public static final class b {

        /* renamed from: a */
        public static final List<String> f21854a = C2968U2.m15236a("data_key", "value");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$c */
    public interface c {

        /* renamed from: a */
        public static final List<String> f21855a = C2968U2.m15236a("key", "value", "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$d */
    public static final class d {

        /* renamed from: a */
        public static final List<String> f21856a = C2968U2.m15236a(NotificationConstants.f19487ID, NotificationConstants.NUMBER, "global_number", "number_of_type", "name", "value", "type", CrashHianalyticsData.TIME, "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id");

        /* renamed from: b */
        public static final String f21857b;

        static {
            StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
            sb.append(EnumC3772z6.FOREGROUND.m17324a());
            sb.append(",app_environment TEXT DEFAULT '{}',app_environment_revision INTEGER DEFAULT 0,truncated INTEGER DEFAULT 0,connection_type INTEGER DEFAULT 2,cellular_connection_type TEXT,custom_type INTEGER DEFAULT 0, wifi_access_point TEXT, encrypting_mode INTEGER DEFAULT ");
            sb.append(EnumC3451mn.NONE.m16436a());
            sb.append(", profile_id TEXT, first_occurrence_status INTEGER DEFAULT 0, battery_charge_type INTEGER DEFAULT ");
            sb.append(C2766M.b.a.UNKNOWN.m14568a());
            sb.append(", collection_mode TEXT, has_omitted_data INTEGER DEFAULT -1, call_state INTEGER DEFAULT 0, source INTEGER DEFAULT 0, attribution_id_changed INTEGER DEFAULT 0, open_id INTEGER DEFAULT ");
            f21857b = AbstractC0852NX.m5760i(sb, new C3006Vf.d.a().f22597x, " )");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$e */
    public static final class e {

        /* renamed from: a */
        public static final List<String> f21858a = C2968U2.m15236a(NotificationConstants.f19487ID, "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b */
        public static final String f21859b = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + EnumC3772z6.FOREGROUND.m17324a() + ",obtained_before_first_sync INTEGER DEFAULT 0 )";

        /* renamed from: c */
        public static final String f21860c = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", NotificationConstants.f19487ID, "type", "reports", "session_id", "session_type");

        /* renamed from: d */
        public static final String f21861d = "(select count(reports.id) from reports where reports.session_id = sessions.id) = 0 and cast(id as integer) < ?";
    }

    static {
        C3670v8 c3670v8 = new C3670v8();
        f21846b = c3670v8;
        C3722x8 c3722x8 = new C3722x8();
        f21847c = c3722x8;
        f21848d = new C3644u8(c3670v8, c3722x8, new C2575E8.b());
    }

    /* renamed from: a */
    public static C3644u8 m14695a() {
        return f21848d;
    }
}
