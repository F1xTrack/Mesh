package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class AA1 extends SQLiteOpenHelper {
    public final /* synthetic */ int a;
    public final /* synthetic */ U0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AA1(Context context, String str) {
        super(context, str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i = C2474cD1.d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.a) {
            case 0:
                C1656Uz1 c1656Uz1 = (C1656Uz1) this.b;
                C0617Hr c0617Hr = c1656Uz1.f;
                if (c0617Hr.b != 0 && ((Clock) c0617Hr.c).elapsedRealtime() - c0617Hr.b < 3600000) {
                    throw new SQLiteException("Database open failed");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    C0617Hr c0617Hr2 = c1656Uz1.f;
                    c0617Hr2.b = ((Clock) c0617Hr2.c).elapsedRealtime();
                    c1656Uz1.n().g.d("Opening the database failed, dropping and recreating it");
                    if (!((C3386dP1) c1656Uz1.b).a.getDatabasePath("google_app_measurement.db").delete()) {
                        c1656Uz1.n().g.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c0617Hr2.b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        c1656Uz1.n().g.c(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    C7966xL1 c7966xL1 = (C7966xL1) this.b;
                    c7966xL1.n().g.d("Opening the local database failed, dropping and recreating it");
                    if (!((C3386dP1) c7966xL1.b).a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        c7966xL1.n().g.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        c7966xL1.n().g.c(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.a) {
            case 0:
                P12.c(((C1656Uz1) this.b).n(), sQLiteDatabase);
                break;
            default:
                P12.c(((C7966xL1) this.b).n(), sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        switch (this.a) {
            case 0:
                C1656Uz1 c1656Uz1 = (C1656Uz1) this.b;
                P12.d(c1656Uz1.n(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1656Uz1.g);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1656Uz1.i);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1656Uz1.j);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1656Uz1.l);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1656Uz1.k);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1656Uz1.m);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1656Uz1.n);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1656Uz1.o);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C1656Uz1.p);
                C7434uY1.a();
                P12.d(c1656Uz1.n(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C1656Uz1.q);
                P12.d(c1656Uz1.n(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C1656Uz1.h);
                break;
            default:
                P12.d(((C7966xL1) this.b).n(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AA1(C7966xL1 c7966xL1, Context context) {
        this(context, "google_app_measurement_local.db");
        this.a = 1;
        this.b = c7966xL1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AA1(C1656Uz1 c1656Uz1, Context context) {
        this(context, "google_app_measurement.db");
        this.a = 0;
        this.b = c1656Uz1;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
