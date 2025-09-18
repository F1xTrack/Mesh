package com.yandex.metrica.impl.ob;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.E8;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Vf;
import defpackage.NX;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class O8 {
    public static final int a = YandexMetrica.getLibraryApiLevel();
    private static final C3146v8 b;
    private static final C3201x8 c;
    private static final C3121u8 d;

    public interface a {
        public static final List<String> a = U2.a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$a */
        public interface InterfaceC0008a {
            public static final String a;
            public static final String b;

            static {
                Locale locale = Locale.US;
                a = "CREATE TABLE IF NOT EXISTS lbs_dat (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)";
                b = "DROP TABLE IF EXISTS lbs_dat";
            }
        }

        public interface b {
            public static final String a;
            public static final String b;

            static {
                Locale locale = Locale.US;
                a = "CREATE TABLE IF NOT EXISTS l_dat (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)";
                b = "DROP TABLE IF EXISTS l_dat";
            }
        }
    }

    public static final class b {
        public static final List<String> a = U2.a("data_key", "value");
    }

    public interface c {
        public static final List<String> a = U2.a("key", "value", "type");
    }

    public static final class d {
        public static final List<String> a = U2.a(NotificationConstants.ID, NotificationConstants.NUMBER, "global_number", "number_of_type", "name", "value", "type", CrashHianalyticsData.TIME, "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id");
        public static final String b;

        static {
            StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
            sb.append(EnumC3249z6.FOREGROUND.a());
            sb.append(",app_environment TEXT DEFAULT '{}',app_environment_revision INTEGER DEFAULT 0,truncated INTEGER DEFAULT 0,connection_type INTEGER DEFAULT 2,cellular_connection_type TEXT,custom_type INTEGER DEFAULT 0, wifi_access_point TEXT, encrypting_mode INTEGER DEFAULT ");
            sb.append(EnumC2937mn.NONE.a());
            sb.append(", profile_id TEXT, first_occurrence_status INTEGER DEFAULT 0, battery_charge_type INTEGER DEFAULT ");
            sb.append(M.b.a.UNKNOWN.a());
            sb.append(", collection_mode TEXT, has_omitted_data INTEGER DEFAULT -1, call_state INTEGER DEFAULT 0, source INTEGER DEFAULT 0, attribution_id_changed INTEGER DEFAULT 0, open_id INTEGER DEFAULT ");
            b = NX.i(sb, new Vf.d.a().x, " )");
        }
    }

    public static final class e {
        public static final List<String> a = U2.a(NotificationConstants.ID, "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");
        public static final String b = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + EnumC3249z6.FOREGROUND.a() + ",obtained_before_first_sync INTEGER DEFAULT 0 )";
        public static final String c = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", NotificationConstants.ID, "type", "reports", "session_id", "session_type");
        public static final String d = "(select count(reports.id) from reports where reports.session_id = sessions.id) = 0 and cast(id as integer) < ?";
    }

    static {
        C3146v8 c3146v8 = new C3146v8();
        b = c3146v8;
        C3201x8 c3201x8 = new C3201x8();
        c = c3201x8;
        d = new C3121u8(c3146v8, c3201x8, new E8.b());
    }

    public static C3121u8 a() {
        return d;
    }
}
