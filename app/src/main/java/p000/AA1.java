package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class AA1 extends SQLiteOpenHelper {

    /* renamed from: a */
    public final /* synthetic */ int f100a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1259U0 f101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AA1(Context context, String str) {
        super(context, str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i = C8953cD1.f17369d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f100a) {
            case 0:
                C8405Uz1 c8405Uz1 = (C8405Uz1) this.f101b;
                C0495Hr c0495Hr = c8405Uz1.f12287f;
                if (c0495Hr.f4553b != 0 && ((Clock) c0495Hr.f4554c).elapsedRealtime() - c0495Hr.f4553b < 3600000) {
                    throw new SQLiteException("Database open failed");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    C0495Hr c0495Hr2 = c8405Uz1.f12287f;
                    c0495Hr2.f4553b = ((Clock) c0495Hr2.f4554c).elapsedRealtime();
                    c8405Uz1.mo6070n().f8378g.m24555d("Opening the database failed, dropping and recreating it");
                    if (!((C9110dP1) c8405Uz1.f11615b).f26031a.getDatabasePath("google_app_measurement.db").delete()) {
                        c8405Uz1.mo6070n().f8378g.m24554c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c0495Hr2.f4553b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        c8405Uz1.mo6070n().f8378g.m24554c(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    C11660xL1 c11660xL1 = (C11660xL1) this.f101b;
                    c11660xL1.mo6070n().f8378g.m24555d("Opening the local database failed, dropping and recreating it");
                    if (!((C9110dP1) c11660xL1.f11615b).f26031a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        c11660xL1.mo6070n().f8378g.m24554c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        c11660xL1.mo6070n().f8378g.m24554c(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f100a) {
            case 0:
                P12.m6206c(((C8405Uz1) this.f101b).mo6070n(), sQLiteDatabase);
                break;
            default:
                P12.m6206c(((C11660xL1) this.f101b).mo6070n(), sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f100a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        switch (this.f100a) {
            case 0:
                C8405Uz1 c8405Uz1 = (C8405Uz1) this.f101b;
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C8405Uz1.f12275g);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C8405Uz1.f12277i);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C8405Uz1.f12278j);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C8405Uz1.f12280l);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C8405Uz1.f12279k);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C8405Uz1.f12281m);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C8405Uz1.f12282n);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C8405Uz1.f12283o);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C8405Uz1.f12284p);
                C11304uY1.m25207a();
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C8405Uz1.f12285q);
                P12.m6207d(c8405Uz1.mo6070n(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C8405Uz1.f12276h);
                break;
            default:
                P12.m6207d(((C11660xL1) this.f101b).mo6070n(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f100a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AA1(C11660xL1 c11660xL1, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f100a = 1;
        this.f101b = c11660xL1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AA1(C8405Uz1 c8405Uz1, Context context) {
        this(context, "google_app_measurement.db");
        this.f100a = 0;
        this.f101b = c8405Uz1;
    }

    /* renamed from: a */
    private final void m98a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: c */
    private final void m99c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: e */
    private final void m100e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: f */
    private final void m101f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
